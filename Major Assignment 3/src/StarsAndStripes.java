import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

// Jared Howard

public class StarsAndStripes {

	public static int closestDivisors(int number) {
		int a = ((int) Math.sqrt(number));
		while (number % a > 0)
			a -= 1;
		return number / a;
	}

	public static void drawFlag(int stars, int stripes, java.awt.Graphics g, int x, int y, int width, int height) {

		int stripeWidth = (height / stripes);
		int blueHeight = (stripeWidth * (int) Math.ceil(stripes / 2.0));
		int blueWidth = (blueHeight * width / height);
		int starsAcross = closestDivisors(stars);
		int starsDown = stars / ((closestDivisors(stars)));
		int size = (blueHeight / starsDown);

		// Drawing the base
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);

		// If you could go ahead and give me those measurements
		// That'd be great
//		System.out.println("The starting x and y coordinates are " + x + " plus " + y);
//		System.out.println("The stripeWidth is " + stripeWidth);
//		System.out.println("The height and width is " + height + " width " + width);
//		System.out.println("The number of stripes is " + stripes);
//		System.out.println("The remainder of height divided by stripes is " + height % (stripes * stripeWidth));
//		System.out.println("The horizontal center of the starfield is " + (blueWidth / 2));
//		System.out.println("The vertical center of the starfield is " + (blueHeight / 2));
//		System.out.println("The number of stars input is " + stars);
//		System.out.println("The amount of stars YOU got is " + ((blueWidth / size) * (blueHeight / size)));
//		System.out.println("The starting point of the starfield is " + (blueWidth - ((stars / 2.0) * size)));
//		System.out.println("The size of the stars is " + size);
//		System.out.println("The width and height of the starFIELD is " + blueWidth + " + " + blueHeight);
//		System.out.println("The closest two multiples of the stars are " + closestDivisors(stars) + " and " + (stars / closestDivisors(stars)));

		// Drawing the stripes
		for (int j = 0; j < stripes; j++) {
			if (j % 2 == 0 && j == stripes - 1) {// sets the colors based on the location
				g.setColor(Color.red);
				g.fillRect(x, y + ((j) * stripeWidth), width, (height - j * stripeWidth));
			} else if (j % 2 == 0) {
				g.setColor(Color.red);
				g.fillRect(x, y + (j * stripeWidth), width, stripeWidth);
			}
		}
		// Drawing the starfield
		g.setColor(Color.blue);
		g.fillRect(x, y, blueWidth, blueHeight);

		for (int h = 0; h < closestDivisors(stars); h++) {
			for (int k = 0; k < stars / ((closestDivisors(stars))); k++) {
				int verticalStarOffset = ((blueHeight - ((blueHeight / size) * size)) / 2);
				int horizontalStarOffset = ((blueWidth - ((blueWidth / size) * size)) / 2);
				g.setColor(Color.white);
				drawStar(g, x + horizontalStarOffset + (h * size), y + verticalStarOffset + (k * size), size);
			}
		}

		// IF YOU MOVE ANY PARENTHESES ABOVE THIS POINT
	}
	// YOU'RE GONNA HAVE A BAD TIME

	// Code for drawing the star
	public static void drawStar(java.awt.Graphics g, int x, int y, int size) {
		int x1 = x + (size / 2);
		int y1 = y;
		int x2 = x + (size * 4 / 5);
		int y2 = y + size;
		int x3 = x;
		int y3 = y + (size * 2 / 5);
		int x4 = x + size;
		int y4 = y + (size * 2 / 5);
		int x5 = x + (size * 1 / 5);
		int y5 = y + size;

		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x4, y4);
		g.drawLine(x4, y4, x5, y5);
		g.drawLine(x5, y5, x1, y1);
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Graphics window");
		window.setLocationByPlatform(true);
		final JLabel coords = new JLabel(" ");
		@SuppressWarnings("serial")
		final JPanel panel = new JPanel() {

			protected void paintComponent(Graphics gx) {
				coords.setText(" ");
				Graphics2D g = (Graphics2D) gx;
				int width = getWidth();
				int height = getHeight();
				g.setBackground(Color.GREEN); // To make sure you cover the base rectangle!
				g.clearRect(0, 0, width, height);
				g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g.setColor(Color.BLACK);

				// You could alter this code to try different flags!
//					drawStar(g, 100, 100, 300);
//					drawFlag(15, 13, g, 0, 0, width/2, height/2);
//					drawFlag(20, 14, g, width/2, 0, width/2, height/2);
//					drawFlag(24, 15, g, 0, height/2, width/2, height/2);
				drawFlag(70, 15, g, 0, 0, 300, 200);
			}
		};
		panel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseMoved(MouseEvent e) {
				coords.setText(e.getX() + ", " + e.getY());
			}

		});
		window.setLayout(new BorderLayout());
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		window.setSize(d.width / 2, d.height / 2);

		JPanel coordPanel = new JPanel();
		coordPanel.setLayout(new BorderLayout());
		coordPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		window.add(coordPanel, BorderLayout.SOUTH);
		coordPanel.add(coords, BorderLayout.WEST);

		window.setBackground(Color.WHITE); // To make sure you cover the base rectangle!
		panel.setBackground(Color.BLACK);
		window.add(panel, BorderLayout.CENTER);
		// window.setContentPane(panel);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
