/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcl2;

//import javafx.scene.control.CheckBox;
import javax.swing.ButtonGroup;

/**
 *
 * @author Dorpon
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    public String a;
    public String sum1;
    public calculator() 
    {
        initComponents();
        groupc();
    }
    public void groupc()
    {
       ButtonGroup obj=new ButtonGroup();
       obj.add(rbnADD);
       obj.add(rbnSUB);
       obj.add(rbnMUL);
       obj.add(rbnDEV);
       //CheckBox ob=new CheckBox();
       //ob.equals(check_add);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBox4 = new javax.swing.JCheckBox();
        tv_num1 = new javax.swing.JTextField();
        tv_num2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tv_sum = new javax.swing.JTextField();
        rbnSUB = new javax.swing.JRadioButton();
        rbnMUL = new javax.swing.JRadioButton();
        rbnDEV = new javax.swing.JRadioButton();
        rbnADD = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        check_add = new javax.swing.JCheckBox();
        check_sub = new javax.swing.JCheckBox();
        check_mul = new javax.swing.JCheckBox();
        check_dev = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        jCheckBox4.setText("jCheckBox4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Button");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rbnSUB.setText("SUB");

        rbnMUL.setText("MUL");

        rbnDEV.setText("DEV");

        rbnADD.setText("ADD");

        jLabel1.setText("number1");

        jLabel2.setText("number2");

        check_add.setText("ADD");
        check_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_addActionPerformed(evt);
            }
        });

        check_sub.setText("SUB");
        check_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_subActionPerformed(evt);
            }
        });

        check_mul.setText("MUL");
        check_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_mulActionPerformed(evt);
            }
        });

        check_dev.setText("DEV");
        check_dev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_devActionPerformed(evt);
            }
        });

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnADD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(check_add, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(check_sub, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tv_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tv_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnSUB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbnMUL, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbnDEV, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(tv_sum, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_mul, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(check_dev, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tv_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbnSUB)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbnADD)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tv_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addComponent(tv_sum, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rbnMUL)
                        .addGap(18, 18, 18)
                        .addComponent(rbnDEV)
                        .addGap(18, 18, 18)
                        .addComponent(check_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check_sub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check_mul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check_dev)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String num1=tv_num1.getText();
        double num11=Double.parseDouble(num1);
        String num2=tv_num2.getText();
        double num22=Double.parseDouble(num2);
        //double a=num11-num22;
        //tv_sum.setText(String.valueOf(a));
        
            if(rbnADD.isSelected())
            {
                double a=num11+num22;
                tv_sum.setText(String.valueOf(a));
            }
        
            if(rbnSUB.isSelected())
            {
                double a=num11-num22;
                tv_sum.setText(String.valueOf(a));
            }
        
        
            if(rbnMUL.isSelected())
            {
                double a=num11*num22;
                tv_sum.setText(String.valueOf(a));
            }
        
        
        
            if(rbnDEV.isSelected())
            {
                double a=num11/num22;
                tv_sum.setText(String.valueOf(a));
            }
        
        
           
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void check_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_addActionPerformed
        if(check_add.isSelected())
            check_sub.setSelected(false);
            check_mul.setSelected(false);
            check_dev.setSelected(false);
        {
            String num1=tv_num1.getText();
            double num11=Double.parseDouble(num1);
             String num2=tv_num2.getText();
             double num22=Double.parseDouble(num2);
            double a=num11+num22;
            sum1=String.valueOf(a);
            tv_sum.setText(String.valueOf(sum1));
        }  

    }//GEN-LAST:event_check_addActionPerformed

    private void check_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_subActionPerformed
         if(check_sub.isSelected())
            check_mul.setSelected(false);
            check_dev.setSelected(false);
            check_add.setSelected(false);
        {
            String num1=tv_num1.getText();
            double num11=Double.parseDouble(num1);
             String num2=tv_num2.getText();
             double num22=Double.parseDouble(num2);
            double a=num11-num22;
            sum1=String.valueOf(a);
            tv_sum.setText(String.valueOf(sum1));
                //tv_sum.setText(String.valueOf(a));
           
        }
    }//GEN-LAST:event_check_subActionPerformed

    private void check_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_mulActionPerformed
            if(check_mul.isSelected())
             check_sub.setSelected(false);
             check_dev.setSelected(false);
            check_add.setSelected(false);
        {
            String num1=tv_num1.getText();
            double num11=Double.parseDouble(num1);
             String num2=tv_num2.getText();
             double num22=Double.parseDouble(num2);
            double a=num11*num22;
            sum1=String.valueOf(a);
            tv_sum.setText(String.valueOf(sum1));
                //tv_sum.setText(String.valueOf(a));
       
        }
    }//GEN-LAST:event_check_mulActionPerformed

    private void check_devActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_devActionPerformed
            if(check_dev.isSelected());
            check_sub.setSelected(false);
             check_add.setSelected(false);
            check_mul.setSelected(false);
        {
            String num1=tv_num1.getText();
            double num11=Double.parseDouble(num1);
             String num2=tv_num2.getText();
             double num22=Double.parseDouble(num2);
            double a=num11/num22;
            sum1=String.valueOf(a);
            tv_sum.setText(String.valueOf(sum1));
               // tv_sum.setText(String.valueOf(a));
         
           //check_mul.isSelected(false);
        }
    }//GEN-LAST:event_check_devActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         //check_add.isSelected();
        
        calculator0 ob=new calculator0(sum1);
        this.setVisible(false);
        ob.setVisible(true);
        
         
          //else if(check_sub.isSelected())
         //{
      /*  calculator0 ob=new calculator0(sum1);
        this.setVisible(false);
        ob.setVisible(true);
         //}
           // else if(check_mul.isSelected())
         //{
        calculator0 ob=new calculator0(sum1);
        this.setVisible(false);
        ob.setVisible(true);
         //}
             else if(check_dev.isSelected())
         {
        calculator0 ob=new calculator0(sum1);
        this.setVisible(false);
        ob.setVisible(true);
         }*/
         
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox check_add;
    private javax.swing.JCheckBox check_dev;
    private javax.swing.JCheckBox check_mul;
    private javax.swing.JCheckBox check_sub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rbnADD;
    private javax.swing.JRadioButton rbnDEV;
    private javax.swing.JRadioButton rbnMUL;
    private javax.swing.JRadioButton rbnSUB;
    private javax.swing.JTextField tv_num1;
    private javax.swing.JTextField tv_num2;
    public javax.swing.JTextField tv_sum;
    // End of variables declaration//GEN-END:variables
}
