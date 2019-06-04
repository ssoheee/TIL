**What is Java?**

Java는 다양한 플랫폼 소프트웨어를 만들 수 있는 프로그래밍 언어이다. Java를 다른 언어와 구분 짓는 가장 큰 특징은 컴파일 된 코드가 플랫폼 독립적이라는 점이다. 즉, Java로 개발된 프로그램은 CPU나 운영체제의 종류에 관계없이 어디서나 실행할 수 있다.

 

**- Java vs C**

① C는 프로시저 지향 프로그래밍 언어에 가깝다. 즉, 특정 작업에 대해 작성 해야 하는 프로시저가 있으며 해당 프로시저를 호출하여 프로그램을 작성한다. 

자바는 OOP를 사용하여 클래스를 정의하는 객체 지향 프로그래밍 언어이다. 하나의 클래스를 사용하여 많은 객체를 생성 할 수 있다. 

 

② C 언어는 일반적으로 #define 또는 #typedef 지시문을 사용하여 선언 된 식별자를 대체하기 위해 지능형 검색을 수행하는 선행 처리기라는 컴파일 단계를 구현한다. 

하지만 Java 언어에는 전 처리기가 없다. #Define 지시어와 클래스 정의는 상수 데이터 멤버로 대체된다. 


 ③ C에서 메모리를 관리할 때 프로그래머는 heap에 할당 된 메모리를 명시적으로 해제하지 않으면 메모리 누수가 발생한다. 

Java에서는 가비지 컬렉터를 사용하여 메모리가 자동으로 해제되기 때문에 누수 되는 메모리가 적다.

 

④ C에서는 포인터를 지원하지만 포인터를 올바른 방법으로 사용하지 않으면 버그가 수정되어 다시 고정하는 데 시간 낭비가 발생한다.

Java는 포인터를 지원하지 않지만 참조를 통해 포인터의 기능과 유사한 기능을 제공하여 부적절한 포인터 관리로 인한 버그를 방지한다.

 

⑤ C 언어로 작성된 프로그램은 원시 기계 코드로 컴파일 된다. 즉, C로 작성된 프로그램은 실행을 위해 컴파일 된 플랫폼에서 실행 되어야 한다. 

Java는 Java 가상 머신 환경에서 실행되는 Java 바이트 코드로 컴파일 된다. 바이트 코드는 다른 플랫폼으로 이식 될 수 있으며 다른 운영 체제에서 실행될 수 있다.

 

**- Java vs JavaScript**

① 자바[스크립트](http://terms.naver.com/entry.nhn?docId=848218)는 사용자 컴퓨터에 의해 인터프리트(interpreted)되는 언어이다.

그러나 자바는 일단 서버측에서 컴파일해야 하고, 프로그램의 실행은 사용자측에서 이루어진다.


 ② 두 언어 모두 객체 지향적 언어이다. 

하지만 자바스크립트에는 상속성이나 클래스는 존재하지 않는다.


 ③ 자바스크립트는 HTML 코드에 끼워져서(embedded)사용되지만 자바는 HTML과 독립적으로 사용 가능하다. 단, HTML을 이용해야 자바 프로그램에 접근할 수 있다.
 
 

④ 흔히 루즈 타입(loose type)이라는 변수형을 선언할 필요가 없다. 반면에 자바는 항상 변수형을 선언해야 한다. 이 경우 스트롱 타입(strong type)이라 한다.


 ⑤ 자바스크립트는 [동적 연결](http://terms.naver.com/entry.nhn?docId=847857)(dynamic binding)이기 때문에 객체에 대한 참조는 [실행시](http://terms.naver.com/entry.nhn?docId=831103)에만 한다. 그러나 정적인 연결(static binding)을 취하는 자바는 컴파일시에 객체에 대한 참조가 이루어진다.


 ⑥ 자바스크립트의 경우는 HTML 코드에 직접 끼워져 있기 때문에 누구든지 볼 수가 있다. 그러나 자바 소스 코드를 컴파일하면 바이트 코드로 불리는 클래스 파일이 생성된다. 따라서 [프로그램 작성자](http://terms.naver.com/entry.nhn?docId=861362)가 디렉토리 안에 소스 코드를 지워도 HTML에서 부르는 것은 자바 클래스 파일이기 때문에 다른 사람이 그 소스를 보지 못한다는 점에서 차이가 있다.

 

### Development Environmnet

JDK & Eclipse



### Java Program

1. variable
   1) primitive type

   char

   boolean

   number

   

   2) reference type

   operator

   if, while, for

   oop

   자바에서 문자열은 무조건 레퍼런스 타입
   자바 API를 이용해서 문자열을 표현 -> 그러므로 첫글자는 무조건 대문자로 표시



* 자바는 프로그래밍 언어이자 개발 환경, 실행 환경까지 포함하는 개념이다.
  자바는 랭귀지가 아닌 플랫폼
  c++은 100프로 객체지향언어가 아님.
  객체지향언어의 단점 : 파일이 여러개
  가비지 컬렉터가 JVM 안에 자동적으로 들어가있음
  *네트워크와 분산처리가 쉽다. (JAVA API를 제공한다)