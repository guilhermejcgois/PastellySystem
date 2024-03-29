/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmUsuario.java
 *
 * Created on Jun 4, 2012, 9:20:00 PM
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import model.UserBean;

/**
 *
 * @author Guilherme
 */
public class FrmUsuario extends javax.swing.JInternalFrame
        implements IOuvintesPadrao, ITeclasPadrao {

    private static FrmUsuario _instance = null;

    public static FrmUsuario getInstance() {
        if (_instance == null) {
            _instance = new FrmUsuario();
        }
        return _instance;
    }

    /** Creates new form FrmUsuario */
    private FrmUsuario() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblUsuarioAtual = new javax.swing.JLabel();
        btnRedefinirSenha = new javax.swing.JButton();
        btnTrocarLogin = new javax.swing.JButton();
        lblUsuarioNivel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Usuario Atual");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblUsuarioAtual.setFont(new java.awt.Font("Tahoma", 0, 24));
        lblUsuarioAtual.setForeground(java.awt.Color.red);
        lblUsuarioAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioAtual.setText("USUARIO ATUAL");

        btnRedefinirSenha.setText("Redefinir Senha");
        btnRedefinirSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnRedefinirSenhaKeyReleased(evt);
            }
        });

        btnTrocarLogin.setText("Trocar Login");
        btnTrocarLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnTrocarLoginKeyReleased(evt);
            }
        });

        lblUsuarioNivel.setForeground(java.awt.Color.red);
        lblUsuarioNivel.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarioAtual)
                    .addComponent(lblUsuarioNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrocarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRedefinirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblUsuarioAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblUsuarioNivel)
                        .addGap(6, 6, 6)
                        .addComponent(btnTrocarLogin)
                        .addGap(6, 6, 6)
                        .addComponent(btnRedefinirSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        _instance = null;
        setVisible(false);
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnTrocarLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTrocarLoginKeyReleased
        performAction(evt);
        performNavigateAction(evt);
    }//GEN-LAST:event_btnTrocarLoginKeyReleased

    private void btnRedefinirSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRedefinirSenhaKeyReleased
        performAction(evt);
        performNavigateAction(evt);
    }//GEN-LAST:event_btnRedefinirSenhaKeyReleased

    public void setUsuarioAtual(UserBean usuario) {
        lblUsuarioAtual.setText(usuario.getLogin());
        lblUsuarioNivel.setText("Usuario nivel: " + usuario.getNivel());
    }

    public String showJOptionPane() {
        String returnValue = null;

        JPasswordField jpf = new JPasswordField(10);
        jpf.setEchoChar('*');
        JLabel jlabel = new JLabel("Confirme sua senha:");
        JPanel jpanel = new JPanel();
        jpanel.add(jlabel);
        jpanel.add(jpf);

        int intResult = JOptionPane.showConfirmDialog(this, jpanel, "Confirme sua identidade",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

        if (intResult == JOptionPane.OK_OPTION) {
            returnValue = String.valueOf(jpf.getPassword());
        }

        return returnValue;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRedefinirSenha;
    private javax.swing.JButton btnTrocarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUsuarioAtual;
    private javax.swing.JLabel lblUsuarioNivel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setActionListener(ActionListener al) {
        btnRedefinirSenha.addActionListener(al);
        btnRedefinirSenha.setActionCommand("Alterar_Senha");
        btnTrocarLogin.addActionListener(al);
        btnTrocarLogin.setActionCommand("Alterar_Login");
    }

    @Override
    public void performAction(KeyEvent evt) {
        if (evt.isControlDown() && evt.isShiftDown()) {
            if(evt.getKeyCode() == KeyEvent.VK_L) {
                btnTrocarLogin.doClick();
            } else if (evt.getKeyCode() == KeyEvent.VK_S) {
                btnRedefinirSenha.doClick();
            }
        }
    }

    @Override
    public void performNavigateAction(KeyEvent evt) {
        if (evt.isControlDown()) {
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_DOWN:
                    if (btnTrocarLogin.equals(this.getFocusOwner())) {
                        btnRedefinirSenha.requestFocus();
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (btnRedefinirSenha.equals(this.getFocusOwner())) {
                        btnTrocarLogin.requestFocus();
                    }
                    break;
            }
        }
    }
}
