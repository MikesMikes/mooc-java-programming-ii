package FlightControl;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl fc = new FlightControl(scanner);
//        fc.addAirplane("a1", 100);
//        fc.addFlight(fc.getAirplane("a1"), "BAL", "HEL");
//        fc.addFlight(fc.getAirplane("a1"), "HEL", "BAL");
//        System.out.println(fc.getAirplanes());
//        System.out.println(fc.getFlights());
        TextUI ui = new TextUI(fc, scanner);
        ui.start();
        
    }
}
