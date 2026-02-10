package CH2;

import java.util.Arrays;
import java.util.List;

public class PickElementsMultipleCollection {
    static final List<String> friends =
            Arrays.asList( "Brian" , "Nate" , "Neal" , "Raju" , "Sara" , "Scott" );
    static final List<String> editors =
            Arrays.asList( "Brian" , "Jackie" , "John" , "Mike" );
    static final List<String> comrades =
            Arrays.asList( "Kate" , "Ken" , "Nick" , "Paula" , "Zach" );

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
    }
}
