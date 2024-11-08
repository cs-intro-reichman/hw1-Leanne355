// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// get input of three people and the bill payment
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int payment = Integer.parseInt(args[3]);
		// divide the payment by 3 and round it up if its doesn't split evenly
		payment= (int)Math.ceil(payment / 3.0);
		System.out.println("dear " + name1  + ", " + name2  + " and " + name3 + " pay " + payment + " Shekels each");
	}
}
