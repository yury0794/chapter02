package kr.ac.sungkyul.paint.app;

import kr.ac.sungkyul.paint.app.I.Drawable;
import kr.ac.sungkyul.paint.point.*;
import kr.as.sungkyul.paint.shape.*;

public class PointApp {

	public static void main(String[] args) {
		Point point1 = new Point(100, 200);
		// point1.setX(100);
		// point1.setY(200);

		Point point2 = new Point(10, 20);
		// point2.setX(10);
		// point2.setY(20);

		ColorPoint point3 = new ColorPoint(300, 200, "red");
		// point3.setX(300);
		// point3.setY(200);
		// ((ColorPoint) point3).setColor("red");

		draw(point1);
		draw(point2);
		draw(point3);

		draw(new Rectangle());
		draw(new Triangle());
		draw(new Circle());
		draw(new Pentagon());

		// drawShape(new Shape());
	}

	// public static void drawPoint(Point point) {
	// point.show();
	// }

	// public static void drawRectangle(Rectangle ract){}
	//
	// public static void drawTriangle(Triangle tri){}
	//
	// public static void drawCircle(Circle cir){}

	// public static void drawShape(Shape shape) {
	// shape.draw();
	// }

	public static void draw(Drawable drawable) {
		drawable.draw();
	}
}