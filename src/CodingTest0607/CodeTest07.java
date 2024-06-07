package CodingTest0607;

public class CodeTest07 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "ban";

        int answer = my_string.indexOf(is_prefix);

        if (answer == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
