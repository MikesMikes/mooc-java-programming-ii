package application;

import java.util.Arrays;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        String string
                = "2007 73\n"
                + "2008 68\n"
                + "2009 72\n"
                + "2010 72\n"
                + "2011 74\n"
                + "2012 73\n"
                + "2013 76\n"
                + "2014 73\n"
                + "2015 67\n"
                + "2016 56\n"
                + "2017 56";

        String[] parts = string.split("\n");
        System.out.println(Arrays.deepToString(parts));

        HashMap<Integer, Integer> yearPct = new HashMap<>();
        for (String i : parts) {
            String[] k = i.split(" ");
            yearPct.put(Integer.valueOf(k[0]), Integer.valueOf(k[1]));
        }


        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        XYChart.Series data = new XYChart.Series();
        data.setName("Helinski");

        yearPct.entrySet().stream().forEach(i -> {
            data.getData().add(new XYChart.Data(i.getKey(), i.getValue()));
        });

        lineChart.getData().add(data);

        Scene view = new Scene(lineChart);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
