import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTable tblSymbols;
    private JButton btnCompile;
    private JButton btnScanner;
    private JButton compileButton;
    private JButton scannerButton;
    private JButton btnParser;
    private JButton btnSemantic;

    public MainScreen() {

      /*  tblSymbols.setPreferredScrollableViewportSize(new Dimension(400, 150)); // Ajusta las dimensiones aquí

        // Asegúrate de que table1 esté dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(tblSymbols);
        mainPanel.add(scrollPane);
        mainPanel.validate();
        mainPanel.repaint();*/

        btnParser.setEnabled(false);
        btnSemantic.setEnabled(false);

        btnCompile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnScanner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnParser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnSemantic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void lexer() {}
    private void parser() {}

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTable getTblSymbols() {
        return tblSymbols;
    }


    public void setTblSymbols(JTable tblSymbols) {
        this.tblSymbols = tblSymbols;
    }
}
