package CH4;

import java.util.List;

import static CH4.Person.SAMPLE_DATA;
import static java.util.stream.Collectors.averagingDouble;

public class AvgNumOfEmailAddresses {
    public static void main(String[] args) {
//        Person person = new Person();
        System.out.println("Average number of email addresses:"+
                SAMPLE_DATA.stream()
                        //V1
                        //.map(Person::emailAddresses)
                        //.mapToDouble(List::size)
                        //.sum()/SAMPLE_DATA.size() * 1.0
                        //V2
//                        .mapToDouble(person->person.emailAddresses().size())
//                        .average()
//                        .orElse(0)
                //V3
                        .collect(averagingDouble(person -> person.emailAddresses().size()))
        );
    }
}
