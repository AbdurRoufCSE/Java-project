
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Sub_Menu extends JFrame implements ActionListener{
    
    private Container c;
    private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7;
    private Font f;
    private JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    private JButton bt1,bt2,bt3;
    
    Sub_Menu(){
        
        Rouf();
    }
    public void Rouf(){
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(150,100, 600, 500);
        this.setTitle("Abdur Rouf");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
      
        f = new Font("Arial",Font.BOLD,16);
        
        lb1  = new JLabel("Emplpyee Salary Calculation");
        lb1.setBounds(100, 30, 230, 30);
        lb1.setFont(f);
        c.add(lb1);
                
        lb2  = new JLabel("Basic Salary");
        lb2.setBounds(50, 90, 100, 30);
        lb2.setFont(f);
        c.add(lb2);
        
        tf1 =new JTextField();
        tf1.setBounds(250,90,100,30);
        c.add(tf1);
              
        lb3  = new JLabel("House Rent");
        lb3.setBounds(50, 130, 130, 30);
        lb3.setFont(f);
        c.add(lb3);
        
        tf2 =new JTextField();
        tf2.setBounds(250,130,100,30);
        c.add(tf2);
       
        
        lb4  = new JLabel("Medical Allowance");
        lb4.setBounds(50, 170, 150, 30);
        lb4.setFont(f);
        c.add(lb4);
        
        tf3 =new JTextField();
        tf3.setBounds(250,170,100,30);
        c.add(tf3);
        
        
        lb5  = new JLabel("Transpart");
        lb5.setBounds(50, 210, 130, 30);
        lb5.setFont(f);
        c.add(lb5);
        
        tf4 =new JTextField();
        tf4.setBounds(250,210,100,30);
        c.add(tf4);
        
        lb6  = new JLabel("Provident found");
        lb6.setBounds(50, 250, 130, 30);
        lb6.setFont(f);
        c.add(lb6);
        
        tf5 =new JTextField();
        tf5.setBounds(250,250,100,30);
        c.add(tf5);
        
        lb7 = new JLabel("Total");
        lb7.setBounds(50, 300, 130, 30);
        lb7.setFont(f);
        c.add(lb7);
        
        tf6 =new JTextField();
        tf6.setBounds(250,300,100,30);
        c.add(tf6);
              
          
        bt1 =new JButton("Exit");
        bt1.setBounds(50, 360, 70, 30);
        c.add(bt1);
            
        bt2 =new JButton("Save");
        bt2.setBounds(150, 360, 70, 30);
        c.add(bt2);
            
        bt3 =new JButton("Clear");
        bt3.setBounds(270, 360, 70, 30);
        c.add(bt3);
        
     
        
        bt3.addActionListener(this);
        bt1.addActionListener(this);
    
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()==bt3){
            
           tf1.setText("");
           tf2.setText("");
           tf3.setText("");
           tf4.setText("");
           tf5.setText("");
           tf6.setText("");
           
           tf1.requestFocus();
        }
       
        else if(ae.getSource()==bt1){
           this.dispose();
        }
        
    }
    
    public static void main(String[] args) {
        Sub_Menu frame = new Sub_Menu();
       /* frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(150,100, 600, 500);
        frame.setTitle("Abdur Rouf");
      */
    }


}
