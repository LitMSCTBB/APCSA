package Tree;



import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Canvas;

public class Tree extends Canvas
{
	public Tree()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		window.drawString("CVHS - Tree", 50, 50);
		
		tree(window); star(window); treeTrunk(window, 400, 530);
		
		smallGift(window, 330, 560, Color.RED);
		smallGift(window, 560, 560, Color.YELLOW);
		
		largeGift(window, 130, 500, Color.CYAN);
		largeGift(window, 650, 500, Color.MAGENTA);
		
		orn(window, 400, 360, Color.BLACK);
		orn(window, 400, 450, Color.BLUE);
		orn(window, 499, 360, Color.YELLOW);
		orn(window, 309, 310, Color.RED);
		orn(window, 511, 383, Color.YELLOW);
		orn(window, 245, 453, Color.PINK);
		orn(window, 444, 252, Color.CYAN);
		orn(window, 333, 390, Color.MAGENTA);
		orn(window, 241, 365, Color.WHITE);
		orn(window, 523, 412, Color.RED);
		orn(window, 434, 355, Color.GRAY);
		orn(window, 543, 431, Color.BLUE);



	}
	
	public void tree(Graphics window)
	{
		int[] treeXPoints = {400,200,600};
		int[] treeYPoints = {100,500,500};
		Polygon tree = new Polygon(treeXPoints,treeYPoints,treeXPoints.length);
		window.setColor(Color.GREEN);
		window.fillPolygon(tree);


	}

	public void star(Graphics window)
	{


		int[] starXPoints = {399, 464, 461, 545, 476, 517, 434, 400, 365, 282, 322, 253, 337, 334};
		int[] starYPoints = {200, 257, 171, 155, 104, 28, 50, -29, 50, 27, 103, 154, 170, 256};
		Polygon star = new Polygon(starXPoints,starYPoints,starXPoints.length);
		window.setColor(Color.YELLOW);
		window.fillPolygon(star);


	}
	
	public void orn(Graphics window, double cx, double cy, Color c) {
		int[] ornXPoints = new int[10]; int[] ornYPoints = new int[10];
		for (int i=0; i<10; i++) {
			ornXPoints[i] = (int)(cx+12*Math.sin(2*Math.PI*i/10));
			ornYPoints[i] = (int)(cy+12*Math.cos(2*Math.PI*i/10));
		}
		Polygon orn = new Polygon(ornXPoints, ornYPoints, 10);
		window.setColor(c);
		window.fillPolygon(orn);
	}
	
	public void treeTrunk(Graphics window, int cx, int cy)  {
		int[] sgXPoints = {cx+18, cx-18, cx-18, cx+18}; int[] sgYPoints = {cy+30, cy+30, cy-30, cy-30};
		Polygon sg = new Polygon(sgXPoints, sgYPoints, 4);
		window.setColor(Color.ORANGE);
		window.fillPolygon(sg);	
	}	
	
	public void smallGift(Graphics window, int cx, int cy, Color c)  {
		int[] sgXPoints = {cx+20, cx-20, cx-20, cx+20}; int[] sgYPoints = {cy+15, cy+15, cy-15, cy-15};
		Polygon sg = new Polygon(sgXPoints, sgYPoints, 4);
		window.setColor(c);
		window.fillPolygon(sg);	
	}
	
	public void largeGift(Graphics window, int cx, int cy, Color c)  {
		int[] lgXPoints = {cx+30, cx-30, cx-30, cx+30}; int[] lgYPoints = {cy+50, cy+50, cy-50, cy-50};
		Polygon lg = new Polygon(lgXPoints, lgYPoints, 4);
		window.setColor(c);
		window.fillPolygon(lg);	
	}
}