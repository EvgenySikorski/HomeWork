package home_work_3.calcs.additional;


public class CalculatorWithCounterAutoComposite {

    public CalculatorWithCounterAutoComposite(){
        CalculatorWithCounterAutoComposite operat7 = new CalculatorWithCounterAutoComposite();
    }

    private long count;
    public long getCountOperation(){
        return count;
    }



}



