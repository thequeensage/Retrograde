import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HowToPlayFrame extends JFrame{
    private JButton backButton;
    private JPanel mainPanel;
    public HowToPlayFrame(){
        Utility.__initialization__(this, mainPanel);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuFrame MF = new MenuFrame();
                MF.setVisible(true);
            }
        });
    }
}
