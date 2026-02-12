package CH2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PickDifferentNames {
    static final List<String> friends =
            Arrays.asList( "Brian" , "Nate" , "Neal" , "Raju" , "Sara" , "Scott" );
    static final List<String> editors =
            Arrays.asList( "Brian" , "Jackie" , "John" , "Mike" );
    static final List<String> comrades =
            Arrays.asList( "Kate" , "Ken" , "Nick" , "Paula" , "Zach" );

    public static Predicate<String> checkIfStartsWith(final String letter){
        return names->names.startsWith(letter);
    }

    static final Predicate<String> startsWith= names->names.startsWith("N");
    static final Predicate<String> startsWithN = names->names.startsWith("B");

    public static void main(String[] args) {
        final long countFriendsStartN =
                friends.stream()
                        .filter(name -> name.startsWith("N"))
                        .count();
        final long countEditorsStartB =
                editors.stream()
                        .filter(name -> name.startsWith("B"))
                        .count();
        final long countComradesStartN =
                comrades.stream()
                        .filter(name -> name.startsWith("N"))
                        .count();
        System.out.println(countFriendsStartN);
        System.out.println(countEditorsStartB);
        System.out.println(countComradesStartN);
        System.out.println("--------------checkIfStartsWith---------------");
        long countFriendsStartN2 = friends.stream()
                .filter(checkIfStartsWith("N"))
                .count();
        long countEditorsStartB2 = editors.stream()
                .filter(checkIfStartsWith("B"))
                .count();
        System.out.println(countFriendsStartN2);
        System.out.println(countEditorsStartB2);

        System.out.println("--------------startsWith---------------");

        final Function<String, Predicate<String>> startsWithLetter =
                (String letter) -> (String name) -> name.startsWith(letter);

        final long countFriendsStartN3 =
                friends.stream()
                        .filter(startsWithLetter.apply("N"))
                        .count();

        final long countFriendsStartB3 =
                friends.stream()
                        .filter(startsWithLetter.apply("B"))
                        .count();

        System.out.println(countFriendsStartN3);
        System.out.println(countFriendsStartB3);

        System.out.println("--------------startsWith-Refactor--------------");

        final Function<String , Predicate<String>> stringPredicateFunction =
                letter -> name -> name.startsWith(letter);
        final long countFriendsStartN4 =
                friends.stream()
                        .filter(stringPredicateFunction.apply("N"))
                        .count();
        final long countFriendsStartB4 =
                friends.stream()
                        .filter(stringPredicateFunction.apply("B"))
                        .count();
        System.out.println(countFriendsStartN4);
        System.out.println(countFriendsStartB4);

    }
}
