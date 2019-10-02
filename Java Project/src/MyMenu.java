import Mutiplication.*;
//import java.awt.Color;
//import java.awt.Container;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;



public class MyMenu extends JFrame implements ActionListener {
    
    private JFrame frame;
    private Container c;
    private JMenuBar menuber;
        private JMenu file, edit,navigate,source,reractor,run,debug,profile,tem,tools,window,help;
    
    private JMenuItem multiItem,undoItem,redoItem,findItem,escItem,smItem,rgbItem,slideItem,newItem,openItem,exitItem,cutItem,copyItem,pastItem,selectAllItem;
    private Font f;
    private JTextField tf1;
    private JButton bt1;
    MyMenu(){
    
    Rouf();
    
    
    }
    
    public void Rouf(){
        Toolkit tool=Toolkit.getDefaultToolkit();
		Dimension size=tool.getScreenSize();
             this.setSize(size);
             
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        f = new Font("Aril",Font.BOLD,16);
        
        menuber = new JMenuBar();
        this.setJMenuBar(menuber);
        
        file = new JMenu("File");
        edit = new JMenu("View");
        navigate = new JMenu("Navigate");
        source = new JMenu("Source");
        reractor = new JMenu("Reractor");
        run = new JMenu("Run");
        debug = new JMenu("Debug");
        profile = new JMenu("Profile");
        tem = new JMenu("Team");
        tools = new JMenu("Tools");
        window = new JMenu("Window");
        help = new JMenu("Help");
        
        menuber.add(file); 
        menuber.add(edit); 
        menuber.add(navigate); 
        menuber.add(source); 
        menuber.add(reractor); 
        menuber.add(run); 
        menuber.add(debug); 
        menuber.add(profile); 
        menuber.add(tem); 
        menuber.add(tools); 
        menuber.add(window); 
        menuber.add(help); 
        
         escItem = new JMenuItem("Employee Salary Calculation");
         smItem = new JMenuItem("Student Management");
         rgbItem = new JMenuItem("RGB Color Combination");
         multiItem = new JMenuItem("Multiplication Calculate");
         slideItem = new JMenuItem("Slide show");
         newItem = new JMenuItem("New File");
         openItem = new JMenuItem("Open");
         exitItem = new JMenuItem("Exit");
         
         
         cutItem = new JMenuItem("Cut");
         copyItem = new JMenuItem("Copy");
         undoItem = new JMenuItem("Undo");
         redoItem = new JMenuItem("Redo");
         findItem = new JMenuItem("Find");
         pastItem = new JMenuItem("Past");
         selectAllItem = new JMenuItem("Select All");
         
         
         
         file.add(escItem);
         file.addSeparator();

         file.add(smItem);
         file.addSeparator();

         file.add(rgbItem);
         file.addSeparator();

         file.add(multiItem);
         file.addSeparator();


         file.add(slideItem);
         file.addSeparator();

         file.add(newItem);
         file.addSeparator();

         file.add(openItem);
         file.addSeparator();

         file.add(selectAllItem);
         file.addSeparator();

         file.add(exitItem);

         edit.add(cutItem);
         edit.add(copyItem);
         edit.add(pastItem);
         edit.add(undoItem);
         edit.add(redoItem);
         edit.add(findItem);
         
         escItem.addActionListener(this);
         smItem.addActionListener(this);
         rgbItem.addActionListener(this);
         slideItem.addActionListener(this);
         exitItem.addActionListener(this);
         multiItem.addActionListener(this);
         
   
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
         
        if(ae.getSource()==escItem){
          
           Sub_Menu frame=new Sub_Menu();
           //Sub_Frame fc =new Sub_Frame();
            
        }
        else if(ae.getSource()==smItem){
            
            Student_Rouf frame = new Student_Rouf();
        }
        
        else if(ae.getSource()==rgbItem){
            
            Slider frame = new Slider();
        }
        else if(ae.getSource()==slideItem){
            
             SlideShow frame = new SlideShow();
        }
        else if(ae.getSource()== multiItem){
             Multiplecation frame = new Multiplecation();
        }
        else if(ae.getSource()==exitItem){
            
            System.exit(0);  
            
        }

    }
    
    public static void main(String[] args) {
        
        MyMenu frame = new MyMenu();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame.setBounds(20,20, 700, 600);
        frame.setTitle("Abdur Rouf");
    }

   
}
