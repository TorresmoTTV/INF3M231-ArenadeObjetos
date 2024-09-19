/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Ladrao;
import servicos.ServicosFactory;
import servicos.LadraoServicos;

/**
 *
 * @author 182310076
 */
public class JFLadrao extends javax.swing.JFrame {

    /**
     * Creates new form Ladrao
     */
    public JFLadrao() {
        initComponents();
        addRowToTable();
        jbEditarLadrao.setVisible(false);
        jbDeletarLadrao.setVisible(false);
    }

    private void addRowToTable() {
        //pega a modelagem da tabela na interface gráfica 
        DefaultTableModel model = (DefaultTableModel) jtLadrao.getModel();
        model.getDataVector().removeAllElements();// remove todas as linhas
        model.fireTableDataChanged();
        // cria vetor de 7 posições que corresponde as colunas da tabela
        Object rowData[] = new Object[8];
        LadraoServicos ladraoS = ServicosFactory.getLadraoServicos();
        // percorrer lista e popula vetor e add vetor a tabela
        for (Ladrao ladrao : ladraoS.listaLadroes()) {
            rowData[0] = ladrao.getId();
            rowData[1] = ladrao.getNome();
            rowData[2] = ladrao.getCabelo();
            rowData[3] = ladrao.getOlho();
            rowData[4] = ladrao.getPele();
            // if ternario
            rowData[5] = ladrao.isSexo() == false ? "Femino" : "Masculino";
            rowData[6] = ladrao.getPlanoDeFuga();
            rowData[7] = ladrao.getPontosDeVida();
            model.addRow(rowData);
        }
    }

    private void limpaCampos() {
        jtfNomeLadrao.setText("");
        jtfCabeloLadrao.setText("");
        jtfOlhoLadrao.setText("");
        jtfPeleLadrao.setText("");
        jtfPlanodeFuga.setText("");
        bgSexoLadrao.clearSelection();
        jtfNomeLadrao.requestFocus();
    }

