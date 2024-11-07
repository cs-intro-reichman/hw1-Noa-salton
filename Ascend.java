// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		double random1 = Math.random();
		double random2 = Math.random();
		double random3 = Math.random();
		System.out.println((int)(random1*lim) + " " + 
		(int)(random2*lim) + " " + (int)(random3*lim));
			double max = Math.max(random1, random2);
			double min = Math.min(random1, random2);
			if (min >= random3){
				System.out.println((int)(random3*lim) + " " + 
		(int)(min*lim) + " " + (int)(max*lim));
			} else if(max <= random3){
				System.out.println((int)(min*lim) + " " + 
		(int)(max*lim) + " " + (int)(random3*lim));
			} else{
				System.out.println((int)(min*lim) + " " + 
		(int)(random3*lim) + " " + (int)(max*lim));
			}
		}
		}
	

