package paintbrush;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    private DrawingPanel drawingPanel;

    public MainFrame() {
        setTitle("Paint Brush");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);

        JPanel toolsPanel = new JPanel();
        toolsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Tool buttons
        JButton lineBtn = new JButton("Line");
        lineBtn.addActionListener(e -> drawingPanel.setCurrentTool("Line"));

        JButton rectBtn = new JButton("Rectangle");
        rectBtn.addActionListener(e -> drawingPanel.setCurrentTool("Rectangle"));

        JButton ovalBtn = new JButton("Oval");
        ovalBtn.addActionListener(e -> drawingPanel.setCurrentTool("Oval"));

        // Color chooser button
        JButton colorBtn = new JButton("Color");
        colorBtn.addActionListener(e -> {
            Color selected = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
            if (selected != null) {
                drawingPanel.setCurrentColor(selected);
            }
        });

        // Filled / Dotted checkboxes
        JCheckBox filledCB = new JCheckBox("Filled");
        filledCB.addActionListener(e -> drawingPanel.setFilled(filledCB.isSelected()));

        JCheckBox dottedCB = new JCheckBox("Dotted");
        dottedCB.addActionListener(e -> drawingPanel.setDotted(dottedCB.isSelected()));

        // Clear button
        JButton clearBtn = new JButton("Clear");
        clearBtn.addActionListener(e -> drawingPanel.clear());

        // Add all to panel
        toolsPanel.add(lineBtn);
        toolsPanel.add(rectBtn);
        toolsPanel.add(ovalBtn);
        toolsPanel.add(colorBtn);
        toolsPanel.add(filledCB);
        toolsPanel.add(dottedCB);
        toolsPanel.add(clearBtn);

        add(toolsPanel, BorderLayout.NORTH);

        setVisible(true);
    }

}
