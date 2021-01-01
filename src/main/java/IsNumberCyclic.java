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

        for (int i = 1; i < 100; i++) {
            String temp = String.valueOf(number * i);
            if (temp.length() > numberToString.length()) {
                break;
            }
            multiplied.add(temp);
        }

        Iterator<String> iterator = multiplied.iterator();

        int howManyTimes = 0;
        while (iterator.hasNext()) {
            String next = iterator.next();
            int countMutualDigits = 0;
            for (int i = 0; i < next.length(); i++) {
                for (int j = 0; j < numberToString.length(); j++) {
                    if (next.charAt(i) == numberToString.charAt(j)) {
                        countMutualDigits++;
                    }
                }
            }
            if (countMutualDigits != numberToString.length()) {
                break;
            }
            if (countMutualDigits == 6) {
                howManyTimes++;
            }
            if (howManyTimes >= 2) {
                checkIfTrue = true;
            }
        }
        String msg = "";
        if (howManyTimes == 1) {
            msg = "raz";
        } else msg = "razy";
        System.out.println("liczba " + number + " jest " + howManyTimes + " " + msg + " cykliczna ");
        return checkIfTrue;
    }
}
