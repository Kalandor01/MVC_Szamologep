package model;

import java.util.ArrayList;
import java.util.List;

public class CalculatorModel
{
    List<Double> numbers;
    List<Signs> singns;

    public CalculatorModel() {
        numbers = new ArrayList<>();
        singns = new ArrayList<>();
    }

    public List<Double> getNumbers() {
        return numbers;
    }
    
    public List<Signs> getSigns() {
        return singns;
    }

    public double calculate() {
        double res = 0;
        for (int x = 0; x < numbers.size(); x++) {
            if(singns.get(x).equals(Signs.PLUS)) {
                res += numbers.get(x);
            }
            else if(singns.get(x).equals(Signs.MINUS)) {
                res -= numbers.get(x);
            }
        }
        return res;
    }

    public void addNum(double num, Signs sign) {
        numbers.add(num);
        singns.add(sign);
    }
    
}
