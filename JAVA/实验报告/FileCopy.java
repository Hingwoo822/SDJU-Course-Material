
import java.io.*;

public class FileCopy  {//�ı��ļ�����
 
  public static void main(String[] args) throws IOException { 
	  InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader inp=new BufferedReader(isr);
	  System.out.print("������Դ�ļ���");
      String f1=inp.readLine();
      
     
    // Check if source file exists
    File sourceFile = new File(f1);
    if (!sourceFile.exists()) {
       System.out.println("Source file " + sourceFile 
         + " does not exist");
       System.exit(2);
    }

    System.out.print("������Ŀ���ļ���");
    String f2=inp.readLine();
    // Check if target file exists
    File targetFile = new File(f2);
    if (targetFile.exists()) {
      System.out.println("Target file " + targetFile 
        + " already exists");
      System.exit(3);
    }

    String str=new String();
    try
    {
       BufferedReader in=new BufferedReader(new FileReader(sourceFile));
       BufferedWriter out=new BufferedWriter(new FileWriter(targetFile));
      while ((str=in.readLine())!=null)
      {
        System.out.println(str);
        out.write(str); //����ȡ����һ������д�뵽�������������
        out.newLine();//д��س����з�
      }
      out.flush(); 
      in.close();
      out.close();
    }
    catch (IOException ioe)
    {
      System.out.println("����! "+ioe);
    }
  }
}

