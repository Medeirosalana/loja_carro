/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CarrosController;
import dao.CarrosDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Carros;
import model.CustosCarros;



/**
 *
 * @author a9211062
 */
public class CarroView extends javax.swing.JFrame {
   DefaultTableModel model;
   Carros carro;
    /**
     * Creates new form CarroView
     */
    public CarroView() {
        initComponents();
        loadtable();
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btEditar = new javax.swing.JButton();
        btCustos = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btAtualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carros");
        setResizable(false);

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btCustos.setText("Custos");
        btCustos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCustosActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Ano Modelo", "Ano Fabricação", "Placa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir Custos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btCustos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(jButton1)
                    .addComponent(btNovo)
                    .addComponent(btExcluir)
                    .addComponent(btEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCustos)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
      
        novoscarros novo = new novoscarros(this, false);
        novo.setVisible(true);
        
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int i [] = jTable1.getSelectedRows();
        if(i.length == 0){
            JOptionPane.showMessageDialog(null, "Selecione um contato");
        }else if (i.length > 1){
            JOptionPane.showMessageDialog(null, "Selecione apenas um contato");
        }else{
        Carros carro = new Carros();   
              
        carro.setAno_fabricacao((int) jTable1.getValueAt(i[0], 2));
        carro.setAno_modelo((int) jTable1.getValueAt(i[0], 1));
         carro.setPlaca((String) jTable1.getValueAt(i[0],3));
        carro.setModelo((String) jTable1.getValueAt(i[0], 0));
        carro.setId((int) jTable1.getValueAt(i[0], 4));
       
        int resposta = JOptionPane.showConfirmDialog(null, "Dejesa excluir "+ carro.getModelo()+" ?");
            if (resposta == 0){
                if(new CarrosController().remover(carro.getPlaca())){
                JOptionPane.showMessageDialog(null, "Carro excluido com sucesso!");
                loadtable();}
        }else{
            JOptionPane.showMessageDialog(null, "Falha ao tentar excluir");
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
      int i [] = jTable1.getSelectedRows();
        if(i.length == 0){
            JOptionPane.showMessageDialog(null, "Selecione um contato");
        }else if (i.length > 1){
            JOptionPane.showMessageDialog(null, "Selecione apenas um contato");
        }else{       
            
            CarrosDAO dao = new CarrosDAO();       
              Carros carros = new Carros();   
//             carros.setAno_fabricacao((int) jTable1.getValueAt(i[0], 2));
        carros.setAno_modelo((int) jTable1.getValueAt(i[0], 1));
//         carros.setId((int) jTable1.getValueAt(i[0], 4));
        carros.setModelo((String) jTable1.getValueAt(i[0], 0));
    carros.setPlaca(NovoCarros.clear((String) jTable1.getValueAt(i[0],3)));
       NovoCarros novo = new NovoCarros(carros, model);  
       
       novo.setVisible(true);
       
        
            
           
      
        
        
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        loadtable();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i [] = jTable1.getSelectedRows();
        if(i.length == 0){
            JOptionPane.showMessageDialog(null, "Selecione um contato");
        }else if (i.length > 1){
            JOptionPane.showMessageDialog(null, "Selecione apenas um contato");
        }else{    
            Carros carros = new Carros(); 
            carros.setPlaca(NovoCarros.clear((String) jTable1.getValueAt(i[0],3)));
            NovoCarros novo = new NovoCarros(carros, model);
            novo.habilitar();
            novo.setVisible(true);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btCustosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCustosActionPerformed
        // TODO add your handling code here:
         int i [] = jTable1.getSelectedRows();
        if(i.length == 0){
            JOptionPane.showMessageDialog(null, "Selecione um contato");
        }else if (i.length > 1){
            JOptionPane.showMessageDialog(null, "Selecione apenas um contato");
        }else{
            Carros carro = new Carros();
            CustosCarros cus = new CustosCarros();
            carro.setPlaca(NovoCarros.clear((String) jTable1.getValueAt(i[0], 3)));
            cus.setCarro(carro);
            CustosView view = new CustosView(model, carro);
            view.setVisible(true);
        }
    }//GEN-LAST:event_btCustosActionPerformed

   public void open(){
   CarroView car = new CarroView();
   car.setVisible(true);
   
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCustos;
    public javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    public  void loadtable(){
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
        for(Carros carro: new CarrosController().listar(null)){
        model.addRow(new Object[]{ carro.getModelo(),carro.getAno_modelo(), carro.getAno_fabricacao(),CarroView.format(carro.getPlaca())});
            
        }
    
    }
    public static String format (String placa){
    int length = placa.length();
    if(length == 7){
        placa = placa.substring(0,3)+"-"+placa.substring(3,7);
    }
    return placa;
    }

}
