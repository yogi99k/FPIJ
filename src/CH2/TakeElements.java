package CH2;

import java.util.Arrays;
import java.util.List;

public class TakeElements {
    final List<String> friends =
            Arrays.asList("Brian" , "Nate" , "Neal" , "Raju" , "Sara" , "Scott" );
    public String usingLimit(){
        friends.stream()
                .limit(3)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        return "";
    }
    public String usingtakeWhile(){
        friends.stream()
                .takeWhile(n->n.length()>4)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        return "";
    }

    public static void main(String[] args) {
        TakeElements takeElements = new TakeElements();
        takeElements.usingLimit();
        System.out.println("------------------");
        takeElements.usingtakeWhile();
    }
}
