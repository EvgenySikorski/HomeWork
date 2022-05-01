package HomeWork1.test;

import org.junit.jupiter.api.Assertions;
import HomeWork1.task4;
import org.junit.jupiter.api.Test;
public class Task4Test {

    @Test
    public void sleepInWork(){
        task4 test1 = new task4();

        Boolean workDay = true;
        Boolean vacation = false;
        Boolean resultExpect = false;
        Boolean resultActual = test1.sleepIn(workDay, vacation);


        Assertions.assertEquals(resultExpect, resultActual);
    }

    @Test
    public void sleepInWVacation(){
        task4 test1 = new task4();

        Boolean workDay = true;
        Boolean vacation = true;
        Boolean resultExpect = true;
        Boolean resultActual = test1.sleepIn(workDay, vacation);

        Assertions.assertEquals(resultExpect, resultActual);
    }

    @Test
    public void sleepInWWeekend(){
        task4 test1 = new task4();

        Boolean workDay = false;
        Boolean vacation = false;
        Boolean resultExpect = true;
        Boolean resultActual = test1.sleepIn(workDay, vacation);

        Assertions.assertEquals(resultExpect, resultActual);
    }


}
