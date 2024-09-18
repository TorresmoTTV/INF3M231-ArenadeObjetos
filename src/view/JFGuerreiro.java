/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.Guerreiro;
import servicos.ServicosFactory;
import servicos.GuerreiroServicos;

/**
 *
 * @author 182310076
 */
public class JFGuerreiro extends javax.swing.JFrame {

    /**
     * Creates new form Vitima
     */
    public JFGuerreiro() {
        initComponents();
        addRowToTable();
    }
    public void addRowToTable() {
        //pega a modelagem da tabela na interface gráfica 
        DefaultTableModel model = (DefaultTableModel) jtGuerreiro.getModel();
        model.getDataVector().removeAllElements();// remove todas as linhas
        model.fireTableDataChanged();
        // cria vetor de 7 posições que corresponde as colunas da tabela
        Object rowData[] = new Object[8];
        GuerreiroServicos guerreiroS = ServicosFactory.getGuerreiroServicos();
        // percorrer lista e popula vetor e add vetor a tabela
        for (Guerreiro guerreiro : guerreiroS.listaGuerreiros()) {
            rowData[0] = guerreiro.getId();
            rowData[1] = guerreiro.getNome();
            rowData[2] = guerreiro.getCabelo();
            rowData[3] = guerreiro.getOlho();
            rowData[4] = guerreiro.getPele();
            // if ternario
            rowData[5] = guerreiro.isSexo() == false ? "Femino" : "Masculino";
            rowData[6] = guerreiro.getArmamento();
            rowData[7] = guerreiro.getPontosDeVida();
            model.addRow(rowData);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexoGuerreiro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jtfNomeGuerreiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfCabeloGuerreiro = new javax.swing.JTextField();
        jtfOlhoGuerreiro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfPeleGuerreiro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jjrbFemininoGuerreiro = new javax.swing.JRadioButton();
        jrbMasculinoGuerreiro = new javax.swing.JRadioButton();
        jbSalvarGuerreiro = new javax.swing.JButton();
        jbLimparGuerreiro = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtGuerreiro = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jtfArmamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Ladrao");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jtfNomeGuerreiro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfNomeGuerreiro.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Cabelo:");

        jtfCabeloGuerreiro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfCabeloGuerreiro.setName(""); // NOI18N
        jtfCabeloGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCabeloGuerreiroActionPerformed(evt);
            }
        });

        jtfOlhoGuerreiro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfOlhoGuerreiro.setName(""); // NOI18N
        jtfOlhoGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfOlhoGuerreiroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Olho:");

        jtfPeleGuerreiro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfPeleGuerreiro.setName(""); // NOI18N
        jtfPeleGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPeleGuerreiroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Pele:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Sexo:");

        bgSexoGuerreiro.add(jjrbFemininoGuerreiro);
        jjrbFemininoGuerreiro.setText("Feminino");
        jjrbFemininoGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjrbFemininoGuerreiroActionPerformed(evt);
            }
        });

        bgSexoGuerreiro.add(jrbMasculinoGuerreiro);
        jrbMasculinoGuerreiro.setText("Masculino");

        jbSalvarGuerreiro.setText("Salvar");

        jbLimparGuerreiro.setText("Limpar");
        jbLimparGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparGuerreiroActionPerformed(evt);
            }
        });

        jtGuerreiro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtGuerreiro);
        if (jtGuerreiro.getColumnModel().getColumnCount() > 0) {
            jtGuerreiro.getColumnModel().getColumn(0).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(1).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(2).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(3).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(4).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(5).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(6).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Armamento:");

        jtfArmamento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfArmamento.setName(""); // NOI18N
        jtfArmamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfArmamentoActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfNomeGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addGap(8, 8, 8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfArmamento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfPeleGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfCabeloGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jjrbFemininoGuerreiro)
                                        .addComponent(jrbMasculinoGuerreiro)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtfOlhoGuerreiro)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jbSalvarGuerreiro)
                        .addGap(160, 160, 160)
                        .addComponent(jbLimparGuerreiro)))
                .addGap(0, 236, Short.MAX_VALUE))
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
                    .addComponent(jtfNomeGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCabeloGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtfOlhoGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPeleGuerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfArmamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jjrbFemininoGuerreiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbMasculinoGuerreiro)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbLimparGuerreiro)
                    .addComponent(jbSalvarGuerreiro))
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

    private void jtfCabeloGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCabeloGuerreiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCabeloGuerreiroActionPerformed

    private void jtfOlhoGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfOlhoGuerreiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfOlhoGuerreiroActionPerformed

    private void jtfPeleGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPeleGuerreiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPeleGuerreiroActionPerformed

    private void jjrbFemininoGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjrbFemininoGuerreiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jjrbFemininoGuerreiroActionPerformed

    private void jbLimparGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparGuerreiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimparGuerreiroActionPerformed

    private void jtfArmamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfArmamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfArmamentoActionPerformed

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
            java.util.logging.Logger.getLogger(JFGuerreiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGuerreiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGuerreiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGuerreiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGuerreiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexoGuerreiro;
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
    private javax.swing.JButton jbLimparGuerreiro;
    private javax.swing.JButton jbSalvarGuerreiro;
    private javax.swing.JRadioButton jjrbFemininoGuerreiro;
    private javax.swing.JRadioButton jrbMasculinoGuerreiro;
    private javax.swing.JTable jtGuerreiro;
    private javax.swing.JTextField jtfArmamento;
    private javax.swing.JTextField jtfCabeloGuerreiro;
    private javax.swing.JTextField jtfNomeGuerreiro;
    private javax.swing.JTextField jtfOlhoGuerreiro;
    private javax.swing.JTextField jtfPeleGuerreiro;
    // End of variables declaration//GEN-END:variables
}
