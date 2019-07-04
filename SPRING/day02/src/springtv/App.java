package springtv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Spring Start...");
		
		AbstractApplicationContext factory = 
		new GenericXmlApplicationContext("mytv.xml");
		//�갡 ����Ǹ鼭 Spring Container�� �������.
		//������� �� xml�� ���� ����.
		//�Ϲ����� �ڹ� Ŭ������ POJO���� ����.
		//spring container�� ����� �۾��� ��.
		
		System.out.println("Spring Started");
		
		//�� tv�ٷ�? -> Spring
		//�ش��ϴ� ��ü�� Ƣ���. 
		TV stv = (TV)factory.getBean("stv");
		stv.turnOn();
		stv.volumeUp(10);
		System.out.println(stv);
		
	
		
		factory.close();
	}

}
