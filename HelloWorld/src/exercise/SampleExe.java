package exercise;

class Sample {
	int price;
	String item;
	int qty;

	Sample() {
		
	}

	Sample(int price) {
		this.price = price;
	}
	
	Sample(int price, String item) {
		this.price = price;
		this.item = item;
	}
	
public class SampleExe {
	public static void main(String[] args) {
		Sample sample = null;
		sample = new Sample(30, "apple");
	}
	
	Sample[] samAry = new Sample[100];
	int[] intAry = new int[10];
	Sample sample = new Sample(30, "apple");
	samAry[0] = sample;
	
	
}

