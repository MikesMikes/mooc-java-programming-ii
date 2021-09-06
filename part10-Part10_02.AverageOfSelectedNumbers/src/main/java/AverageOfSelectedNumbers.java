
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        List<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type ''end'' to stop." );
        while(true){
            String i = scanner.nextLine();
            if(i.equals("end")){
                break;
            }
            
            inputs.add(i);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        
        double averagePositive = inputs.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
        
        double averageNegative = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
        
        if(input.equals("p")){
            System.out.println("The average of positive numbers: " + averagePositive);
        } else {
            System.out.println("The average of negative numbers: " + averageNegative);
        }
        
    }
}
