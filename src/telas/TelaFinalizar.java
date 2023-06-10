package telas;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TelaFinalizar extends javax.swing.JFrame {

    public TelaFinalizar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDinheiro = new javax.swing.JButton();
        btnPix = new javax.swing.JButton();
        btnCredito = new javax.swing.JButton();
        btnDebito = new javax.swing.JButton();
        btnCancelarPagamento = new javax.swing.JButton();
        lblFinalizarPagamento = new javax.swing.JLabel();
        lblTotalPagamento = new javax.swing.JLabel();
        lblProdutosPagamento = new javax.swing.JLabel();
        pnlVerde = new javax.swing.JPanel();
        lblLanches = new javax.swing.JLabel();
        lblPagamento = new javax.swing.JLabel();
        pnlBranco = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagamento");
        getContentPane().setLayout(null);

        btnDinheiro.setBackground(new java.awt.Color(26, 68, 31));
        btnDinheiro.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        btnDinheiro.setForeground(new java.awt.Color(255, 255, 255));
        btnDinheiro.setText("Dinheiro");
        btnDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDinheiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnDinheiro);
        btnDinheiro.setBounds(890, 500, 110, 40);

        btnPix.setBackground(new java.awt.Color(26, 68, 31));
        btnPix.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        btnPix.setForeground(new java.awt.Color(255, 255, 255));
        btnPix.setText("Pix");
        btnPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPixActionPerformed(evt);
            }
        });
        getContentPane().add(btnPix);
        btnPix.setBounds(290, 500, 110, 40);

        btnCredito.setBackground(new java.awt.Color(26, 68, 31));
        btnCredito.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        btnCredito.setForeground(new java.awt.Color(255, 255, 255));
        btnCredito.setText("Crédito");
        btnCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCredito);
        btnCredito.setBounds(890, 240, 110, 40);

        btnDebito.setBackground(new java.awt.Color(26, 68, 31));
        btnDebito.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        btnDebito.setForeground(new java.awt.Color(255, 255, 255));
        btnDebito.setText("Débito");
        btnDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebitoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDebito);
        btnDebito.setBounds(290, 240, 110, 40);

        btnCancelarPagamento.setBackground(new java.awt.Color(153, 51, 0));
        btnCancelarPagamento.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        btnCancelarPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPagamento.setText("Cancelar");
        btnCancelarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarPagamento);
        btnCancelarPagamento.setBounds(1070, 30, 160, 50);

        lblFinalizarPagamento.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblFinalizarPagamento.setForeground(new java.awt.Color(255, 255, 153));
        lblFinalizarPagamento.setText("Finalizar");
        getContentPane().add(lblFinalizarPagamento);
        lblFinalizarPagamento.setBounds(240, 40, 121, 28);

        lblTotalPagamento.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblTotalPagamento.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPagamento.setText("Total");
        getContentPane().add(lblTotalPagamento);
        lblTotalPagamento.setBounds(170, 40, 121, 28);

        lblProdutosPagamento.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblProdutosPagamento.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutosPagamento.setText("Produtos");
        getContentPane().add(lblProdutosPagamento);
        lblProdutosPagamento.setBounds(60, 40, 121, 28);

        pnlVerde.setBackground(new java.awt.Color(26, 68, 31));

        javax.swing.GroupLayout pnlVerdeLayout = new javax.swing.GroupLayout(pnlVerde);
        pnlVerde.setLayout(pnlVerdeLayout);
        pnlVerdeLayout.setHorizontalGroup(
            pnlVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        pnlVerdeLayout.setVerticalGroup(
            pnlVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(pnlVerde);
        pnlVerde.setBounds(0, 0, 1280, 100);

        lblLanches.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 24)); // NOI18N
        lblLanches.setForeground(new java.awt.Color(26, 68, 31));
        lblLanches.setText("FORMA DE PAGAMENTO");
        getContentPane().add(lblLanches);
        lblLanches.setBounds(480, 150, 310, 50);

        lblPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/pagamento.png"))); // NOI18N
        getContentPane().add(lblPagamento);
        lblPagamento.setBounds(0, 0, 1280, 750);

        pnlBranco.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlBrancoLayout = new javax.swing.GroupLayout(pnlBranco);
        pnlBranco.setLayout(pnlBrancoLayout);
        pnlBrancoLayout.setHorizontalGroup(
            pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        pnlBrancoLayout.setVerticalGroup(
            pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBranco);
        pnlBranco.setBounds(0, 0, 1280, 780);

        setSize(new java.awt.Dimension(1296, 788));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebitoActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();         
            PreparedStatement st = conectado.prepareStatement("DELETE FROM produtos");
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Você pagou no cartão de débito!");
       dispose();
       new TelaInicio().setVisible(true);
    }//GEN-LAST:event_btnDebitoActionPerformed

    private void btnCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();         
            PreparedStatement st = conectado.prepareStatement("DELETE FROM produtos");
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Você pagou no cartão de crédito!");
       dispose();
       new TelaInicio().setVisible(true);
    }//GEN-LAST:event_btnCreditoActionPerformed

    private void btnPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPixActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();         
            PreparedStatement st = conectado.prepareStatement("DELETE FROM produtos");
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Você pagou no pix!");
       dispose();
       new TelaInicio().setVisible(true);
    }//GEN-LAST:event_btnPixActionPerformed

    private void btnDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDinheiroActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();         
            PreparedStatement st = conectado.prepareStatement("DELETE FROM produtos");
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Retire a nota do seu pedido e leve ao caixa!");
       dispose();
       new TelaInicio().setVisible(true);
    }//GEN-LAST:event_btnDinheiroActionPerformed

    private void btnCancelarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPagamentoActionPerformed
        dispose();
        new TelaInicio().setVisible(true);
    }//GEN-LAST:event_btnCancelarPagamentoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFinalizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPagamento;
    private javax.swing.JButton btnCredito;
    private javax.swing.JButton btnDebito;
    private javax.swing.JButton btnDinheiro;
    private javax.swing.JButton btnPix;
    private javax.swing.JLabel lblFinalizarPagamento;
    private javax.swing.JLabel lblLanches;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JLabel lblProdutosPagamento;
    private javax.swing.JLabel lblTotalPagamento;
    private javax.swing.JPanel pnlBranco;
    private javax.swing.JPanel pnlVerde;
    // End of variables declaration//GEN-END:variables
}
