package balaji.AssistedPractice;
	import java.util.Scanner;
	public class ArithmeticCalculator {
		public static void main(String[] args) {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Enter the two numbers");
				int firstnumber=scan.nextInt();
				int secondnumber= scan.nextInt();
				System.out.println("Enter the operator ");
				char operator=scan.next().charAt(0);
				double Ans=0;

				switch(operator){
				case '+': Ans=firstnumber+secondnumber;
				break;
				case '-':Ans=firstnumber-secondnumber;
				break;
				case '*': Ans=firstnumber*secondnumber;
				break;
				case '/':Ans=firstnumber/secondnumber;
				break;
				}
				System.out.println("The answer is " + Ans);
			}
		}
}

