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
package options;

import java.io.IOException;

/**
 *
 * @author lucasmeyer
 */
public class frame_outrasopcoes extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1702081799853230255L;
	public static main.frame_telaprincipal telappai;

	/**
	 * Creates new form mfconfiguracoesgerais
	 */
	public frame_outrasopcoes(main.frame_telaprincipal tppai) {
		initComponents();

		telappai = tppai;

		inicializar();
	}

	void inicializar() {
		jLabelAVKey.setText("Alpha Vantage API Key: " + telappai.msapicomms.av_retornarchaveapi());
		jLabelCCKey.setText("CryptoCompare API Key: " + telappai.msapicomms.crycom_retornarchaveapi());
		jLabelTelegramBotToken.setText("Telegram Bot Token: " + telappai.mstelegramcomms.retornarbottoken());
		jLabelTelegramUserId.setText("Telegram User ID: " + telappai.mstelegramcomms.retornaruserid());

		boolean telegramstatus = telappai.mstelegramcomms.ativo;
		if (telegramstatus == true) {
			jLabelTelegramCommsStatus.setText("Telegram Bots Communication: activated");
			jButtonTestarTelegramComms.setEnabled(true);
		} else if (telegramstatus == false) {
			jLabelTelegramCommsStatus.setText("Telegram Bots Communication: deactivated");
			jButtonTestarTelegramComms.setEnabled(false);
		}

		if (telappai.msapicomms.math_tirarzeros == true) {
			jLabelRemoverCandles.setText("Remove Candles with zero OHLC values: yes");
		} else if (telappai.msapicomms.math_tirarzeros == false) {
			jLabelRemoverCandles.setText("Remove Candles with zero OHLC values: no");
		}

		java.util.Calendar c = java.util.Calendar.getInstance();
		java.util.TimeZone tz = c.getTimeZone();
		jLabelAppTimezone.setText("Application Time Zone: " + tz.getDisplayName());
	}

	void enviarmensagemtestetelegram() {
		try {
			telappai.mstelegramcomms.enviarmensagemtelegramcombot(
					"Test message from Open Stock at " + new java.util.Date(System.currentTimeMillis()));
			communication.mcfuncoeshelper.mostrarmensagem("Test message sent!");
		} catch (Exception e) {
			communication.mcfuncoeshelper.mostrarmensagem(
					"A problem occurred when trying to send a test Telegram Bot API message." + e.getMessage());
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanelMore = new javax.swing.JPanel();
		jButtonOpenBearcodeIndicatorEditor = new javax.swing.JButton();
		jButtonOpenBearcodeBotEditor = new javax.swing.JButton();
		jPanelConfiguration = new javax.swing.JPanel();
		jLabelAVKey = new javax.swing.JLabel();
		jLabelCCKey = new javax.swing.JLabel();
		jLabelTelegramBotToken = new javax.swing.JLabel();
		jLabelTelegramUserId = new javax.swing.JLabel();
		jLabelTelegramCommsStatus = new javax.swing.JLabel();
		jButtonTestarTelegramComms = new javax.swing.JButton();
		jLabelRemoverCandles = new javax.swing.JLabel();
		jLabelAppTimezone = new javax.swing.JLabel();
		jPanelAbout = new javax.swing.JPanel();
		jLabelOpenStock = new javax.swing.JLabel();
		jLabelLastBuild = new javax.swing.JLabel();
		jLabelBear = new javax.swing.JLabel();
		jLabelVersion = new javax.swing.JLabel();
		jLabelAPIAttribution = new javax.swing.JLabel();
		jLabelAPIAttributionIEX = new javax.swing.JLabel();
		jButtonIEX = new javax.swing.JButton();
		jLabelAPIAttributionAV = new javax.swing.JLabel();
		jButtonAV = new javax.swing.JButton();
		jButtonLicense = new javax.swing.JButton();
		jButtonGithub = new javax.swing.JButton();
		jLabelAPIAttributionCC = new javax.swing.JLabel();
		jButtonCC = new javax.swing.JButton();
		jLabelAPITelegram = new javax.swing.JLabel();
		jButtonTelegram = new javax.swing.JButton();

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Options");

		jPanelMore.setBackground(new java.awt.Color(55, 55, 55));

		jButtonOpenBearcodeIndicatorEditor.setText("Indicator Editor");
		jButtonOpenBearcodeIndicatorEditor.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButtonOpenBearcodeIndicatorEditorActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButtonOpenBearcodeBotEditor.setText("Bot Editor and Simulator");
		jButtonOpenBearcodeBotEditor.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButtonOpenBearcodeBotEditorActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout jPanelMoreLayout = new javax.swing.GroupLayout(jPanelMore);
		jPanelMore.setLayout(jPanelMoreLayout);
		jPanelMoreLayout.setHorizontalGroup(jPanelMoreLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelMoreLayout.createSequentialGroup().addContainerGap()
						.addGroup(jPanelMoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButtonOpenBearcodeIndicatorEditor, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButtonOpenBearcodeBotEditor, javax.swing.GroupLayout.DEFAULT_SIZE, 584,
										Short.MAX_VALUE))
						.addContainerGap()));
		jPanelMoreLayout
				.setVerticalGroup(jPanelMoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMoreLayout.createSequentialGroup()
								.addContainerGap().addComponent(jButtonOpenBearcodeIndicatorEditor)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButtonOpenBearcodeBotEditor).addContainerGap(253, Short.MAX_VALUE)));

		jTabbedPane1.addTab("More", jPanelMore);

		jPanelConfiguration.setBackground(new java.awt.Color(55, 55, 55));

		jLabelAVKey.setForeground(new java.awt.Color(255, 255, 255));
		jLabelAVKey.setText("Alpha Vantage API Key:");

		jLabelCCKey.setForeground(new java.awt.Color(255, 255, 255));
		jLabelCCKey.setText("CryptoCompare API Key:");

		jLabelTelegramBotToken.setForeground(new java.awt.Color(255, 255, 255));
		jLabelTelegramBotToken.setText("Telegram Bot Token:");

		jLabelTelegramUserId.setForeground(new java.awt.Color(255, 255, 255));
		jLabelTelegramUserId.setText("Telegram User ID:");

		jLabelTelegramCommsStatus.setForeground(new java.awt.Color(255, 255, 255));
		jLabelTelegramCommsStatus.setText("Telegram Bots Communication: deactivated");

		jButtonTestarTelegramComms.setText("Send Test Message");
		jButtonTestarTelegramComms.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonTestarTelegramCommsActionPerformed(evt);
			}
		});

		jLabelRemoverCandles.setForeground(new java.awt.Color(255, 255, 255));
		jLabelRemoverCandles.setText("Remove Candles with zero OHLC values: ");

		jLabelAppTimezone.setForeground(new java.awt.Color(255, 255, 255));
		jLabelAppTimezone.setText("Application Time Zone:");

		javax.swing.GroupLayout jPanelConfigurationLayout = new javax.swing.GroupLayout(jPanelConfiguration);
		jPanelConfiguration.setLayout(jPanelConfigurationLayout);
		jPanelConfigurationLayout.setHorizontalGroup(
				jPanelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelConfigurationLayout.createSequentialGroup().addContainerGap()
								.addGroup(jPanelConfigurationLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabelCCKey, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabelRemoverCandles, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabelAppTimezone, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabelTelegramBotToken, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabelAVKey, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabelTelegramUserId, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(jPanelConfigurationLayout.createSequentialGroup()
												.addComponent(jLabelTelegramCommsStatus,
														javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButtonTestarTelegramComms)))
								.addContainerGap()));
		jPanelConfigurationLayout.setVerticalGroup(
				jPanelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelConfigurationLayout.createSequentialGroup().addContainerGap()
								.addComponent(jLabelAVKey, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabelTelegramBotToken, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabelTelegramUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanelConfigurationLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabelTelegramCommsStatus, javax.swing.GroupLayout.PREFERRED_SIZE,
												14, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonTestarTelegramComms))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabelCCKey, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabelRemoverCandles, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabelAppTimezone, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(132, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Configuration", jPanelConfiguration);

		jPanelAbout.setBackground(new java.awt.Color(55, 55, 55));

		jLabelOpenStock.setForeground(new java.awt.Color(255, 255, 255));
		jLabelOpenStock.setText("Open Stock");

		jLabelLastBuild.setForeground(new java.awt.Color(255, 255, 255));
		jLabelLastBuild.setText("Lucas Meyer build of March 2019");

		jLabelBear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelBear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bear70.png"))); // NOI18N

		jLabelVersion.setForeground(new java.awt.Color(255, 255, 255));
		jLabelVersion.setText("(v1.035)");

		jLabelAPIAttribution.setForeground(new java.awt.Color(255, 255, 255));
		jLabelAPIAttribution.setText("API Attributions:");

		jLabelAPIAttributionIEX.setForeground(new java.awt.Color(255, 255, 255));
		jLabelAPIAttributionIEX.setText("Data provided for free by IEX.");

		jButtonIEX.setText("IEX's Terms of Use");
		jButtonIEX.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonIEXActionPerformed(evt);
			}
		});

		jLabelAPIAttributionAV.setForeground(new java.awt.Color(255, 255, 255));
		jLabelAPIAttributionAV.setText("Data provided for free by Alpha Vantage.");

		jButtonAV.setText("Alpha Vantage's Terms of Service");
		jButtonAV.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAVActionPerformed(evt);
			}
		});

		jButtonLicense.setText("Open Stock License");
		jButtonLicense.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonLicenseActionPerformed(evt);
			}
		});

		jButtonGithub.setText("Open Stock's GitHub");
		jButtonGithub.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonGithubActionPerformed(evt);
			}
		});

		jLabelAPIAttributionCC.setForeground(new java.awt.Color(255, 255, 255));
		jLabelAPIAttributionCC.setText("Data provided for free by CryptoCompare.");

		jButtonCC.setText("CryptoCompare's License Agreement");
		jButtonCC.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCCActionPerformed(evt);
			}
		});

		jLabelAPITelegram.setForeground(new java.awt.Color(255, 255, 255));
		jLabelAPITelegram.setText("Notifications provided by Telegram API.");

		jButtonTelegram.setText("Telegram API's Terms of Service");
		jButtonTelegram.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonTelegramActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanelAboutLayout = new javax.swing.GroupLayout(jPanelAbout);
		jPanelAbout.setLayout(jPanelAboutLayout);
		jPanelAboutLayout.setHorizontalGroup(jPanelAboutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelAboutLayout.createSequentialGroup().addContainerGap().addGroup(jPanelAboutLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelAboutLayout.createSequentialGroup().addGroup(jPanelAboutLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanelAboutLayout.createSequentialGroup().addComponent(jLabelOpenStock)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabelVersion))
								.addComponent(jLabelLastBuild))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabelBear, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(jLabelAPIAttribution, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanelAboutLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jButtonLicense)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButtonGithub))
						.addGroup(jPanelAboutLayout.createSequentialGroup()
								.addComponent(jLabelAPIAttributionIEX, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButtonIEX))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanelAboutLayout.createSequentialGroup()
										.addComponent(jLabelAPIAttributionAV, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButtonAV))
						.addGroup(jPanelAboutLayout.createSequentialGroup()
								.addComponent(jLabelAPIAttributionCC, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButtonCC))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanelAboutLayout.createSequentialGroup()
										.addComponent(jLabelAPITelegram, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButtonTelegram)))
						.addContainerGap()));
		jPanelAboutLayout.setVerticalGroup(jPanelAboutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelAboutLayout.createSequentialGroup().addContainerGap()
						.addGroup(jPanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabelBear)
								.addGroup(jPanelAboutLayout.createSequentialGroup()
										.addGroup(jPanelAboutLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabelOpenStock).addComponent(jLabelVersion))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabelLastBuild)))
						.addGap(18, 18, 18).addComponent(jLabelAPIAttribution)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelAPIAttributionIEX).addComponent(jButtonIEX))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelAPIAttributionAV).addComponent(jButtonAV))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelAPIAttributionCC).addComponent(jButtonCC))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelAPITelegram).addComponent(jButtonTelegram))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
						.addGroup(jPanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButtonGithub).addComponent(jButtonLicense))
						.addContainerGap()));

		jTabbedPane1.addTab("About", jPanelAbout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonGithubActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonGithubActionPerformed
		try {
			java.awt.Desktop.getDesktop().browse(new java.net.URI("https://github.com/lcmeyer37/openstock"));
		} catch (Exception ex) {
			communication.mcfuncoeshelper.mostrarmensagem("A problem occurred. Exception: " + ex.getMessage());
		}
	}// GEN-LAST:event_jButtonGithubActionPerformed

	private void jButtonIEXActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonIEXActionPerformed
		try {
			java.awt.Desktop.getDesktop().browse(new java.net.URI("https://iextrading.com/api-exhibit-a/"));
		} catch (Exception ex) {
			communication.mcfuncoeshelper.mostrarmensagem("A problem occurred. Exception: " + ex.getMessage());
		}
	}// GEN-LAST:event_jButtonIEXActionPerformed

	private void jButtonOpenBearcodeIndicatorEditorActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_jButtonOpenBearcodeIndicatorEditorActionPerformed
		// open interface to edit bearcode scripts
		options.editorbearcodeindicador.frame_editorbearcodeindicador mfebc = new options.editorbearcodeindicador.frame_editorbearcodeindicador(
				telappai);
		mfebc.setVisible(true);
	}// GEN-LAST:event_jButtonOpenBearcodeIndicatorEditorActionPerformed

	private void jButtonLicenseActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_jButtonLicenseActionPerformed
	{// GEN-HEADEREND:event_jButtonLicenseActionPerformed
		main.frame_license mfl = new main.frame_license();
		mfl.setVisible(true);
	}// GEN-LAST:event_jButtonLicenseActionPerformed

	private void jButtonOpenBearcodeBotEditorActionPerformed(java.awt.event.ActionEvent evt) throws IOException// GEN-FIRST:event_jButtonOpenBearcodeBotEditorActionPerformed
	{// GEN-HEADEREND:event_jButtonOpenBearcodeBotEditorActionPerformed
		options.editorbearcodetraderbot.frame_editorbearcodetraderbot mfebc = new options.editorbearcodetraderbot.frame_editorbearcodetraderbot(
				telappai);
		mfebc.setVisible(true);
	}// GEN-LAST:event_jButtonOpenBearcodeBotEditorActionPerformed

	private void jButtonAVActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_jButtonAVActionPerformed
	{// GEN-HEADEREND:event_jButtonAVActionPerformed
		try {
			java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.alphavantage.co/terms_of_service/"));
		} catch (Exception ex) {
			communication.mcfuncoeshelper.mostrarmensagem("A problem occurred. Exception: " + ex.getMessage());
		}
	}// GEN-LAST:event_jButtonAVActionPerformed

	private void jButtonCCActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_jButtonCCActionPerformed
	{// GEN-HEADEREND:event_jButtonCCActionPerformed
		try {
			java.awt.Desktop.getDesktop()
					.browse(new java.net.URI("https://www.cryptocompare.com/api-licence-agreement/"));
		} catch (Exception ex) {
			communication.mcfuncoeshelper.mostrarmensagem("A problem occurred. Exception: " + ex.getMessage());
		}
	}// GEN-LAST:event_jButtonCCActionPerformed

	private void jButtonTelegramActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_jButtonTelegramActionPerformed
	{// GEN-HEADEREND:event_jButtonTelegramActionPerformed
		try {
			java.awt.Desktop.getDesktop().browse(new java.net.URI("https://core.telegram.org/api/terms"));
		} catch (Exception ex) {
			communication.mcfuncoeshelper.mostrarmensagem("A problem occurred. Exception: " + ex.getMessage());
		}
	}// GEN-LAST:event_jButtonTelegramActionPerformed

	private void jButtonTestarTelegramCommsActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_jButtonTestarTelegramCommsActionPerformed
	{// GEN-HEADEREND:event_jButtonTestarTelegramCommsActionPerformed
		enviarmensagemtestetelegram();
	}// GEN-LAST:event_jButtonTestarTelegramCommsActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(frame_outrasopcoes.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frame_outrasopcoes.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frame_outrasopcoes.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frame_outrasopcoes.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new frame_outrasopcoes(telappai).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonAV;
	private javax.swing.JButton jButtonCC;
	private javax.swing.JButton jButtonGithub;
	private javax.swing.JButton jButtonIEX;
	private javax.swing.JButton jButtonLicense;
	private javax.swing.JButton jButtonOpenBearcodeBotEditor;
	private javax.swing.JButton jButtonOpenBearcodeIndicatorEditor;
	private javax.swing.JButton jButtonTelegram;
	private javax.swing.JButton jButtonTestarTelegramComms;
	private javax.swing.JLabel jLabelAPIAttribution;
	private javax.swing.JLabel jLabelAPIAttributionAV;
	private javax.swing.JLabel jLabelAPIAttributionCC;
	private javax.swing.JLabel jLabelAPIAttributionIEX;
	private javax.swing.JLabel jLabelAPITelegram;
	private javax.swing.JLabel jLabelAVKey;
	private javax.swing.JLabel jLabelAppTimezone;
	private javax.swing.JLabel jLabelBear;
	private javax.swing.JLabel jLabelCCKey;
	private javax.swing.JLabel jLabelLastBuild;
	private javax.swing.JLabel jLabelOpenStock;
	private javax.swing.JLabel jLabelRemoverCandles;
	private javax.swing.JLabel jLabelTelegramBotToken;
	private javax.swing.JLabel jLabelTelegramCommsStatus;
	private javax.swing.JLabel jLabelTelegramUserId;
	private javax.swing.JLabel jLabelVersion;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanelAbout;
	private javax.swing.JPanel jPanelConfiguration;
	private javax.swing.JPanel jPanelMore;
	private javax.swing.JTabbedPane jTabbedPane1;
	// End of variables declaration//GEN-END:variables
}
