package forwhile;
 
import java.util.Scanner;
 
public class Game4 
{
 
 public static void main(String[] args) 
 {
  int a = 0, b = 0 , c = 0;
  int k = 0;
  String result1 = " ";
  String result2 = " ";
  System.out.println("������ ��� ���ðڽ��ϱ�? (Y/N) : ");
  Scanner sec = new Scanner(System.in);
  String yn = sec.next();
  if (yn.equals("Y")) 
  {
   System.out.println("�ΰ��� ���ڸ� �Է��ϼ��� : ");
   Scanner sc = new Scanner(System.in);
   a = Integer.parseInt(sc.next());
   b = Integer.parseInt(sc.next());
   c = Math.abs(a - b);
   String ans = " ";
   String ans_s = " ";
 
   for (int i = 1; i < 7; i++) 
   {
    for (int j = 1; j < 7; j++) 
    {
     k = Math.abs(i - j);
     if (k == 0) {
         ans = "�� ";
         ans_s = "���󿡼� ������ ��ġ�� ���� �� �ִ� ���� ���̴�.";
     } else if (k == 1) {
         ans = "�� ";
         ans_s = "�����Ⱑ ����. ������ ��Ȳ�� ȯ���ų �ʿ䰡 �ִ�.";
     } else if (k == 2) {
         ans = "�� ";
         ans_s = "���������� ��ΰŸ��� ���� ���� �ذ�ȴ�. ���� �����̴�.";
     } else if (k == 3) {
         ans = "�� ";
         ans_s = "������ ���ε��� ��� �ݵ�� �ʿ��ϴ�. ������ ������ ���� �� �� �ִ�.";
     } else if (k == 4) {
         ans = "�� ";
         ans_s = "������ ��ȭ�� �־ ������ �Ǵ��� �����ٸ� ���߿� �� ū ��ȸ�� �ϰ� �� ���̴�.";
     } else if (k == 5) {
         ans = "�� ";
         ans_s = "������̰� �� ���ϴ� ��� Ǯ������ ������, ��а� ����ϴ�.";
     }
     System.out.print(ans);
     
     if (k==c)
     {
         result1=ans;
         result2=ans_s;
     }
     
    }
    System.out.println();
  
   }
   System.out.println("����� ���� ��� -> " + result1 + ": "+result2);
   sc.close();
  } 
   else {
   System.out.println("�ȳ���������.");
  }
   sec.close();
 
 }
}
