package zadachnik;
/*Класс Дробное число со знаком (Fractions). Число должно быть представлено двумя полями: 
 * целая часть - длинное целое со знаком, дробная часть - беззнаковое короткое целое. 
 * Реализовать арифметические операции сложения. 
 * В функции main проверить эти методы.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fractions {
	private String integ;
	private String fract;
		
	public static void main(String[] args) throws IOException {
		Fractions value1 = new Fractions();
		Fractions value2 = new Fractions();
		System.out.println("_______________________________________________");
		System.out.println("For first value:");
		value1.inputNumber();
		System.out.println("_______________________________________________");
		System.out.println("For second value:");
		value2.inputNumber();
		
		System.out.println("===============================================");
		System.out.println(makeDouble(value1)+" + "+makeDouble(value2));

		System.out.println("Summ = "+summ(value1,value2));
	}

	
	
	private void inputNumber () throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please, input integer part of Value:  ");
		this.integ = reader.readLine()+".";
		System.out.print("Please, input fractional part of Value:  ");
		this.fract = reader.readLine();
	}
	static private Double makeDouble (Fractions x){
		final String number = x.integ + x.fract;
		Double value = Double.parseDouble (number);
		return value;
	}
	private static double summ (Fractions a, Fractions b){
		System.out.println("===============================================");
		double summ =makeDouble(a) + makeDouble(b); 
		return summ;
	}

}
