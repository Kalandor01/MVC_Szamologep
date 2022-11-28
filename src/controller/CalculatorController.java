package controller;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JButton;
import model.CalculatorModel;
import model.Signs;
import nezet.GUIView;
import view.View;

public class CalculatorController
{
    CalculatorModel model;
    GUIView gview;
    
    JButton addButton;
    JButton subButton;
    
    public CalculatorController(CalculatorModel model, View view)
    {
        int x = 1;
        while (true) {
            double num = view.getNmuber(x);
            model.addNum(num, (x % 2 == 0 ? Signs.PLUS : Signs.MINUS));
            if(x > 1)
            {
                double result = model.calculate();
                List<Double> numbers = model.getNumbers();
                List<Signs> signs = model.getSigns();
                view.setText(numbers, signs, result);
                view.display(view.getText());
            }
            x++;
        }
    }
    
    public CalculatorController(CalculatorModel model, GUIView view)
    {
        this.model = model;
        gview = view;
        gview.setVisible(true);
        
        addButton = view.getAddButton();
        subButton = view.getSubButton();
        
        addButton.addActionListener(this::clickAddButon);
        subButton.addActionListener(this::clickSubButon);
    }

    private void clickAddButon(ActionEvent e) {
        clickButton(Signs.PLUS);
    }

    private void clickSubButon(ActionEvent e) {
        clickButton(Signs.MINUS);
    }
    
    private void clickButton(Signs sign) {
        double num1 = gview.getNmuber(1);
        double num2 = gview.getNmuber(2);
        model.addNum(num1, Signs.PLUS);
        model.addNum(num2, sign);
        double result = model.calculate();
        List<Double> numbers = model.getNumbers();
        List<Signs> signs = model.getSigns();
        gview.setText(numbers, signs, result);
        gview.display(gview.getText());
    }
}
