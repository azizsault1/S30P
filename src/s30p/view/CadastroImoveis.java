/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s30p.view;

/**
 *
 * @author Aziz
 */
public class CadastroImoveis extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroImoveis
     */
    public CadastroImoveis() {
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

        S30PPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("S30PPU").createEntityManager();
        tabbeCadimoveis = new javax.swing.JTabbedPane();
        panelDescricao = new javax.swing.JPanel();
        cboTipo = new javax.swing.JComboBox();
        lblTipo = new javax.swing.JLabel();
        lblAreato = new javax.swing.JLabel();
        lblAreaut = new javax.swing.JLabel();
        txtAreato = new javax.swing.JTextField();
        txtAreaut = new javax.swing.JTextField();
        lblProprietario = new javax.swing.JLabel();
        lblCondominio = new javax.swing.JLabel();
        txtCondominio = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        lblTmpoconst = new javax.swing.JLabel();
        txtTpoconst = new javax.swing.JTextField();
        lblPavim = new javax.swing.JLabel();
        txtPavim = new javax.swing.JTextField();
        lblTotun = new javax.swing.JLabel();
        txtTotun = new javax.swing.JTextField();
        lblUnpandr = new javax.swing.JLabel();
        txtUnpandr = new javax.swing.JTextField();
        lblCondom = new javax.swing.JLabel();
        txtCondom = new javax.swing.JTextField();
        lblIptu = new javax.swing.JLabel();
        txtIptu = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblPzentrega = new javax.swing.JLabel();
        txtPzentrega = new javax.swing.JTextField();
        checkRevest100 = new javax.swing.JCheckBox();
        checkColonial = new javax.swing.JCheckBox();
        checkPintura = new javax.swing.JCheckBox();
        checkSemir = new javax.swing.JCheckBox();
        checkNascente = new javax.swing.JCheckBox();
        checkPoente = new javax.swing.JCheckBox();
        checkNorte = new javax.swing.JCheckBox();
        checkSul = new javax.swing.JCheckBox();
        checkEmconst = new javax.swing.JCheckBox();
        checkInquilino = new javax.swing.JCheckBox();
        checkPropreside = new javax.swing.JCheckBox();
        checkVazio = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        uJComboBox1 = new componentes.UJComboBox();
        uJComboBox1.setAutocompletar(true);
        panelCaracteristica = new javax.swing.JPanel();
        checkPiscina = new javax.swing.JCheckBox();
        checkChurrasqueira = new javax.swing.JCheckBox();
        checkAcademia = new javax.swing.JCheckBox();
        checkPlayground = new javax.swing.JCheckBox();
        checkParque = new javax.swing.JCheckBox();
        checkQuadra = new javax.swing.JCheckBox();
        checkSlfesta = new javax.swing.JCheckBox();
        checkSljogos = new javax.swing.JCheckBox();
        checkEspgourmet = new javax.swing.JCheckBox();
        checkEspzen = new javax.swing.JCheckBox();
        checkBrinquedo = new javax.swing.JCheckBox();
        checkCinema = new javax.swing.JCheckBox();
        checkSauna = new javax.swing.JCheckBox();
        checkPorteiro = new javax.swing.JCheckBox();
        checkInterfone = new javax.swing.JCheckBox();
        checkCntgas = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        panelEndereco = new javax.swing.JPanel();

        setClosable(true);
        setTitle("SU Software - Cadastro de Imóveis");

        panelDescricao.setPreferredSize(new java.awt.Dimension(710, 372));

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Casa", "Apto", "Terreno", "Lote", "Village", "Loja", "Fazenda", "Sítio" }));

        lblTipo.setText("Tipo:");

        lblAreato.setText("Área total:");

        lblAreaut.setText("Área útil:");

        lblProprietario.setText("Proprietário:");

        lblCondominio.setText("Condomínio:");

        jCheckBox1.setText("Permuta");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        lblTmpoconst.setText("Tmpo construção:");

        lblPavim.setText("Pavimentos:");

        lblTotun.setText("Total UN.:");

        lblUnpandr.setText("UN p/andar:");

        txtUnpandr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnpandrActionPerformed(evt);
            }
        });

        lblCondom.setText("Condomínio:");

        lblIptu.setText("I.P.T.U.:");

        lblValor.setText("Valor:");

        lblPzentrega.setText("Pz entrega:");

        checkRevest100.setText("100% revestida");

        checkColonial.setText("Colonial");

        checkPintura.setText("Pintura");
        checkPintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPinturaActionPerformed(evt);
            }
        });

        checkSemir.setText("Semi-revestida");

        checkNascente.setText("Nascente");

        checkPoente.setText("Poente");

        checkNorte.setText("Norte");
        checkNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNorteActionPerformed(evt);
            }
        });

        checkSul.setText("Sul");
        checkSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSulActionPerformed(evt);
            }
        });

        checkEmconst.setText("Em construção");

        checkInquilino.setText("Inquilino");

        checkPropreside.setText("Proprietário reside");
        checkPropreside.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPropresideActionPerformed(evt);
            }
        });

        checkVazio.setText("Vazio");
        checkVazio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVazioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDescricaoLayout = new javax.swing.GroupLayout(panelDescricao);
        panelDescricao.setLayout(panelDescricaoLayout);
        panelDescricaoLayout.setHorizontalGroup(
            panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDescricaoLayout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblAreato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAreato, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(lblAreaut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAreaut, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDescricaoLayout.createSequentialGroup()
                        .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDescricaoLayout.createSequentialGroup()
                                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelDescricaoLayout.createSequentialGroup()
                                        .addComponent(lblCondom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCondom))
                                    .addGroup(panelDescricaoLayout.createSequentialGroup()
                                        .addComponent(lblTmpoconst)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTpoconst, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPavim)
                                    .addComponent(lblIptu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPavim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIptu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelDescricaoLayout.createSequentialGroup()
                                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkRevest100)
                                    .addComponent(checkNascente)
                                    .addComponent(checkEmconst))
                                .addGap(18, 18, 18)
                                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkColonial)
                                    .addComponent(checkPoente)
                                    .addComponent(checkInquilino))
                                .addGap(28, 28, 28)
                                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkPropreside)
                                    .addComponent(checkNorte)
                                    .addComponent(checkPintura))))
                        .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDescricaoLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkSul)
                                    .addComponent(checkSemir)
                                    .addComponent(checkVazio)))
                            .addGroup(panelDescricaoLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox1)
                                    .addGroup(panelDescricaoLayout.createSequentialGroup()
                                        .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelDescricaoLayout.createSequentialGroup()
                                                .addComponent(lblTotun)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtTotun, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelDescricaoLayout.createSequentialGroup()
                                                .addComponent(lblValor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(50, 50, 50)
                                        .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblUnpandr)
                                            .addComponent(lblPzentrega))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtPzentrega, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUnpandr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDescricaoLayout.createSequentialGroup()
                            .addComponent(lblProprietario)
                            .addGap(18, 18, 18)
                            .addComponent(uJComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDescricaoLayout.createSequentialGroup()
                            .addComponent(lblCondominio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(panelDescricaoLayout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        panelDescricaoLayout.setVerticalGroup(
            panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProprietario)
                    .addComponent(uJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCondominio)
                    .addComponent(txtCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo)
                    .addComponent(lblAreato)
                    .addComponent(lblAreaut)
                    .addComponent(txtAreato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAreaut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDescricaoLayout.createSequentialGroup()
                        .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTmpoconst)
                            .addComponent(txtTpoconst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPavim)
                            .addComponent(txtPavim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotun)
                            .addComponent(txtTotun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnpandr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCondom)
                            .addComponent(txtCondom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIptu)
                            .addComponent(txtIptu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPzentrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDescricaoLayout.createSequentialGroup()
                        .addComponent(lblUnpandr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPzentrega)))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkRevest100)
                    .addComponent(checkColonial)
                    .addComponent(checkPintura)
                    .addComponent(checkSemir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkNascente)
                    .addComponent(checkPoente)
                    .addComponent(checkNorte)
                    .addComponent(checkSul))
                .addGap(18, 18, 18)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkEmconst)
                    .addComponent(checkInquilino)
                    .addComponent(checkPropreside)
                    .addComponent(checkVazio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbeCadimoveis.addTab("Descrição", panelDescricao);

        checkPiscina.setText("Piscina");

        checkChurrasqueira.setText("Churrasqueira");

        checkAcademia.setText("Academia");

        checkPlayground.setText("Play ground");

        checkParque.setText("Parque");

        checkQuadra.setText("Quadra");

        checkSlfesta.setText("Sl Festa");

        checkSljogos.setText("Sl Jogos");

        checkEspgourmet.setText("Espaço gourmet");

        checkEspzen.setText("Espaço Zen");

        checkBrinquedo.setText("Brinquedoteca");

        checkCinema.setText("Cinema");
        checkCinema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCinemaActionPerformed(evt);
            }
        });

        checkSauna.setText("Sauna");

        checkPorteiro.setText("Porteiro");
        checkPorteiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPorteiroActionPerformed(evt);
            }
        });

        checkInterfone.setText("Interfone");

        checkCntgas.setText("Central gás");

        jCheckBox2.setText("Elevador");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCaracteristicaLayout = new javax.swing.GroupLayout(panelCaracteristica);
        panelCaracteristica.setLayout(panelCaracteristicaLayout);
        panelCaracteristicaLayout.setHorizontalGroup(
            panelCaracteristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaracteristicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCaracteristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCaracteristicaLayout.createSequentialGroup()
                        .addGroup(panelCaracteristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkPiscina)
                            .addComponent(checkParque)
                            .addComponent(checkEspgourmet)
                            .addComponent(checkSauna))
                        .addGap(50, 50, 50)
                        .addGroup(panelCaracteristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkChurrasqueira)
                            .addComponent(checkQuadra)
                            .addComponent(checkEspzen)
                            .addComponent(checkPorteiro))
                        .addGap(101, 101, 101)
                        .addGroup(panelCaracteristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkInterfone)
                            .addComponent(checkAcademia)
                            .addComponent(checkSlfesta)
                            .addComponent(checkBrinquedo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addGroup(panelCaracteristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkPlayground)
                            .addComponent(checkSljogos)
                            .addComponent(checkCinema)
                            .addComponent(checkCntgas))
                        .addGap(67, 67, 67))
                    .addGroup(panelCaracteristicaLayout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelCaracteristicaLayout.setVerticalGroup(
            panelCaracteristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaracteristicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCaracteristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPiscina)
                    .addComponent(checkChurrasqueira)
                    .addComponent(checkAcademia)
                    .addComponent(checkPlayground))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCaracteristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkParque)
                    .addComponent(checkQuadra)
                    .addComponent(checkSlfesta)
                    .addComponent(checkSljogos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCaracteristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkEspgourmet)
                    .addComponent(checkEspzen)
                    .addComponent(checkBrinquedo)
                    .addComponent(checkCinema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCaracteristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkSauna)
                    .addComponent(checkPorteiro)
                    .addComponent(checkInterfone)
                    .addComponent(checkCntgas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        tabbeCadimoveis.addTab("Característica", panelCaracteristica);

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        tabbeCadimoveis.addTab("Enderêço", panelEndereco);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbeCadimoveis)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbeCadimoveis, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 370, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtUnpandrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnpandrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnpandrActionPerformed

    private void checkNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNorteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNorteActionPerformed

    private void checkSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSulActionPerformed

    private void checkPropresideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPropresideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPropresideActionPerformed

    private void checkVazioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVazioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkVazioActionPerformed

    private void checkPinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPinturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPinturaActionPerformed

    private void checkCinemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCinemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkCinemaActionPerformed

    private void checkPorteiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPorteiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPorteiroActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager S30PPUEntityManager;
    private javax.swing.JComboBox cboTipo;
    private javax.swing.JCheckBox checkAcademia;
    private javax.swing.JCheckBox checkBrinquedo;
    private javax.swing.JCheckBox checkChurrasqueira;
    private javax.swing.JCheckBox checkCinema;
    private javax.swing.JCheckBox checkCntgas;
    private javax.swing.JCheckBox checkColonial;
    private javax.swing.JCheckBox checkEmconst;
    private javax.swing.JCheckBox checkEspgourmet;
    private javax.swing.JCheckBox checkEspzen;
    private javax.swing.JCheckBox checkInquilino;
    private javax.swing.JCheckBox checkInterfone;
    private javax.swing.JCheckBox checkNascente;
    private javax.swing.JCheckBox checkNorte;
    private javax.swing.JCheckBox checkParque;
    private javax.swing.JCheckBox checkPintura;
    private javax.swing.JCheckBox checkPiscina;
    private javax.swing.JCheckBox checkPlayground;
    private javax.swing.JCheckBox checkPoente;
    private javax.swing.JCheckBox checkPorteiro;
    private javax.swing.JCheckBox checkPropreside;
    private javax.swing.JCheckBox checkQuadra;
    private javax.swing.JCheckBox checkRevest100;
    private javax.swing.JCheckBox checkSauna;
    private javax.swing.JCheckBox checkSemir;
    private javax.swing.JCheckBox checkSlfesta;
    private javax.swing.JCheckBox checkSljogos;
    private javax.swing.JCheckBox checkSul;
    private javax.swing.JCheckBox checkVazio;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAreato;
    private javax.swing.JLabel lblAreaut;
    private javax.swing.JLabel lblCondom;
    private javax.swing.JLabel lblCondominio;
    private javax.swing.JLabel lblIptu;
    private javax.swing.JLabel lblPavim;
    private javax.swing.JLabel lblProprietario;
    private javax.swing.JLabel lblPzentrega;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTmpoconst;
    private javax.swing.JLabel lblTotun;
    private javax.swing.JLabel lblUnpandr;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel panelCaracteristica;
    private javax.swing.JPanel panelDescricao;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JTabbedPane tabbeCadimoveis;
    private javax.swing.JTextField txtAreato;
    private javax.swing.JTextField txtAreaut;
    private javax.swing.JTextField txtCondom;
    private javax.swing.JTextField txtCondominio;
    private javax.swing.JTextField txtIptu;
    private javax.swing.JTextField txtPavim;
    private javax.swing.JTextField txtPzentrega;
    private javax.swing.JTextField txtTotun;
    private javax.swing.JTextField txtTpoconst;
    private javax.swing.JTextField txtUnpandr;
    private javax.swing.JTextField txtValor;
    private componentes.UJComboBox uJComboBox1;
    // End of variables declaration//GEN-END:variables
}