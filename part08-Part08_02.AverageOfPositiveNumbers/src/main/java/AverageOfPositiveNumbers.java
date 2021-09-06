
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int added = 0;
        int numbers = 0;
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0){
                break;
            }
            if(input >= 0){
                added += input;
                numbers++;
            }
            
            
        }
        if(added <= 0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = (1.0*added)/numbers;
            System.out.println(average);
        }
    }
}
