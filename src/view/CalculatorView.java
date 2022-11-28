package view;

import java.util.Scanner;

public class CalculatorView extends View
{
    private final Scanner sc;

    
    public CalculatorView() {
        sc = new Scanner(System.in);
    }
    
    @Override
    public double getNmuber(int index) {
        System.out.print(index + ". szám: ");
        double num = sc.nextDouble();
        sc.nextLine();
        return num;
    };
    
    @Override
    public void display(String text) {
        System.out.println(text);
    }
}
