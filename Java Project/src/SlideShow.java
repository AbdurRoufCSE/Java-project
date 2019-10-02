

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShow extends JFrame implements ActionListener  {

    private Container c;
    private JButton prevButton, nextButton;
    private CardLayout card; 
    private JPanel panel;
    private ImageIcon icon;
    private JLabel label;

    SlideShow() {
        Rouf();
        }
   
    public void Rouf() {

        c = this.getContentPane();
        c.setLayout(card);
        c.setBackground(Color.PINK);
        
        
         card = new CardLayout();
        
        panel = new JPanel(card);
        panel.setBounds(10, 10, 560, 380);
        c.add(panel);
        
        prevButton = new JButton("Previus");
        prevButton.setBounds(10, 400, 100, 50);
        c.add(prevButton);
        
        nextButton = new JButton("Next");
        nextButton.setBounds(470, 400, 100, 50);
        c.add(nextButton);
          String[] imageNames = {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg","DSCN9471.jpg","rouf.jpg" };
        
        for (String n : imageNames  ) {
            icon = new ImageIcon("src/islamic picture"+n);
            
            Image img = icon.getImage();
            Image NewImage = img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(NewImage);
            
            label = new JLabel(icon);
            panel.add(label);
        }
        
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("SlideShow Demo");
        
        
       prevButton.addActionListener(this);
       nextButton.addActionListener(this);
   
    }

    
     @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==prevButton){
             card.previous(panel);
        }
        else if(ae.getSource()==nextButton){
             card.next(panel);
        }
        
        
    }
    public static void main(String[] args) {

       SlideShow frame = new SlideShow();
       /* frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 600, 500);
        frame.setTitle("SlideShow Demo");*/
   
    }


    @Override
    public void dispose() {
        super.dispose(); //To change body of generated methods, choose Tools | Templates.
    }

}
