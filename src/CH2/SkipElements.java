package CH2;

import java.util.Arrays;
import java.util.List;

public class SkipElements {
    final List<String> friends =
            Arrays.asList( "Pip","Brian" , "Nate" , "Neal" , "Raju" , "Sara" , "Scott" );
    public String usingSkip(){
        friends.stream()
                .skip(4)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        return "";
    }
    public String usingdropWhile(){
        friends.stream()
                .dropWhile(names->names.length()>4)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        return "";
    }

    public static void main(String[] args) {
        SkipElements skipElements = new SkipElements();
        //skipElements.usingSkip();
            skipElements.usingdropWhile();
    }
}
