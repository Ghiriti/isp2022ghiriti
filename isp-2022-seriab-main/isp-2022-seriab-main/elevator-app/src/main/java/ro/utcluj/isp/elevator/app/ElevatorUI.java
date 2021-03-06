/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ro.utcluj.isp.elevator.app;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author mihai.hulea
 */
public class ElevatorUI extends javax.swing.JFrame implements Observer{
    private IElevator e;
    /**
     * Creates new form ElevatorUI
     */
    public ElevatorUI() {
        initComponents();
    }
    
     public ElevatorUI(IElevator e) {
        initComponents();
        this.e = e;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bc3 = new javax.swing.JButton();
        bc2 = new javax.swing.JButton();
        bc1 = new javax.swing.JButton();
        bc0 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMsg = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bc3.setText("3");
        bc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc3ActionPerformed(evt);
            }
        });

        bc2.setText("2");
        bc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc2ActionPerformed(evt);
            }
        });

        bc1.setText("1");
        bc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc1ActionPerformed(evt);
            }
        });

        bc0.setText("0");
        bc0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc0ActionPerformed(evt);
            }
        });

        txtMsg.setColumns(20);
        txtMsg.setRows(5);
        jScrollPane1.setViewportView(txtMsg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bc0)
                    .addComponent(bc1)
                    .addComponent(bc2)
                    .addComponent(bc3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bc3)
                        .addGap(18, 18, 18)
                        .addComponent(bc2)
                        .addGap(18, 18, 18)
                        .addComponent(bc1)
                        .addGap(18, 18, 18)
                        .addComponent(bc0)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc3ActionPerformed
        Command c = new Command(Integer.parseInt(bc3.getText()));
        e.sendCommand(c);
    }//GEN-LAST:event_bc3ActionPerformed

    private void bc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc2ActionPerformed
        Command c = new Command(Integer.parseInt(bc3.getText()));
        e.sendCommand(c);
    }//GEN-LAST:event_bc2ActionPerformed

    private void bc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc1ActionPerformed
        Command c = new Command(Integer.parseInt(bc3.getText()));
        e.sendCommand(c);
    }//GEN-LAST:event_bc1ActionPerformed

    private void bc0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc0ActionPerformed
        Command c = new Command(Integer.parseInt(bc3.getText()));
        e.sendCommand(c);
    }//GEN-LAST:event_bc0ActionPerformed

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
            java.util.logging.Logger.getLogger(ElevatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElevatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElevatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElevatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElevatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bc0;
    private javax.swing.JButton bc1;
    private javax.swing.JButton bc2;
    private javax.swing.JButton bc3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtMsg;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable arg0, Object arg1) {
        System.out.println("ELEVATOR STATE CHANGED....");
        txtMsg.append("Elevator event received...");
    }
}
