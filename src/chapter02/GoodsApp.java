package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		System.out.println(Goods.getCountOfGoods());

		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountSold(10);
		camera.setCountStock(50);

		System.out.println(camera.getCountOfGoods());

		camera.showInfo();
		System.out.println(camera.toString());

		int discountPrice = camera.calcDiscountPrice(43);
		System.out.println(discountPrice);

		Goods goods1 = new Goods("cannon", 300000, 0, 100);
		System.out.println(goods1);
		System.out.println(goods1.getCountOfGoods());
	}
}