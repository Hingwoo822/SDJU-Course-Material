package composite;

public class Client {
	public static void main(String[] args) {
		HeadQuarters of1, of2, sd1, sd2, sd3, sd4;
		of1 = new Office("����칫��");
		of2 = new Office("�����칫��");
		sd1 = new Subdepartment("�����ܲ�");
		sd2 = new Subdepartment("���Ϸ�У");
		sd3 = new Subdepartment("��ɳ��ѧ��");
		sd4 = new Subdepartment("��̶��ѧ��");
		
		sd1.add(of1);
		sd1.add(of2);
		sd1.add(sd2);
		sd2.add(of1);
		sd2.add(of2);
		sd2.add(sd3);
		sd2.add(sd4);
		sd3.add(of1);
		sd3.add(of2);
		sd4.add(of1);
		sd4.add(of2);
		sd1.executeInstructions();
		
	}
}
