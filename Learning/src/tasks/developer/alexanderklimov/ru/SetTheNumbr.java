package tasks.developer.alexanderklimov.ru;
/*��������� ���� �������� ����� �� 0 �� 100. � ��� ����� ���� ������� �� ����������. 
��� ������ ������� ��� ����� ���������� ��������� - "����" ��� "�����". 
���� ��������, ���������� � ���� �������, �� ��������. ���� ���, �� ���� ������� ����.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SetTheNumbr {
static int secret;

public static void main(String[] args) throws NumberFormatException, IOException {
	Random random = new Random();
	int secret;
	// ���������� ����� �� 0 �� 100
	secret = random.nextInt(100) + 1;
	Cat murzic = new Cat(secret);
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	for (int i = 0; i<7;i++) {
		int num = Integer.parseInt(reader.readLine());
		murzic.give(num);
		
	}
}
}
