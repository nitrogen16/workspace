import java.util.Scanner;

public class Calc{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �����:");
		int num1 = sc.nextInt();
		System.out.println("������� ���� ��������:");
		String oper = sc.next();
		System.out.println("������� ������ �����:");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println("��������� ����������:" + CalcLogic.logicmethod(num1, oper, num2));
	}
}