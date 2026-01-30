package day4.movabletext;

import javax.swing.*;

public class main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloWorldFrame frame = new HelloWorldFrame();
                frame.setVisible(true);
            }
        });

    }
}
