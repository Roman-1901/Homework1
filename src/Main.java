import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Window");
        jf.setLayout(new FlowLayout());

        jf.setSize(300, 200);
        JLabel lb = new JLabel("Рома, не Димонь=)))");
        jf.add(lb);
        jf.setBounds(1030,450,500,400);
        jf.setVisible(true);
        lb.setVisible(true);


    }
}