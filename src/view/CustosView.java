/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CarrosController;
import controller.CustosController;

import dao.CarrosDAO;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Carros;
import model.Custos;


/**
 *
 * @author Alana
 */
public class CustosView extends javax.swing.JFrame {
    DefaultTableModel model;
    Carros carros;
    Custos custo ;
    /**
     * Creates new form CustosView
     */
    public CustosView() {
        initComponents();
        loadtable();
    }
    
    public CustosView(DefaultTableModel model, Carros carro){
    this.model = model;
    this.carros = carro;
    
    initComponents();
     loadtable();
    calcularTotal();
    
    
    
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbnome = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        lbvalor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        lbtotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<String>();
        lvvalort = new javax.swing.JLabel();
        tfvalort = new javax.swing.JTextField();
        lblucro = new javax.swing.JLabel();
        tflucro = new javax.swing.JTextField();
        btsalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();

        setResizable(false);

        lbnome.setText("Nome");

        lbvalor.setText("Valor");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        lbtotal.setText("Total Custos");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%", "75%", "80%", "85%", "90%", "95%" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList1);

        lvvalort.setText("Valor Total");

        tfvalort.setEditable(false);

        lblucro.setText("Lucro");

        tflucro.setEditable(false);

        btsalvar.setText("Salvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");

        btExcluir.setText("Excluir");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbnome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(lbvalor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btsalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblucro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tflucro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lvvalort)
                                .addGap(18, 18, 18)
                                .addComponent(tfvalort, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnome)
                    .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbvalor)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(jButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbtotal)
                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfvalort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvvalort))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tflucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblucro)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsalvar)
                    .addComponent(btCancelar)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        // TODO add your handling code here:
        Custos cus = new Custos();
        CustosController control = new CustosController();
        CarrosDAO dao = new CarrosDAO();
        Carros id = dao.select(carros.getId());
        String valorFormatado = jFormattedTextField1.getText().replace(".", "");
        valorFormatado = valorFormatado.replace(",", ".");
        
        float valor = Float.parseFloat(valorFormatado);
        System.out.println(valor);
       if(tfnome.getText().equals("")|| jFormattedTextField1.getText().equals("")){JOptionPane.showMessageDialog(null, "Preencha todos os campos");}
        if(custo == null){
            if(control.adicionar(valor, tfnome.getText(), dao.select(id.getId()) )){
            loadtable();
            limpar();
            }else{JOptionPane.showMessageDialog(null, "Erro ao adicionar");}
        
        
        }else{
            
            
            
            if(control.atualizar(cus.getId(), tfnome.getText(), valor)){
                
            loadtable();
            limpar();
            
            }else{
            JOptionPane.showMessageDialog(null, "Erro ao editar");
            }
        
        }
        
    }//GEN-LAST:event_btsalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jFormattedTextField2.getText().equals("")){
                jFormattedTextField2.requestFocus();
                return;
                }
            
           try{
                float valor = Float.parseFloat(jFormattedTextField2.getText());
                float desconto = 0;
                float valortotal = 0;
                switch(jList1.getSelectedIndex()){
                    
                    case 0:
                        desconto = 1.05f;
                        break;
                    case 1:
                        desconto = 1.1f;
                        break;
                    case 2:
                        desconto = 1.15f;
                        break;
                    case 3:
                        desconto = 1.20f;
                        break;
                    case 4:
                        desconto = 1.25f;
                        break;
                    case 5:
                        desconto = 1.30f;
                        break;
                    case 6: 
                        desconto = 1.35f;
                        break;
                    case 7:
                        desconto = 1.40f;
                        break;
                    case 8: 
                        desconto = 1.45f;
                        break;
                    case 9:
                        desconto = 1.50f;
                        break;
                    case 10:
                        desconto = 1.55f;
                        break;
                    case 11:
                        desconto = 1.60f;
                        break;
                    case 12:
                        desconto = 1.65f;
                        break;
                    case 13: 
                        desconto = 1.70f;
                        break;
                    case 14:
                        desconto = 1.75f;
                                break;
                    case 15:
                        desconto = 1.8f;
                        break;
                    case 16:
                        desconto = 1.85f;
                        break;
                    case 17:
                        desconto = 1.9f;
                        break;
                    case 18:
                        desconto = 1.95f;
                        break;
                    default:
                         JOptionPane.showMessageDialog(null, "Selecione");
                        break;
                }
                valortotal = valor * desconto;
                float lucro = valortotal - valor;
                tfvalort.setText(""+ valortotal);
                tflucro.setText(""+ lucro);
                        
            }catch(NumberFormatException error){
                JOptionPane.showMessageDialog(null, "Forneça apenas números");
                error.toString();
                jFormattedTextField2.setText("");
                jFormattedTextField2.requestFocus();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
         
        int i [] = Table.getSelectedRows();
        tfnome.setText((String) Table.getValueAt(i[0], 1));
        jFormattedTextField1.setText(valorFormatado((String) Table.getValueAt(i[0], 2)));
    }//GEN-LAST:event_TableMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btsalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblucro;
    private javax.swing.JLabel lbnome;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JLabel lbvalor;
    private javax.swing.JLabel lvvalort;
    private javax.swing.JTextField tflucro;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfvalort;
    // End of variables declaration//GEN-END:variables
public  void loadtable(){
    Custos cus = new Custos();
        DefaultTableModel model = (DefaultTableModel) this.Table.getModel();
        model.setRowCount(0);
        for(Custos custo: new CustosController().listar((carros.getId()))){
        model.addRow(new Object[]{ custo.getId(),custo.getDescrissao(),custo.getValor()});
            
        }
    
    }
 private void calcularTotal() {
               float total = 0;
               for(int linha = 0; linha<Table.getRowCount(); linha++){
               String valor = ""+ Table.getValueAt(linha, 2);
               valor = valor.replace(".", "");
               valor = valor.replace(",", ".");
               total += Float.parseFloat(valor);
               }
               jFormattedTextField2.setText(""+ total);
            }
 private void limpar(){
 tfnome.setText("");
 jFormattedTextField1.setText("");
 
 }

    private String valorFormatado(String string) {
       String valorFormatado = jFormattedTextField1.getText().replace(".", ",");
        return valorFormatado;
    }

   
 
}