    private boolean validaInputs() {
        if (jtfNomeLadrao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher o nome!");
            jtfNomeLadrao.requestFocus();
            return false;
        }
        if (jtfCabeloLadrao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher a cor cabelo!");
            jtfCabeloLadrao.requestFocus();
            return false;
        }
        if (jtfOlhoLadrao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher a cor do olho!");
            jtfOlhoLadrao.requestFocus();
            return false;
        }
        if (jtfPeleLadrao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher a cor da pele!");
            jtfPeleLadrao.requestFocus();
            return false;
        }
        if (!jrbFemininoLadrao.isSelected() && !jrbMasculinoLadrao.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecionar o sexo!");
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexoLadrao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jtfNomeLadrao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfCabeloLadrao = new javax.swing.JTextField();
        jtfOlhoLadrao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfPeleLadrao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jrbFemininoLadrao = new javax.swing.JRadioButton();
        jrbMasculinoLadrao = new javax.swing.JRadioButton();
        jbSalvarLadrao = new javax.swing.JButton();
        jbLimparLadrao = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLadrao = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jtfPlanodeFuga = new javax.swing.JTextField();
        jbDeletarLadrao = new javax.swing.JButton();
        jbEditarLadrao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Ladrao");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jtfNomeLadrao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfNomeLadrao.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Cabelo:");

        jtfCabeloLadrao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfCabeloLadrao.setName(""); // NOI18N
        jtfCabeloLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCabeloLadraoActionPerformed(evt);
            }
        });

        jtfOlhoLadrao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfOlhoLadrao.setName(""); // NOI18N
        jtfOlhoLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfOlhoLadraoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Olho:");

        jtfPeleLadrao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfPeleLadrao.setName(""); // NOI18N
        jtfPeleLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPeleLadraoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Pele:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Sexo:");

        bgSexoLadrao.add(jrbFemininoLadrao);
        jrbFemininoLadrao.setText("Feminino");
        jrbFemininoLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFemininoLadraoActionPerformed(evt);
            }
        });

        bgSexoLadrao.add(jrbMasculinoLadrao);
        jrbMasculinoLadrao.setText("Masculino");

        jbSalvarLadrao.setText("Salvar");
        jbSalvarLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarLadraoActionPerformed(evt);
            }
        });

        jbLimparLadrao.setText("Limpar");
        jbLimparLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparLadraoActionPerformed(evt);
            }
        });

        jtLadrao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Cabelo", "Olho", "Pele", "Sexo", "Plano de Fuga", "HP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLadrao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLadraoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtLadrao);
        if (jtLadrao.getColumnModel().getColumnCount() > 0) {
            jtLadrao.getColumnModel().getColumn(0).setResizable(false);
            jtLadrao.getColumnModel().getColumn(1).setResizable(false);
            jtLadrao.getColumnModel().getColumn(2).setResizable(false);
            jtLadrao.getColumnModel().getColumn(3).setResizable(false);
            jtLadrao.getColumnModel().getColumn(4).setResizable(false);
            jtLadrao.getColumnModel().getColumn(5).setResizable(false);
            jtLadrao.getColumnModel().getColumn(6).setResizable(false);
            jtLadrao.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Plano de Fuga:");

        jtfPlanodeFuga.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfPlanodeFuga.setName(""); // NOI18N
        jtfPlanodeFuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPlanodeFugaActionPerformed(evt);
            }
        });

        jbDeletarLadrao.setText("Deletar");
        jbDeletarLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarLadraoActionPerformed(evt);
            }
        });

        jbEditarLadrao.setText("Editar");
        jbEditarLadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarLadraoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfNomeLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jbSalvarLadrao))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbLimparLadrao)
                            .addComponent(jtfPlanodeFuga, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPeleLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCabeloLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfOlhoLadrao))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbEditarLadrao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbDeletarLadrao)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbFemininoLadrao)
                                            .addComponent(jrbMasculinoLadrao))))))))
                .addGap(0, 177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNomeLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCabeloLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtfOlhoLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPeleLadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPlanodeFuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbFemininoLadrao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbMasculinoLadrao)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarLadrao)
                    .addComponent(jbLimparLadrao)
                    .addComponent(jbDeletarLadrao)
                    .addComponent(jbEditarLadrao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void jtfCabeloLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCabeloLadraoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCabeloLadraoActionPerformed

    private void jtfOlhoLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfOlhoLadraoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfOlhoLadraoActionPerformed

    private void jtfPeleLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPeleLadraoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPeleLadraoActionPerformed

    private void jrbFemininoLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFemininoLadraoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbFemininoLadraoActionPerformed

    private void jbLimparLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparLadraoActionPerformed
        // TODO add your handling code here:
        limpaCampos();
    }//GEN-LAST:event_jbLimparLadraoActionPerformed

    private void jtfPlanodeFugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPlanodeFugaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPlanodeFugaActionPerformed

    private void jbSalvarLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarLadraoActionPerformed
        // TODO add your handling code here:
        if (validaInputs()) {
            Ladrao l = new Ladrao();
            l.setNome(jtfNomeLadrao.getText().toUpperCase());
            l.setCabelo(jtfCabeloLadrao.getText().toUpperCase());
            l.setOlho(jtfOlhoLadrao.getText().toUpperCase());
            l.setPele(jtfPeleLadrao.getText().toUpperCase());
            l.setPlanoDeFuga(jtfPlanodeFuga.getText().toUpperCase());
            if (jrbFemininoLadrao.isSelected() || jrbMasculinoLadrao.isSelected()) {
                l.setSexo(!jrbFemininoLadrao.isSelected());
            }
            LadraoServicos ladraoS = ServicosFactory.getLadraoServicos();
            ladraoS.cadastrarLadrao(l);
            addRowToTable();
            limpaCampos();
        }
    }//GEN-LAST:event_jbSalvarLadraoActionPerformed

    private void jbDeletarLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarLadraoActionPerformed
        // TODO add your handling code here:
        int linha = jtLadrao.getSelectedRow();
        int id = (int) jtLadrao.getValueAt(linha, 0);
        String nome = (String) jtLadrao.getValueAt(linha, 1);
        Object[] btnMSG = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this, "Deseja realmente deletar " + nome, ".: Deletar :.",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, btnMSG, btnMSG[0]);
        if (resp == 0) {
            LadraoServicos LadraoS = ServicosFactory.getLadraoServicos();
            LadraoS.deletarLadrao(id);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Ladrao " + nome + " deletada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Ok, delete cancelado com sucesso!");
        }
        jbEditarLadrao.setVisible(false);
        jbDeletarLadrao.setVisible(false);
    }//GEN-LAST:event_jbDeletarLadraoActionPerformed

    private void jbEditarLadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarLadraoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEditarLadraoActionPerformed

    private void jtLadraoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLadraoMouseClicked
        // TODO add your handling code here:
        jbEditarLadrao.setVisible(true);
        jbDeletarLadrao.setVisible(true);
    }//GEN-LAST:event_jtLadraoMouseClicked

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
            java.util.logging.Logger.getLogger(JFLadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLadrao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexoLadrao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbDeletarLadrao;
    private javax.swing.JButton jbEditarLadrao;
    private javax.swing.JButton jbLimparLadrao;
    private javax.swing.JButton jbSalvarLadrao;
    private javax.swing.JRadioButton jrbFemininoLadrao;
    private javax.swing.JRadioButton jrbMasculinoLadrao;
    private javax.swing.JTable jtLadrao;
    private javax.swing.JTextField jtfCabeloLadrao;
    private javax.swing.JTextField jtfNomeLadrao;
    private javax.swing.JTextField jtfOlhoLadrao;
    private javax.swing.JTextField jtfPeleLadrao;
    private javax.swing.JTextField jtfPlanodeFuga;
    // End of variables declaration//GEN-END:variables
}
