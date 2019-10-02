

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame implements ChangeListener {

    private Container c;
    private JPanel panel;
    private JLabel redlabel, greenlabel, bluelabel,preview;
    private JSlider redslider, greenslider, blueslider;
    private JTextField redtf, greentf, bluetf;

    Slider() {
        Rouf();
    }

    public void Rouf() {
        
        
        c = this.getContentPane();
        c.setLayout(null);

        redlabel = new JLabel("Red");
        redlabel.setBounds(50, 50, 80, 50);
        c.add(redlabel);

        redslider = new JSlider(0, 255, 0);
        redslider.setBounds(90, 50, 300, 50);
        c.add(redslider);

        redtf = new JTextField();
        redtf.setBounds(400, 50, 80, 40);
        redtf.setHorizontalAlignment(JTextField.CENTER);
        c.add(redtf);

        greenlabel = new JLabel("Green");
        greenlabel.setBounds(50, 110, 80, 50);
        c.add(greenlabel);

        greenslider = new JSlider(0, 255, 0);
        greenslider.setBounds(90, 110, 300, 50);
        c.add(greenslider);

        greentf = new JTextField();
        greentf.setBounds(400, 110, 80, 40);
        greentf.setHorizontalAlignment(JTextField.CENTER);
        c.add(greentf);

        bluelabel = new JLabel("Blue");
        bluelabel.setBounds(50, 170, 80, 50);
        c.add(bluelabel);

        blueslider = new JSlider(0, 255, 0);
        blueslider.setBounds(90, 170, 300, 50);
        c.add(blueslider);

        bluetf = new JTextField();
        bluetf.setBounds(400, 170, 80, 40);
        bluetf.setHorizontalAlignment(JTextField.CENTER);
        c.add(bluetf);

        panel = new JPanel();
        panel.setBounds(550, 50, 200, 160);
        panel.setBackground(Color.PINK);
        c.add(panel);
        
        preview = new JLabel("Preview");
        preview.setBounds(630, 200, 100, 50);
        c.add(preview);
        
        redslider.addChangeListener(this);
        greenslider.addChangeListener(this);
        blueslider.addChangeListener(this);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 100, 800, 450);
        this.setTitle("Slider Demo");
        
      
    }

    
    @Override
    public void stateChanged(ChangeEvent ce) {
        
        int redvalue = redslider.getValue();
        int greenvalue = greenslider.getValue();
        int bluevalue = blueslider.getValue();
        
        redtf.setText(""+redvalue);
        greentf.setText(""+greenvalue);
        bluetf.setText(""+bluevalue);
        
          Color color = new Color(redvalue,greenvalue,bluevalue);
          panel.setBackground(color);
    }
    public static void main(String[] args) {

        Slider frame = new Slider();
       /* frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 800, 450);
        frame.setTitle("Slider Demo");
        */    
}

    @Override
    public void dispose() {
        super.dispose(); //To change body of generated methods, choose Tools | Templates.
    }


}
