package chapter02;

public class Goods {
	private static int countOfGoods;
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public Goods() {
		countOfGoods++;
	}

	public Goods(String name, int price, int countStock, int countSold) {
		countOfGoods++;
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}

	public static int getCountOfGoods() {
		return countOfGoods;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public String getName() {
		return name;
	}

	public void showInfo() {
		System.out.println("[name = " + name + ", price = " + price + ", countStock = " + countStock + ", countSold = "
				+ countSold + "]");
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}

	public int calcDiscountPrice(int percentage) {
		return price * percentage / 100;
	}
}