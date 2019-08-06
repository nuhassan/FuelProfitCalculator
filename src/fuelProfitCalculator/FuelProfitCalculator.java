package fuelProfitCalculator;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FuelProfitCalculator {

	private JFrame frmFuelProfitCalculator;
	private JTextField uVol;
	private JTextField pVol;
	private JTextField sVol;
	private JTextField dVol;
	private JTextField uAmt;
	private JTextField pAmt;
	private JTextField sAmt;
	private JTextField dAmt;
	private JTextField uCost;
	private JTextField pCost;
	private JTextField sCost;
	private JTextField dCost;
	private JLabel uProf;
	private JLabel pProf;
	private JLabel sProf;
	private JLabel dProf;
	private JLabel ttlProf;
	private JLabel ttlAmt;
	private JLabel ttlVol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuelProfitCalculator window = new FuelProfitCalculator();
					window.frmFuelProfitCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	/**
	 * Create the application.
	 */
	public FuelProfitCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFuelProfitCalculator = new JFrame();
		frmFuelProfitCalculator.setTitle("Fuel Profit Calculator");
		frmFuelProfitCalculator.setBounds(100, 100, 990, 540);
		frmFuelProfitCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFuelProfitCalculator.getContentPane().setLayout(null);

		JLabel lblVolume = new JLabel("Volume");
		lblVolume.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVolume.setHorizontalAlignment(SwingConstants.CENTER);
		lblVolume.setBounds(253, 30, 67, 25);
		frmFuelProfitCalculator.getContentPane().add(lblVolume);

		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAmount.setBounds(424, 30, 67, 25);
		frmFuelProfitCalculator.getContentPane().add(lblAmount);

		JLabel lblUnl = new JLabel("Unleaded");
		lblUnl.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUnl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUnl.setBounds(72, 96, 67, 25);
		frmFuelProfitCalculator.getContentPane().add(lblUnl);

		JLabel lblPlus = new JLabel("Plus");
		lblPlus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlus.setBounds(72, 162, 67, 25);
		frmFuelProfitCalculator.getContentPane().add(lblPlus);

		JLabel lblSuper = new JLabel("Super");
		lblSuper.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSuper.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSuper.setBounds(72, 253, 67, 25);
		frmFuelProfitCalculator.getContentPane().add(lblSuper);

		JLabel lblDiesel = new JLabel("Diesel");
		lblDiesel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiesel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDiesel.setBounds(72, 344, 67, 25);
		frmFuelProfitCalculator.getContentPane().add(lblDiesel);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setBounds(72, 435, 67, 25);
		frmFuelProfitCalculator.getContentPane().add(lblTotal);

		JLabel lblCost = new JLabel("Cost");
		lblCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblCost.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCost.setBounds(615, 30, 67, 25);
		frmFuelProfitCalculator.getContentPane().add(lblCost);

		uVol = new JTextField();
		uVol.setHorizontalAlignment(SwingConstants.TRAILING);
		uVol.setBounds(243, 101, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(uVol);
		uVol.setColumns(10);
		uVol.addFocusListener(new volFocusListener());

		pVol = new JTextField();
		pVol.setHorizontalAlignment(SwingConstants.TRAILING);
		pVol.setColumns(10);
		pVol.setBounds(243, 167, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(pVol);
		pVol.addFocusListener(new volFocusListener());

		sVol = new JTextField();
		sVol.setHorizontalAlignment(SwingConstants.TRAILING);
		sVol.setColumns(10);
		sVol.setBounds(243, 258, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(sVol);
		sVol.addFocusListener(new volFocusListener());

		dVol = new JTextField();
		dVol.setHorizontalAlignment(SwingConstants.TRAILING);
		dVol.setColumns(10);
		dVol.setBounds(243, 349, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(dVol);
		dVol.addFocusListener(new volFocusListener());

		uAmt = new JTextField();
		uAmt.setHorizontalAlignment(SwingConstants.TRAILING);
		uAmt.setColumns(10);
		uAmt.setBounds(412, 101, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(uAmt);
		uAmt.addFocusListener(new amtFocusListener());

		pAmt = new JTextField();
		pAmt.setHorizontalAlignment(SwingConstants.TRAILING);
		pAmt.setColumns(10);
		pAmt.setBounds(412, 167, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(pAmt);
		pAmt.addFocusListener(new amtFocusListener());

		sAmt = new JTextField();
		sAmt.setHorizontalAlignment(SwingConstants.TRAILING);
		sAmt.setColumns(10);
		sAmt.setBounds(412, 258, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(sAmt);
		sAmt.addFocusListener(new amtFocusListener());

		dAmt = new JTextField();
		dAmt.setHorizontalAlignment(SwingConstants.TRAILING);
		dAmt.setColumns(10);
		dAmt.setBounds(412, 349, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(dAmt);
		dAmt.addFocusListener(new amtFocusListener());

		JLabel lblProfit = new JLabel("Profit");
		lblProfit.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProfit.setBounds(799, 30, 67, 25);
		frmFuelProfitCalculator.getContentPane().add(lblProfit);

		uCost = new JTextField();
		uCost.setHorizontalAlignment(SwingConstants.TRAILING);
		uCost.setColumns(10);
		uCost.setBounds(605, 101, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(uCost);
		uCost.addFocusListener(new unlCostFocusListener());
		uCost.addFocusListener(new ttlProfitFocusListener());

		pCost = new JTextField();
		pCost.setHorizontalAlignment(SwingConstants.TRAILING);
		pCost.setColumns(10);
		pCost.setBounds(605, 167, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(pCost);
		pCost.addFocusListener(new plusCostFocusListener());
		pCost.addFocusListener(new ttlProfitFocusListener());

		sCost = new JTextField();
		sCost.setHorizontalAlignment(SwingConstants.TRAILING);
		sCost.setColumns(10);
		sCost.setBounds(605, 258, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(sCost);
		sCost.addFocusListener(new supCostFocusListener());
		sCost.addFocusListener(new ttlProfitFocusListener());

		dCost = new JTextField();
		dCost.setHorizontalAlignment(SwingConstants.TRAILING);
		dCost.setColumns(10);
		dCost.setBounds(605, 349, 96, 19);
		frmFuelProfitCalculator.getContentPane().add(dCost);
		dCost.addFocusListener(new dieCostFocusListener());
		dCost.addFocusListener(new ttlProfitFocusListener());
		
		uProf = new JLabel("");
		uProf.setHorizontalAlignment(SwingConstants.CENTER);
		uProf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		uProf.setBounds(799, 96, 72, 25);
		frmFuelProfitCalculator.getContentPane().add(uProf);

		pProf = new JLabel("      ");
		pProf.setHorizontalAlignment(SwingConstants.CENTER);
		pProf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pProf.setBounds(799, 162, 72, 25);
		frmFuelProfitCalculator.getContentPane().add(pProf);

		sProf = new JLabel("");
		sProf.setHorizontalAlignment(SwingConstants.CENTER);
		sProf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sProf.setBounds(799, 253, 72, 25);
		frmFuelProfitCalculator.getContentPane().add(sProf);

		dProf = new JLabel("");
		dProf.setHorizontalAlignment(SwingConstants.CENTER);
		dProf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dProf.setBounds(799, 344, 72, 25);
		frmFuelProfitCalculator.getContentPane().add(dProf);

		ttlProf = new JLabel("");
		ttlProf.setHorizontalAlignment(SwingConstants.CENTER);
		ttlProf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ttlProf.setBounds(799, 435, 72, 25);
		frmFuelProfitCalculator.getContentPane().add(ttlProf);

		ttlAmt = new JLabel("");
		ttlAmt.setHorizontalAlignment(SwingConstants.CENTER);
		ttlAmt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ttlAmt.setBounds(424, 435, 72, 25);
		frmFuelProfitCalculator.getContentPane().add(ttlAmt);

		ttlVol = new JLabel("");
		ttlVol.setHorizontalAlignment(SwingConstants.CENTER);
		ttlVol.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ttlVol.setBounds(253, 435, 72, 25);
		frmFuelProfitCalculator.getContentPane().add(ttlVol);
	}

	class volFocusListener implements FocusListener {

		public void focusGained(FocusEvent e) {

		}

		public void focusLost(FocusEvent e) {

			ttlVol.setText(getTotal(uVol.getText(), pVol.getText(), sVol.getText(), dVol.getText()));
		}
	}

	class amtFocusListener implements FocusListener {

		public void focusGained(FocusEvent e) {

		}

		public void focusLost(FocusEvent e) {

			ttlAmt.setText(getTotal(uAmt.getText(), pAmt.getText(), sAmt.getText(), dAmt.getText()));
		}
	}
	
	class unlCostFocusListener implements FocusListener {

		public void focusGained(FocusEvent e) {

		}

		public void focusLost(FocusEvent e) {

			uProf.setText(getProfit(uVol.getText(),uAmt.getText(),uCost.getText()));
		}
	}
	
	class plusCostFocusListener implements FocusListener {

		public void focusGained(FocusEvent e) {

		}

		public void focusLost(FocusEvent e) {

			pProf.setText(getProfit(pVol.getText(),pAmt.getText(),pCost.getText()));
		}
	}
	
	class supCostFocusListener implements FocusListener {

		public void focusGained(FocusEvent e) {

		}

		public void focusLost(FocusEvent e) {

			sProf.setText(getProfit(sVol.getText(),sAmt.getText(),sCost.getText()));
		}
	}
	
	class dieCostFocusListener implements FocusListener {

		public void focusGained(FocusEvent e) {

		}

		public void focusLost(FocusEvent e) {

			dProf.setText(getProfit(dVol.getText(),dAmt.getText(),dCost.getText()));
		}
	}
	
	class ttlProfitFocusListener implements FocusListener {

		public void focusGained(FocusEvent e) {

		}

		public void focusLost(FocusEvent e) {

			ttlProf.setText(getTotal(uProf.getText(), pProf.getText(), sProf.getText(), dProf.getText()));
		}
	}

	private String getTotal(String u, String p, String s, String d) {

		float total = 0;
		
		if(isNumeric(u)) {
			total = total + Float.parseFloat(u);
		}
		
		if(isNumeric(p)) {
			total = total + Float.parseFloat(p);
		}
		
		if(isNumeric(s)) {
			total = total + Float.parseFloat(s);
		}
		
		if(isNumeric(d)) {
			total = total + Float.parseFloat(d);
		}
		
		return total + "";
	}
	
	private static boolean isNumeric(String str)
	{
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	
	private static String getProfit(String vol,  String amt, String c) {
		
		if((isNumeric(vol) && isNumeric(amt) && isNumeric(c)) && (!vol.equals("0") || !amt.equals("0") || !c.equals("0"))) {
			
			float volume = Float.parseFloat(vol);
			float amount = Float.parseFloat(amt);
			float cost = Float.parseFloat(c);
			
			float price = amount / volume;
			float margin = price - cost;
			float profit = (float) ((margin * volume) * 0.75);
			return profit + "";
		}
		return "0";
	}
}
