
package forwhile;

import java.util.Scanner;

public class Game3 
{

 public static void main(String[] args) 
 {
  int a = 0, b = 0 , c = 0;
  int k = 0;
  String result = " ";
  System.out.println("오늘의 운세를 보시겠습니까? (Y/N) : ");
  Scanner sec = new Scanner(System.in);
  String yn = sec.next();
  if (yn.equals("Y")) 
  {
   System.out.println("두개의 숫자를 입력하세요 : ");
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
    	 ans = "쥐 ";
     } else if (k == 1) {
    	 ans = "말 ";
     } else if (k == 2) {
    	 ans = "양 ";
     } else if (k == 3) {
    	 ans = "닭 ";
     } else if (k == 4) {
    	 ans = "용 ";
     } else if (k == 5) {
    	 ans = "범 ";
     }
     System.out.print(ans);
     
     if (k==c)
     {
    	 result=ans;
     }
     
    }
    System.out.println();
  
   }
   System.out.println("당신의 오늘 운세는 -> " + result + "입니다!");
   sc.close();
  } 
   else {
   System.out.println("안녕히가세요.");
  }
   sec.close();

 }
}

 
