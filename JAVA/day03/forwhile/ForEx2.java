package forwhile;

public class ForEx2 {

	public static void main(String[] args) {
		
		// ���������� ��Ʈ������ ����Ͻÿ� p.151
		int result = 0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) 
			{
				result = i-j;
				String str = "";
				if (result==0) {
					str = "���º�";
				}
				if (result==-1||result==2)
				{
					str = "�Ľ�";
				}
				if (result==-2||result==1)
				{
					str = "������";
				}
				System.out.print(str+" ");
			}
			System.out.println();
		}

	}

}
