package CH2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Iteration {
    final List<String> friends =
            Arrays.asList( "Brian" , "Nate" , "Neal" , "Raju" , "Sara" , "Scott" );
    public String oldIteration(){
        for(int i=0;i<=friends.size()-1;i++){
            System.out.println(friends.get(i));
        }
        return "";
    }
    public String oldIteration1(){
        for(String names: friends){
            System.out.println(names);
        }
        return "";
    }
    public String forEachIteration(){
        //friends.forEach((final String name) -> System.out.println(name));
        friends.forEach(System.out::println);
        return "";
    }
    public List<String> getFriends() {
        return friends;
    }
    public static void main(String args[]){
        Iteration iteration = new Iteration();
        iteration.oldIteration();
        iteration.oldIteration1();
        iteration.forEachIteration();
    }
}
