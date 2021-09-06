
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        ArrayList<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(i -> new Book(i[0], Integer.valueOf(i[1]), Integer.valueOf(i[2]), i[3]))
                    .forEach(i -> books.add(i));
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        
        return books;
    }
}
