/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import dao.Cliente;
import logica.Prestamo;

/**
 *
 * @author Vinni.
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this.setTitle("Banco de credito El Mejor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSimular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cjNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cjFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cjValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cjPlazo = new javax.swing.JTextField();
        cjResultado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnSimular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSimular.setText("Simular");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimular);
        btnSimular.setBounds(370, 240, 150, 25);

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 90, 14);
        getContentPane().add(cjNombre);
        cjNombre.setBounds(160, 20, 170, 20);

        jLabel2.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 120, 14);

        cjFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjFechaActionPerformed(evt);
            }
        });
        getContentPane().add(cjFecha);
        cjFecha.setBounds(160, 60, 150, 20);

        jLabel3.setText("Valor a prestar:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 110, 14);
        getContentPane().add(cjValor);
        cjValor.setBounds(160, 100, 140, 20);

        jLabel4.setText("Plazo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 70, 14);
        getContentPane().add(cjPlazo);
        cjPlazo.setBounds(160, 140, 140, 20);

        cjResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(cjResultado);
        cjResultado.setBounds(250, 210, 80, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Pago Mensual");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 230, 110, 17);

        setSize(new java.awt.Dimension(554, 327));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
        // TODO add your handling code here:
        this.hacerSimulacion();
    }//GEN-LAST:event_btnSimularActionPerformed

    private void cjFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjFechaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    private void hacerSimulacion(){
        String elNombre = cjNombre.getText();
        int elPlazo = Integer.parseInt(cjPlazo.getText());
        Double elvalor = new Double(cjValor.getText());
        Cliente elCliente = new Cliente(cjNombre.getText(), new Date());
        Prestamo pre = new Prestamo(elCliente, elPlazo, elvalor);
        Double res = pre.hacerSimulacion();
        if (res == null ){
            JOptionPane.showMessageDialog(this, "No tiene edad para simular ");
        }else {
            //JOptionPane.showMessageDialog(this, "Su pago mensual es  "+res.toString());
            this.cjResultado.setText(res.toString());
        }
        //JOptionPane.showMessageDialog(this, "Va a realizar la simulacion");
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimular;
    private javax.swing.JTextField cjFecha;
    private javax.swing.JTextField cjNombre;
    private javax.swing.JTextField cjPlazo;
    private javax.swing.JTextField cjResultado;
    private javax.swing.JTextField cjValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
