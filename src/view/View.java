package view;

import java.util.List;
import model.Signs;

public abstract class View
{
    private String text;
    
    public abstract double getNmuber(int index);
    
    public abstract void display(String text);

    public String getText() {
        return text;
    }

    public void setText(List<Double> numbers, List<Signs> signs, double result) {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < numbers.size(); x++)
        {
            sb.append(numbers.get(x));
            if(x < numbers.size() - 1) {
                if(signs.get(x) == Signs.PLUS)
                    sb.append(" + ");
                if(signs.get(x) == Signs.MINUS)
                    sb.append(" - ");
            }
            else {
                sb.append(" = ");
            }
        }
        sb.append(result);
        text = sb.toString();
    }
}
