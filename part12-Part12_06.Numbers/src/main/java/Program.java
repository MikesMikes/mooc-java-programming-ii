
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many numbers should be printed?");
        int numbers = scanner.nextInt();
        for(int i = 0; i < numbers; i++){
            System.out.println(random.nextInt(11));
        }
    }

}
