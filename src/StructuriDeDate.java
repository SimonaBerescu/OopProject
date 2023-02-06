import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StructuriDeDate {
    public static void main(String[] args) {
        ArrayList<String> listaNoastra = new ArrayList<>();
        listaNoastra.add("First");
        listaNoastra.add("Second");
        listaNoastra.add("Third");
        listaNoastra.set(0, "First updated");
        //listaNoastra.remove(0);
        System.out.println(listaNoastra.get(0));
        System.out.println(listaNoastra.contains("Second"));
        System.out.println(listaNoastra.indexOf("Third"));
        for (String value : listaNoastra) {
            System.out.println(value);
        }
        HashMap<Integer, String> dictionarulNostru = new HashMap<>();
        dictionarulNostru.put(1, "First");
        dictionarulNostru.put(2, "Second");
        dictionarulNostru.put(3, "Third");
        dictionarulNostru.replace(1, "First updated");
        System.out.println(dictionarulNostru.get(1));
        System.out.println(dictionarulNostru.keySet());
        System.out.println(dictionarulNostru.values());
        System.out.println(dictionarulNostru.entrySet());

        HashMap<String, Boolean> cineTreceExamenul = new HashMap<>();
        cineTreceExamenul.put("Maria Popescu", true);
        cineTreceExamenul.put("Iulian Ionescu", true);
        cineTreceExamenul.put("Carina Sava", false);
        cineTreceExamenul.put("Ioana Vas", true);
        cineTreceExamenul.put("Marian Pop", false);

        //varianta cu lamda:
     /*   cineTreceExamenul.forEach((k,v)-> {
            if (v) {
                System.out.println(k);
            }}

*/
        for (String nume : cineTreceExamenul.keySet()) {
            if (cineTreceExamenul.get(nume)) {
                //if it's boolean, get(name) implicit e comparat cu "true"
                System.out.println("key: " + nume + " value: " + cineTreceExamenul.get(nume));
            }
        }

    }
}






