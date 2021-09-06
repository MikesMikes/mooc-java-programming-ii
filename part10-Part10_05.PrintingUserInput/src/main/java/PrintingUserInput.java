
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true){
            String string = scanner.nextLine();
            if(string.equals("")){
                break;
            }
            
            list.add(string);
        }
        
        list.stream()
                .forEach(i -> System.out.println(i));
    }
}
