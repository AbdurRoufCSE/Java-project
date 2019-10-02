

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Student_Rouf extends JFrame implements ActionListener {

    private Container c;
    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;
    private JLabel titleLabel, fnLabel, lnLabel, phoneLabel, gpaLabel;
    private JTextField fnTf, lnTf, phoneTf, gpaTf;
    private JButton addButton, updateButton, deleteButton, clearButton;
    private Font f;
    private String[] colums = {"First name", "Last name", "Phone number", "GPA"};
    private String[] rows = new String[4];

    Student_Rouf() {
        initComponents();
    }

    public void initComponents() {
          
       
      
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        
        f = new Font("Aril", Font.BOLD, 16);

        titleLabel = new JLabel("Student Registration");
        titleLabel.setBounds(140, 10, 250, 50);
        titleLabel.setFont(f);
        c.add(titleLabel);

        fnLabel = new JLabel("First Name  ");
        fnLabel.setBounds(10, 80, 140, 30);
        fnLabel.setFont(f);
        c.add(fnLabel);

        fnTf = new JTextField();
        fnTf.setBounds(110, 80, 200, 30);
        fnTf.setFont(f);
        c.add(fnTf);

        addButton = new JButton("Add");
        addButton.setBounds(400, 80, 100, 30);
        addButton.setFont(f);
        c.add(addButton);

        lnLabel = new JLabel("Last Name  ");
        lnLabel.setBounds(10, 130, 140, 30);
        lnLabel.setFont(f);
        c.add(lnLabel);

        lnTf = new JTextField();
        lnTf.setBounds(110, 130, 200, 30);
        lnTf.setFont(f);
        c.add(lnTf);

        updateButton = new JButton("Update");
        updateButton.setBounds(400, 130, 100, 30);
        updateButton.setFont(f);
        c.add(updateButton);

        phoneLabel = new JLabel("Phone  ");
        phoneLabel.setBounds(10, 180, 140, 30);
        phoneLabel.setFont(f);
        c.add(phoneLabel);

        phoneTf = new JTextField();
        phoneTf.setBounds(110, 180, 200, 30);
        phoneTf.setFont(f);
        c.add(phoneTf);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(400, 180, 100, 30);
        deleteButton.setFont(f);
        c.add(deleteButton);

        gpaLabel = new JLabel("GPA  ");
        gpaLabel.setBounds(10, 230, 140, 30);
        gpaLabel.setFont(f);
        c.add(gpaLabel);

        gpaTf = new JTextField();
        gpaTf.setBounds(110, 230, 200, 30);
        gpaTf.setFont(f);
        c.add(gpaTf);

        clearButton = new JButton("Clear");
        clearButton.setBounds(400, 230, 100, 30);
        clearButton.setFont(f);
        c.add(clearButton);
         
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(50, 50, 780, 690);
        this.setTitle("Student Table");
        
    

        
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(colums);
        table.setModel(model);
        table.setFont(f);
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);

        scroll = new JScrollPane(table);
        scroll.setBounds(10, 360, 740, 265);
        c.add(scroll);

        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me) {

                int numberOfRow = table.getSelectedRow();

                String f_name = model.getValueAt(numberOfRow, 0).toString();
                String l_name = model.getValueAt(numberOfRow, 1).toString();
                String phone_name = model.getValueAt(numberOfRow, 2).toString();
                String gpa_name = model.getValueAt(numberOfRow, 3).toString();

                fnTf.setText(f_name);
                lnTf.setText(l_name);
                phoneTf.setText(phone_name);
                gpaTf.setText(gpa_name);
            }

        });
        
        
           
        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addButton) {

            rows[0] = fnTf.getText();
            rows[1] = lnTf.getText();
            rows[2] = phoneTf.getText();
            rows[3] = gpaTf.getText();

            model.addRow(rows);

        } else if (e.getSource() == clearButton) {

            fnTf.setText("");
            lnTf.setText("");
            phoneTf.setText("");
            gpaTf.setText("");
            fnTf.requestFocus();

        } else if (e.getSource() == deleteButton) {

            int numberOfRow = table.getSelectedRow();
            if (numberOfRow >= 0) {
                model.removeRow(numberOfRow);

            } else {
                JOptionPane.showMessageDialog(null, "No row has been selected or no row exits");
            }

        } else if (e.getSource() == updateButton) {

            int numberOfRow = table.getSelectedRow();

            String f_name = fnTf.getText();
            String l_name = lnTf.getText();
            String phone_name = phoneTf.getText();
            String gpa = gpaTf.getText();
            
            model.setValueAt(f_name,numberOfRow, 0);
            model.setValueAt(l_name,numberOfRow, 1);
            model.setValueAt(phone_name,numberOfRow, 2);
            model.setValueAt(gpa,numberOfRow, 3);

        }
        
        
    }

    public static void main(String[] args) {

        Student_Rouf frame = new Student_Rouf();
       /* frame.seounds(50, 50, 780, 690);
        frame.setTtVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBitle("Student Table");
        */
    }

   @Override
    public void dispose() {
        super.dispose(); //To change body of generated methods, choose Tools | Templates.
    }


}
