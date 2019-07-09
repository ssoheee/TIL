# Spring

1. Project

   1) Make Project

   2) Spring Nature

   3) Maven (Add Spring Library)

   - pom.xml (List up Library)
   - Download Library



* Spring의 의존성 주입은 모두 xml로 한다



2.  Sptring IoC (Inversion of Control)

   1) XML
   
   2) Annotation @
   
   
   
3.   Spring AOP (Aspect Oriented Programming)



@Transactional => 같은 데이터가 들어갈 경우 처리방법



<resultMap type="user" id="um">
		<result property="id" column="id" />
		<result property="pwd" column="pwd" />
		<result property="name" column="name" />
	</resultMap> -->

객체의 컬럼네임과 데이터의 네임이 다를 때 사용한다.



<![CDATA[ SELECT * FROM T_USER WHERE NAME>10 ]]>

조건 문 사용할 땐 이렇게 써줘야 인식한다.





5. SpringMVC

   - web.xml

     1) dispatcher

     2) filter

   - spring.xml

     1) ViewResolver
     
     
     
     
     
     SERVLET = CONTROLLER
     
     MVC = Model, View, Controller