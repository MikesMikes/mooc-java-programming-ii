
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        
        List<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type ''end'' to stop");
        while(true){
            String part = scanner.nextLine();
            if(part.equals("end")){
                break;
            }
            inputs.add(part);
        }
        
        double average = inputs.stream()
                .mapToDouble(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("average of the numbers: " + average);
    }
}
