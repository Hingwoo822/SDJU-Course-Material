
import java.util.Scanner;

public class TestFraction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter fraction f1:");
		 // �����д���д��룺��������int���͵ı���n1��d1���������������f1
		
                ����
                ����
                ����



		System.out.println("Please enter fraction f2:");
		 // �����д���д��룺��������int���͵ı���n2��d2���������������f2
	        ����
                ����
                ����
		sc.close();
		
		Fraction addRet = null;
		Fraction subRet = null;
		Fraction mulRet = null;
		Fraction divRet = null;

              // �����д���д��룬������f1,f2�ļӼ��˳������������ֱ𱣴���addRet,subRet,mulRet,divRet��
                Fraction addRet = f1.add(f2);
                ����
                ����
                ����

		System.out.println(f1 + " + " + f2 + " = " + addRet);
		System.out.println(f1 + " - " + f2 + " = " + subRet);
		System.out.println(f1 + " * " + f2 + " = " + mulRet);
		System.out.println(f1 + " / " + f2 + " = " + divRet);


		System.out.println(f1 + " equals " + f2 +" ? "+f1.equals(f2));
	}

}
