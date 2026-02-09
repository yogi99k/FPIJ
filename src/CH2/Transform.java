package CH2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transform {
    final List<String> friends =
            Arrays.asList( "Brian" , "Nate" , "Neal" , "Raju" , "Sara" , "Scott" );
    List<String> upperCaseNames = new ArrayList<>();
    public String usingForLoop(){
        //for
        for(String names:friends){
            upperCaseNames.add(names.toUpperCase());
        }
        //forEach
        /**
         * Using forEach to transform the list is not a good idea because it can lead to side effects and is less readable than using a
         * for loop or stream operations.
         * The forEach method is typically used for performing actions on each element of a collection,
         * rather than transforming the collection itself.
         * In this case, using a for loop or stream operations would be more appropriate and would make the code clearer and easier to understand.
         * We used the internal iterator, but that still required the empty list and the effort to add elements to it
         */
        friends.forEach(names->upperCaseNames.add(names.toUpperCase())); //Bad Idea
        System.out.println(upperCaseNames);
        return "";
    }
    public String usingStream(){
        friends.stream()
                .map(names -> names.toUpperCase())
//                .forEach(names -> System.out.println(names + ""));
                .forEach(System.out::println);
        friends.stream()
                        .map(names->names.length())
                        //.forEach(count-> System.out.println(count + ""));
                        .forEach(System.out::println);
        //Method reference
        friends.stream()
                        .map(String::toUpperCase)
                                .forEach(System.out::println);
        System.out.println();
        return "";
    }
    public static void main(String args[]){
        Transform transform = new Transform();
        transform.usingForLoop();
        transform.usingStream();
    }

}
