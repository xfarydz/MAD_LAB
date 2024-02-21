/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.activity.pkg1;
//1.import awt
import java.awt.*;

public class LABACTIVITY1A extends Frame {
    //Frame frame; 
    Label lblTitle, lblName, lblIc ,lblClass ,lblGender ,lblAddress;
    TextField txtName, txtIc ; //, txtAddress; //txtClass;
    Choice cbClass ; //cbGender ;
    CheckboxGroup cbGender;
    Checkbox rbMale , rbFemale;
    TextArea txtAddress;
    Button btnSubmit;
    
    //2.constructor
    LABACTIVITY1A() {
        
        //frame=new Frame("SISTEM MAKLUMAT PELAJAR");
        setTitle("SISTEM MAKLUMAT PELAJAR");
        lblTitle=new Label("SISTEM MAKLUMAT PELAJAR");
        lblTitle.setForeground(Color.red);
        Font f=new Font ("Courier New", Font.BOLD + Font.ITALIC,18);
        lblTitle.setFont(f);
        
        lblName=new Label("NAME: ");
        txtName=new TextField(20);
        
        lblIc=new Label("Ic: ");
        txtIc=new TextField (20);
        
        lblClass=new Label("Class: ");
        cbClass=new Choice();
        cbClass.add("DDT5A");
        cbClass.add("DDT5B");
        cbClass.add("DDT5C");
        cbClass.add("DDT5D");
        
        lblGender=new Label("Gender: ");
        cbGender=new CheckboxGroup();
        rbMale=new Checkbox("Male", false , cbGender);
        rbFemale=new Checkbox("Female", false , cbGender);
       // cbGender.add("Male");
       // cbGender.add("Female");
        
        lblAddress=new Label("Address: ");
        //txtAddress=new TextField (40);
                
        //lblClass=new Label("Class: ");
        //txtClass=new TextField(20);
        
        txtAddress=new TextArea(2,20);
        
        
        btnSubmit=new Button("SUBMIT");
        //susun component
        // setBounds (int x , int y-coor, width,height)
        lblTitle.setBounds(100, 50 , 350 , 20);
        lblName.setBounds(50 , 100 , 50 , 20);
        txtName.setBounds(100 , 100, 150 , 20);
        lblIc.setBounds(50, 130, 50, 20);
        txtIc.setBounds(100, 130, 150, 20);
        lblClass.setBounds(50, 160, 50, 20);
        cbClass.setBounds(100, 160, 150, 20);
        lblGender.setBounds(50, 195, 50, 20);
        rbMale.setBounds(100, 200, 150, 20);
        rbFemale.setBounds(100, 220, 150, 20);
        lblAddress.setBounds(50, 240, 50, 20);
        txtAddress.setBounds(110, 240, 150, 20);
        btnSubmit.setBounds(200, 270, 70, 20);
        
        
        
        
        //add()- add components into frame
        add(lblTitle);
        add(lblName);
        add(txtName);
        add(lblIc);
        add(txtIc);
        add(lblClass);
        add(cbClass);
        add(lblGender);
        //add(cbGender);
        add(rbMale);
        add(rbFemale);
        add(lblAddress);
        add(txtAddress);
        add(btnSubmit);
        //add(txtClass);
        
        
        
        
        
        
        
        setSize(500,300);
        setLayout(null);
        setVisible(true);
    
}

    public static void main(String[] args) {
        // 3.panggil
        LABACTIVITY1A lab = new LABACTIVITY1A();
    }
    
    
}

