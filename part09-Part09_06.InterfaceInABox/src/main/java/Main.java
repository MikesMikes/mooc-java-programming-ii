
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Box smallBox = new Box(10);

        smallBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        smallBox.add(new Book("Robert Martin", "Clean Code", 1));
        smallBox.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        smallBox.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        smallBox.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        smallBox.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(smallBox);
        
        Box bigBox = new Box(100);
        bigBox.add(smallBox);
        bigBox.add(smallBox);
        bigBox.add(smallBox);
        System.out.println(bigBox);
    }

}
