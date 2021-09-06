
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true){
            String i = scanner.nextLine();
            if(Integer.valueOf(i) < 0){
                break;
            }
            list.add(i);
        }
        
        list.stream()
                .filter(i -> Integer.valueOf(i) >= 1 && Integer.valueOf(i) <= 5)
                .forEach(i -> System.out.println(i));
    }
}
