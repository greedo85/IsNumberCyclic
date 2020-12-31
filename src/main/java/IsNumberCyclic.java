import java.util.ArrayList;
import java.util.List;

public class IsNumberCyclic {

    public static void main( String[] args ) {
        isCyclic(142857);
        //125874*2=251748
    }

    public static boolean isCyclic( long number ) {
        String nr = String.valueOf(number);
        List<String> multiplied = new ArrayList<>();
        boolean check = false;
        for (int i = 2; i <= 100; i++) {
            long temp = number * i;
            if (String.valueOf(temp).length() > nr.length()) {
                break;
            }
            multiplied.add(String.valueOf(temp));
        }
        System.out.println("tablica permutacji");
        for (String s : multiplied) {
            System.out.println(s);
        }
        int counter = 0;
        for (int j = 0; j < multiplied.get(0).length(); j++) {
            for (int k = 0; k < nr.length(); k++) {
                if (multiplied.get(0).charAt(j) == nr.charAt(k)) {
                    counter += 1;
                }
            }
            if (counter == nr.length()) {
                return true;
            }
        }

        return check;
    }
}
