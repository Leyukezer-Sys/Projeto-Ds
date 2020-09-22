package formulario;

import dao.FornecedorDao;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Fornecedor;

public class FormFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form FormFornecedor
     */
    public FormFornecedor() {
        initComponents();
        btAtualizar.setVisible(false);
        preencherTabela();
        this.setIconImage(new ImageIcon("Icone-CriativaModas.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbFornecedor = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btCadastrarForn = new javax.swing.JButton();
        btImprimir1 = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btIExcluir = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        edPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btSalvarPdf1 = new javax.swing.JButton();
        btCancelarcONSULTA = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edNomeFantasia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edTelefone = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        edRasaoSocial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edCnpj = new javax.swing.JFormattedTextField();
        cbEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edCep = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        edNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        edEndereco = new javax.swing.JTextField();
        btSalvarPdf = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btCancelarCadastro = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Fornecedor");

        jLabel24.setText("Pesquisar:");

        btCadastrarForn.setText("CADASTRAR NOVO FORNECEDOR");
        btCadastrarForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFornActionPerformed(evt);
            }
        });

        btImprimir1.setText("IMPRIMIR");

        btEditar.setText("EDITAR");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btIExcluir.setText("EXCLUIR");
        btIExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIExcluirActionPerformed(evt);
            }
        });

        jLabel25.setText("LISTA DOS FORNECEDORES CADASTRADOS");

        edPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edPesquisaActionPerformed(evt);
            }
        });
        edPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPesquisaKeyPressed(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID DO FORNECEDOR", "NOME FANTASIA", "CNPJ", "TELEFONE", "CEP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela);

        btSalvarPdf1.setText("SALVAR EM PDF");

        btCancelarcONSULTA.setText("SAIR DA CONSULTA");
        btCancelarcONSULTA.setAlignmentY(5.0F);
        btCancelarcONSULTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarcONSULTAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btSalvarPdf1)
                .addGap(18, 18, 18)
                .addComponent(btImprimir1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEditar)
                .addGap(18, 18, 18)
                .addComponent(btIExcluir)
                .addGap(92, 92, 92))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel24)
                        .addGap(3, 3, 3)
                        .addComponent(edPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btCadastrarForn)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCancelarcONSULTA))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(edPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarForn))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarPdf1)
                    .addComponent(btImprimir1)
                    .addComponent(btEditar)
                    .addComponent(btIExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelarcONSULTA)
                .addContainerGap())
        );

        tbFornecedor.addTab("Lista", jPanel2);

        jLabel1.setText("NOME FANTASIA:");

        jLabel2.setText("TELEFONE:");

        try {
            edTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("RASÃO SOCIAL:");

        jLabel4.setText("CNPJ:");

        try {
            edCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edCnpj.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACRE", "ALAGOAS", "AMAPÁ", "AMAZONAS", "BAHIA", "CEARÁ", "ESPÍRITO SANTO", "GOIÁS", "MARANHÃO", "MATO GROSSO", "MATO GROSSO DO SUL", "MINAS GERAIS", "PARÁ", "PARAÍBA", "PARANÁ", "PERNAMBUCO", "PIAUÍ", "RIO DE JANEIRO", "RIO GRANDE DO NORTE", "RIO GRANDE DO SUL", "RONDÔNIA", "RORAIMA", "SANTA CATARINA", "SÃO PAULO", "SERGIPE", "TOCANTINS", "DISTRITO FEDERAL" }));
        cbEstado.setSelectedIndex(-1);
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        jLabel6.setText("ESTADO");

        jLabel5.setText("CIDADE:");

        jLabel9.setText("CEP");

        try {
            edCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edCep.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("NÚMERO:");

        edNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNumeroActionPerformed(evt);
            }
        });

        jLabel10.setText("ENDEREÇO:");

        edEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEnderecoActionPerformed(evt);
            }
        });

        btSalvarPdf.setText("SALVAR EM\n PDF");
        btSalvarPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSalvarPdf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btCadastrar.setText("FINALIZAR CADASTRO");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btCancelarCadastro.setText("CANCELAR");
        btCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarCadastroActionPerformed(evt);
            }
        });

        btAtualizar.setText("ATUALIZAR");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btImprimir.setText("IMPRIMIR");
        btImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(edNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(edRasaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(edTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(edCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btSalvarPdf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btImprimir)))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(edCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edCep, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(edNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(edEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edRasaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvarPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        tbFornecedor.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbFornecedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void edNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNumeroActionPerformed

    private void edEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edEnderecoActionPerformed

    private void btCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarCadastroActionPerformed
        edCep.setText(null);
        edCidade.setText(null);
        edCnpj.setText(null);
        edEndereco.setText(null);
        edNomeFantasia.setText(null);
        edNomeFantasia.requestFocus();
        edRasaoSocial.setText(null);
        edTelefone.setText(null);
        btAtualizar.setVisible(false);
        btCadastrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCancelarCadastroActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Fornecedor f = new Fornecedor();
        f.setNomeFantasia(edNomeFantasia.getText());
        f.setRasaoSociao(edRasaoSocial.getText());
        f.setCnpj(edCnpj.getText());
        f.setTelefone(edTelefone.getText());
        f.setEstado(cbEstado.getSelectedItem().toString());
        f.setCidade(edCidade.getText());
        f.setCep(edCep.getText());
        f.setEndereco(edEndereco.getText());
        FornecedorDao fdao = new FornecedorDao();
        fdao.inserir(f);
        edCep.setText(null);
        edCidade.setText(null);
        edCnpj.setText(null);
        edEndereco.setText(null);
        edNomeFantasia.setText(null);
        edNomeFantasia.requestFocus();
        edRasaoSocial.setText(null);
        edTelefone.setText(null);


    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCadastrarFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFornActionPerformed
        edCep.setText(null);
        edCidade.setText(null);
        edCnpj.setText(null);
        edEndereco.setText(null);
        edNomeFantasia.setText(null);
        edNomeFantasia.requestFocus();
        edRasaoSocial.setText(null);
        edTelefone.setText(null);
        btCadastrar.setVisible(true);
        btAtualizar.setVisible(false);
        tbFornecedor.setSelectedIndex(1);
    }//GEN-LAST:event_btCadastrarFornActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        Fornecedor f = new Fornecedor();
        int indice = tabela.getSelectedRow();

        if (indice >= 0) {
            try {
                f.setIdFornecedor(Integer.parseInt(tabela.getValueAt(indice, 0).toString()));
                edNomeFantasia.setText(tabela.getValueAt(indice, 1).toString());
                edCnpj.setText(tabela.getValueAt(indice, 2).toString());
                edTelefone.setText(tabela.getValueAt(indice, 3).toString());
                edCep.setText(tabela.getValueAt(indice, 4).toString());
                btAtualizar.setVisible(true);
                btCadastrar.setVisible(false);
                tbFornecedor.setSelectedIndex(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro Ao Carregar Dados");
        }

    }//GEN-LAST:event_btEditarActionPerformed

    private void btIExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIExcluirActionPerformed
        int indice = tabela.getSelectedRow();
        Fornecedor f = new Fornecedor();
        FornecedorDao fdao = new FornecedorDao();
        if (indice >= 0) {
            f.setIdFornecedor(Integer.parseInt(tabela.getValueAt(indice, 0).toString()));
            f.setNomeFantasia(tabela.getValueAt(indice, 1).toString());
            fdao.deletar(f);
            preencherTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btIExcluirActionPerformed

    private void edPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edPesquisaActionPerformed

    private void edPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaKeyPressed
        preencherTabela(edPesquisa.getText());
    }//GEN-LAST:event_edPesquisaKeyPressed

    private void btCancelarcONSULTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarcONSULTAActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarcONSULTAActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        Fornecedor f = new Fornecedor();
        preencherTabela(f);
        cbEstado.setSelectedItem(f.getEstado());
        edCep.setText(f.getCep());
        edCidade.setText(f.getCidade());
        edCnpj.setText(f.getCnpj());
        edEndereco.setText(f.getEndereco());
        edNomeFantasia.setText(f.getNomeFantasia());
        edNumero.setText(f.getNumero());
        edRasaoSocial.setText(f.getRasaoSociao());
        edTelefone.setText(f.getTelefone());

        f.setNomeFantasia(edNomeFantasia.getText());
        f.setRasaoSociao(edRasaoSocial.getText());
        f.setCnpj(edCnpj.getText());
        f.setTelefone(edTelefone.getText());
        f.setEstado(cbEstado.getSelectedItem().toString());
        f.setCidade(edCidade.getText());
        f.setCep(edCep.getText());
        f.setEndereco(edEndereco.getText());
        FornecedorDao fdao = new FornecedorDao();
        fdao.atualizar(f);
        edCep.setText(null);
        edCidade.setText(null);
        edCnpj.setText(null);
        edEndereco.setText(null);
        edNomeFantasia.setText(null);
        edNomeFantasia.requestFocus();
        edRasaoSocial.setText(null);
        edTelefone.setText(null);
    }//GEN-LAST:event_btAtualizarActionPerformed

    public void preencherTabela() {
        FornecedorDao fdao = new FornecedorDao();
        List<Fornecedor> lista = fdao.listarTodos();
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        for (Fornecedor f : lista) {
            modelo.addRow(new Object[]{f.getIdFornecedor(), f.getNomeFantasia(), f.getCnpj(), f.getTelefone(), f.getCep()});
        }
    }

    public void preencherTabela(Fornecedor fo) {
        FornecedorDao fdao = new FornecedorDao();
        List<Fornecedor> lista = fdao.listarTodos();
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        for (Fornecedor f : lista) {
            modelo.addRow(new Object[]{f.getIdFornecedor(), f.getNomeFantasia(), f.getCnpj(), f.getTelefone(), f.getCep()});
            fo = f;
        }
    }

    public void preencherTabela(String nome) {
        FornecedorDao fdao = new FornecedorDao();
        List<Fornecedor> lista = fdao.listarTodos(nome);
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        for (Fornecedor f : lista) {
            modelo.addRow(new Object[]{f.getIdFornecedor(), f.getNomeFantasia(), f.getCnpj(), f.getTelefone(), f.getCep()});
        }
    }

    public void iniciarCadastro() {
        tbFornecedor.setSelectedIndex(1);
    }

    public void iniciarConsulta() {
        tbFornecedor.setSelectedIndex(0);
    }

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
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCadastrarForn;
    private javax.swing.JButton btCancelarCadastro;
    private javax.swing.JButton btCancelarcONSULTA;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btIExcluir;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btImprimir1;
    private javax.swing.JButton btSalvarPdf;
    private javax.swing.JButton btSalvarPdf1;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JFormattedTextField edCep;
    private javax.swing.JTextField edCidade;
    private javax.swing.JFormattedTextField edCnpj;
    private javax.swing.JTextField edEndereco;
    private javax.swing.JTextField edNomeFantasia;
    private javax.swing.JTextField edNumero;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JTextField edRasaoSocial;
    private javax.swing.JFormattedTextField edTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    private javax.swing.JTabbedPane tbFornecedor;
    // End of variables declaration//GEN-END:variables
}
