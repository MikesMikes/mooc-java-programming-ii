
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.println(String.format("First: %d/100", container1));
            System.out.println(String.format("Second: %d/100", container2));

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            input = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (amount < 0) {
                continue;
            }

            if (input.equals("add")) {
                if (container1 + amount > 100) {
                    container1 = 100;
                } else {
                    container1 += amount;
                }
            }
            if (input.equals("move")) {
                if (container1 == 0) {
                    ;
                } else if (amount > container1) {

                    if (container1 - amount < 0) {
                        container2 += container1;
                        container1 = 0;
                    }
                } else if (container2 + amount > 100) {
                    container2 = 100;
                    container1 -= amount;
                } else {
                    container1 -= amount;
                    container2 += amount;
                }
            }
            if (input.equals("remove")) {
                if (container2 - amount < 0) {
                    container2 = 0;
                } else {
                    container2 -= amount;
                }
            }

        }
    }

}
