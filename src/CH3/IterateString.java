package CH3;

public class IterateString {
    public void iterateString(String str){
        str.chars()
                //.forEach(c-> System.out.println(c));
                .forEach(System.out::println);
        /**
         * Output : some numbers,
         * because the chars method returns a stream of Integers representing the letters instead of a
         * stream of Characters.
         */
    }

    public static void main(String[] args) {
        IterateString iterateString = new IterateString();
        iterateString.iterateString("Hello");
    }
}
