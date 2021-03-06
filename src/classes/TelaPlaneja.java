package classes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class TelaPlaneja extends javax.swing.JFrame {
    private Conta conta;
    //receptores
    private int code=0;
    private String bank;
    private String owner;     
    private float value; 
    private String date;
    private int meses=0;
    
    //variaveis auxiliares
    private float estimativa=0;
    
    public TelaPlaneja() {
        initComponents();
        cadHabilita();
        buscaDesabilita();
        altDesabilita();
        ctrlGiratorio(false);//controle geiratorio que indica anos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        showCod = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        showBanco = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        showDono = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        showValor = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        showData = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblEstimativa = new javax.swing.JLabel();
        spAnos = new javax.swing.JSpinner();
        painelNav = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        p4 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtAltCod = new javax.swing.JTextField();
        txtAltBanco = new javax.swing.JTextField();
        txtAltDono = new javax.swing.JTextField();
        txtAltValor = new javax.swing.JTextField();
        btnAltBuscar = new javax.swing.JButton();
        btnAltAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnEnviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEnviar.setText("ENVIAR");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Codigo da Conta");

        txtCod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Banco");

        txtBanco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Proprietario");

        txtDono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor");

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Data");

        txtData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cadastramento de Conta");

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel6)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtData)
                            .addComponent(txtValor)
                            .addComponent(txtDono)
                            .addComponent(txtBanco)
                            .addComponent(txtCod)))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Codigo da Conta");

        showCod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showCod.setText("<null>");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Banco");

        showBanco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showBanco.setText("<none>");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Proprietario");

        showDono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showDono.setText("<none>");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Valor");

        showValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showValor.setText("<null>");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Data");

        showData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showData.setText("<none>");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Consulta de Conta");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Intervalo(em anos)");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Valor estimado");

        lblEstimativa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEstimativa.setText("0");

        spAnos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spAnos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spAnos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spAnosStateChanged(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(61, 61, 61))
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showCod))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showBanco))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showDono))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showValor))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showData)))
                .addContainerGap())
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEstimativa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spAnos))
                .addContainerGap())
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(showCod))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(showBanco))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(showDono))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(showValor))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(showData))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spAnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lblEstimativa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");

        javax.swing.GroupLayout painelNavLayout = new javax.swing.GroupLayout(painelNav);
        painelNav.setLayout(painelNavLayout);
        painelNavLayout.setHorizontalGroup(
            painelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNavLayout.createSequentialGroup()
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelNavLayout.setVerticalGroup(
            painelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Alteração de Conta");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Codigo da Conta");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Banco");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Proprietario");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Valor");

        txtAltCod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAltCod.setText("0");

        txtAltBanco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAltBanco.setText("<none>");

        txtAltDono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAltDono.setText("<none>");

        txtAltValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAltValor.setText("<null>");

        btnAltBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAltBuscar.setText("BUSCAR");
        btnAltBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltBuscarActionPerformed(evt);
            }
        });

        btnAltAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAltAlterar.setText("ALTERAR");
        btnAltAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btnAltBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAltAlterar))
                            .addGroup(p3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(p3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(26, 26, 26)
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAltValor)
                            .addComponent(txtAltDono)
                            .addComponent(txtAltBanco)
                            .addComponent(txtAltCod))))
                .addContainerGap())
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtAltCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtAltBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtAltDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtAltValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAltBuscar)
                    .addComponent(btnAltAlterar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        //Os valores das caixas de texto são armazenados em variaveis
        code = Integer.parseInt(txtCod.getText());
        bank = txtBanco.getText();
        owner = txtDono.getText();
        value = Float.parseFloat(txtValor.getText());
        date = txtData.getText();
        
        //validação de dados
        //IMPORTANTE:  MELHORAR CONDIÇÕES P/ QUE SOMENTE VALORES VALIDOS SEJAM DIGITADOS
        if(code==0 || bank.equals(null) || owner.equals(null) || date.equals(null) || value==0.0){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente");
        }else{
            conta = new Conta(code, bank, owner, value, date);
            JOptionPane.showMessageDialog(null, "Conta criada");
        }
        //Os controles do painel são HABILITADOS        
        btnBuscar.setEnabled(true);
        
        //Os controles do painel de cadastramento são DESABILITADOS        
        cadDesabilita();
        
        //Os valores(que estavam nas caixas de texto) são gravadas no banco de dados
        //ver classe 'Conta.java'
        conta.record();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        /*quando o botão BUSCAR for pressionado a caixa de mensagem abaixo será
        exibida solicitando ao usuario o código da conta, que será usado para buscar
        o arquivo pelo nome do arquivo(que é o codigo da conta)*/
        String num = JOptionPane.showInputDialog(null, "Digite o código da conta");
        ctrlGiratorio(true);
        
        lblEstimativa.setText("0");
        /*INICAILIZAR NOVAMENTE O OBJETO É MUITO INPORTANTE: se fizermos uma busca
        para uma conta antes de criar uma, o objeto 'conta' nunca será inicializado
        causando um erro. Para garantir que o objeto 'conta' seja inicializado fazemos
        isso antes de iniciar a busca. E caso o objeto ja tenha sido inicializado
        apenas substituimos seus dados anteriores*/
        conta = new Conta(0, null, null, 0, null);
        
        spAnos.setEnabled(true);

        ResultSet res = conta.search(Integer.parseInt(num));        
        try{
            res.next();
            this.showCod.setText(Integer.toString(res.getInt("numero")));
            this.showBanco.setText(res.getString("banco"));
            this.showDono.setText(res.getString("proprietario"));
            this.showValor.setText(Float.toString(res.getFloat("valor")));
            this.showData.setText((res.getDate("data")+""));            
        }catch(SQLException ex){
             System.out.println("Erro ao executar o SELECT");
        }
        try{
            res.close();
        }catch(SQLException ex){
            System.out.println("Erro ao fechar ResultSet desta classe");
        }
        
        conta.consultaCloseConnections();
        /*showCod.setText(conta.retornarValor(0));
        showBanco.setText(conta.retornarValor(1));
        showDono.setText(conta.retornarValor(2));
        showValor.setText(conta.retornarValor(3));
        showData.setText(conta.retornarValor(4));*/       
                
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtBanco.setText("");
        txtCod.setText("");
        txtData.setText("");
        txtDono.setText("");
        txtValor.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed
    //Botão de Navegação: CADASTRAR
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        /*'btnCadastrar' habilita as funções do painel de cadastro e desabilita
        as funções dos outros paineis*/        
        cadHabilita();
        buscaDesabilita();
        ctrlGiratorio(false);
        altDesabilita();
    }//GEN-LAST:event_btnCadastrarActionPerformed
    //Botão de Navegação: CONSULTA
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        cadDesabilita();
        buscaHabilita();
        altDesabilita();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void spAnosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spAnosStateChanged
        //a quantia da conta é armazenada na variavel estimativa
        estimativa = Float.parseFloat(showValor.getText());
        //o numero de anos(12 meses) é armazenado na variavel meses
        meses = (int) spAnos.getValue() * 12;        
        //é efetuado o calculo de juros de acordo com o numeros de anos informado
        for(int cont=0; cont<meses; cont++){
            estimativa = estimativa + (estimativa * (float)0.5)/100;
        }        
        //finalmente é apresentado ao usuario o calculo da quantia com juros
        lblEstimativa.setText(Float.toString(estimativa));
        //RELEMBRANDO: TODA VEZ QUE O CONTROLE GIRATORIO É ACIONADO O CALCULO É REFEITO
    }//GEN-LAST:event_spAnosStateChanged

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //altHabilita();
        cadDesabilita();
        buscaDesabilita();
        ctrlGiratorio(false);
        
        //txtAltCod será usado para consulta por isso não será desabilitado        
        txtAltCod.setEnabled(true);
        btnAltBuscar.setEnabled(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAltBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltBuscarActionPerformed
        String num = txtAltCod.getText();
        conta = new Conta(0, null, null, 0, null);
        ResultSet res = conta.search(Integer.parseInt(num));

        try {       
            res.next();
            txtAltCod.setText(Integer.toString(res.getInt("numero")));
            txtAltBanco.setText(res.getString("banco"));
            txtAltDono.setText(res.getString("proprietario"));
            txtAltValor.setText(Integer.toString(res.getInt("valor")));
        } catch (SQLException ex) {
            System.out.println("Erro ao executar SELECT");
        }
        
        try{
            res.close();
        }catch(SQLException ex){
            System.out.println("Impossivel fechar ResultSet");
        }
        conta.consultaCloseConnections();//é muito importante fechar todas as conexões quando terminar a operação
        altHabilita();
    }//GEN-LAST:event_btnAltBuscarActionPerformed

    private void btnAltAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltAlterarActionPerformed
        conta = new Conta(Integer.parseInt(txtAltCod.getText()),txtAltBanco.getText(),
                txtAltDono.getText(),Float.parseFloat(txtAltValor.getText()),"2016-10-02");
        String op = JOptionPane.showInputDialog(null, "Deseja confirmar alterações? [s - sim | n - Não]");
        if(op.equals("s") || op.equals("sim") || op.equals("S") || op.equals("SIM") || op.equals("Sim")){
            conta.alter();
        }
    }//GEN-LAST:event_btnAltAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPlaneja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPlaneja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPlaneja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPlaneja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPlaneja().setVisible(true);
            }
        });
    }
    //o controle giratorio precisa ser idependente do resto dos controles do painel de busca
    void ctrlGiratorio(boolean status){
        this.spAnos.setEnabled(status);
    }
    
    //painel cadastro
    void cadHabilita(){
        txtCod.setEnabled(true);
        txtBanco.setEnabled(true);
        txtData.setEnabled(true);
        txtDono.setEnabled(true);
        txtValor.setEnabled(true);
        btnEnviar.setEnabled(true);
        btnLimpar.setEnabled(true);
    }
    void cadDesabilita(){
        txtCod.setEnabled(false);
        txtBanco.setEnabled(false);
        txtData.setEnabled(false);
        txtDono.setEnabled(false);
        txtValor.setEnabled(false);
        btnEnviar.setEnabled(false);
        btnLimpar.setEnabled(false);
    }
    //painel de busca
    void buscaHabilita(){
        btnBuscar.setEnabled(true);
        //spAnos.setEnabled(true);
    }
    void buscaDesabilita(){
        btnBuscar.setEnabled(false);
        //spAnos.setEnabled(false);
    }
    //painel de alteração
    void altHabilita(){
        txtAltCod.setEnabled(true);
        txtAltBanco.setEnabled(true);
        txtAltDono.setEnabled(true);
        txtAltValor.setEnabled(true);
        btnAltAlterar.setEnabled(true);
        btnAltBuscar.setEnabled(true);
        
    }
    void altDesabilita(){
        txtAltCod.setEnabled(false);
        txtAltBanco.setEnabled(false);
        txtAltDono.setEnabled(false);
        txtAltValor.setEnabled(false);
        btnAltAlterar.setEnabled(false);
        btnAltBuscar.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltAlterar;
    private javax.swing.JButton btnAltBuscar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblEstimativa;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel painelNav;
    private javax.swing.JLabel showBanco;
    private javax.swing.JLabel showCod;
    private javax.swing.JLabel showData;
    private javax.swing.JLabel showDono;
    private javax.swing.JLabel showValor;
    private javax.swing.JSpinner spAnos;
    private javax.swing.JTextField txtAltBanco;
    private javax.swing.JTextField txtAltCod;
    private javax.swing.JTextField txtAltDono;
    private javax.swing.JTextField txtAltValor;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDono;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

