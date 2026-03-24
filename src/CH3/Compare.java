package CH3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Compare {
    final List<Person> people = Arrays.asList(
            new Person ( "John" , 20),
            new Person ( "Sara" , 21),
            new Person ( "Jane" , 21),
            new Person ( "Greg" , 35)
    );

    List<Person> ascendingAge = people.stream()
            .sorted((person1, person2)-> person1.ageDifference(person2))
            .collect(toList());

}
