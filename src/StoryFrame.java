import javax.swing.*;

public class StoryFrame extends JFrame {

    private JPanel mainPanel;
    private JLabel test;

    public StoryFrame(){
        Utility.__initialization__(this, mainPanel);
    }

    public static void main(String[] args) {
        StoryFrame SF = new StoryFrame();
        SF.setVisible(true);
    }
}
