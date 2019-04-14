package dsjava;

import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.*;
import java.awt.Event.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DsJava  extends JFrame implements ActionListener{

   
    public static void main(String[] args) {

        
        
        HashMap<Integer,Etudiant> lstEtudiant = new HashMap<Integer,Etudiant>(); 
            
            JFrame DS = new JFrame("ajouter Etudiant "); 
            JLabel lblNom = new JLabel("Nom");
            JLabel lblPreom = new JLabel("Prenomom");
            JLabel lblcin = new JLabel("CIN");

            
            JTextField txtnom = new JTextField();
            JTextField txtprenom = new JTextField();
            JTextField txtcin = new JTextField();

            
            JButton btnajouter = new JButton("Ajouter");
           btnajouter.addActionListener(this);
            JButton btnmodifier = new JButton("Modifier");
            JButton btnsupp = new JButton("Supprimer");
           

            JPanel Pbtns = new JPanel();
            
           Pbtns.setLayout(new BoxLayout(Pbtns, BoxLayout.Y_AXIS));
           Pbtns.add(btnajouter);
           Pbtns.add(btnmodifier);
           Pbtns.add(btnsupp);
           Pbtns.setBounds(0, -400, 400, 300);
            
           JPanel PForms = new JPanel();
           
                   
           PForms.setLayout(new GridLayout(3,2));
           PForms.add(lblNom);
           PForms.add(txtnom);
           PForms.add(lblPreom);
           PForms.add(txtprenom);
           PForms.add(lblcin);
           PForms.add(txtcin);
          
           JPanel PContent = new JPanel(); 
           PContent.setLayout(new BoxLayout(PContent, BoxLayout.X_AXIS));
           
           
           
           PContent.add(PForms);
           PContent.add(Pbtns);
           
           
          DS.add(PContent);
            
          
            
            
           
           
           
           
            
           
           
            
            
            
            
            
            
            
            
            
            
            
            DS.setVisible(true);
            DS.setBounds(500, 300, 200, 300);
    }
    
  

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
