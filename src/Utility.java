import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

interface ThemeValues {
    Font F = (new Font("Segoe UI", Font.PLAIN, 24));
    Color ROYAL_BLUE = new Color(29, 87, 235);
    Color CERULEAN_BLUE = new Color(52,102, 192);
    Color BLUE_CHILL = new Color(14, 167, 172);
    Color MOUNTAIN_MEADOW = new Color(34, 181, 146);
    Color MALACHITE = new Color(25, 235, 130);
}
public interface Utility {
    static void __initialization__(JFrame frame, JPanel panel){
        frame.setIconImage(new ImageIcon(Utility.getThisResource("images/icon.png")).getImage());
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Retrograde");
        panel.setBackground(ThemeValues.ROYAL_BLUE);
        styleComponents(panel.getComponents());
//        recheckScreen(frame);
        frame.setLocationRelativeTo(null);
        frame.pack();
    }
    /*static void recheckScreen(JFrame frame){
        boolean isFullScreen = DataEdit.getDataLineAt(DataEdit.FULLSCREEN_dl).contains("ON");
        if(!isFullScreen){
            frame.pack();
        }else if(isFullScreen){
            frame.setUndecorated(true);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }else{
            System.out.println("ERROR CANT FIND SPECIFIED FILE");
        }
    }*/
    static Font getExternalFont(){
        InputStream IS = Utility.class.getResourceAsStream("resources/dogica.ttf");
        Font font = null;
        try{
            font = Font.createFont(Font.TRUETYPE_FONT, IS);
        }catch (IOException e){
            e.printStackTrace();
        }catch (FontFormatException e){
            e.printStackTrace();
        }
        font = font.deriveFont(11f);
        return font;
    }

    static void styleComponents(Component[] C){
        for(Component c: C){
            String name = c.getClass().getName();
            c.setFont(Utility.getExternalFont());
            if(name.contains("JButton")){
                JButton b = (JButton) c;
                b.setFocusPainted(false);
                b.setFocusable(false);
                b.setBorderPainted(false);
                b.setForeground(ThemeValues.MALACHITE);
                if(b.getIcon() == null){
                    b.setBackground(ThemeValues.ROYAL_BLUE);
                    b.setForeground(ThemeValues.MALACHITE);
                }
                else{
                    b.setContentAreaFilled(false);
                    b.setBackground(null);
                    b.setForeground(ThemeValues.MOUNTAIN_MEADOW);
                    String path = b.getIcon().toString();
                    b.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            super.mouseEntered(e);
                            if(path.contains("start")){
                                b.setIcon(new ImageIcon(getThisResource("start_hover.png")));
                            }
                            if(path.contains("cont")){
                                b.setIcon(new ImageIcon(getThisResource("cont_hover.png")));
                            }
                            if(path.contains("category")){
                                b.setIcon(new ImageIcon(getThisResource("category_hover.png")));
                            }
                            if(path.contains("High")){
                                b.setIcon(new ImageIcon(getThisResource("High_hover.png")));
                            }
                            if(path.contains("category")){
                                b.setIcon(new ImageIcon(getThisResource("category_hover.png")));
                            }
                            if(path.contains("how")){
                                b.setIcon(new ImageIcon(getThisResource("how_hover.png")));
                            }
                            if(path.contains("exit")){
                                b.setIcon(new ImageIcon(getThisResource("exit_hover.png")));
                            }
                            if(path.contains("5050")){
                                b.setIcon(new ImageIcon(getThisResource("5050_hover.png")));
                            }
                            if(path.contains("ask")){
                                b.setIcon(new ImageIcon(getThisResource("ask_hover.png")));
                            }
                            if(path.contains("skip")){
                                b.setIcon(new ImageIcon(getThisResource("skip_hover.png")));
                            }
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                            super.mouseExited(e);
                            if(path.contains("start")){
                                b.setIcon(new ImageIcon(getThisResource("start.png")));
                            }
                            if(path.contains("cont")){
                                b.setIcon(new ImageIcon(getThisResource("cont.png")));
                            }
                            if(path.contains("category")){
                                b.setIcon(new ImageIcon(getThisResource("category.png")));
                            }
                            if(path.contains("High")){
                                b.setIcon(new ImageIcon(getThisResource("High.png")));
                            }
                            if(path.contains("how")){
                                b.setIcon(new ImageIcon(getThisResource("how.png")));
                            }
                            if(path.contains("exit")){
                                b.setIcon(new ImageIcon(getThisResource("exit.png")));
                            }
                            if(path.contains("5050")){
                                b.setIcon(new ImageIcon(getThisResource("5050.png")));
                            }
                            if(path.contains("ask")){
                                b.setIcon(new ImageIcon(getThisResource("ask.png")));
                            }
                            if(path.contains("skip")){
                                b.setIcon(new ImageIcon(getThisResource("skip.png")));
                            }
                        }
                    });
                }

            }
            else if(name.contains("JComboBox")){
                JComboBox b = (JComboBox) c;
                b.setForeground(ThemeValues.MALACHITE);
                b.setBackground(ThemeValues.ROYAL_BLUE);
                b.setBorder(null);
                b.setFocusable(false);
            }
            else if(name.contains("JLabel")){
                c.setForeground(ThemeValues.MOUNTAIN_MEADOW);
            }
            else if(name.contains("JPanel")){
                JPanel p= (JPanel) c;
                p.setBackground(ThemeValues.CERULEAN_BLUE);
                styleComponents(p.getComponents());
            }

        }
    }

    static URL getThisResource(String str){
        return Utility.class.getResource("resources/" + str);
    }

    static boolean isNull(String str){
        if (str.equals("") || str.equals(" ") || str == null){
            return true;
        }
        else if(!str.equals("") && !str.equals(" ") || str != null){
            return false;
        }
        else{
            System.out.println("ERROR ON ISNULL RETURNING FALSE BREAKER");
            return false;
        }
    }
}
