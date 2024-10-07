package top.drewssite;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class ClockDriver {

    public static void main(String[] args) {

        int printedSecond = Instant.now().get(ChronoField.SECOND_OF_DAY);
        int currentSecond;

        while (true) { //loops forever (and really fast)

            currentSecond = Instant.now().get(ChronoField.SECOND_OF_DAY); //get the current second

            if (printedSecond != currentSecond) { //if the current second isn't what was last printed

                printedSecond = currentSecond; //set printedSecond to the current second
                System.out.print("\r"+printedSecond); //print it to the user

            }

        }

    }

}
