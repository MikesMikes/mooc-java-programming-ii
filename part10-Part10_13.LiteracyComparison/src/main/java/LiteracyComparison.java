
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        ArrayList<Country> countries = new ArrayList<>();
        // public Country(String name, int year, String sex, double rate) 
        //[0] Adult literacy rate, [1] population 15+ years, [2] male (%),[3] Honduras,[4] 2014, [5] 87.39595

        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Country(parts[3], Integer.valueOf(parts[4]), parts[2].replace("(%)", "").trim(), Double.valueOf(parts[5])))
                    .forEach(i -> countries.add( i));
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
        
        countries.stream()
                .sorted((p1, p2) -> {
                    if(p1.getRate() > p2.getRate()){
                        return 1;
                    }
                    if(p1.getRate() < p2.getRate()){
                        return -1;
                    }
                    return 0;
                }).forEach(i -> System.out.println(i));
        
//        Collections.sort(countries, new Comparator<Country>(){
//            @Override
//            public int compare(Country c1, Country c2){
//                return Double.compare(c2.getRate(), c1.getRate());
//            }
//        });
//        
//        Collections.reverse(countries);
//        
//        countries.stream().forEach(i -> System.out.println(i));
    }
}
