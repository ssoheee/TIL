
package forwhile;

import java.util.Scanner;

public class Game3 
{

 public static void main(String[] args) 
 {
  int a = 0, b = 0 , c = 0;
  int k = 0;
  String result = " ";
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

   for (int i = 1; i < 7; i++) 
   {
    for (int j = 1; j < 7; j++) 
    {
     k = Math.abs(i - j);
     if (k == 0) {
    	 ans = "�� ";
     } else if (k == 1) {
    	 ans = "�� ";
     } else if (k == 2) {
    	 ans = "�� ";
     } else if (k == 3) {
    	 ans = "�� ";
     } else if (k == 4) {
    	 ans = "�� ";
     } else if (k == 5) {
    	 ans = "�� ";
     }
     System.out.print(ans);
     
     if (k==c)
     {
    	 result=ans;
     }
     
    }
    System.out.println();
  
   }
   System.out.println("����� ���� ��� -> " + result + "�Դϴ�!");
   sc.close();
  } 
   else {
   System.out.println("�ȳ���������.");
  }
   sec.close();

 }
}

 
