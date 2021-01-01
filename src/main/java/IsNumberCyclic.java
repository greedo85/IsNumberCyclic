import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IsNumberCyclic {

    public static void main( String[] args ) {
        isCyclic(142856);
        //125874*2=251748
        //142857
    }

    public static boolean isCyclic( long number ) {
        String numberToString = String.valueOf(number);
        List<String> multiplied = new ArrayList<>();
        boolean checkIfTrue = false;
        /*Mnożymy do momentu aż długość wyniku nie będzie większa niż długość liczby*/
        for (int i = 1; i < 100; i++) {
            String temp = String.valueOf(number * i);
            if (temp.length() > numberToString.length()) {
                break;
            }
            multiplied.add(temp);
        }
        /*Tworzymy iterator i wyświetlamy listę*/
        Iterator<String> iterator = multiplied.iterator();
       /* while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }*/

        int isTrue = 0;
        while (iterator.hasNext()) {
            String next = iterator.next();
            int count = 0;
            for (int i = 0; i < next.length(); i++) {
                for (int j = 0; j < numberToString.length(); j++) {
                    if (next.charAt(i) == numberToString.charAt(j)) {
                        count++;
                    }
                }
            }
            if (count != numberToString.length()) {
                break;
            }
            System.out.println("count: " + count);
            if (count == 6) {
                isTrue++;
            }
            if (isTrue >= 2) {
                checkIfTrue = true;
            }
        }
        return checkIfTrue;
    }
}
