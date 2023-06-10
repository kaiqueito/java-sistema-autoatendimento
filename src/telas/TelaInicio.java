package telas;

public class TelaInicio extends javax.swing.JFrame {


    public TelaInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        btnInicio = new javax.swing.JButton();
        lblRealizePedido = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bem-Vindo");
        getContentPane().setLayout(null);

        btnInicio.setBackground(new java.awt.Color(133, 93, 15));
        btnInicio.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Começar");
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio);
        btnInicio.setBounds(540, 510, 200, 40);

        lblRealizePedido.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        lblRealizePedido.setForeground(new java.awt.Color(255, 255, 255));
        lblRealizePedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRealizePedido.setText("Realize seu pedido!");
        getContentPane().add(lblRealizePedido);
        lblRealizePedido.setBounds(500, 340, 280, 80);

        lblBemVindo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindo.setText("Bem-Vindo(a)");
        getContentPane().add(lblBemVindo);
        lblBemVindo.setBounds(550, 310, 190, 80);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(0, 0, 1280, 720);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/background.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 1280, 780);

        setSize(new java.awt.Dimension(1296, 788));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        dispose();
        new TelaProdutos().setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRealizePedido;
    // End of variables declaration//GEN-END:variables
}
