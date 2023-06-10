package telas;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaProdutos extends javax.swing.JFrame {
    public TelaProdutos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        lblFinalizar = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        pnlVerde = new javax.swing.JPanel();
        btnTotalPagamento = new javax.swing.JButton();
        btnAddAgua = new javax.swing.JButton();
        lblAguaValor = new javax.swing.JLabel();
        lblAgua = new javax.swing.JLabel();
        btnAddLaranja = new javax.swing.JButton();
        lblLaranjaValor = new javax.swing.JLabel();
        lblLaranja = new javax.swing.JLabel();
        btnAddCoca = new javax.swing.JButton();
        lblCocaValor = new javax.swing.JLabel();
        lblCoca = new javax.swing.JLabel();
        btnAddChicken = new javax.swing.JButton();
        lblXchickenValor = new javax.swing.JLabel();
        lblXchicken = new javax.swing.JLabel();
        btnAddBigChicken = new javax.swing.JButton();
        lblBigChickenValor = new javax.swing.JLabel();
        lblBigChicken = new javax.swing.JLabel();
        btnAddBurguer = new javax.swing.JButton();
        lblXburguerValor = new javax.swing.JLabel();
        lblXburguer = new javax.swing.JLabel();
        btnAddDuplo = new javax.swing.JButton();
        lblXduploValor = new javax.swing.JLabel();
        lblXduplo = new javax.swing.JLabel();
        btnAddSalada = new javax.swing.JButton();
        lblXsaladaValor = new javax.swing.JLabel();
        lblXsalada = new javax.swing.JLabel();
        lblBebidas = new javax.swing.JLabel();
        lblLanches = new javax.swing.JLabel();
        lblBebidasImg = new javax.swing.JLabel();
        lblLanchesImg = new javax.swing.JLabel();
        pnlBranco = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produtos");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

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

        lblFinalizar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        lblFinalizar.setText("Finalizar");
        getContentPane().add(lblFinalizar);
        lblFinalizar.setBounds(240, 40, 121, 28);

        lblTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(170, 40, 121, 28);

        lblProdutos.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 153));
        lblProdutos.setText("Produtos");
        getContentPane().add(lblProdutos);
        lblProdutos.setBounds(60, 40, 121, 28);

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

        btnTotalPagamento.setBackground(new java.awt.Color(26, 68, 31));
        btnTotalPagamento.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        btnTotalPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnTotalPagamento.setText("Ver Total e ir para o Pagamento");
        btnTotalPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTotalPagamento);
        btnTotalPagamento.setBounds(810, 650, 390, 50);

        btnAddAgua.setBackground(new java.awt.Color(26, 68, 31));
        btnAddAgua.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAddAgua.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAgua.setText("Add");
        btnAddAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAguaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddAgua);
        btnAddAgua.setBounds(1140, 550, 60, 24);

        lblAguaValor.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblAguaValor.setForeground(new java.awt.Color(26, 68, 31));
        lblAguaValor.setText("R$ 5,99");
        getContentPane().add(lblAguaValor);
        lblAguaValor.setBounds(1140, 530, 80, 19);

        lblAgua.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblAgua.setForeground(new java.awt.Color(26, 68, 31));
        lblAgua.setText("Água");
        getContentPane().add(lblAgua);
        lblAgua.setBounds(1140, 510, 50, 19);

        btnAddLaranja.setBackground(new java.awt.Color(26, 68, 31));
        btnAddLaranja.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAddLaranja.setForeground(new java.awt.Color(255, 255, 255));
        btnAddLaranja.setText("Add");
        btnAddLaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLaranjaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddLaranja);
        btnAddLaranja.setBounds(980, 550, 60, 24);

        lblLaranjaValor.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblLaranjaValor.setForeground(new java.awt.Color(26, 68, 31));
        lblLaranjaValor.setText("R$ 10,99");
        getContentPane().add(lblLaranjaValor);
        lblLaranjaValor.setBounds(980, 530, 80, 19);

        lblLaranja.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblLaranja.setForeground(new java.awt.Color(26, 68, 31));
        lblLaranja.setText("Suco de Laranja");
        getContentPane().add(lblLaranja);
        lblLaranja.setBounds(950, 510, 110, 19);

        btnAddCoca.setBackground(new java.awt.Color(26, 68, 31));
        btnAddCoca.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAddCoca.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCoca.setText("Add");
        btnAddCoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCocaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddCoca);
        btnAddCoca.setBounds(810, 550, 60, 24);

        lblCocaValor.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblCocaValor.setForeground(new java.awt.Color(26, 68, 31));
        lblCocaValor.setText("R$ 9,99");
        getContentPane().add(lblCocaValor);
        lblCocaValor.setBounds(810, 530, 80, 19);

        lblCoca.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblCoca.setForeground(new java.awt.Color(26, 68, 31));
        lblCoca.setText("Coca-Cola");
        getContentPane().add(lblCoca);
        lblCoca.setBounds(800, 510, 90, 19);

        btnAddChicken.setBackground(new java.awt.Color(26, 68, 31));
        btnAddChicken.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAddChicken.setForeground(new java.awt.Color(255, 255, 255));
        btnAddChicken.setText("Add");
        btnAddChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddChickenActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddChicken);
        btnAddChicken.setBounds(170, 670, 60, 24);

        lblXchickenValor.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblXchickenValor.setForeground(new java.awt.Color(26, 68, 31));
        lblXchickenValor.setText("R$ 15,99");
        getContentPane().add(lblXchickenValor);
        lblXchickenValor.setBounds(390, 650, 80, 19);

        lblXchicken.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblXchicken.setForeground(new java.awt.Color(26, 68, 31));
        lblXchicken.setText("X-Chicken");
        getContentPane().add(lblXchicken);
        lblXchicken.setBounds(390, 630, 90, 19);

        btnAddBigChicken.setBackground(new java.awt.Color(26, 68, 31));
        btnAddBigChicken.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAddBigChicken.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBigChicken.setText("Add");
        btnAddBigChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBigChickenActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddBigChicken);
        btnAddBigChicken.setBounds(390, 670, 60, 24);

        lblBigChickenValor.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblBigChickenValor.setForeground(new java.awt.Color(26, 68, 31));
        lblBigChickenValor.setText("R$ 22,99");
        getContentPane().add(lblBigChickenValor);
        lblBigChickenValor.setBounds(170, 650, 80, 19);

        lblBigChicken.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblBigChicken.setForeground(new java.awt.Color(26, 68, 31));
        lblBigChicken.setText("Big Chicken");
        getContentPane().add(lblBigChicken);
        lblBigChicken.setBounds(160, 630, 90, 19);

        btnAddBurguer.setBackground(new java.awt.Color(26, 68, 31));
        btnAddBurguer.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAddBurguer.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBurguer.setText("Add");
        btnAddBurguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBurguerActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddBurguer);
        btnAddBurguer.setBounds(450, 430, 60, 24);

        lblXburguerValor.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblXburguerValor.setForeground(new java.awt.Color(26, 68, 31));
        lblXburguerValor.setText("R$ 15,99");
        getContentPane().add(lblXburguerValor);
        lblXburguerValor.setBounds(450, 410, 80, 19);

        lblXburguer.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblXburguer.setForeground(new java.awt.Color(26, 68, 31));
        lblXburguer.setText("X-Burguer");
        getContentPane().add(lblXburguer);
        lblXburguer.setBounds(450, 390, 80, 19);

        btnAddDuplo.setBackground(new java.awt.Color(26, 68, 31));
        btnAddDuplo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAddDuplo.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDuplo.setText("Add");
        btnAddDuplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDuploActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddDuplo);
        btnAddDuplo.setBounds(270, 430, 60, 24);

        lblXduploValor.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblXduploValor.setForeground(new java.awt.Color(26, 68, 31));
        lblXduploValor.setText("R$ 19,99");
        getContentPane().add(lblXduploValor);
        lblXduploValor.setBounds(270, 410, 80, 19);

        lblXduplo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblXduplo.setForeground(new java.awt.Color(26, 68, 31));
        lblXduplo.setText("X-Duplo");
        getContentPane().add(lblXduplo);
        lblXduplo.setBounds(270, 390, 80, 19);

        btnAddSalada.setBackground(new java.awt.Color(26, 68, 31));
        btnAddSalada.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAddSalada.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSalada.setText("Add");
        btnAddSalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSaladaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddSalada);
        btnAddSalada.setBounds(100, 430, 60, 24);

        lblXsaladaValor.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblXsaladaValor.setForeground(new java.awt.Color(26, 68, 31));
        lblXsaladaValor.setText("R$ 17,99");
        getContentPane().add(lblXsaladaValor);
        lblXsaladaValor.setBounds(100, 410, 80, 19);

        lblXsalada.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblXsalada.setForeground(new java.awt.Color(26, 68, 31));
        lblXsalada.setText("X-Salada");
        getContentPane().add(lblXsalada);
        lblXsalada.setBounds(100, 390, 80, 19);

        lblBebidas.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 24)); // NOI18N
        lblBebidas.setForeground(new java.awt.Color(26, 68, 31));
        lblBebidas.setText("BEBIDAS");
        getContentPane().add(lblBebidas);
        lblBebidas.setBounds(780, 150, 190, 50);

        lblLanches.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 24)); // NOI18N
        lblLanches.setForeground(new java.awt.Color(26, 68, 31));
        lblLanches.setText("LANCHES");
        getContentPane().add(lblLanches);
        lblLanches.setBounds(60, 150, 190, 50);

        lblBebidasImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/bebidas.png"))); // NOI18N
        getContentPane().add(lblBebidasImg);
        lblBebidasImg.setBounds(40, 0, 1280, 720);

        lblLanchesImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/lanches.png"))); // NOI18N
        getContentPane().add(lblLanchesImg);
        lblLanchesImg.setBounds(0, 0, 1280, 720);

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

    private void btnAddSaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSaladaActionPerformed
        try {
            // Utiliza a classe de conexão
            var conectado = ConnectionFactory.conectar();         
            // Define o comando SQL que será executado na tabela do banco de dados
            PreparedStatement st = conectado.prepareStatement("INSERT INTO produtos values('X-Salada', 17.99)");
            // Executa o comando insert
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAddSaladaActionPerformed

    private void btnAddDuploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDuploActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();      
            PreparedStatement st = conectado.prepareStatement("INSERT INTO produtos values('X-Duplo', 19.99)");
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAddDuploActionPerformed

    private void btnAddBurguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBurguerActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();      
            PreparedStatement st = conectado.prepareStatement("INSERT INTO produtos values('X-Burguer', 15.99)");
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAddBurguerActionPerformed

    private void btnAddBigChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBigChickenActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();              
            PreparedStatement st = conectado.prepareStatement("INSERT INTO produtos values('Big Chicken', 22.99)");
            st.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }            
    }//GEN-LAST:event_btnAddBigChickenActionPerformed

    private void btnAddChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChickenActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();      
            PreparedStatement st = conectado.prepareStatement("INSERT INTO produtos values('X-Chicken', 15.99)");
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAddChickenActionPerformed

    private void btnAddCocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCocaActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();         
            PreparedStatement st = conectado.prepareStatement("INSERT INTO produtos values('Coca-Cola', 9.99)");
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }//GEN-LAST:event_btnAddCocaActionPerformed

    private void btnAddLaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLaranjaActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();         
            PreparedStatement st = conectado.prepareStatement("INSERT INTO produtos values('Suco de Laranja', 10.99)");
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }//GEN-LAST:event_btnAddLaranjaActionPerformed

    private void btnAddAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAguaActionPerformed
        try {
            var conectado = ConnectionFactory.conectar();         
            PreparedStatement st = conectado.prepareStatement("INSERT INTO produtos values('Água', 5.99)");
            st.executeUpdate();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }//GEN-LAST:event_btnAddAguaActionPerformed

    private void btnTotalPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalPagamentoActionPerformed
        dispose();
        new Total().setVisible(true);
    }//GEN-LAST:event_btnTotalPagamentoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        new TelaInicio().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAgua;
    private javax.swing.JButton btnAddBigChicken;
    private javax.swing.JButton btnAddBurguer;
    private javax.swing.JButton btnAddChicken;
    private javax.swing.JButton btnAddCoca;
    private javax.swing.JButton btnAddDuplo;
    private javax.swing.JButton btnAddLaranja;
    private javax.swing.JButton btnAddSalada;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnTotalPagamento;
    private javax.swing.JLabel lblAgua;
    private javax.swing.JLabel lblAguaValor;
    private javax.swing.JLabel lblBebidas;
    private javax.swing.JLabel lblBebidasImg;
    private javax.swing.JLabel lblBigChicken;
    private javax.swing.JLabel lblBigChickenValor;
    private javax.swing.JLabel lblCoca;
    private javax.swing.JLabel lblCocaValor;
    private javax.swing.JLabel lblFinalizar;
    private javax.swing.JLabel lblLanches;
    private javax.swing.JLabel lblLanchesImg;
    private javax.swing.JLabel lblLaranja;
    private javax.swing.JLabel lblLaranjaValor;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblXburguer;
    private javax.swing.JLabel lblXburguerValor;
    private javax.swing.JLabel lblXchicken;
    private javax.swing.JLabel lblXchickenValor;
    private javax.swing.JLabel lblXduplo;
    private javax.swing.JLabel lblXduploValor;
    private javax.swing.JLabel lblXsalada;
    private javax.swing.JLabel lblXsaladaValor;
    private javax.swing.JPanel pnlBranco;
    private javax.swing.JPanel pnlVerde;
    // End of variables declaration//GEN-END:variables
}
