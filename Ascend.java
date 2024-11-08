// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	
		int Lim= Integer.parseInt(args[0]);
			// 3 random ints between 0 to the input
		int a = (int)(Math.random() * (Lim + 1));
		int b = (int)(Math.random() * (Lim + 1));
		int c = (int)(Math.random() * (Lim + 1));
		System.out.println(a + " " + b + " " + c);
			// 3 random ints in order from min to max
		int min = Math.min(a,b);
		min = Math.min(min,c);
		int max = Math.max(a,b);
		max = Math.max(max,c);
		int middle = a + b + c -max - min; 
		System.out.println(min + " " + middle + " " + max);
}
}