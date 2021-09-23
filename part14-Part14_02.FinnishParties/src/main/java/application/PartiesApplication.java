package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support(%)");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        final Map<String, Map<Integer, Double>> allParties = createMap();

        allParties.keySet().stream().forEach(party -> {

            XYChart.Series oneParty = new XYChart.Series();
            oneParty.setName(party);

            allParties.get(party).entrySet().stream().forEach(pair -> {
                oneParty.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            lineChart.getData().add(oneParty);
        });

        Scene view = new Scene(lineChart);
        stage.setScene(view);
        stage.show();
    }

    public static Map<String, Map<Integer, Double>> createMap() throws IOException {
        Map<String, Map<Integer, Double>> allParties = new HashMap<>();
        String fileName = "partiesdata.tsv";
        Scanner scanner = new Scanner(Paths.get(fileName));

        String[] years = scanner.nextLine().split("\t");

        while (scanner.hasNextLine()) {
            Map<Integer, Double> onePartyData = new HashMap<>();
            String[] partyData = scanner.nextLine().split("\t");
            for (int i = 1; i < partyData.length; i++) {
                if (!partyData[i].equals("-")) {
                    onePartyData.put(Integer.valueOf(years[i]), Double.valueOf(partyData[i]));
                }
            }
            allParties.put(partyData[0], onePartyData);
        }

        return allParties;
    }

    public static void main(String[] args) throws IOException {
        launch(PartiesApplication.class);
    }
}
