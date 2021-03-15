import java.util.Scanner;
public class Hackerrank {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {
            input.useDelimiter(";");
            while (input.hasNext()) {
                String next = input.next();
                if ("DONE".equals(next)) {
                    break;
                }
                System.out.println("Token:" + next);
            }
        }
    }
}



