import java.util.HashMap;
import java.util.Map;

public class Base {

    Map<String, String> base;

    /**
     * Konstruktor klassa
     */
    public Base(){

        base = new HashMap<String, String>();
    }

    /**
     * Metod dobavkeniya znachenii
     * @param slovo1 pervoe slovo
     * @param slovo2 perevod pervogo slova
     */
    public void dobavlenie(String slovo1, String slovo2) {

    base.put(slovo1, slovo2);
    }
}
