/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames.analisadorasset.grafico;

/**
 *
 * @author lucasmeyer
 */
public class renomearitemanotacao extends javax.swing.JFrame
{
    public static panels.analisadorasset.grafico.itemanotacao mpitemanotacao;
    
    /**
     * Creates new form mfrenomearitemgrafico
     */
    public renomearitemanotacao(panels.analisadorasset.grafico.itemanotacao mpia)
    {
        initComponents();
        
        mpitemanotacao = mpia;
        jTextFieldNovoNomeItemGrafico.setText(mpitemanotacao.jLabelNomeItemAnotacao.getText());
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

        jPanelFundo = new javax.swing.JPanel();
        jPanelFundo2 = new javax.swing.JPanel();
        jTextFieldNovoNomeItemGrafico = new javax.swing.JTextField();
        jButtonConfirmarNovoNomeItemGrafico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rename Annotation");

        jPanelFundo.setBackground(new java.awt.Color(55, 55, 55));

        jPanelFundo2.setBackground(new java.awt.Color(120, 120, 120));

        jButtonConfirmarNovoNomeItemGrafico.setText("OK");
        jButtonConfirmarNovoNomeItemGrafico.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonConfirmarNovoNomeItemGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFundo2Layout = new javax.swing.GroupLayout(jPanelFundo2);
        jPanelFundo2.setLayout(jPanelFundo2Layout);
        jPanelFundo2Layout.setHorizontalGroup(
            jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldNovoNomeItemGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfirmarNovoNomeItemGrafico)
                .addContainerGap())
        );
        jPanelFundo2Layout.setVerticalGroup(
            jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNovoNomeItemGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmarNovoNomeItemGrafico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarNovoNomeItemGraficoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonConfirmarNovoNomeItemGraficoActionPerformed
    {//GEN-HEADEREND:event_jButtonConfirmarNovoNomeItemGraficoActionPerformed
        mpitemanotacao.renomearitem(jTextFieldNovoNomeItemGrafico.getText());
        this.dispose();
    }//GEN-LAST:event_jButtonConfirmarNovoNomeItemGraficoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
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
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(renomearitemanotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(renomearitemanotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(renomearitemanotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(renomearitemanotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new renomearitemanotacao(mpitemanotacao).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarNovoNomeItemGrafico;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelFundo2;
    private javax.swing.JTextField jTextFieldNovoNomeItemGrafico;
    // End of variables declaration//GEN-END:variables
}
