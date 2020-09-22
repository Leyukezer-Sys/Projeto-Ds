/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

/**
 *
 * @author Wasgton
 */
public class Form_Realizar_Venda extends javax.swing.JFrame {

    /**
     * Creates new form Form_Realizar_Venda
     */
    public Form_Realizar_Venda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel_venda = new javax.swing.JTabbedPane();
        Painel_dados_venda = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        edquantidadeProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_list_produto_venda = new javax.swing.JTable();
        Bt_add_cliente = new javax.swing.JButton();
        bt_Produto = new javax.swing.JButton();
        btExcluir_produto = new javax.swing.JButton();
        Ed_data_venda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ComboBox_cliente_venda = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        ComboBox_produto_venda = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        Painel_final_vend = new javax.swing.JPanel();
        bt_voltar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ComboBox_desconto_venda = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        ed_valor_total_venda = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_list_produto_venda_final = new javax.swing.JTable();
        Ed_data_venda_final = new javax.swing.JTextField();
        Bt_concluir = new javax.swing.JButton();
        Painel_pagamento = new javax.swing.JPanel();
        ComboBox_forma_pagamento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ed_valor_pagamento = new javax.swing.JTextField();
        bt_Confirmar = new javax.swing.JButton();
        bt_Cancelar = new javax.swing.JButton();
        bt_voltar_pagamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel_venda.setBackground(new java.awt.Color(51, 51, 255));
        Painel_venda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setText("QUANTIDADE DE PRODUTOS");

        edquantidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edquantidadeProdutoActionPerformed(evt);
            }
        });

        tabela_list_produto_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome ", "Quantidade ", "Valor_final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_list_produto_venda);

        Bt_add_cliente.setText("Cadastrar novo cliente");
        Bt_add_cliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Bt_add_cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Bt_add_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_add_clienteActionPerformed(evt);
            }
        });

        bt_Produto.setText("Add produto na tabela");
        bt_Produto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bt_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ProdutoActionPerformed(evt);
            }
        });

        btExcluir_produto.setText("Excluir produto da tabela");
        btExcluir_produto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btExcluir_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluir_produtoActionPerformed(evt);
            }
        });

        Ed_data_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ed_data_vendaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Data da venda");

        jLabel9.setText("CLIENTE");

        ComboBox_cliente_venda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox_cliente_venda.setSelectedIndex(-1);

        jLabel10.setText("PRODUTO");

        ComboBox_produto_venda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox_produto_venda.setSelectedIndex(-1);

        jButton2.setText("AVANÇAR");

        javax.swing.GroupLayout Painel_dados_vendaLayout = new javax.swing.GroupLayout(Painel_dados_venda);
        Painel_dados_venda.setLayout(Painel_dados_vendaLayout);
        Painel_dados_vendaLayout.setHorizontalGroup(
            Painel_dados_vendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_dados_vendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_dados_vendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_dados_vendaLayout.createSequentialGroup()
                        .addGroup(Painel_dados_vendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ed_data_venda)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(edquantidadeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBox_cliente_venda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(ComboBox_produto_venda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(Painel_dados_vendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Painel_dados_vendaLayout.createSequentialGroup()
                                .addComponent(Bt_add_cliente)
                                .addGap(7, 7, 7)
                                .addComponent(bt_Produto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir_produto))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_dados_vendaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(78, 78, 78))))
        );
        Painel_dados_vendaLayout.setVerticalGroup(
            Painel_dados_vendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_dados_vendaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBox_cliente_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(ComboBox_produto_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edquantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ed_data_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Painel_dados_vendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_dados_vendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bt_add_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(bt_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluir_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        Painel_venda.addTab("DADOS DA VENDA", Painel_dados_venda);

        bt_voltar.setText("VOLTAR");
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Data da venda");

        jLabel13.setText("PORCENTAGEM DE DESCONTO %");

        ComboBox_desconto_venda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        ComboBox_desconto_venda.setSelectedIndex(-1);

        jLabel14.setText("VALOR COM DESCONTO TOTAL (R$)");

        ed_valor_total_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed_valor_total_vendaActionPerformed(evt);
            }
        });

        tabela_list_produto_venda_final.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome ", "Quantidade ", "Valor_final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela_list_produto_venda_final);

        Ed_data_venda_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ed_data_venda_finalActionPerformed(evt);
            }
        });

        Bt_concluir.setText("Concluir Venda");
        Bt_concluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bt_concluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Bt_concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_concluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_final_vendLayout = new javax.swing.GroupLayout(Painel_final_vend);
        Painel_final_vend.setLayout(Painel_final_vendLayout);
        Painel_final_vendLayout.setHorizontalGroup(
            Painel_final_vendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_final_vendLayout.createSequentialGroup()
                .addGroup(Painel_final_vendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Painel_final_vendLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Painel_final_vendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel_final_vendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Painel_final_vendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBox_desconto_venda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                                .addComponent(Ed_data_venda_final, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addComponent(jLabel14)
                            .addComponent(ed_valor_total_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel_final_vendLayout.createSequentialGroup()
                        .addComponent(bt_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bt_concluir)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        Painel_final_vendLayout.setVerticalGroup(
            Painel_final_vendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_final_vendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_final_vendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_final_vendLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE))
                    .addGroup(Painel_final_vendLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ed_data_venda_final, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBox_desconto_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ed_valor_total_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(Painel_final_vendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        Painel_venda.addTab("FINALIZAR VENDA", Painel_final_vend);

        ComboBox_forma_pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão de Credito", "Cartão de Débito", "Cheque", "Crediario", "Boleto", " " }));
        ComboBox_forma_pagamento.setSelectedIndex(-1);

        jLabel2.setText("FORMA DE PAGAMENTO");

        jLabel3.setText("VALOR DO PAGAMENTO (R$)");

        bt_Confirmar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_Confirmar.setText("CONFIRMAR");

        bt_Cancelar.setText("CANCELAR");
        bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelarActionPerformed(evt);
            }
        });

        bt_voltar_pagamento.setText("VOLTAR");
        bt_voltar_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltar_pagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_pagamentoLayout = new javax.swing.GroupLayout(Painel_pagamento);
        Painel_pagamento.setLayout(Painel_pagamentoLayout);
        Painel_pagamentoLayout.setHorizontalGroup(
            Painel_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_pagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ed_valor_pagamento)
                        .addComponent(ComboBox_forma_pagamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                    .addGroup(Painel_pagamentoLayout.createSequentialGroup()
                        .addComponent(bt_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_voltar_pagamento))
                .addContainerGap(362, Short.MAX_VALUE))
        );
        Painel_pagamentoLayout.setVerticalGroup(
            Painel_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_pagamentoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBox_forma_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ed_valor_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(Painel_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(bt_voltar_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Painel_venda.addTab("PAGAMENTO", Painel_pagamento);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REALIZAR VENDA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_venda)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Painel_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edquantidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edquantidadeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edquantidadeProdutoActionPerformed

    private void Bt_add_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_add_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bt_add_clienteActionPerformed

    private void bt_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ProdutoActionPerformed

    }//GEN-LAST:event_bt_ProdutoActionPerformed

    private void Ed_data_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ed_data_vendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ed_data_vendaActionPerformed

    private void btExcluir_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluir_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluir_produtoActionPerformed

    private void ed_valor_total_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed_valor_total_vendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ed_valor_total_vendaActionPerformed

    private void Ed_data_venda_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ed_data_venda_finalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ed_data_venda_finalActionPerformed

    private void Bt_concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_concluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bt_concluirActionPerformed

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CancelarActionPerformed

    private void bt_voltar_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltar_pagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_voltar_pagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Realizar_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Realizar_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Realizar_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Realizar_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Realizar_Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_add_cliente;
    private javax.swing.JButton Bt_concluir;
    private javax.swing.JComboBox<String> ComboBox_cliente_venda;
    private javax.swing.JComboBox<String> ComboBox_desconto_venda;
    private javax.swing.JComboBox<String> ComboBox_forma_pagamento;
    private javax.swing.JComboBox<String> ComboBox_produto_venda;
    private javax.swing.JTextField Ed_data_venda;
    private javax.swing.JTextField Ed_data_venda_final;
    private javax.swing.JPanel Painel_dados_venda;
    private javax.swing.JPanel Painel_final_vend;
    private javax.swing.JPanel Painel_pagamento;
    private javax.swing.JTabbedPane Painel_venda;
    private javax.swing.JButton btExcluir_produto;
    private javax.swing.JButton bt_Cancelar;
    private javax.swing.JButton bt_Confirmar;
    private javax.swing.JButton bt_Produto;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton bt_voltar_pagamento;
    private javax.swing.JTextField ed_valor_pagamento;
    private javax.swing.JTextField ed_valor_total_venda;
    private javax.swing.JTextField edquantidadeProduto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela_list_produto_venda;
    private javax.swing.JTable tabela_list_produto_venda_final;
    // End of variables declaration//GEN-END:variables
}
