package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Title?");
        String title = "--title=" + scanner.nextLine();
//        System.out.println(title);
        Application.launch(UserTitle.class,
            title);
    }

}
