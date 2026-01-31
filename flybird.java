import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class flybird extends JPanel {
    int boardWidth = 360;
    int boardHeight = 740;

    flybird() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground((Color.blue));
    }
}
