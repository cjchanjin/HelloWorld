package test;

public class Test5 {
	public String item = "apple";
	public int qty = 10;
	public int price = 1200;
	
	Test5 (String item, int qty, int price) {
		this.item = item;
		this.qty = qty;
		this.price = price;
	}
	
	public static void main(String[] args) {
		Test5 compute = new Test5("apple", 10 , 1200);
		System.out.println("품명 : " + compute.item);
		System.out.println("금액 : " + compute.price + "원");
		
	}
}
