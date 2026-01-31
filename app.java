import javax.swing.*;
//import sun.awt.resources.awt;

public class app {
    public static void main(String[] args) throws Exception {

        int boardWidth = 360;
        int boardHeight = 640;
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        flybird flyb = new flybird();
    }

}
