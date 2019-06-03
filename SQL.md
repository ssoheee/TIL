1. RDBMS (Relational DataBase Management System)

   데이터베이스(DB)에 포함된 속성에 대한 추가, 편집, 질의, 분석, 요약을 위해 사용하는 컴퓨터 소프트웨어를 일컫는다. 금융 거래, 인사 관리, 자산 관리 등 기업 업무에 이용되는 데이터들을 체계적으로 저장 · 관리하기 위한 시스템이다. 관계형 데이터베이스 관리 시스템은 대량의 데이터를 관계형 모델에 따라 구조화해 저장 · 관리하고, 사용자가 간단한 데이터베이스 언어로 복잡한 질의 연산을 요구할 수 있게 한다.



## SQL

2. DDL

   1) CREATE

   CREATE TABLE T_USER (

   ID VARCHAR2 (10),	

   PWD VARCHAR2 (10),

   NAME VARCHAR2 (20)

   );

   

   2) DROP (지울 때)

   DROP TABLE T_USER;

   

   3) ALTER

   ALTER TABLE T_PRODUCT ADD PRIMARY KEY (ID); // PRIMARY KEY  : 반드시 존재해야하는 값, 같은 값이 들어오면 안됨, 변경도 안됨

   *ALTER TABLE T_USER MODIFY (PWD NOT NULL);* // NULL로 집어 넣을 수 없게 함

   *ALTER TABLE T_USER MODIFY (NAME UNIQUE);* // 같은 값이 들어오지 못하게 함

   *ALTER TABLE T_PRODUCT MODIFY (PRICE DEFAULT 1000);* // NULL로 값이 들어오면 디폴트 값으로 설정

   

   ALTER TABLE T_PRODUCT ADD (REGDATE DATE); // 테이블에 열 추가하기

   ALTER TABLE T_PRODUCT MODIFY (NAME CHAR(10)); // 사이즈 바꾸기

   ALTER TABLE T_PRODUCT MODIFY (NAME NULL); // NULL 값으로 바꾸기

   ALTER TABLE T_PRODUCT RENAME COLUMN NAME TO UNAME; // 이름 바꾸기

   

   

