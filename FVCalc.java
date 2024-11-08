// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// gets input of the current value, the rate precent and the years
		int CurrentValue = Integer.parseInt(args[0]);
		double Rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double futureValue;
		// an ecuation for calculating the future value by rate, current value and years
		futureValue= CurrentValue*(Math.pow((Rate / 100)+ 1,n));;
		System.out.println("After " + n + " years, a $"  + CurrentValue + " saved at " + Rate + "%" + " will yield " + "$" + (int)futureValue);

	}
}