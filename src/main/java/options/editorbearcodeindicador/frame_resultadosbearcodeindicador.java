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
package options.editorbearcodeindicador;

import org.jfree.chart.ui.TextAnchor;

import java.awt.BasicStroke;
import java.awt.Color;

/**
 *
 * @author meyerlu
 */

public class frame_resultadosbearcodeindicador extends javax.swing.JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = -2484763404686312382L;
	static communication.mcbcindicatorinterpreter mcbciip;

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
			java.util.logging.Logger.getLogger(frame_resultadosbearcodeindicador.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (final InstantiationException ex) {
			java.util.logging.Logger.getLogger(frame_resultadosbearcodeindicador.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (final IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frame_resultadosbearcodeindicador.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (final javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frame_resultadosbearcodeindicador.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> new frame_resultadosbearcodeindicador(mcbciip).setVisible(true));
	}

	org.jfree.chart.ChartPanel chartpanelseparado = null;
	// <editor-fold defaultstate="collapsed" desc="Adicionando Crosshair a este
	// grafico">
	java.util.List<org.jfree.chart.annotations.XYAnnotation> crosshair_preview;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel jPanelChartResults;
	private javax.swing.JPanel jPanelPai;
	// End of variables declaration//GEN-END:variables

	/**
	 * Creates new form frame_resultadosbearcodetraderbot
	 */
	public frame_resultadosbearcodeindicador(communication.mcbcindicatorinterpreter mcbcii) {
		this.initComponents();

		mcbciip = mcbcii;

		this.criargraficoindicador(mcbciip.pontosx_lastrun, mcbciip.pontosy_lastrun, mcbciip.tituloscript_lastrun,
				mcbciip.tipoplot_lastrun);
		this.jPanelChartResults.removeAll();
		this.jPanelChartResults.setLayout(new java.awt.BorderLayout());
		this.jPanelChartResults.add(this.chartpanelseparado);
		// tirar cursor do chart
		final java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
		final byte bogus[] = { (byte) 0 };
		final java.awt.Cursor blankCursor = tk.createCustomCursor(tk.createImage(bogus), new java.awt.Point(0, 0), "");
		this.jPanelChartResults.setCursor(blankCursor);

		this.validate();
	}

	// </editor-fold>

	public java.util.List<org.jfree.chart.annotations.XYAnnotation> adicionarplotohlc_anotacaofixacrosshair(
			org.jfree.chart.ChartMouseEvent cmevent) {

		// atualizar range e posicao atual do grafico
		final java.awt.geom.Point2D p = this.chartpanelseparado
				.translateScreenToJava2D(cmevent.getTrigger().getPoint());
		final java.awt.geom.Rectangle2D plotArea = this.chartpanelseparado.getChartRenderingInfo().getPlotInfo()
				.getDataArea();
		final org.jfree.chart.plot.XYPlot plot = (org.jfree.chart.plot.XYPlot) this.chartpanelseparado.getChart()
				.getPlot(); // your plot
		final double mcg_posmousex = plot.getDomainAxis().java2DToValue(p.getX(), plotArea, plot.getDomainAxisEdge());
		final double mcg_posmousey = plot.getRangeAxis().java2DToValue(p.getY(), plotArea, plot.getRangeAxisEdge());
		final org.jfree.data.Range mcg_rangex = plot.getDomainAxis().getRange();
		final org.jfree.data.Range mcg_rangey = plot.getRangeAxis().getRange();

		// ponto central do crosshair
		final double centrocrosshair_x = mcg_posmousex;
		final double centrocrosshair_y = mcg_posmousey;

		// criando linha horizontal cinza
		final double lh_p1_x = mcg_rangex.getLowerBound();
		final double lh_p1_y = centrocrosshair_y;
		final double lh_p2_x = mcg_rangex.getUpperBound();
		final double lh_p2_y = centrocrosshair_y;
		final org.jfree.chart.annotations.XYLineAnnotation xylh = new org.jfree.chart.annotations.XYLineAnnotation(
				lh_p1_x, lh_p1_y, lh_p2_x, lh_p2_y, new BasicStroke(0.4f), Color.BLUE);

		// criando linha vertical cinza
		final double lv_p1_x = centrocrosshair_x;
		final double lv_p1_y = mcg_rangey.getUpperBound();
		final double lv_p2_x = centrocrosshair_x;
		final double lv_p2_y = mcg_rangey.getLowerBound();
		final org.jfree.chart.annotations.XYLineAnnotation xylv = new org.jfree.chart.annotations.XYLineAnnotation(
				lv_p1_x, lv_p1_y, lv_p2_x, lv_p2_y, new BasicStroke(0.4f), Color.BLUE);

		// texto preco
		final String textopreco = String.format("%.4f", mcg_posmousey);
		final org.jfree.chart.annotations.XYTextAnnotation xytextopreco = new org.jfree.chart.annotations.XYTextAnnotation(
				textopreco, lh_p1_x, centrocrosshair_y);
		xytextopreco.setTextAnchor(TextAnchor.TOP_LEFT);

		// texto data
		final String datacrosshair = new java.util.Date((long) mcg_posmousex).toString();
		final String textodata = datacrosshair;
		final org.jfree.chart.annotations.XYTextAnnotation xytextodata = new org.jfree.chart.annotations.XYTextAnnotation(
				textodata, centrocrosshair_x, lv_p2_y);
		xytextodata.setTextAnchor(TextAnchor.BOTTOM_LEFT);

		plot.addAnnotation(xylh);
		plot.addAnnotation(xylv);
		plot.addAnnotation(xytextopreco);
		plot.addAnnotation(xytextodata);

		final java.util.List<org.jfree.chart.annotations.XYAnnotation> subannotations = new java.util.ArrayList<>();
		subannotations.add(xylh);
		subannotations.add(xylv);
		subannotations.add(xytextopreco);
		subannotations.add(xytextodata);

		return subannotations;
	}

	void criargraficoindicador(Object xvalues, Object yvalues, String tituloscript, String desenhografico) {

		if (desenhografico.equals("drawoncandles")) {
			// interpretar valores de x como double, e de y como date
			final double[] yvalues_double = (double[]) yvalues;
			final java.util.Date[] xvalues_date = (java.util.Date[]) xvalues;

			// criar timeseries com os dados
			final org.jfree.data.time.TimeSeries seriesadd = new org.jfree.data.time.TimeSeries(tituloscript);
			for (int i = 0; i < yvalues_double.length; i++) {

				final org.jfree.data.time.Millisecond millisegundoatual = new org.jfree.data.time.Millisecond(
						xvalues_date[i]);

				final double valoratual = yvalues_double[i];

				seriesadd.add(millisegundoatual, valoratual);
			}

			// criar dataset e associar timeseries ao dataset
			final org.jfree.data.time.TimeSeriesCollection datasettimeseries = new org.jfree.data.time.TimeSeriesCollection();
			datasettimeseries.addSeries(seriesadd);

			// criar renderer
			final org.jfree.chart.renderer.xy.XYLineAndShapeRenderer renderer = new org.jfree.chart.renderer.xy.DefaultXYItemRenderer();
			renderer.setDefaultShapesVisible(false);
			renderer.setSeriesStroke(0, new BasicStroke(0.75f));
			renderer.setSeriesPaint(0, Color.BLACK);

			// criar ranges
			final org.jfree.chart.axis.DateAxis domainAxis = new org.jfree.chart.axis.DateAxis("");
			final org.jfree.chart.axis.NumberAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("");

			// criar xyplot e associar dataset e renderer ao xyplot
			final org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(datasettimeseries, domainAxis,
					rangeAxis, renderer);
			plot.setDataset(datasettimeseries);
			plot.setRenderer(renderer);

			// criar chart
			final org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(tituloscript.toUpperCase(), null,
					plot, false);

			// criar chartpanel
			this.chartpanelseparado = new org.jfree.chart.ChartPanel(chart);
			this.chartpanelseparado.addChartMouseListener(new org.jfree.chart.ChartMouseListener() {
				@Override
				public void chartMouseClicked(org.jfree.chart.ChartMouseEvent e) {
				}

				@Override
				public void chartMouseMoved(org.jfree.chart.ChartMouseEvent e) {
					frame_resultadosbearcodeindicador.this.executaranotacaofixa_crosshair_mmove(e);
				}
			});

		} else if (desenhografico.equals("drawseparateline")) {
			// interpretar valores de x como double, e de y como date
			final double[] yvalues_double = (double[]) yvalues;
			final java.util.Date[] xvalues_date = (java.util.Date[]) xvalues;

			// criar timeseries com os dados
			final org.jfree.data.time.TimeSeries seriesadd = new org.jfree.data.time.TimeSeries(tituloscript);
			for (int i = 0; i < yvalues_double.length; i++) {

				final org.jfree.data.time.Millisecond millisegundoatual = new org.jfree.data.time.Millisecond(
						xvalues_date[i]);

				final double valoratual = yvalues_double[i];

				seriesadd.add(millisegundoatual, valoratual);
			}

			// criar dataset e associar timeseries ao dataset
			final org.jfree.data.time.TimeSeriesCollection datasettimeseries = new org.jfree.data.time.TimeSeriesCollection();
			datasettimeseries.addSeries(seriesadd);

			// criar renderer
			final org.jfree.chart.renderer.xy.XYLineAndShapeRenderer renderer = new org.jfree.chart.renderer.xy.DefaultXYItemRenderer();
			renderer.setDefaultShapesVisible(false);
			renderer.setDefaultStroke(new BasicStroke(2.0f));

			// criar ranges
			final org.jfree.chart.axis.DateAxis domainAxis = new org.jfree.chart.axis.DateAxis("");
			final org.jfree.chart.axis.NumberAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("");

			// criar xyplot e associar dataset e renderer ao xyplot
			final org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(datasettimeseries, domainAxis,
					rangeAxis, renderer);
			plot.setDataset(datasettimeseries);
			plot.setRenderer(renderer);

			// criar chart
			final org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(tituloscript.toUpperCase(), null,
					plot, false);

			// criar chartpanel
			this.chartpanelseparado = new org.jfree.chart.ChartPanel(chart);
			this.chartpanelseparado.addChartMouseListener(new org.jfree.chart.ChartMouseListener() {
				@Override
				public void chartMouseClicked(org.jfree.chart.ChartMouseEvent e) {
				}

				@Override
				public void chartMouseMoved(org.jfree.chart.ChartMouseEvent e) {
					frame_resultadosbearcodeindicador.this.executaranotacaofixa_crosshair_mmove(e);
				}
			});

		} else if (desenhografico.equals("drawseparatebar")) {
			// interpretar valores de x como double, e de y como date
			final double[] yvalues_double = (double[]) yvalues;
			final java.util.Date[] xvalues_date = (java.util.Date[]) xvalues;

			// criar timeseries com os dados
			final org.jfree.data.time.TimeSeries seriesadd = new org.jfree.data.time.TimeSeries(tituloscript);
			for (int i = 0; i < yvalues_double.length; i++) {

				final org.jfree.data.time.Millisecond millisegundoatual = new org.jfree.data.time.Millisecond(
						xvalues_date[i]);

				final double valoratual = yvalues_double[i];

				seriesadd.add(millisegundoatual, valoratual);
			}

			// criar dataset e associar timeseries ao dataset
			final org.jfree.data.time.TimeSeriesCollection datasettimeseries = new org.jfree.data.time.TimeSeriesCollection();
			datasettimeseries.addSeries(seriesadd);

			// criar renderer
			final org.jfree.chart.renderer.xy.XYBarRenderer renderer = new org.jfree.chart.renderer.xy.XYBarRenderer();
			renderer.setDrawBarOutline(true);
			renderer.setDefaultStroke(new BasicStroke(10.0f));

			// criar ranges
			final org.jfree.chart.axis.DateAxis domainAxis = new org.jfree.chart.axis.DateAxis("");
			final org.jfree.chart.axis.NumberAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("");

			// criar xyplot e associar dataset e renderer ao xyplot
			final org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(datasettimeseries, domainAxis,
					rangeAxis, renderer);
			plot.setDataset(datasettimeseries);
			plot.setRenderer(renderer);

			// criar chart
			final org.jfree.chart.JFreeChart chartseparado = new org.jfree.chart.JFreeChart(tituloscript.toUpperCase(),
					null, plot, false);

			// criar chartpanel
			this.chartpanelseparado = new org.jfree.chart.ChartPanel(chartseparado);
			this.chartpanelseparado.addChartMouseListener(new org.jfree.chart.ChartMouseListener() {
				@Override
				public void chartMouseClicked(org.jfree.chart.ChartMouseEvent e) {
				}

				@Override
				public void chartMouseMoved(org.jfree.chart.ChartMouseEvent e) {
					frame_resultadosbearcodeindicador.this.executaranotacaofixa_crosshair_mmove(e);
				}
			});
		}
	}

	void executaranotacaofixa_crosshair_mmove(org.jfree.chart.ChartMouseEvent cmevent) {
		try {
			final org.jfree.chart.plot.XYPlot plotatual = (org.jfree.chart.plot.XYPlot) this.chartpanelseparado
					.getChart().getPlot();

			for (int i = 0; i < this.crosshair_preview.size(); i++) {
				plotatual.removeAnnotation(this.crosshair_preview.get(i));
			}
		} catch (final Exception ex) {
		}

		this.crosshair_preview = this.adicionarplotohlc_anotacaofixacrosshair(cmevent);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		this.jPanelPai = new javax.swing.JPanel();
		this.jPanelChartResults = new javax.swing.JPanel();

		this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		this.setTitle("Indicator Editor Results");

		this.jPanelPai.setBackground(new java.awt.Color(55, 55, 55));

		final javax.swing.GroupLayout jPanelChartResultsLayout = new javax.swing.GroupLayout(this.jPanelChartResults);
		this.jPanelChartResults.setLayout(jPanelChartResultsLayout);
		jPanelChartResultsLayout.setHorizontalGroup(jPanelChartResultsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 551, Short.MAX_VALUE));
		jPanelChartResultsLayout.setVerticalGroup(jPanelChartResultsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 392, Short.MAX_VALUE));

		final javax.swing.GroupLayout jPanelPaiLayout = new javax.swing.GroupLayout(this.jPanelPai);
		this.jPanelPai.setLayout(jPanelPaiLayout);
		jPanelPaiLayout
				.setHorizontalGroup(
						jPanelPaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanelPaiLayout.createSequentialGroup().addContainerGap()
										.addComponent(this.jPanelChartResults, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));
		jPanelPaiLayout
				.setVerticalGroup(
						jPanelPaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanelPaiLayout.createSequentialGroup().addContainerGap()
										.addComponent(this.jPanelChartResults, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
}
