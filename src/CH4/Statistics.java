package CH4;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;

import static CH4.Person.SAMPLE_DATA;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.summarizingDouble;

public class Statistics {
    public static void main(String[] args) {
        DoubleSummaryStatistics collect = SAMPLE_DATA.stream()
                .collect(summarizingDouble(person -> person.emailAddresses().size()));

        System.out.println("Max : "+collect.getMax());
        System.out.println("MIN : "+collect.getMin());
        System.out.println("AVG : "+collect.getAverage());
        System.out.println( "Number of people: " + collect.getCount());
        System.out.println(
                "Number of email addresses: " + collect.getSum());
        System.out.println(Statistics.fname());
        //System.out.println(new Statistics().fname()); //used if fname method is not static
        System.out.println(Statistics.emails());
        System.out.println(Statistics.emailsFlat());

        //anyMatch
        System.out.println("Anyone has email address: "+ SAMPLE_DATA.stream()
                .anyMatch(person -> person.emailAddresses().size()>0));
        System.out.println("Anyone has 10 email address: "+ SAMPLE_DATA.stream()
                .anyMatch(person -> person.emailAddresses().size()>=10));
        //allMatch
        System.out.println( "Everyone has at least one email address: " +
                SAMPLE_DATA.stream()
                        .allMatch(person -> person.emailAddresses().size() > 0));
        System.out.println( "Everyone has zero or more email address: " +
                SAMPLE_DATA.stream()
                        .allMatch(person -> person.emailAddresses().size() >= 0));

        //partitioningBy
        Map<Boolean, List<Person>> collect1 = SAMPLE_DATA.stream()
                .collect(partitioningBy(person -> person.emailAddresses().size() > 1));
        System.out.println("Persons with emails >1 : "+collect1.get(true).size());
        System.out.println("Persons with emails <1 : "+collect1.get(false).size());

    }

    public static List<String> fname(){
        List<String> list = SAMPLE_DATA.stream()
                .map(Person::firstName)
                .toList();
        return list;
    }
    public static List<List<String>> emails(){
        List<List<String>> list = SAMPLE_DATA.stream()
                .map(Person::emailAddresses)
                .toList();
        return list;
    }

    public static List<String> emailsFlat(){
        List<String> emailAddresses = SAMPLE_DATA.stream()
                .flatMap(person -> person.emailAddresses().stream())
                .toList();
        return emailAddresses;
    }
}
