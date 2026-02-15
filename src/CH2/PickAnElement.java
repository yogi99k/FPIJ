package CH2;

import java.util.List;
import java.util.Optional;

public class PickAnElement {
    public static void pickName (final List<String> names, final String startingLetter) {
        String foundName = null ;
        for (String name : names) {
            if (name.startsWith(startingLetter)) {
                foundName = name;
                break ;
            }
        }
        System.out.print(String.format( "A name starting with %s: " , startingLetter));
        if (foundName != null ) {
            System.out.println(foundName);
        } else {
            System.out.println( "No name found" );
        }
    }

    /**
     * The Optional class is useful whenever the result may be absent. It protects us from getting a
     * NullPointerException
     * @param names
     */
    public static void pickName2 (
            final List<String> names, final String startingLetter) {
        final Optional<String> foundName =
                names.stream()
                        .filter(name ->name.startsWith(startingLetter))
                        .findFirst();
        System.out.println(String.format( "A name starting with %s: %s" ,
                startingLetter, foundName.orElse( "No name found" )));
    }

    public static void main(String[] args) {
        final List<String> friends =
                List.of( "Brian" , "Nate" , "Neal" , "Raju" , "Sara" , "Scott" );
        pickName(friends, "N");
        pickName(friends, "B");
        pickName(friends, "X");
        System.out.println("--------------pickName2---------------");
        pickName2(friends, "N");
        pickName2(friends, "B");
    }
}
