package tasks.developer.alexanderklimov.ru;
/*Попросите кота загадать число от 0 до 100. У вас будет семь попыток на угадывание. 
При каждой попытке вам будет выводиться сообщение - "Мало" или "Много". 
Если угадаете, уложившись в семь попыток, то выиграли. Если нет, то идёте кормить кота.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SetTheNumbr {
static int secret;

public static void main(String[] args) throws NumberFormatException, IOException {
	Random random = new Random();
	int secret;
	// Генерируем число от 0 до 100
	secret = random.nextInt(100) + 1;
	Cat murzic = new Cat(secret);
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	for (int i = 0; i<7;i++) {
		int num = Integer.parseInt(reader.readLine());
		murzic.give(num);
		
	}
}
}
