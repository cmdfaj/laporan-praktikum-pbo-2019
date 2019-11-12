package percobaan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm1841720175Fajar extends JFrame {

    private static final int FRAME_WIDTH = 700;
    private static final int FRAME_HEIGHT = 300;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton buttontambah;
    private JPanel panel;

    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil (x): ");
        dLabel = new JLabel("Hasil (+): ");

        final int field_width = 10;
        aField = new JTextField(field_width);
        aField.setText("0");
        bField = new JTextField(field_width);
        bField.setText("0");
    }

    private void createButton() {
        button = new JButton("Calculate (x)");
        class AddInterestListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("\nHasil (x):" + c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }

    private void createButtonTambah() {
        buttontambah = new JButton("Calculate (+)");
        class AddInterestListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int d = a + b;
                dLabel.setText("\nHasil (+): " + d);
            }
        }
        ActionListener listener = new AddInterestListener();
        buttontambah.addActionListener(listener);
    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(buttontambah);
        panel.add(cLabel);
        panel.add(dLabel);
        add(panel);
    }

    public MyInputForm1841720175Fajar() {
        createTextField();
        createButton();
        createButtonTambah();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm1841720175Fajar();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

}
