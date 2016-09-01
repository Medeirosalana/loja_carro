/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CartasController;
import dao.CartaDeCreditoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CartasDeCreditos;

/**
 *
 * @author Alana
 */
public final class NovaCarta extends javax.swing.JFrame {
    DefaultTableModel model;
    CartasDeCreditos carta;
    
    public NovaCarta(){
    initComponents();
    }
    public NovaCarta(DefaultTableModel model, CartasDeCreditos carta) {
        this.model = model;
        this.carta = carta;
        initComponents();
        CartaDeCreditoDAO dao = new CartaDeCreditoDAO();
       CartasDeCreditos id = dao.select(carta.getId());
       tfcota.setText(id.getCota());
       tfgrupo.setText(id.getGrupo());
       tfprazo.setText(Integer.toString(id.getPrazo()));
       formentrada.setText(Float.toString((id.getValor_inicial())).replace(".", ","));
       formlance.setText(Float.toString(id.getProposta()).replace(".", ","));
       formparcela.setText(Float.toString(id.getParcela()).replace(".", ","));
       formvalor.setText(Float.toString(id.getValor_final()).replace(".", ","));
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbcota = new javax.swing.JLabel();
        lbgrupo = new javax.swing.JLabel();
        lblance = new javax.swing.JLabel();
        lbentrada = new javax.swing.JLabel();
        lbprazo = new javax.swing.JLabel();
        lbparcela = new javax.swing.JLabel();
        lbvalor = new javax.swing.JLabel();
        tfcota = new javax.swing.JTextField();
        tfgrupo = new javax.swing.JTextField();
        tfprazo = new javax.swing.JTextField();
        formlance = new javax.swing.JFormattedTextField();
        formentrada = new javax.swing.JFormattedTextField();
        formparcela = new javax.swing.JFormattedTextField();
        formvalor = new javax.swing.JFormattedTextField();
        btsalvar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();

        setResizable(false);

        lbcota.setText("Cota");

        lbgrupo.setText("Grupo");

        lblance.setText("Lance");

        lbentrada.setText("Entrada");

        lbprazo.setText("Prazo");

        lbparcela.setText("Parcela");

        lbvalor.setText("Valor");

        formlance.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        formentrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        formparcela.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        formvalor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        btsalvar.setText("Salvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbvalor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formvalor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formlance))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbprazo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfprazo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbcota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfcota, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbgrupo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbparcela, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbentrada, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(formentrada, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfgrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(formparcela))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(btsalvar)
                .addGap(18, 18, 18)
                .addComponent(btcancelar)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcota)
                    .addComponent(lbgrupo)
                    .addComponent(tfcota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblance)
                    .addComponent(formlance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbentrada)
                    .addComponent(formentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbprazo)
                    .addComponent(lbparcela)
                    .addComponent(tfprazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formparcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbvalor)
                    .addComponent(formvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsalvar)
                    .addComponent(btcancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        // TODO add your handling code here:
        String valorFormatado = formentrada.getText().replace(".", "");
        valorFormatado = valorFormatado.replace(",", ".");
        float valorentrada = Float.parseFloat(valorFormatado);
         String valorFormatado2 = formlance.getText().replace(".", "");
        valorFormatado2 = valorFormatado2.replace(",", ".");
        float valorlance = Float.parseFloat(valorFormatado2);
        CartasDeCreditos cartas = new CartasDeCreditos();
         String valorFormatado3 = formparcela.getText().replace(".", "");
        valorFormatado3 = valorFormatado3.replace(",", ".");
        float valorparcelar = Float.parseFloat(valorFormatado3);
         String valorFormatado4 = formvalor.getText().replace(".", "");
        valorFormatado4 = valorFormatado4.replace(",", ".");
        float valor = Float.parseFloat(valorFormatado4);
        if(tfcota.getText().equals("")|| tfgrupo.getText().equals("")|| tfprazo.getText().equals("")||formentrada.getText().equals("")||formlance.getText().equals("")||formparcela.getText().equals("")||formvalor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }else{
            CartasController control = new CartasController();
            if(carta == null){
                if(control.adicionar(tfcota.getText(), tfgrupo.getText(), valorlance, Integer.parseInt(tfprazo.getText()), valorparcelar, valorentrada, valor)){
                
                
                }else{JOptionPane.showMessageDialog(null, "Erro ao adicionar");}
            
            }else{
                if(control.atualizar(carta.getId(), tfcota.getText(), tfgrupo.getText(), valorlance, Integer.parseInt(tfprazo.getText()), valor, valorentrada,valorparcelar)){
                
                }else{
                JOptionPane.showMessageDialog(null, "Erro ao editar");
                }
            
            }
                
        }
    }//GEN-LAST:event_btsalvarActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        // TODO add your handling code here:
        NovaCarta.this.setVisible(false);
    }//GEN-LAST:event_btcancelarActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JFormattedTextField formentrada;
    private javax.swing.JFormattedTextField formlance;
    private javax.swing.JFormattedTextField formparcela;
    private javax.swing.JFormattedTextField formvalor;
    private javax.swing.JLabel lbcota;
    private javax.swing.JLabel lbentrada;
    private javax.swing.JLabel lbgrupo;
    private javax.swing.JLabel lblance;
    private javax.swing.JLabel lbparcela;
    private javax.swing.JLabel lbprazo;
    private javax.swing.JLabel lbvalor;
    private javax.swing.JTextField tfcota;
    private javax.swing.JTextField tfgrupo;
    private javax.swing.JTextField tfprazo;
    // End of variables declaration//GEN-END:variables
public void desabilitar(){
formentrada.setEditable(false);
formlance.setEditable(false);
formparcela.setEditable(false);
formvalor.setEditable(false);
tfcota.setEditable(false);
tfgrupo.setEditable(false);
tfprazo.setEditable(false);
btsalvar.setEnabled(false);

}
public Float clear(float Valor_inicial){
String valorFormatado = "".replace(".", ",");
    
        
        float valorentrada = Float.parseFloat(valorFormatado);
return valorentrada;
 
 }
}
