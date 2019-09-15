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
package assetparser;

import java.io.IOException;

/**
 *
 * @author lucasmeyer
 */
public class panel_analisadorasset extends javax.swing.JPanel {
	/*
	 * classe que segura um submodulosholder, ou uma mensagem dizendo que o
	 * submodulosholder esta em uma janela suspensa
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 554122330376723559L;

	// item asset pai
	public assetparser.panel_itemanalisadorasset iaassetpai;

	// panel com submodulos holder
	public assetparser.panel_submodulosholder submodulosholder;
	// panel com mensagem dizendo que submodulos holder esta em janela separada
	public assetparser.panel_shjanelamensagem shjanelamensagem;

	// janela separada para submodulosholder
	assetparser.frame_shjanelaseparada janelaseparadaemuso;

	// <editor-fold defaultstate="collapsed" desc="CONSTRUTOR">
	public panel_analisadorasset(assetparser.panel_itemanalisadorasset iaapai) throws IOException {
		initComponents();
		iaassetpai = iaapai;

		// setar panel para mostrar submodulosholder ou mensagem de submodulosholder em
		// janela separada
		jPanelSubmodulosOuMensagemSuspensa.setLayout(new java.awt.GridLayout(1, 1));

		// criar um submodulosholder para pertencer a este analisador asset
		submodulosholder = new assetparser.panel_submodulosholder(this);

		// criar uma shjanelamensagem para pertencer a este analisador asset
		shjanelamensagem = new assetparser.panel_shjanelamensagem(this);

		atachsubmodulosholder();
	}
	// </editor-fold>

	public void atachsubmodulosholder() {
		try {
			janelaseparadaemuso.dispose();
		} catch (Exception ex) {
		}

		// remover child de jPanelSubmodulosOuMensagemSuspensa
		jPanelSubmodulosOuMensagemSuspensa.removeAll();

		// mudar layout do submodulosholder para atach
		submodulosholder.jLabelDetachSubmodulosholder.setVisible(true);

		// adicionar submodulosholder
		jPanelSubmodulosOuMensagemSuspensa.add(submodulosholder);
		this.validate();
		this.repaint();
	}

	public void detachsubmodulosholder() {
		// funcao para detach submodulosholder deste analisadorasset e adiciona-lo a um
		// shjanelaseparada

		// remover child de jPanelSubmodulosOuMensagemSuspensa
		jPanelSubmodulosOuMensagemSuspensa.removeAll();

		// adicionar janela de mensagem
		jPanelSubmodulosOuMensagemSuspensa.add(shjanelamensagem);
		this.validate();
		this.repaint();

		// mudar layout do submodulosholder para detach
		submodulosholder.mostrarsubmodulografico();
		submodulosholder.subgrafico.esconderPainelInferior();
		submodulosholder.jLabelDetachSubmodulosholder.setVisible(false);

		// mostrar janela separada
		janelaseparadaemuso = new assetparser.frame_shjanelaseparada(this);
		janelaseparadaemuso.mostrarjanelaseparada();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanelSubmodulosOuMensagemSuspensa = new javax.swing.JPanel();

		jPanelSubmodulosOuMensagemSuspensa.setBackground(new java.awt.Color(25, 25, 25));

		javax.swing.GroupLayout jPanelSubmodulosOuMensagemSuspensaLayout = new javax.swing.GroupLayout(
				jPanelSubmodulosOuMensagemSuspensa);
		jPanelSubmodulosOuMensagemSuspensa.setLayout(jPanelSubmodulosOuMensagemSuspensaLayout);
		jPanelSubmodulosOuMensagemSuspensaLayout.setHorizontalGroup(jPanelSubmodulosOuMensagemSuspensaLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 621, Short.MAX_VALUE));
		jPanelSubmodulosOuMensagemSuspensaLayout.setVerticalGroup(jPanelSubmodulosOuMensagemSuspensaLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 492, Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanelSubmodulosOuMensagemSuspensa, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanelSubmodulosOuMensagemSuspensa, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel jPanelSubmodulosOuMensagemSuspensa;
	// End of variables declaration//GEN-END:variables
}
