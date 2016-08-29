/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CarrosController;
import dao.CarrosDAO;
import dao.CorDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Carros;
import model.Cores;

/**
 *
 * @author Alana
 */
public class novoscarros extends javax.swing.JDialog {
    DefaultTableModel model;
    CarroView view;
    /**
     * Creates new form novoscarros
     */
    public novoscarros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        lbAnomodelo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        tfmodelo = new javax.swing.JTextField();
        lbMotorizacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbPlaca = new javax.swing.JLabel();
        lbAnofabricacao = new javax.swing.JLabel();
        cbCores = new javax.swing.JComboBox();
        lbModelo = new javax.swing.JLabel();
        lbRenavam = new javax.swing.JLabel();
        tfchassi = new javax.swing.JTextField();
        lbChassi = new javax.swing.JLabel();
        tfmotorizacao = new javax.swing.JTextField();
        formanofabi = new javax.swing.JFormattedTextField();
        formanomodelo = new javax.swing.JFormattedTextField();
        formplaca = new javax.swing.JFormattedTextField();
        formrenavam = new javax.swing.JFormattedTextField();
        btNovo = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setName("Dados"); // NOI18N

        lbAnomodelo.setText("Ano Modelo");

        taObs.setColumns(20);
        taObs.setRows(5);
        jScrollPane1.setViewportView(taObs);

        tfmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmodeloActionPerformed(evt);
            }
        });

        lbMotorizacao.setText("Motorização");

        jLabel1.setText("Observações");

        lbPlaca.setText("Placa");

        lbAnofabricacao.setText("Ano Fabricação");

        cbCores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione uma cor", "Azul", "Branco", "Cinza", "Preto" }));
        cbCores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCoresActionPerformed(evt);
            }
        });

        lbModelo.setText("Modelo");

        lbRenavam.setText("Renavam");

        tfchassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfchassiActionPerformed(evt);
            }
        });

        lbChassi.setText("Chassi");

        try {
            formanofabi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            formanomodelo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            formplaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("LLL-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formplaca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        formplaca.setToolTipText("");

        try {
            formrenavam.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRenavam)
                            .addComponent(lbPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbChassi)
                            .addComponent(lbModelo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfchassi, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(tfmodelo, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(formplaca)
                            .addComponent(formrenavam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbMotorizacao)
                                    .addGap(26, 26, 26)
                                    .addComponent(tfmotorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cbCores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAnofabricacao)
                                    .addComponent(lbAnomodelo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(formanomodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formanofabi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRenavam)
                    .addComponent(lbAnomodelo)
                    .addComponent(formanomodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formrenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAnofabricacao)
                    .addComponent(lbPlaca)
                    .addComponent(formanofabi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfmotorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMotorizacao)
                    .addComponent(lbChassi)
                    .addComponent(tfchassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbModelo)
                    .addComponent(tfmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btCancelar))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmodeloActionPerformed

    private void cbCoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCoresActionPerformed

    }//GEN-LAST:event_cbCoresActionPerformed

    private void tfchassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfchassiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfchassiActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        Carros carr = new Carros();
        
        if (formrenavam.getText().equals("")||formanomodelo.getText().equals("")||formanofabi.getText().equals("")||tfchassi.getText().equals("")||tfmotorizacao.getText().equals("")||tfmodelo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigatorios");
        }else{
            CarrosController control = new CarrosController();
            CorDAO dao = new CorDAO();
            Cores cor = new Cores();

            if(carr.getPlaca() == null){
                
                if(control.adicionar(formrenavam.getText(), tfchassi.getText(),Integer.parseInt(formanofabi.getText()), Integer.parseInt(formanomodelo.getText()), tfmodelo.getText(),
                    tfmotorizacao.getText(),novoscarros.clear(formplaca.getText()) ,dao.select(cbCores.getSelectedIndex()) , taObs.getText())){
                   
                JOptionPane.showMessageDialog(null, "Carro adicionado com sucesso");
              
                limpar();

            }else{

                JOptionPane.showMessageDialog(null, "Erro ao adicionar");
            }
       
            }
        }
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

    }//GEN-LAST:event_btCancelarActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JComboBox cbCores;
    private javax.swing.JFormattedTextField formanofabi;
    private javax.swing.JFormattedTextField formanomodelo;
    private javax.swing.JFormattedTextField formplaca;
    private javax.swing.JFormattedTextField formrenavam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAnofabricacao;
    private javax.swing.JLabel lbAnomodelo;
    private javax.swing.JLabel lbChassi;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbMotorizacao;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbRenavam;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTextField tfchassi;
    private javax.swing.JTextField tfmodelo;
    private javax.swing.JTextField tfmotorizacao;
    // End of variables declaration//GEN-END:variables
private void limpar(){
    formanofabi.setText("");
    formrenavam.setText("");
    formanomodelo.setText("");
    tfchassi.setText("");
    tfmodelo.setText("");
    tfmotorizacao.setText("");
   formplaca.setText("");
    taObs.setText("");
    cbCores.setSelectedIndex(0);
    }
    public void desabilitar(){
    formplaca.setEnabled(false);
    formrenavam.setEnabled(true);
    formanofabi.setEnabled(true);
    formanomodelo.setEnabled(true);
    tfchassi.setEnabled(true);
    tfmotorizacao.setEnabled(true);
    tfmodelo.setEnabled(true);
    taObs.setEnabled(true);
    cbCores.setEnabled(false);        
    }
    public static String clear(String placa){
    return placa = placa.replace("-", "");
    }

}
