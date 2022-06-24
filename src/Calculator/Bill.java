package Calculator;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public static final double BPRICE = 5.00;
	public static final double BRPRICE = 7.00;
	public static final double SDPRICE = 3.00;

	public static double cover() {
		return 4.00;
	}

	public double feeding() {
		return beer * BPRICE + barbecue * BRPRICE + softDrink * SDPRICE;
	}

	public double ticket() {
		if (this.gender == 'M') {
			return 10.0;
		} else {
			return 8.0;
		}

	}

	public double total() {
		if (feeding() < 30.0) {
			return cover() + feeding() + ticket();
		} else {
			return feeding() + ticket();
		}
	}

}
