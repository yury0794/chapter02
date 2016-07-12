package kr.as.sungkyul.paint.shape;

import kr.ac.sungkyul.paint.app.I.Drawable;

public class Pentagon extends Shape implements Drawable {

	@Override
	public void draw() {
		System.out.println("오각형을 그렸습니다.");
	}
}