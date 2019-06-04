package forwhile;

public class ForEx2 {

	public static void main(String[] args) {
		
		// 가위바위보 매트릭스를 출력하시오 p.151
		int result = 0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) 
			{
				result = i-j;
				String str = "";
				if (result==0) {
					str = "무승부";
				}
				if (result==-1||result==2)
				{
					str = "컴승";
				}
				if (result==-2||result==1)
				{
					str = "유저승";
				}
				System.out.print(str+" ");
			}
			System.out.println();
		}

	}

}
