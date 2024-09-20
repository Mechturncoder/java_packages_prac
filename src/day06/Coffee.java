package day06;

public enum Coffee {
	SMALL(50), MEDIUM(100), LARGE(140);
	private int price;
	private Coffee (int price) {
		this.price = price;
		
	}
	public int getPrice()
	{
		return price;
	}
}
