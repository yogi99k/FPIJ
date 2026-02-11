package CH2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PickDifferentNames {
    static final List<String> friends =
            Arrays.asList( "Brian" , "Nate" , "Neal" , "Raju" , "Sara" , "Scott" );
    static final List<String> editors =
            Arrays.asList( "Brian" , "Jackie" , "John" , "Mike" );
    static final List<String> comrades =
            Arrays.asList( "Kate" , "Ken" , "Nick" , "Paula" , "Zach" );

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
    }
}
