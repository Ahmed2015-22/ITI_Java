package day3.font;

import javax.swing.*;
import java.awt.*;

public class FontListFrame extends JFrame {

    private FontService fontService;

    public FontListFrame() {
        fontService = new FontService();
        initUI();
    }

    private void initUI() {
        setTitle("List of Fonts");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        Font[] fonts = fontService.getAllFonts();

        for (Font font : fonts) {
            JLabel label = new JLabel(font.getFontName());
            label.setFont(new Font(font.getFontName(), Font.PLAIN, 18));
            panel.add(label);
        }

        JScrollPane scrollPane = new JScrollPane(panel);
        add(scrollPane);

        setVisible(true);
    }
}
