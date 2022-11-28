package main;

import controller.CalculatorController;
import model.CalculatorModel;
import nezet.GUIView;
import view.CalculatorView;

public class MVC_Szamologep
{
    public static void main(String[] args)
    {
        new CalculatorController(new CalculatorModel(), new GUIView());
    }
}
