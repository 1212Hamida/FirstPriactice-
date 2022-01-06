
public class ThreeClass {

	public static void main(String[] args) {
	int [] num = {2,3,4,5,6,7};
	int sumResult = 0;
	double multiResult=0;
	
		for (int i=0;i<num.length;i++){
			sumResult += num[i];
			multiResult *= num[i];
		}
		System.out.println("The sum of numbers are: "+sumResult);
		System.out.println("The multiplies of numbers are: "+multiResult);
			
		

	}

}
