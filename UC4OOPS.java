public class UC4OOPS {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", "W", "E", "L", " ", "*"),
            String.join("", "*", " ", "C", "O", "M", " ", "*"),
            String.join("", "*", " ", "E", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}