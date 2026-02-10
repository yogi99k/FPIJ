package CH2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PickElementsMultipleCollection {
    static final List<String> friends =
            Arrays.asList( "Brian" , "Nate" , "Neal" , "Raju" , "Sara" , "Scott" );
    static final List<String> editors =
            Arrays.asList( "Brian" , "Jackie" , "John" , "Mike" );
    static final List<String> comrades =
            Arrays.asList( "Kate" , "Ken" , "Nick" , "Paula" , "Zach" );

    static final Predicate<String> startsWith= names->names.startsWith("N");

    public static void main(String[] args) {
        final long countFriendsStartN =
                friends.stream()
                        .filter(name -> name.startsWith( "N" ))
                        .count();
        final long countEditorsStartN =
                editors.stream()
                        .filter(name -> name.startsWith( "N" ))
                        .count();
        final long countComradesStartN =
                comrades.stream()
                        .filter(name -> name.startsWith( "N" ))
                        .count();
        System.out.println(countFriendsStartN);
        System.out.println(countComradesStartN);
        System.out.println(countEditorsStartN);

        final long countFriendsStartN2 =
                friends.stream()
                        .filter(startsWith)
                        .count();
        final long countEditorsStartN2 =
                editors.stream()
                        .filter(startsWith)
                        .count();
        final long countComradesStartN2 =
                comrades.stream()
                        .filter(startsWith)
                        .count();
        System.out.println("------------------");
        System.out.println(countFriendsStartN2);
        System.out.println(countComradesStartN2);
        System.out.println(countEditorsStartN2);
    }

}
