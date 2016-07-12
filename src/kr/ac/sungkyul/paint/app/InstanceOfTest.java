package kr.ac.sungkyul.paint.app;

import kr.ac.sungkyul.paint.app.I.Drawable;
import kr.ac.sungkyul.paint.point.ColorPoint;
import kr.ac.sungkyul.paint.point.Point;
import kr.as.sungkyul.paint.shape.Circle;
import kr.as.sungkyul.paint.shape.Shape;

public class InstanceOfTest {

	public static void main(String[] args) {
		// Circle c = new Circle();
		// // 객체가 Rectangle 클래스의 인스턴스 인가?
		// System.out.println(c instanceof Rectangle);

		Shape s = new Circle();
		// 객체가 Circle 클래스의 인스턴스 인가?
		System.out.println(s instanceof Circle);
		// 객체가 Drawable 인터페이스를 구현하였는가?
		System.out.println(s instanceof Drawable);
		// 객체가 Shape 클래스의 인스턴스 인가?
		System.out.println(s instanceof Shape);
		
		Point p = new ColorPoint(50, 100, "yellow");
		System.out.println(p instanceof ColorPoint);
		System.out.println(p instanceof Point);
		System.out.println(p instanceof ColorPoint);
	}
}