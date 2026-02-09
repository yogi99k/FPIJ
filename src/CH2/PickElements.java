package CH2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PickElements {
    final List<String> friends =
            Arrays.asList( "Brian" , "Nate" , "Neal" , "Raju" , "Sara" , "Scott" );
    static List<String> letterStartWithN = new ArrayList<>();
    public String usingForLoop(){
        for(String names:friends){
            if(names.startsWith("N")){
                letterStartWithN.add(names);
            }
        }
        System.out.println(letterStartWithN);
        System.out.println(String.format( "Found %d names" , letterStartWithN.size()));
        return "";
    }
    public String usingFilter(){
        List<String> n = friends.stream()
                .filter(names -> names.startsWith("N"))
                .collect(Collectors.toList());
        System.out.println(n);
        System.out.println(friends);
        return "";
    }

    public static void main(String[] args) {
        PickElements pickElements = new PickElements();
        pickElements.usingForLoop();
        pickElements.usingFilter();
    }
}
