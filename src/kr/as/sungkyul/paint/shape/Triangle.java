package kr.as.sungkyul.paint.shape;

import kr.ac.sungkyul.paint.app.I.Drawable;

public class Triangle extends Shape implements Drawable {

	@Override
	public void draw() {
		System.out.println("삼각을 그렸습니다.");
	}
}