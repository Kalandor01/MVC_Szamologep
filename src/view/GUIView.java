package nezet;

import java.util.List;
import javax.swing.JButton;
import model.Signs;

public class GUIView extends javax.swing.JFrame
{
    public GUIView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        subButton = new javax.swing.JButton();
        num1Spinner = new javax.swing.JSpinner();
        num2Spinner = new javax.swing.JSpinner();
        resultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addButton.setText("Összead");

        subButton.setText("Kivon");

        resultLabel.setText("Eredmény: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(num1Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(num2Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(resultLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(subButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num2Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num1Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59)
                .addComponent(resultLabel)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public JButton getAddButton() {
    return addButton;
}

public JButton getSubButton() {
    return subButton;
}

private String text;
    
    public double getNmuber(int index) {
        if(index == 1)
            return (double)num1Spinner.getValue();
        else
            return (double)num2Spinner.getValue();
    }
    
    public void display(String text) {
        resultLabel.setText(text);
    };

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JSpinner num1Spinner;
    private javax.swing.JSpinner num2Spinner;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton subButton;
    // End of variables declaration//GEN-END:variables
}
