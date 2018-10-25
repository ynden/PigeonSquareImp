package model;

import java.awt.Point;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Food extends Rectangle {
	private Point point;
	private boolean fresh;

	public Food(int x, int y) {
		super(x, y, 10, 10);
		this.setFill(Color.BLACK);
		this.point = new Point(x, y);
		this.fresh = true;

	}

	public Point getPoint() {
		return this.point;
	}

	public boolean isFresh() {
		return fresh;
	}

	/*@Override
	public void run() {
		fresh = true;

		try {
			wait(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		 //fresh = false;
		 System.err.println("nourriture est "+ fresh);
	}*/
}
