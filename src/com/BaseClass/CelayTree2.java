package com.BaseClass;

import java.awt.*;

public class CelayTree2 {

	public static void main( String []args ){
		Frame frm = new Frame("CelayTree");
		frm.setSize( 400, 400 );
		frm.setBackground( Color.lightGray );
		frm.show();
		CelayTree2 p = new CelayTree2( frm );
		p.drawCelayTree( 10, 200, 400, 100, -Math.PI/2 );
	}
	private Frame frm;
	private Graphics graphics;
	private int width;
	private int height;
	private final double PI = Math.PI;
	private final double th1 = 30 * PI / 180;
	private final double th2 = 20 * PI / 180;
	private final double per = 0.7;
	private final double per1 = 0.7;
	private final double per2 = 0.6;

	public CelayTree2(Frame frm){
		graphics = frm.getGraphics();
		width = frm.getSize().width;
		height = frm.getSize().height;
	}
	

	void drawCelayTree(int n, 
			double x0, double y0, double leng, double th)
	{
		if( n==0 ) return;

		double x1 = x0 + leng * Math.cos(th);
		double y1 = y0 + leng * Math.sin(th);
		
		drawLine(x0, y0, x1, y1);
		
		drawCelayTree( n - 1, x1, y1, per * leng, th + th1 );
		drawCelayTree( n - 1, x1, y1, per * leng, th - th2 );
	}
	void drawLine( double x0, double y0, double x1, double y1 ){
		graphics.drawLine( (int)x0, (int)y0, (int)x1, (int)y1 );
	}
}
