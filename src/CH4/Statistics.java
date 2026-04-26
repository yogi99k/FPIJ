package CH4;

import java.util.DoubleSummaryStatistics;
import java.util.List;

import static CH4.Person.SAMPLE_DATA;
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
    }

    public static List<String> fname(){
        List<String> list = SAMPLE_DATA.stream()
                .map(Person::firstName)
                .toList();
        return list;
    }
}
