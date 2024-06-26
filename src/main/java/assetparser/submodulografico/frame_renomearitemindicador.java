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
package assetparser.submodulografico;

/**
 *
 * @author lucasmeyer
 */
public class frame_renomearitemindicador extends javax.swing.JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7920856798984136677L;
	public static assetparser.submodulografico.panel_itemindicador mpitemindicador;
    
    /**
     * Creates new form mfrenomearitemgrafico
     */
    public frame_renomearitemindicador(assetparser.submodulografico.panel_itemindicador mpii)
    {
        initComponents();
        
        mpitemindicador = mpii;
        jTextFieldNovoNomeItemIndicador.setText(mpitemindicador.jLabelNomeItemIndicador.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanelFundo = new javax.swing.JPanel();
        jPanelFundo2 = new javax.swing.JPanel();
        jTextFieldNovoNomeItemIndicador = new javax.swing.JTextField();
        jButtonConfirmarNovoNomeItemIndicador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rename Indicator");

        jPanelFundo.setBackground(new java.awt.Color(55, 55, 55));

        jPanelFundo2.setBackground(new java.awt.Color(120, 120, 120));

        jButtonConfirmarNovoNomeItemIndicador.setText("OK");
        jButtonConfirmarNovoNomeItemIndicador.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonConfirmarNovoNomeItemIndicadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFundo2Layout = new javax.swing.GroupLayout(jPanelFundo2);
        jPanelFundo2.setLayout(jPanelFundo2Layout);
        jPanelFundo2Layout.setHorizontalGroup(
            jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldNovoNomeItemIndicador, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConfirmarNovoNomeItemIndicador)
                .addContainerGap())
        );
        jPanelFundo2Layout.setVerticalGroup(
            jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNovoNomeItemIndicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmarNovoNomeItemIndicador))
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
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarNovoNomeItemIndicadorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonConfirmarNovoNomeItemIndicadorActionPerformed
    {//GEN-HEADEREND:event_jButtonConfirmarNovoNomeItemIndicadorActionPerformed
        mpitemindicador.renomearitem(jTextFieldNovoNomeItemIndicador.getText());
        this.dispose();
    }//GEN-LAST:event_jButtonConfirmarNovoNomeItemIndicadorActionPerformed

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
            java.util.logging.Logger.getLogger(frame_renomearitemindicador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frame_renomearitemindicador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frame_renomearitemindicador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frame_renomearitemindicador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            @Override
			public void run()
            {
                new frame_renomearitemindicador(mpitemindicador).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarNovoNomeItemIndicador;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelFundo2;
    private javax.swing.JTextField jTextFieldNovoNomeItemIndicador;
    // End of variables declaration//GEN-END:variables
}
