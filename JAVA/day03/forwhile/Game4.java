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
   String ans_s = " ";
 
   for (int i = 1; i < 7; i++) 
   {
    for (int j = 1; j < 7; j++) 
    {
     k = Math.abs(i - j);
     if (k == 0) {
         ans = "쥐 ";
         ans_s = "협상에서 유리한 위치를 점할 수 있는 좋은 날이다.";
     } else if (k == 1) {
         ans = "말 ";
         ans_s = "분위기가 좋다. 현재의 상황을 환기시킬 필요가 있다.";
     } else if (k == 2) {
         ans = "양 ";
         ans_s = "교착상태의 고민거리가 이유 없이 해결된다. 정말 다행이다.";
     } else if (k == 3) {
         ans = "닭 ";
         ans_s = "오래된 선인들의 충고가 반드시 필요하다. 설익은 조언은 독이 될 수 있다.";
     } else if (k == 4) {
         ans = "용 ";
         ans_s = "심정의 변화가 있어도 성급한 판단을 내린다면 나중에 더 큰 후회를 하게 될 것이다.";
     } else if (k == 5) {
         ans = "범 ";
         ans_s = "세상살이가 다 원하는 대로 풀리지는 않으니, 당분간 답답하다.";
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
   System.out.println("당신의 오늘 운세는 -> " + result1 + ": "+result2);
   sc.close();
  } 
   else {
   System.out.println("안녕히가세요.");
  }
   sec.close();
 
 }
}
