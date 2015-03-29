import javax.swing.*;
import java.awt.*;

public class VideoBrowser {
    private JFrame _jFrame;
    private JPanel _mainPanel;
    private JPanel _list;
    private JPanel _viewer;

    public VideoBrowser() {
        JScrollPane test = new JScrollPane(new JLabel("<html><head></head><body><ul><li>test</li><li>test1</li></ul></body></html>"));
        _mainPanel = new JPanel(new BorderLayout());
        _mainPanel.add(test, BorderLayout.CENTER);

        _jFrame = new JFrame();
        _jFrame.add(_mainPanel);
        _jFrame.pack();
        _jFrame.setVisible(true);
    }
}