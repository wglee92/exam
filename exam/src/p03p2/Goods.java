package p03p2;

public class Goods {
	private String name;
	private int price;
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getCountStock() {
		return countStock;
	}

	private int countStock;
	
	public Goods(String name, int price, int countStock) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
	}
}
