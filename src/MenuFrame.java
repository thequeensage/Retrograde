import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame{
    private JButton startButton;
    private JButton howToPlayButton;
    private JButton highscoreButton;
    private JButton exitButton;
    private JPanel mainPanel;

    public MenuFrame(){
        Utility.__initialization__(this, mainPanel);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int process = JOptionPane.showConfirmDialog(null, "Are you sure want to quit?");
                if (process == JOptionPane.YES_OPTION) System.exit(0);
            }
        });
        howToPlayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                HowToPlayFrame HF = new HowToPlayFrame();
                HF.setVisible(true);
            }
        });
        highscoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                HighScoreFrame HF = new HighScoreFrame();
                HF.setVisible(true);
            }
        });
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                StoryFrame SF = new StoryFrame();
                SF.setVisible(true);
            }
        });
    }
}
