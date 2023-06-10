package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Total extends javax.swing.JFrame {
    
    public Total() {
        initComponents();
        try {
            var conectado = ConnectionFactory.conectar();  
            // Consulta para obter a soma dos valores
            PreparedStatement stSoma = conectado.prepareStatement("SELECT SUM(valor) AS soma FROM produtos");
            ResultSet resultadoSoma = stSoma.executeQuery();         
            resultadoSoma.next();
            double soma = resultadoSoma.getDouble("soma");
            
            // Consulta para obter os produtos da tabela
            PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM produtos");    
            ResultSet resultado = stConsultar.executeQuery();
            DefaultTableModel modeloTabela = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    // Torna a coluna do botão de deletar não editável
                    return column != 2;
                }
            };
            modeloTabela = (DefaultTableModel) tblProdutos.getModel();
            modeloTabela.setRowCount(0);
            modeloTabela.addColumn("Nome");
            modeloTabela.addColumn("Valor");
            
            while (resultado.next()) { 
                Object dep[] = {
                  resultado.getString("nome"),
                  resultado.getString("valor"), 
                };
                modeloTabela.addRow(dep);
            }
            // Adicionando a soma na tabela "Total"
            Object total[] = {
                "================================= Total =================================",
                String.format("%.2f", soma)       
            };
            modeloTabela.addRow(total);

                     
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
           
    }
      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnResetar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        lblFinalizarTotal = new javax.swing.JLabel();
        lblTotalTotal = new javax.swing.JLabel();
        lblProdutosTotal = new javax.swing.JLabel();
        pnlVerde = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Total");
        getContentPane().setLayout(null);

        btnResetar.setBackground(new java.awt.Color(26, 68, 31));
        btnResetar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        btnResetar.setForeground(new java.awt.Color(255, 255, 255));
        btnResetar.setText("Resetar");
        btnResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetarActionPerformed(evt);
            }
        });
        getContentPane().add(btnResetar);
        btnResetar.setBounds(550, 690, 180, 50);

        btnVoltar.setBackground(new java.awt.Color(26, 68, 31));
        btnVoltar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(60, 690, 180, 50);

        btnPagar.setBackground(new java.awt.Color(26, 68, 31));
        btnPagar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar);
        btnPagar.setBounds(1050, 690, 180, 50);

        tblProdutos.setBackground(new java.awt.Color(255, 255, 255));
        tblProdutos.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 1280, 580);

        btnCancelar.setBackground(new java.awt.Color(153, 51, 0));
        btnCancelar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(1070, 30, 160, 50);

        lblFinalizarTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblFinalizarTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblFinalizarTotal.setText("Finalizar");
        getContentPane().add(lblFinalizarTotal);
        lblFinalizarTotal.setBounds(240, 40, 121, 28);

        lblTotalTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblTotalTotal.setForeground(new java.awt.Color(255, 255, 153));
        lblTotalTotal.setText("Total");
        getContentPane().add(lblTotalTotal);
        lblTotalTotal.setBounds(170, 40, 121, 28);

        lblProdutosTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblProdutosTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutosTotal.setText("Produtos");
        getContentPane().add(lblProdutosTotal);
        lblProdutosTotal.setBounds(60, 40, 121, 28);

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

        setSize(new java.awt.Dimension(1296, 788));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        new TelaInicio().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        dispose();
        new TelaFinalizar().setVisible(true);
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        new TelaProdutos().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetarActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();         
            PreparedStatement st = conectado.prepareStatement("DELETE FROM produtos");
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        dispose();
        new Total().setVisible(true);
    }//GEN-LAST:event_btnResetarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Total().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnResetar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFinalizarTotal;
    private javax.swing.JLabel lblProdutosTotal;
    private javax.swing.JLabel lblTotalTotal;
    private javax.swing.JPanel pnlVerde;
    private javax.swing.JTable tblProdutos;
    // End of variables declaration//GEN-END:variables
}
