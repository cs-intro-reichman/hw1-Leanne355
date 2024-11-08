// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		String numberinput = args[0];
		int Number = Integer.parseInt(numberinput);
		// get only the hundreds by deviding by 100
		int Hundreds = (Number/100);
		// get only the tens by removing from the number the hundreds and deviding by 10
		int tens = (Number - (Hundreds*100)) / 10;
		// get only the ones by removing from the number the hundreds and the tens
		int ones = (Number - (Hundreds*100)) - (tens*10);
		System.out.println(Hundreds + " hundreds, " + tens + " tens, and " + ones + " ones. ");
	}
}