3. DML (데이터 조작)

   

   

   INSERT

   INSERT INTO T_PRODUCT () VALUES ();

   

   DELETE

   DELETE FROM T_USER  // 다 지워버리는 것

   DELETE FROM T_USER WHERE ID='ID05'; // ID05를 지움 -> 삭제 대상 설정 가능

   

   UPDATE

   UPDATE T_USER SET PWD='111', NAME='공말숙' // 모든 차트값이 이렇게 바뀜

   UPDATE T_USER SET PWD='111', NAME='공말숙' WHERE ID = 'ID03' // 그러므로 조건을 넣어줘서 실행해야함

   
   
   # SELECT
   
   SELECT * FROM T_USER;  // 테이블 전체 보여줌
   
   SELECT ENAME, SAL FROM EMP; // 원하는 값들만 보여줌
   
   SELECT ENAME, SAL, SAL*12 AS ASAL, DEPTNO AS DNO FROM EMP;
   
   // AS 사용할 때 한 칸 띄우거나 한글 사용하려면 "" 사용
   
   SELECT ENAME || JOB FROM EMP; // 스트링 두개를 붙여서 출력
   
   SELECT ENAME || ' ' || JOB FROM EMP; // 위에서 공백 한칸 붙여 출력
   
   SELECT DISTINCT JOB FROM EMP; // 중복된 항목 제거하고 보여줌 -> 다른 항목이랑 같이 출력은 못함
   
   SELECT * FROM EMP WHERE JOB='MANAGER'; // 매니저의 정보들만 보여줌
   
   SELECT * FROM EMP WHERE JOB='MANAGER' AND SAL>2500 AND HIREDATE >'04/15/1981'; // 그 중에서 뒤에 조건 값을 만족하는 정보들을 보여줌
   
   
   
   ENAME LIKE '%A%'; // ENAME에 A가 들어가 있는 정보 출력
   
   %E -> E로 끝나는 데이터, E% -> E로 시작하는 데이터
   
   
   
   SELECT ENAME, ((SAL*12)*0.87)+((NVL(COMM,0)*12)*0.88) AS ASAL FROM EMP;
   
   SELECT * FROM EMP WHERE JOB='CLERK' AND (DEPTNO=10 OR DEPTNO=20); // 잡은 클락, 뎁넘버 10 또는 20
   
   
   
   SELECT ENAME, SAL FROM EMP ORDER BY SAL;  // SAL 낮은 크기부터 정렬
   
   SELECT ENAME, SAL FROM EMP ORDER BY SAL DESC; // 반대로 정렬
   
   SELECT ENAME, SAL, SAL*12 FROM EMP WHERE SAL>1000 AND DEPTNO=20 ORDER BY 3; // 3번째 항목을 기준으로 정렬하시오
   
   SELECT * FROM EMP WHERE MGR IS NOT NULL ORDER BY MGR, ENAME; // 두번 정렬
   
   SELECT * FROM EMP WHERE COMM IS NOT NULL ORDER BY COMM DESC; // NULL값 제외하고 정렬
   
   // ORDER는 별명 사용해서 정렬 가능
   
   
   
   ### Function
   
   ABS(NUM) 절댓값
   
   MOD(SAL,3) 3으로 나눈 나머지 값
   
   ROUND(대상 수, 반올림 자릿수) 반올림
   
   LOWER (문자열) -> 소문자화
   
   REPLACE(대상 문자열, 치환 전 문자열, 치환 후 문자열)
   
   SUBSTR (대상 문자열, 잘라내기 시작 위치 , 잘라낼 문자 수)
   
   CURRENT_TIMESTAMP 시간 불러오기
   
   
   
   WHERE DEPTNO=20 OR DEPTNO=30; => WHERE DEPTNO IN(20,30);
   
   
   
   TO_CHAR(CURRENT_TIMESTAMP, 'HH:MM:SS') 날짜를 내가 원하는 포맷으로 바꾸고 싶을 때
   
   SELECT ENAME, HIREDATE, SYSDATE, TO_CHAR(CURRENT_TIMESTAMP, 'YYYY/MM/DD-HH:MM:SS') FROM EMP; 이렇게도 사용 가능
   
   TO_DATE(TO_CHAR(HIREDATE,'YYYY/MM'), 'YYYY/MM') // CAHR에서 DATE형으로 다시 바꿈
   
   TO_DATE('2010/10/11','YY:MM:DD')
   
   SELECT ENAME, HIREDATE, HIREDATE+1000 FROM EMP; -> 날짜계산 가능
   
   SELECT ENAME, HIREDATE, SYSDATE-HIREDATE, MONTHS_BETWEEN(SYSDATE,HIREDATE) FROM EMP;
   
   -> 두 날짜 기준으로 몇개월이 지났는지
   
   
   
   BETWEEN 2000 AND 5000 // 숫자의 범위 설정 (포함)
   
   IN( , ) -> OR라고 생각
   
   한글은 한글자당 3바이트로 인식
   
   
   
   ### CASE
   
   SELECT ENAME, 
   CASE WHEN JOB='PRESIDENT'
        THEN '왕'
        WHEN JOB='MANAGER'
        THEN '관리자'
        ELSE '직원'
   END AS REUSLT
   FROM EMP;
   
   
   
   ### 집약 함수
   
   NULL 값을  제외하고 계산
   
   따라서 (NVL(COMM,0))으로 계산
   
   하지만 COUNT(*)는 NULL까지 포함한다.
   
   SELECT MIN(HIREDATE) FROM EMP; 가능 
   
   -> 날짜의 최소, 최대 구하는 건 가능
   
   SUM(DISTINCT SAL) -> 중복된 값 제외하고 계산
   
   SELECT JOB FROM EMP GROUP BY JOB;  
   
   -> 그룹 바이는 항상 그룹 함수와 같이 사용한다
   
   (SELECT JOB, SUM(SAL) FROM EMP GROUP BY JOB; 이런식으로)
   
   
   
   그룹 함수 쓸 때는 조건문 WHERE 대신 HAVING 으로 쓴다 !
   
   -> HAVING 절 안에서는 그룹핑 된 항목의 조건만 해당된다, GROUP BY  뒤에 쓴다
   
   SELECT JOB, AVG(SAL) FROM EMP WHERE DEPTNO IN(10,30) GROUP BY JOB;
   
   -> 여기엔 JOB의 조건이 아닌 DEPTNO의 조건이 들어감
   
   EX)  JOB 별 월급의 평균을 구하시오. 단, JOB 중에서 E가 들어간 JOB만 조회하시오 -> HAVING
   
   ​      SELECT JOB, AVG(SAL) FROM EMP  GROUP BY JOB HAVING JOB LIKE '%E%'
   
   EX) JOB 별 월급의 평균을 구하시오. 단, DEPTNO가 10, 20인 직원들을 대상으로 하시오. -> WHERE
   
   ​       SELECT JOB, AVG(SAL) FROM EMP WHERE DEPTNO IN (10,20) GROUP BY JOB
   
   

