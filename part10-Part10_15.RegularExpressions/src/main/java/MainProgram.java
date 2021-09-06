

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        Checker check = new Checker();
        String string = "oti";
        
        String test1 = "29";
        String test2 = "abc";
        String test3 = "33";
        
//        System.out.println(check.timeOfDay("16:23:04"));
//        System.out.println(check.timeOfDay("abc"));
//        System.out.println(check.timeOfDay("33:33:33"));
        
        
        String regex = "([0-1][0-9]|[2][0-3])";
        System.out.println(test1.matches(regex));
        System.out.println(test2.matches(regex));
        System.out.println(test3.matches(regex));
    }
}
