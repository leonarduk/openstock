/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.analisadorasset.offlinetrader;

import panels.analisadorasset.grafico.*;

/**
 *
 * @author lucasmeyer
 */
public class itemtransacao extends javax.swing.JPanel
{
    //item utilizado para mostrar anotacoes introduzidas no grafico
    
    //submodulo grafico ao qual este item anotacao pertence
    public mierclasses.mcofflinetransaction offlinetransactionassociada;
    
    //construtor nova anotacao
    public itemtransacao(mierclasses.mcofflinetransaction otransaction)
    {
        initComponents();

        offlinetransactionassociada = otransaction;
        
        jLabelID.setText(offlinetransactionassociada.idstr);
        
        if (offlinetransactionassociada.tipostr.equals("depositobase"))
            jLabelTipoTransacao.setText("Base Deposit");
        else if (offlinetransactionassociada.tipostr.equals("depositocotacao"))
            jLabelTipoTransacao.setText("Quote Deposit");
        else if (offlinetransactionassociada.tipostr.equals("saquebase"))
            jLabelTipoTransacao.setText("Base Withdraw");
        else if (offlinetransactionassociada.tipostr.equals("saquecotacao"))
            jLabelTipoTransacao.setText("Quote Withdraw");
        
        if (offlinetransactionassociada.preco_tradestr.equals("(NN)"))
            jLabelPrecoTransacao.setText("");
        else
            jLabelPrecoTransacao.setText(offlinetransactionassociada.preco_tradestr);
        
        jLabelQuantidadeTransacao.setText(offlinetransactionassociada.quantidadestr);
        
        jLabelTimestampTransacao.setText(offlinetransactionassociada.timestampdate.toGMTString());
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanelSub = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jLabelTipoTransacao = new javax.swing.JLabel();
        jLabelPrecoTransacao = new javax.swing.JLabel();
        jLabelQuantidadeTransacao = new javax.swing.JLabel();
        jLabelTimestampTransacao = new javax.swing.JLabel();

        setBackground(new java.awt.Color(155, 155, 155));

        jPanelSub.setBackground(new java.awt.Color(55, 55, 55));

        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelID.setText("IDTransascao");

        jLabelTipoTransacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoTransacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTipoTransacao.setText("TipoTransacao");

        jLabelPrecoTransacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecoTransacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecoTransacao.setText("PrecoTransacao");

        jLabelQuantidadeTransacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuantidadeTransacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQuantidadeTransacao.setText("QuantidadeTransacao");

        jLabelTimestampTransacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTimestampTransacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTimestampTransacao.setText("TimestampTransacao");

        javax.swing.GroupLayout jPanelSubLayout = new javax.swing.GroupLayout(jPanelSub);
        jPanelSub.setLayout(jPanelSubLayout);
        jPanelSubLayout.setHorizontalGroup(
            jPanelSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTipoTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPrecoTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelQuantidadeTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTimestampTransacao, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelSubLayout.setVerticalGroup(
            jPanelSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecoTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTimestampTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantidadeTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabelID;
    public javax.swing.JLabel jLabelPrecoTransacao;
    public javax.swing.JLabel jLabelQuantidadeTransacao;
    public javax.swing.JLabel jLabelTimestampTransacao;
    public javax.swing.JLabel jLabelTipoTransacao;
    private javax.swing.JPanel jPanelSub;
    // End of variables declaration//GEN-END:variables
}
