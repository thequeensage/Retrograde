import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CategoryFrame extends JFrame{
    private JPanel mainPanel;
    private JButton motherboardButton;
    private JButton CPUButton;
    private JButton chipsetButton;
    private JButton networkButton;
    private JButton operatingSystemButton;
    private JButton subCategory1;
    private JButton subCategory2;
    private JButton subCategory3;
    private JButton subCategory4;
    private JButton subCategory5;
    private JButton subCategory6;

    public JButton[] allButtons;
    public JButton[] majorButtons;
    public CategoryFrame(){
        allButtons = new JButton[] { motherboardButton, CPUButton, chipsetButton, networkButton, operatingSystemButton,
                subCategory1, subCategory2, subCategory3, subCategory4, subCategory5, subCategory6 };
        majorButtons = new JButton[] { motherboardButton, CPUButton, chipsetButton, networkButton, operatingSystemButton };
        __initialization__();

    }

    public void __initialization__(){
        this.setContentPane(mainPanel);
        this.pack();
        mainPanel.setBackground(ThemeValues.ROYAL_BLUE);
        for(JButton button: allButtons){
            Font thisFont = Utility.getExternalFont();
            thisFont = thisFont.deriveFont(18f);
            button.setFont(thisFont);
            button.setBackground(null);
            button.setFocusPainted(false);
            button.setBorder(null);
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    button.setBackground(Color.WHITE);
                    button.setForeground(ThemeValues.CERULEAN_BLUE);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e);
                    button.setBackground(null);
                    button.setForeground(Color.WHITE);
                }
            });
        }

        motherboardButton.addActionListener(e -> {
            resetColorMajorButtons();
            motherboardButton.setBackground(Color.WHITE);
            motherboardButton.setForeground(ThemeValues.ROYAL_BLUE);
            subCategory1.setText("System Clock");
            subCategory2.setText("Expansion Slots");
            subCategory3.setText("Ports");
            subCategory4.setText("BIOS");
            subCategory5.setText("CMOS");
            subCategory6.setText("Bus Ports");
        });
        CPUButton.addActionListener(e -> {
            resetColorMajorButtons();
            CPUButton.setBackground(Color.WHITE);
            CPUButton.setForeground(ThemeValues.ROYAL_BLUE);
            subCategory1.setText("Control Unit");
            subCategory2.setText("Arithmetic and Logic Unit");
            subCategory3.setText("Registers");
            subCategory4.setText("");
            subCategory5.setText("");
            subCategory6.setText("");
        });
        chipsetButton.addActionListener(e -> {
            resetColorMajorButtons();
            chipsetButton.setBackground(Color.WHITE);
            chipsetButton.setForeground(ThemeValues.ROYAL_BLUE);
            subCategory1.setText("Northbridge");
            subCategory2.setText("Southbridge");
            subCategory3.setText("");
            subCategory4.setText("");
            subCategory5.setText("");
            subCategory6.setText("");
        });
        networkButton.addActionListener(e -> {
            resetColorMajorButtons();
            networkButton.setBackground(Color.WHITE);
            networkButton.setForeground(ThemeValues.ROYAL_BLUE);
            subCategory1.setText("Hypertext Transfer Protocol");
            subCategory2.setText("");
            subCategory3.setText("");
            subCategory4.setText("");
            subCategory5.setText("");
            subCategory6.setText("");
        });
        operatingSystemButton.addActionListener(e -> {
            resetColorMajorButtons();
            operatingSystemButton.setBackground(Color.WHITE);
            operatingSystemButton.setForeground(ThemeValues.ROYAL_BLUE);
            subCategory1.setText("Ubuntu");
            subCategory2.setText("");
            subCategory3.setText("");
            subCategory4.setText("");
            subCategory5.setText("");
            subCategory6.setText("");
        });
    }

    public void resetColorMajorButtons(){
        for(JButton b: majorButtons){
            b.setBackground(null);
            b.setForeground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
        CategoryFrame CF = new CategoryFrame();
        CF.setVisible(true);
    }
}
