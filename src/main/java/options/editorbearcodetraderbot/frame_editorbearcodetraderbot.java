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
package options.editorbearcodetraderbot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import communication.mccandle;

/**
 *
 * @author meyerlu
 */
public class frame_editorbearcodetraderbot extends javax.swing.JFrame {

	// janela utilizada para edicao de bearcode scripts

	/**
	 *
	 */
	private static final long serialVersionUID = -7136978550509747943L;

	// <editor-fold defaultstate="collapsed" desc="Variáveis">
	// tela principal pai
	public static main.frame_telaprincipal telappai;

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
			for (final javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (final ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(frame_editorbearcodetraderbot.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (final InstantiationException ex) {
			java.util.logging.Logger.getLogger(frame_editorbearcodetraderbot.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (final IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frame_editorbearcodetraderbot.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (final javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frame_editorbearcodetraderbot.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
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

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			try {
				new frame_editorbearcodetraderbot(telappai).setVisible(true);
			} catch (final IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	// classe interpretadora de bearcode (contem o codigo relacionado a este trader
	// bot)
	public communication.mcbctradingbotinterpreter mcbctraderbot;

	// offline trader utilizado por este submodulo
	public communication.mcofflinetrader otrader;
	// todas o set de candles de teste utilizado pelo editor
	java.util.List<communication.mccandle> candlessample;

	// o subset de candles utilizados ao rodar a simulacao
	public java.util.List<communication.mccandle> candlessimulacao;

	// handler para o output do jtextareaoutput
	communication.mcjtextareahandler mcjtah;

	// RSyntaxTextArea utilizado pelo editor
	org.fife.ui.rsyntaxtextarea.RSyntaxTextArea rsTextArea;
	// </editor-fold>

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonLoadFile;

	private javax.swing.JButton jButtonRecarregarCandlesData;

	private javax.swing.JButton jButtonResetEditor;

	// </editor-fold>

	private javax.swing.JButton jButtonRun;

	private javax.swing.JButton jButtonSaveFile;

	private javax.swing.JCheckBox jCheckBoxAutoTrade;

	private javax.swing.JComboBox<String> jComboBoxMaxInterval;

	private javax.swing.JComboBox<String> jComboBoxMinInterval;

	public javax.swing.JComboBox<String> jComboBoxPeriodoSimbolo;

	private javax.swing.JLabel jLabelBaseAmount;

	private javax.swing.JLabel jLabelBuyFee;

	private javax.swing.JLabel jLabelBuyFee1;

	private javax.swing.JLabel jLabelCandlesDataStatus;

	private javax.swing.JLabel jLabelNomeSimbolo;

	private javax.swing.JLabel jLabelOutput;

	private javax.swing.JLabel jLabelParameters;

	private javax.swing.JLabel jLabelPeriodoSimbolo;

	private javax.swing.JLabel jLabelQuoteAmount;

	private javax.swing.JLabel jLabelScript;

	private javax.swing.JLabel jLabelSellFee;

	private javax.swing.JLabel jLabelTestParameters3;

	private javax.swing.JPanel jPanelChooseDataSimulator;

	private javax.swing.JPanel jPanelEditorHolder;
	private javax.swing.JPanel jPanelPai;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextAreaOutput;
	private javax.swing.JTextField jTextFieldBaseAmount;
	private javax.swing.JTextField jTextFieldBuyFee;
	public javax.swing.JTextField jTextFieldNomeSimbolo;
	private javax.swing.JTextField jTextFieldParameters;
	private javax.swing.JTextField jTextFieldQuoteAmount;
	private javax.swing.JTextField jTextFieldSellFee;

	// End of variables declaration//GEN-END:variables
	// <editor-fold defaultstate="collapsed" desc="Construtor e Inicializar">
	public frame_editorbearcodetraderbot(main.frame_telaprincipal tppai) throws IOException {
		this.initComponents();

		telappai = tppai;

		this.inicializar();
	}

	// <editor-fold defaultstate="collapsed" desc="Atualizar Dados do Simulador">
	void atualizardadoscandlessimulador() throws IOException {
		final String sourcesimboloescolhido = this.jTextFieldNomeSimbolo.getText();
		final String periodoescolhido = this.jComboBoxPeriodoSimbolo.getSelectedItem().toString();

		// funcao utilizada para associar dados de candle ao simulador
		java.util.List<mccandle> candles = null;

		if ((sourcesimboloescolhido.equals("testdata")) == true) {
			// codigo para criar um dataset offline para teste
			candles = telappai.msapicomms.offline_receberstockcandlessample();
		} else if ((sourcesimboloescolhido.equals("testdata")) == false) {
			if (((sourcesimboloescolhido.split(":")[0]).toLowerCase()).equals("iex")) {
				if (periodoescolhido.equals("1 Day")) {
					candles = telappai.msapicomms
							.iex_receberstockcandleswithminutes((sourcesimboloescolhido.split(":")[1]), "1d");
				} else if (periodoescolhido.equals("1 Month")) {
					candles = telappai.msapicomms
							.iex_receberstockcandleswithoutminutes((sourcesimboloescolhido.split(":")[1]), "1m");
				} else if (periodoescolhido.equals("3 Months")) {
					candles = telappai.msapicomms
							.iex_receberstockcandleswithoutminutes((sourcesimboloescolhido.split(":")[1]), "3m");
				} else if (periodoescolhido.equals("6 Months")) {
					candles = telappai.msapicomms
							.iex_receberstockcandleswithoutminutes((sourcesimboloescolhido.split(":")[1]), "6m");
				} else if (periodoescolhido.equals("Year-to-date")) {
					candles = telappai.msapicomms
							.iex_receberstockcandleswithoutminutes((sourcesimboloescolhido.split(":")[1]), "ytd");
				} else if (periodoescolhido.equals("1 Year")) {
					candles = telappai.msapicomms
							.iex_receberstockcandleswithoutminutes((sourcesimboloescolhido.split(":")[1]), "1y");
				} else if (periodoescolhido.equals("2 Years")) {
					candles = telappai.msapicomms
							.iex_receberstockcandleswithoutminutes((sourcesimboloescolhido.split(":")[1]), "2y");
				} else if (periodoescolhido.equals("5 Years")) {
					candles = telappai.msapicomms
							.iex_receberstockcandleswithoutminutes((sourcesimboloescolhido.split(":")[1]), "5y");
				}
			} else if (((sourcesimboloescolhido.split(":")[0]).toLowerCase()).equals("avs")) {
				if (periodoescolhido.equals("1 minute (Compact)")) {
					candles = telappai.msapicomms.av_receberstockcandlesintraday((sourcesimboloescolhido.split(":")[1]),
							"1min", "compact");
				} else if (periodoescolhido.equals("1 minute (Full)")) {
					candles = telappai.msapicomms.av_receberstockcandlesintraday((sourcesimboloescolhido.split(":")[1]),
							"1min", "full");
				} else if (periodoescolhido.equals("5 minutes (Compact)")) {
					candles = telappai.msapicomms.av_receberstockcandlesintraday((sourcesimboloescolhido.split(":")[1]),
							"5min", "compact");
				} else if (periodoescolhido.equals("5 minutes (Full)")) {
					candles = telappai.msapicomms.av_receberstockcandlesintraday((sourcesimboloescolhido.split(":")[1]),
							"5min", "full");
				} else if (periodoescolhido.equals("15 minutes (Compact)")) {
					candles = telappai.msapicomms.av_receberstockcandlesintraday((sourcesimboloescolhido.split(":")[1]),
							"15min", "compact");
				} else if (periodoescolhido.equals("15 minutes (Full)")) {
					candles = telappai.msapicomms.av_receberstockcandlesintraday((sourcesimboloescolhido.split(":")[1]),
							"15min", "full");
				} else if (periodoescolhido.equals("30 minutes (Compact)")) {
					candles = telappai.msapicomms.av_receberstockcandlesintraday((sourcesimboloescolhido.split(":")[1]),
							"30min", "compact");
				} else if (periodoescolhido.equals("30 minutes (Full)")) {
					candles = telappai.msapicomms.av_receberstockcandlesintraday((sourcesimboloescolhido.split(":")[1]),
							"30min", "full");
				} else if (periodoescolhido.equals("60 minutes (Compact)")) {
					candles = telappai.msapicomms.av_receberstockcandlesintraday((sourcesimboloescolhido.split(":")[1]),
							"60min", "compact");
				} else if (periodoescolhido.equals("60 minutes (Full)")) {
					candles = telappai.msapicomms.av_receberstockcandlesintraday((sourcesimboloescolhido.split(":")[1]),
							"60min", "full");
				} else if (periodoescolhido.equals("Daily (Compact)")) {
					candles = telappai.msapicomms.av_receberstockcandlesdaily((sourcesimboloescolhido.split(":")[1]),
							"compact");
				} else if (periodoescolhido.equals("Daily (Full)")) {
					candles = telappai.msapicomms.av_receberstockcandlesdaily((sourcesimboloescolhido.split(":")[1]),
							"full");
				} else if (periodoescolhido.equals("Weekly")) {
					candles = telappai.msapicomms.av_receberstockcandlesweekly((sourcesimboloescolhido.split(":")[1]));
				} else if (periodoescolhido.equals("Monthly")) {
					candles = telappai.msapicomms.av_receberstockcandlesmonthly((sourcesimboloescolhido.split(":")[1]));
				}
			} else if (((sourcesimboloescolhido.split(":")[0]).toLowerCase()).equals("avfx")) {
				final String simbolo = (sourcesimboloescolhido.split(":")[1]);
				final String fromsimbolo = (simbolo.split("\\.")[0]);
				final String tosimbolo = (simbolo.split("\\.")[1]);

				if (periodoescolhido.equals("1 minute (Compact)")) {
					candles = telappai.msapicomms.av_receberforexcandlesintraday(fromsimbolo, tosimbolo, "1min",
							"compact");
				} else if (periodoescolhido.equals("1 minute (Full)")) {
					candles = telappai.msapicomms.av_receberforexcandlesintraday(fromsimbolo, tosimbolo, "1min",
							"full");
				} else if (periodoescolhido.equals("5 minutes (Compact)")) {
					candles = telappai.msapicomms.av_receberforexcandlesintraday(fromsimbolo, tosimbolo, "5min",
							"compact");
				} else if (periodoescolhido.equals("5 minutes (Full)")) {
					candles = telappai.msapicomms.av_receberforexcandlesintraday(fromsimbolo, tosimbolo, "5min",
							"full");
				} else if (periodoescolhido.equals("15 minutes (Compact)")) {
					candles = telappai.msapicomms.av_receberforexcandlesintraday(fromsimbolo, tosimbolo, "15min",
							"compact");
				} else if (periodoescolhido.equals("15 minutes (Full)")) {
					candles = telappai.msapicomms.av_receberforexcandlesintraday(fromsimbolo, tosimbolo, "15min",
							"full");
				} else if (periodoescolhido.equals("30 minutes (Compact)")) {
					candles = telappai.msapicomms.av_receberforexcandlesintraday(fromsimbolo, tosimbolo, "30min",
							"compact");
				} else if (periodoescolhido.equals("30 minutes (Full)")) {
					candles = telappai.msapicomms.av_receberforexcandlesintraday(fromsimbolo, tosimbolo, "30min",
							"full");
				} else if (periodoescolhido.equals("60 minutes (Compact)")) {
					candles = telappai.msapicomms.av_receberforexcandlesintraday(fromsimbolo, tosimbolo, "60min",
							"compact");
				} else if (periodoescolhido.equals("60 minutes (Full)")) {
					candles = telappai.msapicomms.av_receberforexcandlesintraday(fromsimbolo, tosimbolo, "60min",
							"full");
				} else if (periodoescolhido.equals("Daily (Compact)")) {
					candles = telappai.msapicomms.av_receberforexcandlesdaily(fromsimbolo, tosimbolo, "compact");
				} else if (periodoescolhido.equals("Daily (Full)")) {
					candles = telappai.msapicomms.av_receberforexcandlesdaily(fromsimbolo, tosimbolo, "full");
				} else if (periodoescolhido.equals("Weekly")) {
					candles = telappai.msapicomms.av_receberforexcandlesweekly(fromsimbolo, tosimbolo);
				} else if (periodoescolhido.equals("Monthly")) {
					candles = telappai.msapicomms.av_receberforexcandlesmonthly(fromsimbolo, tosimbolo);
				}
			} else if (((sourcesimboloescolhido.split(":")[0]).toLowerCase()).equals("crycom")) {
				if (periodoescolhido.equals("Minute (200)")) {
					candles = telappai.msapicomms.crycom_recebercryptocandles((sourcesimboloescolhido.split(":")[1]),
							"200", "Minute");
				} else if (periodoescolhido.equals("Minute (1500)")) {
					candles = telappai.msapicomms.crycom_recebercryptocandles((sourcesimboloescolhido.split(":")[1]),
							"1500", "Minute");
				}
				if (periodoescolhido.equals("Hourly (200)")) {
					candles = telappai.msapicomms.crycom_recebercryptocandles((sourcesimboloescolhido.split(":")[1]),
							"200", "Hourly");
				} else if (periodoescolhido.equals("Hourly (1500)")) {
					candles = telappai.msapicomms.crycom_recebercryptocandles((sourcesimboloescolhido.split(":")[1]),
							"1500", "Hourly");
				}
				if (periodoescolhido.equals("Daily (200)")) {
					candles = telappai.msapicomms.crycom_recebercryptocandles((sourcesimboloescolhido.split(":")[1]),
							"200", "Daily");
				} else if (periodoescolhido.equals("Daily (1500)")) {
					candles = telappai.msapicomms.crycom_recebercryptocandles((sourcesimboloescolhido.split(":")[1]),
							"1500", "Daily");
				}
			}

		}

		this.candlessample = candles;
		if (this.candlessample == null) {
			this.jLabelCandlesDataStatus.setText("Current Data: (none)");

			this.jComboBoxMinInterval.removeAllItems();
			this.jComboBoxMinInterval.addItem("(unavailable)");
			this.jComboBoxMaxInterval.removeAllItems();
			this.jComboBoxMaxInterval.addItem("(unavailable)");
			this.jComboBoxMinInterval.setSelectedIndex(0);
			this.jComboBoxMaxInterval.setSelectedIndex(0);

		} else {
			this.jLabelCandlesDataStatus.setText("Current Data: " + sourcesimboloescolhido.toUpperCase() + " (size: "
					+ this.candlessample.size() + ")");

			this.jComboBoxMinInterval.removeAllItems();
			this.jComboBoxMaxInterval.removeAllItems();
			for (int i = 1; i < this.candlessample.size(); i++) {
				// i comeca de 1, porque eh necessario no minimo a candle em 0 para fazer o
				// intervalo de 0 a 1
				// o min tambem deve sempre ser um valor <= ao maximo

				final communication.mccandle candleatual = this.candlessample.get(i);

				Calendar cal = Calendar.getInstance();
				cal.setTime(candleatual.timestampdate);
				final String dataadicionar = (cal.get(Calendar.MONTH + 1) + "/" + cal.get(Calendar.DAY_OF_MONTH) + "/"
						+ (cal.get(Calendar.YEAR) + 1900) + " " + cal.get(Calendar.HOUR) + ":"
						+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));

				this.jComboBoxMinInterval.addItem(dataadicionar + " (" + (i) + ")");
				this.jComboBoxMaxInterval.addItem(dataadicionar + " (" + (i) + ")");
			}
			this.jComboBoxMinInterval.setSelectedIndex(this.jComboBoxMinInterval.getItemCount() - 1);
			this.jComboBoxMaxInterval.setSelectedIndex(this.jComboBoxMinInterval.getItemCount() - 1);
		}

	}

	void atualizarinformacoes_editor_para_offlinetrader() {
		// funcao para atualizar informacoes do offline trader com campos de edicao do
		// editor
		this.otrader.feecompra = Double.valueOf(this.jTextFieldBuyFee.getText());
		this.otrader.feevenda = Double.valueOf(this.jTextFieldSellFee.getText());
		this.otrader.quantidademoedabase = Double.valueOf(this.jTextFieldBaseAmount.getText());
		this.otrader.quantidademoedacotacao = Double.valueOf(this.jTextFieldQuoteAmount.getText());
	}

	void atualizarinformacoes_offlinetrader_para_editor() {
		// funcao para atualizar informacoes do offline trader com campos de edicao do
		// editor
		this.jTextFieldBuyFee.setText(String.valueOf(this.otrader.feecompra));
		this.jTextFieldSellFee.setText(String.valueOf(this.otrader.feevenda));
		this.jTextFieldBaseAmount.setText(String.valueOf(this.otrader.quantidademoedabase));
		this.jTextFieldQuoteAmount.setText(String.valueOf(this.otrader.quantidademoedacotacao));
	}

	public void atualizaropcoescomboboxperiodo() {
		// dependendo da source, iex, av, etc, o periodo muda na lista de periodos
		// disponiveis
		final String textoatualsimbolo = this.jTextFieldNomeSimbolo.getText();

		if ((textoatualsimbolo.equals("testdata")) == true) {
			this.jComboBoxPeriodoSimbolo.removeAllItems();
			this.jComboBoxPeriodoSimbolo.addItem("No options");
		} else if ((textoatualsimbolo.equals("testdata")) == false) {
			this.jComboBoxPeriodoSimbolo.removeAllItems();

			if (((textoatualsimbolo.split(":")[0]).toLowerCase()).equals("iex")) {
				this.jComboBoxPeriodoSimbolo.addItem("1 Day");
				this.jComboBoxPeriodoSimbolo.addItem("1 Month");
				this.jComboBoxPeriodoSimbolo.addItem("3 Months");
				this.jComboBoxPeriodoSimbolo.addItem("6 Months");
				this.jComboBoxPeriodoSimbolo.addItem("Year-to-date");
				this.jComboBoxPeriodoSimbolo.addItem("1 Year");
				this.jComboBoxPeriodoSimbolo.addItem("2 Years");
				this.jComboBoxPeriodoSimbolo.addItem("5 Years");
			} else if (((textoatualsimbolo.split(":")[0]).toLowerCase()).equals("avs")) {
				this.jComboBoxPeriodoSimbolo.addItem("1 minute (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("1 minute (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("5 minutes (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("5 minutes (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("15 minutes (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("15 minutes (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("30 minutes (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("30 minutes (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("60 minutes (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("60 minutes (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("Daily (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("Daily (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("Weekly");
				this.jComboBoxPeriodoSimbolo.addItem("Monthly");
			} else if (((textoatualsimbolo.split(":")[0]).toLowerCase()).equals("avfx")) {
				this.jComboBoxPeriodoSimbolo.addItem("1 minute (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("1 minute (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("5 minutes (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("5 minutes (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("15 minutes (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("15 minutes (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("30 minutes (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("30 minutes (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("60 minutes (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("60 minutes (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("Daily (Compact)");
				this.jComboBoxPeriodoSimbolo.addItem("Daily (Full)");
				this.jComboBoxPeriodoSimbolo.addItem("Weekly");
				this.jComboBoxPeriodoSimbolo.addItem("Monthly");
			} else if (((textoatualsimbolo.split(":")[0]).toLowerCase()).equals("crycom")) {
				this.jComboBoxPeriodoSimbolo.addItem("Minute (200)");
				this.jComboBoxPeriodoSimbolo.addItem("Minute (1500)");
				this.jComboBoxPeriodoSimbolo.addItem("Hourly (200)");
				this.jComboBoxPeriodoSimbolo.addItem("Hourly (1500)");
				this.jComboBoxPeriodoSimbolo.addItem("Daily (200)");
				this.jComboBoxPeriodoSimbolo.addItem("Daily (1500)");
			} else {
				this.jComboBoxPeriodoSimbolo.addItem("No options");
			}
		}

		this.jComboBoxPeriodoSimbolo.setSelectedIndex(0);
	}

	// </editor-fold>
	void carregararquivobcodeedicao() {
		try {
			// abrir janela para selecionar arquivo de save para carregar
			final javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
			final String pastascriptsbot = new File(
					this.getClass().getClassLoader().getResource("bearcode/traderbots").getFile()).getAbsolutePath();
			fileChooser.setCurrentDirectory(new java.io.File(pastascriptsbot));
			final javax.swing.filechooser.FileFilter filter = new communication.mcextensionfilefilter("Bearcode File",
					new String[] { "bearcode" });
			fileChooser.setFileFilter(filter);
			fileChooser.setDialogTitle("Please choose an Open Stock file to load");

			final int userSelection = fileChooser.showOpenDialog(this);

			if (userSelection == javax.swing.JFileChooser.APPROVE_OPTION) {

				java.io.File fileToLoad = null;

				try {
					fileToLoad = fileChooser.getSelectedFile();
					final String scripttexto = communication.mcfuncoeshelper
							.retornarStringArquivo(fileToLoad.getAbsolutePath());

					this.rsTextArea.setText(scripttexto);
					this.jTextAreaOutput.setText("");
				} catch (final Exception ex) {
					communication.mcfuncoeshelper.mostrarmensagem(ex.getMessage());
				}
			}
		} catch (final Exception ex) {
			communication.mcfuncoeshelper
					.mostrarmensagem("A problem occurred when loading. Exception: " + ex.getMessage());
		}
	}

	// </editor-fold>
	void inicializar() throws IOException {
		// popular traderbot interpretador de script
		this.mcbctraderbot = new communication.mcbctradingbotinterpreter("testbctraderbot", "Teste Trader Bot", "", "");
		// adicionar handler para print de output pelo script
		this.mcjtah = new communication.mcjtextareahandler(this.jTextAreaOutput);

		// receber as candles de teste como default
		this.jTextFieldNomeSimbolo.setText("testdata");
		this.atualizardadoscandlessimulador();

		// associar um offlinetrader para este editor (para realizar trades de
		// simulacao)
		this.otrader = new communication.mcofflinetrader(this);

		// inicializar e resetar campos de edicao do editor com informacoes padrao
		this.inicializarRSyntaxTextArea();
		this.resetarcamposeditor();

	}

	void inicializarRSyntaxTextArea() {
		// classe text area com syntax parser para javascript
		this.rsTextArea = new org.fife.ui.rsyntaxtextarea.RSyntaxTextArea(20, 60);
		this.rsTextArea.setSyntaxEditingStyle(org.fife.ui.rsyntaxtextarea.SyntaxConstants.SYNTAX_STYLE_JAVASCRIPT);
		this.rsTextArea.setCodeFoldingEnabled(true);
		final org.fife.ui.rtextarea.RTextScrollPane sp = new org.fife.ui.rtextarea.RTextScrollPane(this.rsTextArea);
		this.jPanelEditorHolder.add(sp);
		this.jPanelEditorHolder.setLayout(new java.awt.GridLayout(1, 1));
		this.validate();
		this.repaint();
	}

	// </editor-fold>
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		this.jPanelPai = new javax.swing.JPanel();
		this.jLabelScript = new javax.swing.JLabel();
		this.jScrollPane2 = new javax.swing.JScrollPane();
		this.jTextAreaOutput = new javax.swing.JTextArea();
		this.jLabelOutput = new javax.swing.JLabel();
		this.jButtonSaveFile = new javax.swing.JButton();
		this.jButtonLoadFile = new javax.swing.JButton();
		this.jButtonResetEditor = new javax.swing.JButton();
		this.jLabelBuyFee = new javax.swing.JLabel();
		this.jTextFieldBuyFee = new javax.swing.JTextField();
		this.jLabelParameters = new javax.swing.JLabel();
		this.jTextFieldParameters = new javax.swing.JTextField();
		this.jLabelSellFee = new javax.swing.JLabel();
		this.jTextFieldSellFee = new javax.swing.JTextField();
		this.jLabelTestParameters3 = new javax.swing.JLabel();
		this.jTextFieldBaseAmount = new javax.swing.JTextField();
		this.jLabelBaseAmount = new javax.swing.JLabel();
		this.jLabelQuoteAmount = new javax.swing.JLabel();
		this.jTextFieldQuoteAmount = new javax.swing.JTextField();
		this.jButtonRun = new javax.swing.JButton();
		this.jCheckBoxAutoTrade = new javax.swing.JCheckBox();
		this.jPanelChooseDataSimulator = new javax.swing.JPanel();
		this.jComboBoxPeriodoSimbolo = new javax.swing.JComboBox<>();
		this.jLabelPeriodoSimbolo = new javax.swing.JLabel();
		this.jTextFieldNomeSimbolo = new javax.swing.JTextField();
		this.jLabelNomeSimbolo = new javax.swing.JLabel();
		this.jLabelCandlesDataStatus = new javax.swing.JLabel();
		this.jButtonRecarregarCandlesData = new javax.swing.JButton();
		this.jComboBoxMinInterval = new javax.swing.JComboBox<>();
		this.jComboBoxMaxInterval = new javax.swing.JComboBox<>();
		this.jLabelBuyFee1 = new javax.swing.JLabel();
		this.jPanelEditorHolder = new javax.swing.JPanel();

		this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		this.setTitle("Bot Editor and Simulator");

		this.jPanelPai.setBackground(new java.awt.Color(55, 55, 55));

		this.jLabelScript.setForeground(new java.awt.Color(255, 255, 255));
		this.jLabelScript.setText("Script");

		this.jTextAreaOutput.setEditable(false);
		this.jTextAreaOutput.setBackground(new java.awt.Color(35, 35, 35));
		this.jTextAreaOutput.setColumns(20);
		this.jTextAreaOutput.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
		this.jTextAreaOutput.setForeground(new java.awt.Color(255, 255, 255));
		this.jTextAreaOutput.setRows(5);
		this.jTextAreaOutput.setFocusable(false);
		this.jScrollPane2.setViewportView(this.jTextAreaOutput);

		this.jLabelOutput.setForeground(new java.awt.Color(255, 255, 255));
		this.jLabelOutput.setText("Output");

		this.jButtonSaveFile.setText("Save File");
		this.jButtonSaveFile
				.addActionListener(evt -> frame_editorbearcodetraderbot.this.jButtonSaveFileActionPerformed(evt));

		this.jButtonLoadFile.setText("Load File");
		this.jButtonLoadFile
				.addActionListener(evt -> frame_editorbearcodetraderbot.this.jButtonLoadFileActionPerformed(evt));

		this.jButtonResetEditor.setForeground(new java.awt.Color(255, 0, 0));
		this.jButtonResetEditor.setText("Reset");
		this.jButtonResetEditor
				.addActionListener(evt -> frame_editorbearcodetraderbot.this.jButtonResetEditorActionPerformed(evt));

		this.jLabelBuyFee.setForeground(new java.awt.Color(255, 255, 255));
		this.jLabelBuyFee.setText("Buy Fee:");

		this.jTextFieldBuyFee.setBackground(new java.awt.Color(0, 0, 0));
		this.jTextFieldBuyFee.setForeground(new java.awt.Color(255, 255, 255));
		this.jTextFieldBuyFee.setText("0.001");
		this.jTextFieldBuyFee.setCaretColor(new java.awt.Color(125, 125, 125));
		this.jTextFieldBuyFee
				.addActionListener(evt -> frame_editorbearcodetraderbot.this.jTextFieldBuyFeeActionPerformed(evt));

		this.jLabelParameters.setForeground(new java.awt.Color(255, 255, 255));
		this.jLabelParameters.setText("Test Parameters:");

		this.jTextFieldParameters.setBackground(new java.awt.Color(0, 0, 0));
		this.jTextFieldParameters.setForeground(new java.awt.Color(255, 255, 255));
		this.jTextFieldParameters.setCaretColor(new java.awt.Color(125, 125, 125));

		this.jLabelSellFee.setForeground(new java.awt.Color(255, 255, 255));
		this.jLabelSellFee.setText("Sell Fee:");

		this.jTextFieldSellFee.setBackground(new java.awt.Color(0, 0, 0));
		this.jTextFieldSellFee.setForeground(new java.awt.Color(255, 255, 255));
		this.jTextFieldSellFee.setText("0.001");
		this.jTextFieldSellFee.setCaretColor(new java.awt.Color(125, 125, 125));

		this.jLabelTestParameters3.setForeground(new java.awt.Color(255, 255, 255));

		this.jTextFieldBaseAmount.setBackground(new java.awt.Color(0, 0, 0));
		this.jTextFieldBaseAmount.setForeground(new java.awt.Color(255, 255, 255));
		this.jTextFieldBaseAmount.setText("0");
		this.jTextFieldBaseAmount.setCaretColor(new java.awt.Color(125, 125, 125));

		this.jLabelBaseAmount.setForeground(new java.awt.Color(255, 255, 255));
		this.jLabelBaseAmount.setText("Current Base Amount:");

		this.jLabelQuoteAmount.setForeground(new java.awt.Color(255, 255, 255));
		this.jLabelQuoteAmount.setText("Current Quote Amount:");

		this.jTextFieldQuoteAmount.setBackground(new java.awt.Color(0, 0, 0));
		this.jTextFieldQuoteAmount.setForeground(new java.awt.Color(255, 255, 255));
		this.jTextFieldQuoteAmount.setText("100000");
		this.jTextFieldQuoteAmount.setCaretColor(new java.awt.Color(125, 125, 125));

		this.jButtonRun.setForeground(new java.awt.Color(0, 0, 255));
		this.jButtonRun.setText("Run");
		this.jButtonRun.addActionListener(evt -> frame_editorbearcodetraderbot.this.jButtonRunActionPerformed(evt));

		this.jCheckBoxAutoTrade.setBackground(new java.awt.Color(55, 55, 55));
		this.jCheckBoxAutoTrade.setForeground(new java.awt.Color(255, 255, 255));
		this.jCheckBoxAutoTrade.setSelected(true);
		this.jCheckBoxAutoTrade.setText("Auto Trade");

		this.jPanelChooseDataSimulator.setBackground(new java.awt.Color(35, 35, 35));

		this.jComboBoxPeriodoSimbolo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No options" }));

		this.jLabelPeriodoSimbolo.setForeground(new java.awt.Color(255, 255, 255));
		this.jLabelPeriodoSimbolo.setText("Period:");

		this.jTextFieldNomeSimbolo.setBackground(new java.awt.Color(125, 125, 125));
		this.jTextFieldNomeSimbolo.setForeground(new java.awt.Color(255, 255, 255));
		this.jTextFieldNomeSimbolo
				.addCaretListener(evt -> frame_editorbearcodetraderbot.this.jTextFieldNomeSimboloCaretUpdate(evt));

		this.jLabelNomeSimbolo.setForeground(new java.awt.Color(255, 255, 255));
		this.jLabelNomeSimbolo.setText("Symbol:");

		this.jLabelCandlesDataStatus.setForeground(new java.awt.Color(255, 255, 255));
		this.jLabelCandlesDataStatus.setText("Current Data:");

		this.jButtonRecarregarCandlesData.setText("Load Data");
		this.jButtonRecarregarCandlesData.addActionListener(evt -> {
			try {
				frame_editorbearcodetraderbot.this.jButtonRecarregarCandlesDataActionPerformed(evt);
			} catch (final IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		final javax.swing.GroupLayout jPanelChooseDataSimulatorLayout = new javax.swing.GroupLayout(
				this.jPanelChooseDataSimulator);
		this.jPanelChooseDataSimulator.setLayout(jPanelChooseDataSimulatorLayout);
		jPanelChooseDataSimulatorLayout.setHorizontalGroup(
				jPanelChooseDataSimulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChooseDataSimulatorLayout
								.createSequentialGroup().addContainerGap().addComponent(this.jLabelNomeSimbolo)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.jTextFieldNomeSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.jLabelPeriodoSimbolo)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.jComboBoxPeriodoSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 143,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.jButtonRecarregarCandlesData)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(this.jLabelCandlesDataStatus).addContainerGap()));
		jPanelChooseDataSimulatorLayout.setVerticalGroup(jPanelChooseDataSimulatorLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelChooseDataSimulatorLayout.createSequentialGroup().addContainerGap()
						.addGroup(jPanelChooseDataSimulatorLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabelNomeSimbolo)
								.addComponent(this.jTextFieldNomeSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jLabelPeriodoSimbolo)
								.addComponent(this.jComboBoxPeriodoSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jLabelCandlesDataStatus)
								.addComponent(this.jButtonRecarregarCandlesData))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		this.jComboBoxMinInterval.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(unavailable)" }));

		this.jComboBoxMaxInterval.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(unavailable)" }));

		this.jLabelBuyFee1.setForeground(new java.awt.Color(255, 255, 255));
		this.jLabelBuyFee1.setText("Interval:");

		final javax.swing.GroupLayout jPanelEditorHolderLayout = new javax.swing.GroupLayout(this.jPanelEditorHolder);
		this.jPanelEditorHolder.setLayout(jPanelEditorHolderLayout);
		jPanelEditorHolderLayout.setHorizontalGroup(jPanelEditorHolderLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));
		jPanelEditorHolderLayout.setVerticalGroup(jPanelEditorHolderLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));

		final javax.swing.GroupLayout jPanelPaiLayout = new javax.swing.GroupLayout(this.jPanelPai);
		this.jPanelPai.setLayout(jPanelPaiLayout);
		jPanelPaiLayout.setHorizontalGroup(jPanelPaiLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanelChooseDataSimulator, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(jPanelPaiLayout.createSequentialGroup().addContainerGap()
						.addGroup(jPanelPaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(this.jScrollPane2)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanelPaiLayout.createSequentialGroup().addComponent(this.jButtonResetEditor)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(this.jButtonLoadFile)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jButtonSaveFile))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaiLayout
										.createSequentialGroup().addComponent(this.jLabelParameters)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jTextFieldParameters))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaiLayout
										.createSequentialGroup().addGap(0, 91, Short.MAX_VALUE)
										.addGroup(jPanelPaiLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaiLayout
														.createSequentialGroup().addComponent(this.jLabelBuyFee1)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jComboBoxMinInterval,
																javax.swing.GroupLayout.PREFERRED_SIZE, 150,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jComboBoxMaxInterval,
																javax.swing.GroupLayout.PREFERRED_SIZE, 175,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jCheckBoxAutoTrade)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(this.jButtonRun))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaiLayout
														.createSequentialGroup().addComponent(this.jLabelBuyFee)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jTextFieldBuyFee,
																javax.swing.GroupLayout.PREFERRED_SIZE, 63,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(12, 12, 12).addComponent(this.jLabelSellFee)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jTextFieldSellFee,
																javax.swing.GroupLayout.PREFERRED_SIZE, 63,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(this.jLabelBaseAmount)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jTextFieldBaseAmount,
																javax.swing.GroupLayout.PREFERRED_SIZE, 88,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(this.jLabelQuoteAmount)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jTextFieldQuoteAmount,
																javax.swing.GroupLayout.PREFERRED_SIZE, 110,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(jPanelPaiLayout.createSequentialGroup()
										.addGroup(jPanelPaiLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(this.jLabelScript).addComponent(this.jLabelOutput))
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaiLayout
										.createSequentialGroup()
										.addComponent(this.jPanelEditorHolder, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jLabelTestParameters3)))
						.addContainerGap()));
		jPanelPaiLayout.setVerticalGroup(jPanelPaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelPaiLayout.createSequentialGroup()
						.addComponent(this.jPanelChooseDataSimulator, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(this.jLabelScript)
						.addGroup(jPanelPaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanelPaiLayout.createSequentialGroup().addGap(195, 195, 195)
										.addComponent(this.jLabelTestParameters3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95,
												Short.MAX_VALUE))
								.addGroup(jPanelPaiLayout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jPanelEditorHolder, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
						.addGroup(jPanelPaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabelParameters)
								.addComponent(this.jTextFieldParameters, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(8, 8, 8)
						.addGroup(jPanelPaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabelBuyFee).addComponent(this.jLabelSellFee)
								.addComponent(this.jTextFieldSellFee, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jTextFieldBuyFee, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jTextFieldBaseAmount, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jLabelBaseAmount)
								.addComponent(this.jTextFieldQuoteAmount, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jLabelQuoteAmount))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanelPaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(this.jButtonRun).addComponent(this.jCheckBoxAutoTrade)
								.addComponent(this.jComboBoxMinInterval, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jComboBoxMaxInterval, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jLabelBuyFee1))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(this.jLabelOutput)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(this.jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanelPaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(this.jButtonSaveFile).addComponent(this.jButtonLoadFile)
								.addComponent(this.jButtonResetEditor))
						.addContainerGap()));

		final javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
		this.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jPanelPai,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jPanelPai,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		this.pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonLoadFileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonLoadFileActionPerformed
		this.carregararquivobcodeedicao();
	}// GEN-LAST:event_jButtonLoadFileActionPerformed

	private void jButtonRecarregarCandlesDataActionPerformed(java.awt.event.ActionEvent evt) throws IOException// GEN-FIRST:event_jButtonRecarregarCandlesDataActionPerformed
	{// GEN-HEADEREND:event_jButtonRecarregarCandlesDataActionPerformed
		this.atualizardadoscandlessimulador();
	}// GEN-LAST:event_jButtonRecarregarCandlesDataActionPerformed

	private void jButtonResetEditorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonResetEditorActionPerformed
		this.resetarcamposeditor();
	}// GEN-LAST:event_jButtonResetEditorActionPerformed

	private void jButtonRunActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_jButtonRunActionPerformed
	{// GEN-HEADEREND:event_jButtonRunActionPerformed
		this.rodarsimulacao();
		this.atualizarinformacoes_offlinetrader_para_editor();
	}// GEN-LAST:event_jButtonRunActionPerformed

	private void jButtonSaveFileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSaveFileActionPerformed
		this.salvararquivobcodeedicao();
	}// GEN-LAST:event_jButtonSaveFileActionPerformed

	private void jTextFieldBuyFeeActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_jTextFieldBuyFeeActionPerformed
	{// GEN-HEADEREND:event_jTextFieldBuyFeeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldBuyFeeActionPerformed

	private void jTextFieldNomeSimboloCaretUpdate(javax.swing.event.CaretEvent evt)// GEN-FIRST:event_jTextFieldNomeSimboloCaretUpdate
	{// GEN-HEADEREND:event_jTextFieldNomeSimboloCaretUpdate
		this.atualizaropcoescomboboxperiodo();
	}// GEN-LAST:event_jTextFieldNomeSimboloCaretUpdate
		// <editor-fold defaultstate="collapsed" desc="Funcoes Helper">

	void resetarcamposeditor() {
		// recriar offline trader
		this.otrader.recriarofflinetrader("testdata");
		// setar alguns valores default para o otrader
		this.otrader.feecompra = 0.001;
		this.otrader.feevenda = 0.001;
		this.otrader.quantidademoedabase = 0;
		this.otrader.quantidademoedacotacao = 100000;

		// funcao para resetar script editor e associar os valores do offline trader com
		// a gui
		final String scriptdefault = "//bearcode trader bot sample\n" + "runoutput.print(\"sample code\");\n" + "\n"
				+ "//sample candles for processing (data at /outfiles/samples/apple5y.json)\n"
				+ "var candlesinput = candles;\n" + "\n" + "//sample values for funds in base and quote currency\n"
				+ "var baseamountinput = basefunds;\n" + "var quoteamountinput = quotefunds;\n"
				+ "var bidinput = lastbid;\n" + "var askinput = lastask;\n" + "var buyfeeinput = buyfee;\n"
				+ "var sellfeeinput = sellfee;\n" + "\n" + "//parameters expected for processing\n"
				+ "//var periodinput = parseInt(period);\n" + "\n" + "/*\n" + "(PROCESSING CODE)\n"
				+ "available properties for candles: \n" + "var timestamp_string = candlesinput[0].timestampstr;\n"
				+ "var open_string = candlesinput[0].openstr;\n" + "var high_string = candlesinput[0].highstr;\n"
				+ "var close_string = candlesinput[0].closestr;\n" + "var low_string = candlesinput[0].lowstr;\n"
				+ "var volume_string = candlesinput[0].volumestr;\n" + "var open_number = candlesinput[0].opend;\n"
				+ "var high_number = candlesinput[0].highd;\n" + "var close_number = candlesinput[0].closed;\n"
				+ "var low_number = candlesinput[0].lowd;\n" + "var volume_number = candlesinput[0].volumed;\n"
				+ "var timestamp_date = candlesinput[0].timestampdate; \n" + "*/\n" + "\n"
				+ "//example of return values for the script if decision is to buy 60 base currency\n"
				+ "var tradermove = \"buyamount\"; //buy amount of base currency\n"
				+ "var amountbase = [60]; //60 is the amount to buy\n"
				+ "var supportamount = Java.to(amountbase,\"double[]\");";

		this.rsTextArea.setText(scriptdefault);
		this.rsTextArea.setCaretPosition(0);
		this.jTextAreaOutput.setText("");
		this.jTextAreaOutput.setCaretPosition(0);
		this.jTextFieldParameters.setText("");

		// atualizar informacoes relacionadas ao status atual do trader com a gui
		this.atualizarinformacoes_offlinetrader_para_editor();
	}

	String retornarstringposicaocaret() {
		try {
			int linenum = 1;
			int columnnum = 1;

			final int caretpos = this.rsTextArea.getCaretPosition();
			linenum = this.rsTextArea.getLineOfOffset(caretpos);

			columnnum = (caretpos - this.rsTextArea.getLineStartOffset(linenum)) + 1;

			linenum += 1;

			return "(" + linenum + ":" + columnnum + ")";
		} catch (final Exception ex) {
			return "";
		}
	}

	String retornartimestampcsv(java.util.Date timestampDate) {
		final String timestampstring = (timestampDate.getYear() + 1900) + "-" + (timestampDate.getMonth() + 1) + "-"
				+ timestampDate.getDate() + "-" + timestampDate.getHours() + "-" + timestampDate.getMinutes() + "-"
				+ timestampDate.getSeconds();

		return timestampstring;
	}

	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="Rodar Script / Simulador / Export
	// CSV">
	String rodarautotrade(String tradermove, String supportamount) {
		// mierclasses.mcfuncoeshelper.mostrarmensagem(tradermove + " " +
		// supportamount);
		String statustrade = "erro - desconhecido";

		if (tradermove.equals("hold")) {
			// significa que nada deve ser feito
			statustrade = "ok";
		} else if (tradermove.equals("buyall")) {
			statustrade = this.otrader.realizarcompratudo_basecotacao();
		} else if (tradermove.equals("sellall")) {
			statustrade = this.otrader.realizarvendatudo_basecotacao();
		} else if (tradermove.equals("buyamount")) {
			statustrade = this.otrader.realizarcompra_basecotacao(Double.valueOf(supportamount));
		} else if (tradermove.equals("sellamount")) {
			statustrade = this.otrader.realizarvenda_basecotacao(Double.valueOf(supportamount));
		}

		return statustrade;
	}

	void rodarsimulacao() {
		// esta funcao pega as informacoes inputadas pelo usuario, e roda de acordo com
		// o intervalo de simulacao
		// once|all -> rodar o script uma unica vez com todas as candles
		// multiple|5-7 -> rodar o script 3 vezes, utilizando desde um subset das
		// candles[0-5] ate candles[0-7]

		// atualizar informacoes do trader com os campos do editor antes de iniciar
		// simulacao
		this.atualizarinformacoes_editor_para_offlinetrader();

		String csvResultado = ""; // arquivo que sera exportado

		// comecar criando o header do csv
		csvResultado = csvResultado
				+ "First Timestamp (YYYY-MM-DD-HH-mm-ss);Last Timestamp (YYYY-MM-DD-HH-mm-ss);Last Close;Simulated Last Bid;Simulated Last Ask;Decision Now;Support Amount to Decision;Base Amount After Trade;Quote Amount After Trade;Total After Trade;Auto Trader Log;Debug Export";

		this.jTextAreaOutput.setText("");

		final String minescolhido = this.jComboBoxMinInterval.getSelectedItem().toString();
		final String maxescolhido = this.jComboBoxMaxInterval.getSelectedItem().toString();
		final Integer numerominimo_sim = Integer.valueOf(((minescolhido.split("\\(")[1]).split("\\)"))[0]);
		final Integer numeromaximo_sim = Integer.valueOf(((maxescolhido.split("\\(")[1]).split("\\)"))[0]);

		final Integer numero_de_simulacoes = (numeromaximo_sim - numerominimo_sim) + 1;

		// rodar o algoritmo de simulacao varias vezes
		for (int i = 0; i < numero_de_simulacoes; i++) {
			final Integer subsetmax_indice = i + numerominimo_sim;

			if (i == 0) {
				this.jTextAreaOutput.setText("Simulation Interval [0 to " + subsetmax_indice + "]");
			} else {
				this.jTextAreaOutput.append("\n\nSimulation Interval [0 to " + subsetmax_indice + "]");
			}

			// atualizar o subset de candles utilizado pela simulacao (neste caso o subset
			// eh igual a todas as candles)
			// subList eh inclusive 0 e exclusive subsetmax_indice + 1
			this.candlessimulacao = this.candlessample.subList(0, subsetmax_indice + 1);

			// atualizar bid ask antes de rodar script
			this.otrader.atualizarbidask();

			// repopular parametros e codigo do script
			this.mcbctraderbot.atualizarscriptparametros(this.rsTextArea.getText(),
					this.jTextFieldParameters.getText());
			// rodar script
			final String result = this.mcbctraderbot.rodarscript(this.candlessimulacao,
					this.otrader.quantidademoedabase, this.otrader.quantidademoedacotacao, this.otrader.melhorbid,
					this.otrader.melhorask, this.otrader.feecompra, this.otrader.feevenda, true, this.mcjtah);

			String ultimo_logtrade = "nao ativo";
			if (result.equals("ok")) {
				this.mcjtah.print("\n======\nOK");

				if (this.jCheckBoxAutoTrade.isSelected() == true) {
					final String traderbot_move = (String) this.mcbctraderbot.respostatradermove_lastrun;
					final String traderbot_supportamount = String
							.valueOf(((double[]) this.mcbctraderbot.respostaquantidadesuporte_lastrun)[0]);
					ultimo_logtrade = this.rodarautotrade(traderbot_move, traderbot_supportamount);
				}
			} else {
				this.mcjtah.print("\n======\n" + "Exception: " + result);

				// se algum dos processos apresentar excecao, sair da simulacao
				return;
			}

			final String primeiro_ts = this.retornartimestampcsv(this.candlessimulacao.get(0).timestampdate);
			final String ultimo_ts = this
					.retornartimestampcsv(this.candlessimulacao.get(this.candlessimulacao.size() - 1).timestampdate);
			final String ultimo_close = String
					.valueOf(this.candlessimulacao.get(this.candlessimulacao.size() - 1).closed);
			final String ultimo_bid = String.valueOf(this.otrader.melhorbid);
			final String ultimo_ask = String.valueOf(this.otrader.melhorask);
			final String traderbot_move = (String) this.mcbctraderbot.respostatradermove_lastrun;
			final String traderbot_supportamount = String
					.valueOf(((double[]) this.mcbctraderbot.respostaquantidadesuporte_lastrun)[0]);
			final String traderbot_debugexport = (String) this.mcbctraderbot.debugexport_lastrun; // variavel de suporte
																									// para print
			// custom de interesse de script
			final String postrade_baseamount = String.valueOf(this.otrader.quantidademoedabase);
			final String postrade_quoteamount = String.valueOf(this.otrader.quantidademoedacotacao);
			final String postrade_total = String.valueOf(this.otrader.totalfundos_moedacotacao());
			csvResultado = csvResultado + "\n" + primeiro_ts + ";" + ultimo_ts + ";" + ultimo_close + ";" + ultimo_bid
					+ ";" + ultimo_ask + ";" + traderbot_move + ";" + traderbot_supportamount + ";"
					+ postrade_baseamount + ";" + postrade_quoteamount + ";" + postrade_total + ";" + ultimo_logtrade
					+ ";" + traderbot_debugexport;
		}

		// apos rodar a simulacao, abrir frame_resultadosbearcodetraderbot para mostrar
		// resultados da simulacao do editor em tabela,
		// mostrar uma opcao para exportar dados do csv, e mostrar um grafico de closes
		// e decisao do robo
		final frame_resultadosbearcodetraderbot frbctb = new frame_resultadosbearcodetraderbot(csvResultado);
		frbctb.setVisible(true);

	}

	// <editor-fold defaultstate="collapsed" desc="Carregar e Salvar Script">
	void salvararquivobcodeedicao() {
		try {
			final javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
			final String pastascriptsbot = new File(
					this.getClass().getClassLoader().getResource("bearcode/traderbots").getFile()).getAbsolutePath();

			fileChooser.setCurrentDirectory(new java.io.File(pastascriptsbot));
			final javax.swing.filechooser.FileFilter filter = new communication.mcextensionfilefilter("Bearcode File",
					new String[] { "bearcode" });
			fileChooser.setFileFilter(filter);
			fileChooser.setDialogTitle("Please choose a location and name for the Open Stock save file");

			final int userSelection = fileChooser.showSaveDialog(this);

			if (userSelection == javax.swing.JFileChooser.APPROVE_OPTION) {
				final java.io.File fileToSave = fileChooser.getSelectedFile();

				final java.io.PrintWriter writer = new java.io.PrintWriter(fileToSave + ".bearcode", "UTF-8");
				writer.println(this.rsTextArea.getText());
				writer.close();

				communication.mcfuncoeshelper.mostrarmensagem("Bearcode saved.");
			}
		} catch (final Exception ex) {
			communication.mcfuncoeshelper
					.mostrarmensagem("A problem occurred when saving. Exception: " + ex.getMessage());
		}
	}
}