// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// get input of three people and the bill payment
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double payment = Double.parseDouble(args[3]);
		// divide the payment by 3 and round it up if its doesn't split evenly
		payment= Math.ceil(payment / 3.0);
		System.out.println("Dear " + name3  + ", " + name2  + " and " + name1 + ": pay " + payment + " Shekels each");
	}
}
