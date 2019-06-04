package ws2;
 
import java.util.Random;
import java.util.Scanner;
 
public class gg {
    public static void main(String[] args) {
        char candy[][] = new char[9][9];
        int r_candy[] = new int[81];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int x, y;
        int c_x, c_y;
        char temp;
        int score=0;
        int move=10;
        
        for(int i=0;i<r_candy.length;i++) {
            r_candy[i]=r.nextInt(5)+65;
        }
        int k=0;
        for(int i=0;i<candy.length;i++) {
            for(int j=0;j<candy.length;j++) {
                candy[i][j]=(char)r_candy[k];
                k++;
            }
 
        }
        System.out.println("캔디판이 생성되었습니다");
 
        while(true) {
            for(char tem[]:candy){
                for(char data:tem) 
                {
                 System.out.printf("%c ",data);
                }
                System.out.println();
               }
            System.out.println("현재점수: "+score+"남은횟수"+move);
        System.out.println("캔디의 x,y 좌표를 입력해주세요");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("교환할 캔디의 x,y 좌표를 입력해주세요");
        c_x=sc.nextInt();        
        c_y=sc.nextInt();
        while((x-c_x)*(x-c_x)+(y-c_y)*(y-c_y)>1) {
            System.out.println("이웃한 캔디가 아닙니다");
            System.out.println("교환할 캔디의 x,y 좌표를 입력해주세요");
            c_x=sc.nextInt();        
            c_y=sc.nextInt();
        }
        temp=candy[x-1][y-1];
        candy[x-1][y-1]=candy[c_x-1][c_y-1];
        candy[c_x-1][c_y-1]=temp;
        move--;
        
        for(int i=0; i<candy.length;i++) {
            for(int j=0; j<candy.length-2;j++) {
                while(candy[i][j]==candy[i][j+1]&&candy[i][j+1]==candy[i][j+2]){
                    System.out.println("candy!!");
                    score++;
                    for(int w=0; w<3; w++) {
                        candy[i][j+w]=(char)(r.nextInt(5)+65);
                    }
                    
                }
                while(candy[j][i]==candy[j+1][i]&&candy[j+1][i]==candy[j+2][i]){
                    System.out.println("candy!!");
                    score++;
                    for(int w=0; w<3; w++) {
                        candy[j+w][i]=(char)(r.nextInt(5)+65);
                    }
                    
                }
            }
        }
        if(move==0) {
            if(score>20) {
                System.out.println("승리!!");
                break;
            }
            else {
                System.out.println("패배ㅠㅠ");
                break;
            }
        }
 
        }
    }
    
}
 
