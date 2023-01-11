/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhoahoc_n12.login;
import quanlykhoahoc_n12.QuanLyKhoaHoc;
import javax.swing.JOptionPane;

/**
 *
 * @author GT70 DOMINATOR
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    public static  boolean xetDangNhap=false;
    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
        DangKi.listTK.add(new TaiKhoan("admin", "admin"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTaiKhoan = new javax.swing.JTextField();
        btnAccess = new javax.swing.JButton();
        btnSign = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAccess.setBackground(new java.awt.Color(127, 139, 145));
        btnAccess.setText("ĐĂNG NHẬP");
        btnAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccessActionPerformed(evt);
            }
        });

        btnSign.setBackground(new java.awt.Color(127, 139, 145));
        btnSign.setText("ĐĂNG KÝ");
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(127, 139, 145));
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("THOÁT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setText("Nhập Username");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("Nhập Mật Khẩu");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("ĐĂNG NHẬP ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAccess)
                        .addGap(18, 18, 18)
                        .addComponent(btnSign)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit))
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccess)
                    .addComponent(btnSign)
                    .addComponent(btnExit))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccessActionPerformed
        // TODO add your handling code here:
        String tk = txtTaiKhoan.getText();
        String mk = txtMatKhau.getText();
        if (tk.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tài khoản không được bỏ trống");
            txtTaiKhoan.requestFocus();
            return;
        }
        if (mk.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được bỏ trống");
            txtMatKhau.requestFocus();
            return;
        }
        if (CheckTaiKhoan(new TaiKhoan(tk, mk))|| tk.equals("admin")&& mk.equals("admin")) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
            xetDangNhap=true;
            // Nếu đúng thì bật giao diện chính của KH
            QuanLyKhoaHoc qly = new QuanLyKhoaHoc();
            qly.setLocationRelativeTo(null);
            qly.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu!");
        }
    }//GEN-LAST:event_btnAccessActionPerformed

    // kiểm tra thông tin tài khoản
    private boolean CheckTaiKhoan(TaiKhoan taiKhoan) {
        for (TaiKhoan tk : DangKi.listTK) {
                if (tk.getTenNguoiDung().equals(taiKhoan.getTenNguoiDung()) && tk.getMatKhau().equals(taiKhoan.getMatKhau())) {
                return true;
            }
        }

        return false;
    }

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        // TODO add your handling code here:
        DangKi dKy = new DangKi();
        dKy.setLocationRelativeTo(null);
        dKy.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignActionPerformed

    public void getTaiKhoanMatKhau(TaiKhoan tk) {
        txtTaiKhoan.setText(tk.getTenNguoiDung());
        txtMatKhau.setText(tk.getMatKhau());
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int diaLog = JOptionPane.YES_NO_OPTION;
        int diaLogResult = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình?", "Warring", diaLog);
        if (diaLogResult == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccess;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}