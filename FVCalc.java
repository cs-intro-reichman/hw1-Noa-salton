// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentVal = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		System.out.println("After " + years + " years, a $" + currentVal + " saved at " +
		rate + "% will yield $" + 
		(int)(currentVal*Math.pow((rate/100.0 + 1.0), (double)years)));
	}
}