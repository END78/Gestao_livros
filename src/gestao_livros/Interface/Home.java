/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao_livros.Interface;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import gestao_livros.EncryptPass;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author fune5ti
 */
public class Home extends javax.swing.JFrame {
public static String usrnm;
   
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minim = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        func = new javax.swing.JCheckBox();
        cl = new javax.swing.JCheckBox();
        admin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        minim.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        minim.setForeground(new java.awt.Color(255, 255, 255));
        minim.setText("-");
        minim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimMouseClicked(evt);
            }
        });

        exit.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minim)
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(minim)
                    .addComponent(exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Password:");

        User.setBackground(new java.awt.Color(108, 122, 137));
        User.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        User.setForeground(new java.awt.Color(228, 241, 254));

        jButton2.setBackground(new java.awt.Color(34, 167, 240));
        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(44, 62, 80));
        jTextField3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 255));
        jTextField3.setText("If you dont have and account, click here");
        jTextField3.setBorder(null);
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        Pass.setBackground(new java.awt.Color(108, 122, 137));
        Pass.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Pass.setForeground(new java.awt.Color(228, 241, 254));

        func.setBackground(new java.awt.Color(44, 62, 80));
        func.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        func.setForeground(java.awt.Color.white);
        func.setText("Funcionario");

        cl.setBackground(new java.awt.Color(44, 62, 80));
        cl.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        cl.setForeground(java.awt.Color.white);
        cl.setText("Cliente");

        admin.setBackground(new java.awt.Color(44, 62, 80));
        admin.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        admin.setForeground(java.awt.Color.white);
        admin.setText("Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(admin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(func)
                        .addGap(18, 18, 18)
                        .addComponent(cl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cl)
                    .addComponent(func)
                    .addComponent(admin))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        Reg_Wind call = new Reg_Wind ();
        call.setVisible(true);
        call.pack();
        call.setLocationRelativeTo(null);
        call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String user = User.getText();
        usrnm = User.getText();
        String pwd= new String (Pass.getPassword());
        
        EncryptPass enc = new EncryptPass ();
        Boolean check = null;
        
        if((user.isEmpty() && pwd.isEmpty() && ((func.isSelected() == false) || !(cl.isSelected()== false)||!(admin.isSelected()== false) ) ))
            {
                JOptionPane.showMessageDialog(this,"Os campos nao podem estar vazios, e tem de selecionar um tipo de utilizador");
                this.dispose();
                this.setVisible(true);
            
            }
         else
            {
                String sql=null;
        
            if(func.isSelected())
                {
                    sql = "SELECT * FROM FUNCIONARIO WHERE IS_ADMIN = FALSE AND  NOME = '"+user+"' AND IS_ACTIVE = TRUE";
                }
            else if(cl.isSelected())
                {
                    sql = "SELECT * FROM REQUERENTE WHERE NOME = '"+user+"'";
                }
            else if(admin.isSelected())
                {
                     sql = "SELECT * FROM FUNCIONARIO WHERE IS_ADMIN = TRUE AND  NOME = '"+user+"'";
                }
        
        ResultSet rs = null;
       
       
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/BIBLIOTECA?verifyServerCertificate=false&useSSL=true","root","casadejogos");
            
           
            Statement stmt=con.createStatement();
            rs = stmt.executeQuery(sql);
            
          
            
            if(rs.next() == true)
            {
               
                
                        String uname = rs.getString("NOME");
                        String password=rs.getString("PASS");
                        check = enc.checkPass(pwd, password);
                        
                       // boolean estado = rs.getBoolean("IS_ACTIVE");
                        
                        
                            
                            
                        
                            if(admin.isSelected() && user.equals(uname) == true && check == true )
                            {
                                admin_page n = new admin_page();
                                n.setVisible(true);
                                n.pack();
                                n.setLocationRelativeTo(null);
                                n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                this.dispose();  
                            }
                            else if( func.isSelected() && user.equals(uname) == true && check == true )
                            {
                               
                              
                                    Post_Login window = new Post_Login();
                                    window.setVisible(true);
                                    window.pack();
                                    window.setLocationRelativeTo(null);
                                    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    this.dispose();
                               
                                
                                
                            }
                            else if(user.equals(uname) == true  && check == true && cl.isSelected())
                            {
                                new Cl_post().setVisible(true);
                                new Cl_post().pack();
                                new Cl_post().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                this.dispose();
                            }
                            else if(check == false ) 
                            {
                                JOptionPane.showMessageDialog(this, "Palavra passe Errada");
                                this.dispose();
                                
                                new Home().setVisible(true);
                                
                            
                            }
             
                    
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Utilizador Nao Existe");
                this.dispose();
                new Home().setVisible(true);
            }
        }
             catch (HeadlessException | ClassNotFoundException | SQLException e)
             {
                JOptionPane.showMessageDialog(this, e.getMessage());
             }
        
        }
    
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimMouseClicked
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField User;
    private javax.swing.JCheckBox admin;
    private javax.swing.JCheckBox cl;
    private javax.swing.JLabel exit;
    private javax.swing.JCheckBox func;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel minim;
    // End of variables declaration//GEN-END:variables
}
