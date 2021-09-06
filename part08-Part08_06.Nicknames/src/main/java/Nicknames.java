
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> hashed = new HashMap<>();
        hashed.put("matthew", "matt");
        hashed.put("michae","mix");
        hashed.put("arthur", "artie");
        System.out.println(hashed.get("matthew"));
    }

}
