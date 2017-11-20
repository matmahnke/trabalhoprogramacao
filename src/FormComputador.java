
import java.util.*;
import javax.swing.*;

public class FormComputador extends javax.swing.JFrame {

    // ATRIBUTOS
    private Computador comp;
    private Porta portaAtual;
    private Dispositivo dispositivoAtual;
    private int totalPar, totalUsb;

    // CONSTRUTOR
    public FormComputador() {
        initComponents();
        // CRIA UM NOVO COMPUTADOR
        this.comp = new Computador();
        // DEFINE O NÚMERO DE PORTAS IGUAL A ZERO
        this.totalPar = this.totalUsb = 0;
        // ENVIA ESSES VALORES PRO TEXTFIELD
        txtNumeroParalela.setText(Integer.toString(this.totalPar));
        txtNumeroUsb.setText(Integer.toString(this.totalUsb));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTipoPorta = new javax.swing.ButtonGroup();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnVerDiretorios4 = new javax.swing.JButton();
        lalDadoPorta4 = new javax.swing.JLabel();
        txtNomeDispositivo4 = new javax.swing.JTextField();
        txtCapacidadeDispositivo4 = new javax.swing.JTextField();
        btnConectarNaPorta4 = new javax.swing.JButton();
        grupoTipoDiretorio = new javax.swing.ButtonGroup();
        grupoMidia = new javax.swing.ButtonGroup();
        tabControl = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblNumeroParalela = new javax.swing.JLabel();
        lblNumeroUsb = new javax.swing.JLabel();
        btnCriarComputador = new javax.swing.JButton();
        rdUSB = new javax.swing.JRadioButton();
        rdParalela = new javax.swing.JRadioButton();
        btnAddPorta = new javax.swing.JButton();
        txtNumeroParalela = new javax.swing.JLabel();
        txtNumeroUsb = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbPortas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTrazerDados1 = new javax.swing.JButton();
        btnConectarVerDispositivo = new javax.swing.JButton();
        lblDadoTipo = new javax.swing.JLabel();
        lblDadoEstado = new javax.swing.JLabel();
        lblDadoDispositivo = new javax.swing.JLabel();
        lblDadoPorta = new javax.swing.JLabel();
        btnConectarVerMidia = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnConectarDispPorta = new javax.swing.JButton();
        lblDadoPortaAtual = new javax.swing.JLabel();
        txtNomeDisp = new javax.swing.JTextField();
        txtCapDisp = new javax.swing.JTextField();
        btnAddDiretorio = new javax.swing.JButton();
        btnVoltarParaPorta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbTipoDispositivo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        txtNomeDiretorio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTamanhoDiretorio = new javax.swing.JTextField();
        rdPasta = new javax.swing.JRadioButton();
        rdArquivo = new javax.swing.JRadioButton();
        btnVoltarParaDispositivo = new javax.swing.JButton();
        btnListarDiretorios = new javax.swing.JButton();
        btnAddNovoDiretorio = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cmbDiretorios = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        rdCD = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblDadoPortaMidia = new javax.swing.JLabel();
        lblDadoDispMidia = new javax.swing.JLabel();
        rdDVD = new javax.swing.JRadioButton();
        btnConectarDispPorta1 = new javax.swing.JButton();
        btnAddDiretorio1 = new javax.swing.JButton();
        btnVoltarParaPorta1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtTamanhoDiretorio1 = new javax.swing.JTextField();

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Porta atual:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Nome do Dispositivo:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Capacidade do Dispositivo:");

        btnVerDiretorios4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVerDiretorios4.setText("Ver Diretórios");
        btnVerDiretorios4.setEnabled(false);

        lalDadoPorta4.setText("0");

        btnConectarNaPorta4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConectarNaPorta4.setText("Conectar Dispositivo");
        btnConectarNaPorta4.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(lalDadoPorta4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNomeDispositivo4)
                            .addComponent(txtCapacidadeDispositivo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConectarNaPorta4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerDiretorios4)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lalDadoPorta4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtNomeDispositivo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtCapacidadeDispositivo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerDiretorios4)
                    .addComponent(btnConectarNaPorta4))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabControl.setEnabled(false);

        lblNumeroParalela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumeroParalela.setText("Número de portas Paralelas:");

        lblNumeroUsb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumeroUsb.setText("Número de portas USB:");

        btnCriarComputador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCriarComputador.setText("Criar Computador");
        btnCriarComputador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarComputadorActionPerformed(evt);
            }
        });

        grupoTipoPorta.add(rdUSB);
        rdUSB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdUSB.setSelected(true);
        rdUSB.setText("Porta USB");
        rdUSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdUSBActionPerformed(evt);
            }
        });

        grupoTipoPorta.add(rdParalela);
        rdParalela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdParalela.setText("Porta Paralela");

        btnAddPorta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddPorta.setText("Adicionar porta");
        btnAddPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPortaActionPerformed(evt);
            }
        });

        txtNumeroParalela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNumeroParalela.setText("0");

        txtNumeroUsb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNumeroUsb.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCriarComputador))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rdUSB)
                        .addGap(31, 31, 31)
                        .addComponent(rdParalela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddPorta))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNumeroParalela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroParalela))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNumeroUsb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroUsb)))
                        .addGap(0, 198, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdUSB)
                    .addComponent(rdParalela)
                    .addComponent(btnAddPorta))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroParalela)
                    .addComponent(txtNumeroParalela))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroUsb)
                    .addComponent(txtNumeroUsb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCriarComputador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabControl.addTab("Computador", jPanel1);

        cmbPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Informações da porta");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tipo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Dispositivo conectado:");

        btnTrazerDados1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTrazerDados1.setText("Trazer Dados");
        btnTrazerDados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrazerDados1ActionPerformed(evt);
            }
        });

        btnConectarVerDispositivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConectarVerDispositivo.setText("Conectar/Ver Dispositivo");
        btnConectarVerDispositivo.setEnabled(false);
        btnConectarVerDispositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarVerDispositivoActionPerformed(evt);
            }
        });

        lblDadoTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblDadoEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblDadoDispositivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblDadoPorta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConectarVerMidia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConectarVerMidia.setText("Conectar/Ver Mídia");
        btnConectarVerMidia.setEnabled(false);
        btnConectarVerMidia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarVerMidiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbPortas, 0, 263, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazerDados1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDadoPorta))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDadoTipo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDadoEstado))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDadoDispositivo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConectarVerMidia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConectarVerDispositivo)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrazerDados1))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblDadoPorta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblDadoTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblDadoEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblDadoDispositivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConectarVerDispositivo)
                    .addComponent(btnConectarVerMidia))
                .addContainerGap())
        );

        tabControl.addTab("Portas", jPanel2);

        jLabel1.setText("Porta Atual:");

        jLabel2.setText("Nome do Dispositivo:");

        jLabel7.setText("Capacidade (bytes):");

        btnConectarDispPorta.setText("Conectar Dispositivo");
        btnConectarDispPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarDispPortaActionPerformed(evt);
            }
        });

        lblDadoPortaAtual.setText("---");

        txtNomeDisp.setMaximumSize(new java.awt.Dimension(1, 1));
        txtNomeDisp.setMinimumSize(new java.awt.Dimension(1, 1));

        btnAddDiretorio.setText("Adicionar/Ver Diretórios");
        btnAddDiretorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDiretorioActionPerformed(evt);
            }
        });

        btnVoltarParaPorta.setText("Voltar");
        btnVoltarParaPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarParaPortaActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo:");

        cmbTipoDispositivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCapDisp)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblDadoPortaAtual)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbTipoDispositivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltarParaPorta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnConectarDispPorta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddDiretorio)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDadoPortaAtual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCapDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbTipoDispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConectarDispPorta)
                    .addComponent(btnAddDiretorio)
                    .addComponent(btnVoltarParaPorta))
                .addContainerGap())
        );

        tabControl.addTab("Dispositivo", jPanel4);

        txtNomeDiretorio.setMaximumSize(new java.awt.Dimension(1, 1));
        txtNomeDiretorio.setMinimumSize(new java.awt.Dimension(1, 1));

        jLabel10.setText("Nome do Diretório:");

        jLabel11.setText("Tipo:");

        jLabel18.setText("Tamanho (bytes):");

        txtTamanhoDiretorio.setText("0");
        txtTamanhoDiretorio.setEnabled(false);
        txtTamanhoDiretorio.setMaximumSize(new java.awt.Dimension(1, 1));
        txtTamanhoDiretorio.setMinimumSize(new java.awt.Dimension(1, 1));

        grupoTipoDiretorio.add(rdPasta);
        rdPasta.setSelected(true);
        rdPasta.setText("Pasta");
        rdPasta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdPastaStateChanged(evt);
            }
        });
        rdPasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPastaActionPerformed(evt);
            }
        });

        grupoTipoDiretorio.add(rdArquivo);
        rdArquivo.setText("Arquivo");

        btnVoltarParaDispositivo.setText("Voltar");
        btnVoltarParaDispositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarParaDispositivoActionPerformed(evt);
            }
        });

        btnListarDiretorios.setText("Listar Diretórios");
        btnListarDiretorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDiretoriosActionPerformed(evt);
            }
        });

        btnAddNovoDiretorio.setText("Adicionar Diretório");
        btnAddNovoDiretorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNovoDiretorioActionPerformed(evt);
            }
        });

        jLabel9.setText("Adicionar em:");

        cmbDiretorios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel18)
                            .addComponent(jLabel9))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTamanhoDiretorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomeDiretorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rdPasta)
                                .addGap(18, 18, 18)
                                .addComponent(rdArquivo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbDiretorios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltarParaDispositivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(btnListarDiretorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddNovoDiretorio)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDiretorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNomeDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rdPasta)
                    .addComponent(rdArquivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtTamanhoDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarParaDispositivo)
                    .addComponent(btnListarDiretorios)
                    .addComponent(btnAddNovoDiretorio))
                .addContainerGap())
        );

        tabControl.addTab("Diretório", jPanel3);

        jLabel24.setText("Tipo de Mídia:");

        grupoMidia.add(rdCD);
        rdCD.setSelected(true);
        rdCD.setText("CD");
        rdCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdCDActionPerformed(evt);
            }
        });

        jLabel19.setText("Porta:");

        jLabel20.setText("Dispositivo:");

        lblDadoPortaMidia.setText("---");

        lblDadoDispMidia.setText("---");

        grupoMidia.add(rdDVD);
        rdDVD.setText("DVD");

        btnConectarDispPorta1.setText("Conectar Mídia");
        btnConectarDispPorta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarDispPorta1ActionPerformed(evt);
            }
        });

        btnAddDiretorio1.setText("Adicionar/Ver Diretórios");
        btnAddDiretorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDiretorio1ActionPerformed(evt);
            }
        });

        btnVoltarParaPorta1.setText("Voltar");
        btnVoltarParaPorta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarParaPorta1ActionPerformed(evt);
            }
        });

        jLabel25.setText("Tamanho (bytes):");

        txtTamanhoDiretorio1.setText("0");
        txtTamanhoDiretorio1.setMaximumSize(new java.awt.Dimension(1, 1));
        txtTamanhoDiretorio1.setMinimumSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDadoPortaMidia)
                    .addComponent(lblDadoDispMidia)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rdCD)
                        .addGap(18, 18, 18)
                        .addComponent(rdDVD)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltarParaPorta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(btnConectarDispPorta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddDiretorio1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel25)
                        .addGap(10, 10, 10)
                        .addComponent(txtTamanhoDiretorio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblDadoPortaMidia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblDadoDispMidia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(rdCD)
                    .addComponent(rdDVD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtTamanhoDiretorio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConectarDispPorta1)
                    .addComponent(btnAddDiretorio1)
                    .addComponent(btnVoltarParaPorta1))
                .addContainerGap())
        );

        tabControl.addTab("Mídia", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabControl))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabControl)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdUSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdUSBActionPerformed
    }//GEN-LAST:event_rdUSBActionPerformed

    // MÉTODO QUE ADICIONA PORTAS
    private void btnAddPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPortaActionPerformed
        if (rdParalela.isSelected()) {
            // ADICIONA UMA PORTA NO COMPUTADOR ENVIANDO O TIPO
            // 0 = PARALELA
            comp.addPorta(0);
            this.totalPar++;
        } else {
            // 1 = USB
            comp.addPorta(1);
            this.totalUsb++;
        }
        // ENVIA OS VALORES PRO TEXTFIELD
        txtNumeroParalela.setText(Integer.toString(this.totalPar));
        txtNumeroUsb.setText(Integer.toString(this.totalUsb));
    }//GEN-LAST:event_btnAddPortaActionPerformed

    // MÉTODO QUE CRIA UM COMPUTADOR
    private void btnCriarComputadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarComputadorActionPerformed
        // SE NÃO HÁ NENHUM TIPO DE PORTA
        if (this.totalPar == 0 && this.totalUsb == 0) {
            // MOSTRA MENSAGEM PARA O USUÁRIO
            JOptionPane.showMessageDialog(null, "Informe uma quantidade de portas válida!");
            // SAI DO MÉTODO
            return;
        }
        // SEM NENHUM ERRO, MUDA PARA A ABA DE PORTAS
        tabControl.setSelectedIndex(1);
        // LIMPA A COMBOBOX
        cmbPortas.removeAllItems();
        // POPULAR A COMBOBOX COM AS PORTAS
        for (Porta p : comp.listarConteudo()) {
            // MOSTRA O NOME DA PORTA
            cmbPortas.addItem(p.getNomePorta());
        }
    }//GEN-LAST:event_btnCriarComputadorActionPerformed

    // MÉTODO QUE TRAZ OS DADOS DO COMBOBOX
    private void btnTrazerDados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrazerDados1ActionPerformed
        // CRIA UMA NOVA PORTA BASEADO NA PORTA SELECIONADA
        portaAtual = buscarDados(cmbPortas.getSelectedItem().toString());
        // POPULA AS ETIQUETAS DE TEXTO COM OS VALORES DA PORTA
        lblDadoPorta.setText(portaAtual.getNomePorta());
        lblDadoTipo.setText(portaAtual.getTipoPorta());
        lblDadoEstado.setText(portaAtual.getEstadoString());
        // CONFERE SE TEM UM DISPOSITIVO CONECTADO
        try {
            lblDadoDispositivo.setText(portaAtual.getDispositivo().getLetra() + " (" + portaAtual.getDispositivo().getEspaco() + " bytes)");
        } catch (Exception ex) {
            // CASO DÊ ERRO MOSTRA A MENSAGEM NO CAMPO DO DISPOSITIVO
            lblDadoDispositivo.setText(ex.getMessage());
        }
        // SÓ É POSSÍVEL CONECTAR UM DISPOSITIVO SE NÃO HÁ NADA CONECTADO
        btnConectarVerDispositivo.setEnabled(true);
        // SÓ É POSSÍVEL ADICIONAR MÍDIA NO DISPOSITIVO SE ELE FOR PARALELO
        // E TIVER UM DISPOSITIVO CONECTADO
        btnConectarVerMidia.setEnabled(portaAtual.getTipoPorta() == "Paralela" && portaAtual.getIsConectada());
    }//GEN-LAST:event_btnTrazerDados1ActionPerformed

    // MÉTODO QUE TRAZ OS DADOS DAS PORTAS
    private Porta buscarDados(String value) {
        Porta p = null;
        // PERCORRE A LISTA DE PORTAS DO COMPUTADOR
        for (int i = 0; i < comp.listarConteudo().size(); i++) {
            // COMPARA O NOME DA PORTA (QUE É ÚNICO E GERADO) COM O DA COMBOBOX
            if (comp.listarConteudo().get(i).getNomePorta() == value) {
                // SE FOR IGUAL DA VALOR AO OBJETO
                p = comp.listarConteudo().get(i);
            }
        }
        // RETORNA O QUE FOI ACHADO
        return p;
    }

    // MÉTODO QUE ABRE A ABA DE DISPOSITIVO
    private void btnConectarVerDispositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarVerDispositivoActionPerformed
        // TROCA DE GUIA
        tabControl.setSelectedIndex(2);
        // INFORMA A QUAL PORTA O DISPOSITIVO VAI SER ADICIONADO
        lblDadoPortaAtual.setText(portaAtual.getNomePorta() + " - " + portaAtual.getTipoPorta());
        // VERIFICA SE É POSSÍVEL CONECTAR O DISPOSITIVO NA PORTA
        btnConectarDispPorta.setEnabled(!portaAtual.getIsConectada());
        // LIMPA A COMBOBOX
        cmbTipoDispositivo.removeAllItems();
        // POPULA A COMBOBOX
        if (portaAtual.getTipoPorta() == "USB") {
            cmbTipoDispositivo.addItem("HD Externo");
            cmbTipoDispositivo.addItem("PenDrive");

        } else {
            cmbTipoDispositivo.addItem("CD");
            cmbTipoDispositivo.addItem("DVD");
            cmbTipoDispositivo.addItem("HD");
        }
        // PREENCHE/LIMPA OS CAMPOS
        if (portaAtual.getIsConectada()) {
            txtCapDisp.setText(Integer.toString(portaAtual.getDispositivo().getLimiteCapadidade()));
            txtNomeDisp.setText(portaAtual.getDispositivo().getLetra());
            cmbTipoDispositivo.setSelectedIndex(portaAtual.getDispositivo().getTipo());
        } else {
            txtCapDisp.setText("");
            txtNomeDisp.setText("");
            cmbTipoDispositivo.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnConectarVerDispositivoActionPerformed

    // MÉTODO QUE VOLTA PRA ABA DE PORTAS
    private void btnVoltarParaPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarParaPortaActionPerformed
        tabControl.setSelectedIndex(1);
    }//GEN-LAST:event_btnVoltarParaPortaActionPerformed

    // MÉTODO QUE CONECTA UM NOVO DISPOSITIVO NA PORTA
    private void btnConectarDispPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarDispPortaActionPerformed
        try {
            // INSTANCIA UM DISPOSITIVO
            Dispositivo dis;
            // VERIFICA SE OS CAMPOS FORAM INFORMADOS
            if (txtNomeDisp.getText() == null || txtCapDisp.getText() == null || txtNomeDisp.getText().trim().length() == 0 || txtCapDisp.getText().trim().length() == 0) {
                throw new IllegalArgumentException("Informe todos os campos!");
            }
            // VERIFICA O TIPO DE PORTA
            if (portaAtual.getTipoPorta() == "Paralela") {
                // CRIA UM DISPOSITIVO PARALELO
                dis = new Paralelo(txtNomeDisp.getText(), Integer.parseInt(txtCapDisp.getText()), cmbTipoDispositivo.getSelectedIndex());
            } else {
                // CRIA UM DISPOSITIVO USB
                dis = new USB(txtNomeDisp.getText(), Integer.parseInt(txtCapDisp.getText()), cmbTipoDispositivo.getSelectedIndex());
            }
            // CONECTA ELE À PORTA ATUAL
            portaAtual.conectarDispositivo(dis);
            // MENSAGEM DE SUCESSO
            JOptionPane.showMessageDialog(null, "Dispositivo " + dis.getLetra() + " conectado com sucesso à porta " + portaAtual.getNomePorta() + "!");
            // VOLTA PARA A ABA DE PORTAS
            tabControl.setSelectedIndex(1);
        } catch (NumberFormatException ex) {
            // EXCEÇÃO PARA NUMERO
            JOptionPane.showMessageDialog(null, "Valor para limite de capacidade inválido!");
        } catch (IllegalArgumentException ex) {
            // EXCEÇÃO PARA DEMAIS TIPOS
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnConectarDispPortaActionPerformed

    // MÉTODO QUE VOLTA PRA ABA DE DISPOSITIVO
    private void btnVoltarParaDispositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarParaDispositivoActionPerformed
        tabControl.setSelectedIndex(2);
    }//GEN-LAST:event_btnVoltarParaDispositivoActionPerformed

    // MÉTODO QUE LISTA TODOS OS DIRETÓRIOS DO DISPOSITIVO
    private void btnListarDiretoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDiretoriosActionPerformed
        JOptionPane.showMessageDialog(null, portaAtual.getDispositivo().listarDiretorios());
    }//GEN-LAST:event_btnListarDiretoriosActionPerformed

    // MÉTODO QUE ABRE A ABA DE DIRETÓRIO
    private void btnAddDiretorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDiretorioActionPerformed
        try {
            dispositivoAtual = portaAtual.getDispositivo();
            // TROCA DE GUIA
            tabControl.setSelectedIndex(3);
            // LIMPA O FORMULÁRIO
            txtNomeDiretorio.setText("");
            rdPasta.setSelected(true);
            txtTamanhoDiretorio.setText("0");
            // LIMPA A COMBOBOX
            cmbDiretorios.removeAllItems();
            // ADICIONA O DISPOSITIVO COMO DIRETÓRIO PAI
            cmbDiretorios.addItem(dispositivoAtual.getLetra() + " (Dispositivo Atual)");
            // ADICIONA OS DIRETÓRIOS DO DISPOSITIVO
            for (Diretorio dir : dispositivoAtual.getDiretorios()) {
                if (dir.getTipoDiretorio() == "Pasta") {
                    cmbDiretorios.addItem(dir.getNome());
                }
            }
            cmbDiretorios.setSelectedIndex(0);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAddDiretorioActionPerformed

    private void rdPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPastaActionPerformed
    }//GEN-LAST:event_rdPastaActionPerformed

    // MÉTODO QUE MUDA A DISPONIBILIDADE DA CAIXA DE TEXTO PARA TAMANHO DO DIRETÓRIO
    // CONFORME O TIPO DE DIRETÓRIO ESCOLHIDO
    private void rdPastaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdPastaStateChanged
        txtTamanhoDiretorio.setEnabled(!rdPasta.isSelected());
    }//GEN-LAST:event_rdPastaStateChanged

    // MÉTODO QUE ADICIONA UM NOVO DIRETÓRIO
    private void btnAddNovoDiretorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNovoDiretorioActionPerformed
        try {
            // PEGA O TIPO DE DIRETÓRIO
            int tipo = 0;
            // VERIFICA O QUE VAI SER
            // 0 - ARQUIVO
            // 1 - PASTA
            if (rdPasta.isSelected()) {
                tipo = 1;
            }
            if (txtNomeDiretorio.getText() == null || txtTamanhoDiretorio.getText() == null || txtNomeDiretorio.getText().trim().length() == 0 || txtTamanhoDiretorio.getText().trim().length() == 0) {
                throw new IllegalArgumentException("Informe todos os campos!");
            }
            // CRIA UM NOVO OBJETO DE DIRETÓRIO
            Diretorio dir = new Diretorio(txtNomeDiretorio.getText(), Integer.parseInt(txtTamanhoDiretorio.getText()), tipo);
            if (cmbDiretorios.getSelectedIndex() == 0) {
                // ADICIONA UM DIRETÓRIO NO DISPOSITIVO ATUAL
                this.portaAtual.getDispositivo().addDiretorio(dir);
            } else {
                // PROCURA A PASTA QUE FOI SELECIONADA
                for (Diretorio diret : this.portaAtual.getDispositivo().getDiretorios()) {
                    if (diret.getNome() == cmbDiretorios.getSelectedItem()) {
                        // VERIFICA SE HÁ ESPAÇO DISPONÍVEL (POR ESTAR ADICIONANDO DIRETAMENTE
                        // EM OUTRO DIRETÓRIO NÃO HÁ VERIFICAÇÃO NA CLASSE)
                        if (this.portaAtual.getDispositivo().verificarEspacoDisponivel(dir)) {
                            throw new IllegalArgumentException("Tamanho do arquivo ou pasta maior que o disponível no dispositivo.");
                        }
                        // ADICIONA O DIRETÓRIO NELA
                        diret.addDiretorio(dir);
                        break;
                    }
                }
            }
            // MENSAGEM DE SUCESSO
            JOptionPane.showMessageDialog(null, "Diretório adicionado com sucesso!");
            // VOLTA PRA ABA DE DISPOSITIVO
            tabControl.setSelectedIndex(2);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAddNovoDiretorioActionPerformed

    private void rdCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdCDActionPerformed

    private void btnConectarDispPorta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarDispPorta1ActionPerformed
        // ARRUMAR ESSA BOSTA
    }//GEN-LAST:event_btnConectarDispPorta1ActionPerformed

    private void btnAddDiretorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDiretorio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddDiretorio1ActionPerformed

    // MÉTODO QUE VOLTA PRA ABA DE PORTA
    private void btnVoltarParaPorta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarParaPorta1ActionPerformed
        tabControl.setSelectedIndex(1);
    }//GEN-LAST:event_btnVoltarParaPorta1ActionPerformed

    private void btnConectarVerMidiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarVerMidiaActionPerformed
        // TROCA DE GUIA
        tabControl.setSelectedIndex(4);
        // INFORMA A QUAL PORTA A MIDIA VAI SER ADICIONADA
        lblDadoPortaMidia.setText(portaAtual.getNomePorta());
        // INFORMA A QUAL DISPOSITIVO A MIDIA VAI SER ADICIONADA
        lblDadoDispMidia.setText(portaAtual.getDispositivo().getLetra());
    }//GEN-LAST:event_btnConectarVerMidiaActionPerformed

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
            java.util.logging.Logger.getLogger(FormComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDiretorio;
    private javax.swing.JButton btnAddDiretorio1;
    private javax.swing.JButton btnAddNovoDiretorio;
    private javax.swing.JButton btnAddPorta;
    private javax.swing.JButton btnConectarDispPorta;
    private javax.swing.JButton btnConectarDispPorta1;
    private javax.swing.JButton btnConectarNaPorta1;
    private javax.swing.JButton btnConectarNaPorta2;
    private javax.swing.JButton btnConectarNaPorta4;
    private javax.swing.JButton btnConectarVerDispositivo;
    private javax.swing.JButton btnConectarVerMidia;
    private javax.swing.JButton btnCriarComputador;
    private javax.swing.JButton btnListarDiretorios;
    private javax.swing.JButton btnTrazerDados1;
    private javax.swing.JButton btnVerDiretorios1;
    private javax.swing.JButton btnVerDiretorios2;
    private javax.swing.JButton btnVerDiretorios4;
    private javax.swing.JButton btnVoltarParaDispositivo;
    private javax.swing.JButton btnVoltarParaPorta;
    private javax.swing.JButton btnVoltarParaPorta1;
    private javax.swing.JComboBox<String> cmbDiretorios;
    private javax.swing.JComboBox<String> cmbPortas;
    private javax.swing.JComboBox<String> cmbTipoDispositivo;
    private javax.swing.ButtonGroup grupoMidia;
    private javax.swing.ButtonGroup grupoTipoDiretorio;
    private javax.swing.ButtonGroup grupoTipoPorta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lalDadoPorta1;
    private javax.swing.JLabel lalDadoPorta2;
    private javax.swing.JLabel lalDadoPorta4;
    private javax.swing.JLabel lblDadoDispMidia;
    private javax.swing.JLabel lblDadoDispositivo;
    private javax.swing.JLabel lblDadoEstado;
    private javax.swing.JLabel lblDadoPorta;
    private javax.swing.JLabel lblDadoPortaAtual;
    private javax.swing.JLabel lblDadoPortaMidia;
    private javax.swing.JLabel lblDadoTipo;
    private javax.swing.JLabel lblNumeroParalela;
    private javax.swing.JLabel lblNumeroUsb;
    private javax.swing.JRadioButton rdArquivo;
    private javax.swing.JRadioButton rdCD;
    private javax.swing.JRadioButton rdDVD;
    private javax.swing.JRadioButton rdParalela;
    private javax.swing.JRadioButton rdPasta;
    private javax.swing.JRadioButton rdUSB;
    private javax.swing.JTabbedPane tabControl;
    private javax.swing.JTextField txtCapDisp;
    private javax.swing.JTextField txtCapacidadeDispositivo1;
    private javax.swing.JTextField txtCapacidadeDispositivo2;
    private javax.swing.JTextField txtCapacidadeDispositivo4;
    private javax.swing.JTextField txtNomeDiretorio;
    private javax.swing.JTextField txtNomeDisp;
    private javax.swing.JTextField txtNomeDispositivo1;
    private javax.swing.JTextField txtNomeDispositivo2;
    private javax.swing.JTextField txtNomeDispositivo4;
    private javax.swing.JLabel txtNumeroParalela;
    private javax.swing.JLabel txtNumeroUsb;
    private javax.swing.JTextField txtTamanhoDiretorio;
    private javax.swing.JTextField txtTamanhoDiretorio1;
    // End of variables declaration//GEN-END:variables
}
