package paint;

public class Circle extends Shape implements Drawable {

	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}
}