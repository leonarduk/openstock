/*
 * Copyright (C) 2019 Lucas Meyer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package assetparser.submoduloofflinetrader;

import javax.swing.SwingConstants;

/**
 *
 * @author meyerlu
 */
public class frame_adicionarremoverfundos extends javax.swing.JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4838819984521914398L;
	public static assetparser.submoduloofflinetrader.panel_submoduloofflinetrader submoduloofftraderpai;

    /**
     * Creates new form adicionarremoverfundos
     */
    public frame_adicionarremoverfundos(assetparser.submoduloofflinetrader.panel_submoduloofflinetrader sotp)
    {
        initComponents();
        
        submoduloofftraderpai = sotp;
        
        jLabelAssetNome.setText(submoduloofftraderpai.otrader.simbolo);
    }
    
    void adicionarouremoverfundos()
    {
        
        String tipomoedacombobox = jComboBoxMoedaTransacionar.getSelectedItem().toString();
        String tipotransacaocombobox = jComboBoxTipoTransacao.getSelectedItem().toString();
        
        String tipomoeda = "";
        if (tipomoedacombobox.equals("Base") == true)
            tipomoeda = "base";
        else if (tipomoedacombobox.equals("Quote") == true)
            tipomoeda = "cotacao";
        
        String depositoousaque = "";
        if (tipotransacaocombobox.equals("Deposit") == true)
            depositoousaque = "deposito";
        else if (tipotransacaocombobox.equals("Withdrawal") == true)
            depositoousaque = "saque";
        
        String valortransacao = jTextFieldQuantidade.getText();
        
        String respostatransacao = submoduloofftraderpai.realizardepositoousaque(tipomoeda, depositoousaque, valortransacao);
        
        if (respostatransacao.equals("ok") == false)
        {
            communication.mcfuncoeshelper.mostrarmensagem("A problem occured with your transaction.\n\nDetails: " + respostatransacao);
        }
        else
        {
            this.dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jTextFieldMelhorBid = new javax.swing.JTextField();
        jPanelFundo = new javax.swing.JPanel();
        jPanelFundo2 = new javax.swing.JPanel();
        jLabelMoedaTransacionar = new javax.swing.JLabel();
        jComboBoxMoedaTransacionar = new javax.swing.JComboBox<>();
        jLabelTipoTransacao = new javax.swing.JLabel();
        jComboBoxTipoTransacao = new javax.swing.JComboBox<>();
        jLabelQuantidade = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jButtonConfirmarTransacao = new javax.swing.JButton();
        jLabelAssetNome = new javax.swing.JLabel();

        jTextFieldMelhorBid.setEditable(false);
        jTextFieldMelhorBid.setBackground(new java.awt.Color(120, 120, 120));
        jTextFieldMelhorBid.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldMelhorBid.setHorizontalAlignment(SwingConstants.RIGHT);
        jTextFieldMelhorBid.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldMelhorBidActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deposits and Withdrawals");

        jPanelFundo.setBackground(new java.awt.Color(55, 55, 55));

        jPanelFundo2.setBackground(new java.awt.Color(120, 120, 120));

        jLabelMoedaTransacionar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMoedaTransacionar.setText("Type of Currency:");

        jComboBoxMoedaTransacionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Base", "Quote" }));

        jLabelTipoTransacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoTransacao.setText("Transaction:");

        jComboBoxTipoTransacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposit", "Withdrawal" }));

        jLabelQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuantidade.setText("Amount:");

        jButtonConfirmarTransacao.setText("OK");
        jButtonConfirmarTransacao.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonConfirmarTransacaoActionPerformed(evt);
            }
        });

        jLabelAssetNome.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabelAssetNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAssetNome.setText("AssetName");

        javax.swing.GroupLayout jPanelFundo2Layout = new javax.swing.GroupLayout(jPanelFundo2);
        jPanelFundo2.setLayout(jPanelFundo2Layout);
        jPanelFundo2Layout.setHorizontalGroup(
            jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundo2Layout.createSequentialGroup()
                        .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipoTransacao)
                            .addComponent(jLabelMoedaTransacionar)
                            .addComponent(jLabelQuantidade))
                        .addGap(14, 14, 14)
                        .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxMoedaTransacionar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipoTransacao, 0, 162, Short.MAX_VALUE)
                            .addComponent(jTextFieldQuantidade)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundo2Layout.createSequentialGroup()
                        .addComponent(jLabelAssetNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmarTransacao)))
                .addContainerGap())
        );
        jPanelFundo2Layout.setVerticalGroup(
            jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMoedaTransacionar)
                    .addComponent(jComboBoxMoedaTransacionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoTransacao)
                    .addComponent(jComboBoxTipoTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmarTransacao)
                    .addComponent(jLabelAssetNome))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFundo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFundo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMelhorBidActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldMelhorBidActionPerformed
    {//GEN-HEADEREND:event_jTextFieldMelhorBidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMelhorBidActionPerformed

    private void jButtonConfirmarTransacaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonConfirmarTransacaoActionPerformed
    {//GEN-HEADEREND:event_jButtonConfirmarTransacaoActionPerformed
        adicionarouremoverfundos();
    }//GEN-LAST:event_jButtonConfirmarTransacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static
            void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frame_adicionarremoverfundos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frame_adicionarremoverfundos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frame_adicionarremoverfundos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frame_adicionarremoverfundos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
			public void run()
            {
                new frame_adicionarremoverfundos(submoduloofftraderpai).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarTransacao;
    private javax.swing.JComboBox<String> jComboBoxMoedaTransacionar;
    private javax.swing.JComboBox<String> jComboBoxTipoTransacao;
    private javax.swing.JLabel jLabelAssetNome;
    private javax.swing.JLabel jLabelMoedaTransacionar;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelTipoTransacao;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelFundo2;
    private javax.swing.JTextField jTextFieldMelhorBid;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
