import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;

import javax.swing.*;

public class WebcamTester {
//    static {
//        Webcam.setDriver(Webcam.getDefault());
//    }

    public static void main(String[] args) {
        System.setProperty("webcam.debug", "true");

        JFrame frame = new JFrame("Capture Driver Demo");
        frame.add(new WebcamPanel(Webcam.getDefault()));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
