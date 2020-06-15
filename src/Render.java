import javax.swing.*;
import java.awt.*;

public class Render extends JPanel {

    private static final long serialVersComUID = 1L;

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        FlappyBird.flappyBird.repaint(g);
    }


}
