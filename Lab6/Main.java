package mirea;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Font defaultFont = new Font("Times new roman", Font.BOLD, 14);
    public JTextField textField = new JTextField("");
    public JButton button = new JButton("Выбрать");
    public JLabel labelAsk = new JLabel("Выберите число от 1 до 20");

    public int num = 0;
    public int userNum = 0;
    public int tries = 3;
    public boolean ended = false;

    protected static String result1 = "Неправильно. Осталось x попыток";
    protected static String result2 = "Вы проиграли. Число z";
    protected static String result3 = "Вы выиграли!";

    Main() {
        super("Lab 6");
        num = 1 + (int)(Math.random() * 20);

        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        add(panel, BorderLayout.CENTER);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(labelAsk);
        panel.add(textField);
        panel.add(button);
        setSize(400, 150);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userNum = Integer.parseInt(textField.getText());
                if(userNum == num)
                {
                    ended = true;
                }
                else {
                    tries = tries - 1;
                    if (tries == 0) ended = true;
                }
                updateButtonText();
            }
        });
    }

    private void updateButtonText() {
        if (userNum == num)
            button.setText(result3);
        else if (tries > 0) {
            if (num>userNum)
                button.setText(result1.replace("x", String.format("%d", tries))+" Число больше");
            else
                button.setText(result1.replace("x", String.format("%d", tries))+" Число меньше");
        }
        else
            button.setText(result2.replace("z", String.format("%d", num)));
    }

    public static void main(String[] args) {
        new Main();
    }
}