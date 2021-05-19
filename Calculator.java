
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check=true;
		do {
			double value1=IOClass.getDouble("Enter the first value:");
			double value2=IOClass.getDouble("Enter the first value:");
			String operand=IOClass.getString("Enter the operaton as:+ - * /");
			double result=getResult(value1, value2, operand);
			System.out.println("The result of this operation is"+result);
			check=IOClass.getBoolean("Do you want to try again?");
			
		}while(check);

	}
	static double getResult(double value1, double value2, String operand) {
		double result=0;
		switch(operand) {
		case "+":result=value1+value2;break;
		case "-":result=value1-value2;break;
		case "*":result=value1*value2;break;
		case "/":result=value1/value2;break;
		default: result=0;break;
		}
		return result;
	}

}

class IOClass{
	static String getString(String question) {
		System.out.println(question);
		return System.console().readLine();
	}
	static Double getDouble(String question) {
		System.out.println(question);
		String answer=System.console().readLine();
		return Double.parseDouble(answer);
	}
	static boolean getBoolean(String question) {
		System.out.println(question);
		String answer=System.console().readLine();
		return Boolean.parseBoolean(answer);
	}
}
