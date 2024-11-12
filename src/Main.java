import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainScreen mainScreen = new MainScreen();

        JFrame frame = new JFrame("Aplicación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainScreen.getMainPanel());
        frame.setSize(1000,500);
        frame.setVisible(true);


    }
}