* DEPTNO 별, JOB 별 월급의 평균을 구하시오. 단, 이름에 A가 들어간 직원들을 대상으로 하고,  DEPTNO 20, 30인 부서를 대상으로 하시오. 또한 월급 평균이 1000 이상인 것을 대상으로 하시오.

  SELECT DEPTNO, JOB, AVG(SAL) FROM EMP 
  WHERE ENAME LIKE '%A%' 
  GROUP BY DEPTNO, JOB

  HAVING DEPTNO IN (20,30) AND AVG(SAL)>=1000

  ORDER BY DEPTNO

* 연도 별 입사자 월급의 평균을 구하시오

  SELECT TO_CHAR(HIREDATE,'YYYY'), AVG(SAL) FROM EMP
  GROUP BY TO_CHAR(HIREDATE,'YYYY')

  그 중 매니저들의 월급을 구하시오

  SELECT TO_CHAR(HIREDATE,'YYYY'), AVG(SAL) FROM EMP
  WHERE JOB IN ('MANAGER')
  GROUP BY TO_CHAR(HIREDATE,'YYYY')



## 뷰

뷰는 일시적인 가상 테이블을 만들어서 보여준다

내가 뷰를 작성한 시점의 데이터 값에 따른 결과를 보여준다

뷰의 뷰를 또 만들 수 있다



CREATE VIEW EMPSALVIEW (ENAE, ANNSAL)
AS
SELECT ENAME, (SAL*12)+(NVL(COMM,0)*12) FROM EMP



ALTER TABLE ITEM ADD FOREIGN KEY (CATE)
REFERENCES CATEGORY (NO)

->  ITEM의 CATE 항목은 CATEGORY 의 NO 항목을 참조한다 !!



## 서브쿼리

일회용 뷰, 쿼리문 안에 또 쿼리가 들어가는 형태 

SELECT DEPTNO FROM DEPT

WHERE LOC = 'DALLAS'



SELECT ENAME FROM EMP

WHERE DEPTNO =

(SELECT DEPTNO FROM DEPT WHERE LOC='DALLAS')



SELECT ENAME, SAL, (SELECT AVG(SAL) FROM EMP) FROM EMP

--> 이렇게 하는 경우 매 줄 마다 평균값이 찍혀서 출력됨



## JOIN

두 개의 테이블을 이용해야한다.

SELECT e.EMPNO, e.ENAME, d.DNAME FROM EMP e, DEPT d
WHERE e.DEPTNO = d.DEPTNO

--> 일대일 조건으로 가져옴





AUTOCOMMIT -> 자동으로 그 전 설정값들을 없애고 새로 설정

체크 안 돼있는 경우 -> ROLLBACK으로 다시 살릴 수 있음

COMMIT -> 다시 살릴 수 없음

DESC T_PRODUCT; // 테이블 설정값을 보여줌

*는 모든열

-- 한줄 주석

/**/ 여러줄 주석

NVL // NULL 값은 빼고 계산해줌

NVL2 (COMM,'0','1') ->COMM이 NULL이면 1, 아니면 0(COMM 값이 있는지 없는지의 판단)

VARCHAR2 -> 길이 가변 가능한 문자열

CHAR -> 길이 고정형 문자열


