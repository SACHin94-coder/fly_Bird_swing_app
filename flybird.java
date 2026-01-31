import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class flybird extends JPanel {
    int boardWidth = 360;
    int boardHeight = 740;

    // images
    Image background;
    Image topPipe;
    Image lowPipe;
    Image bird;

    flybird() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground((Color.blue));

        background = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        topPipe = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        lowPipe = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
        bird = new ImageIcon(getClass().getResource("./bird.png")).getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.drawImage(background, 0, 0, boardWidth, boardHeight, null);
    }
}
