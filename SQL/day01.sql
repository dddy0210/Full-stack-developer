/*
*CREATE TABLE 테이블명(
* 컬럼명 타입(길이),
* 컬럼명 타입(길이),
* 컬럼명 타입(길이),
* 컬럼명 타입(길이),
*);
**/
--이름
--나이

CREATE TABLE TBL_MEMBER(
	NAME VARCHAR2(100),
	AGE NUMBER
);
--주의점
--컬럼이 여러개일때 콤마(,) 잘 써야 함 
--사이에 공백 두지 않기 
--같은 이름으로는 안만들어짐 
--마지막에는 콤마 안붙힘 

CREATE TABLE TBL_CAR(
	ID NUMBER,--차량 식별번호
	BRAND VARCHAR2(100),--브랜드
	COLOR VARCHAR2(100),--색깔
	PRICE NUMBER,--가격
	CONSTRAINT CAR_PK PRIMARY KEY(ID)--테이블을 생성하면서 제약조건을 지정 
);
--영구 삭제이기 때문에 조심해야한다. 
DROP TABLE TBL_CAR;    
DROP TABLE TBL_MEMBER; 
    
--테이블 명 : ex02_10
--속성 1: Col1 문자형 길이는 10 null값 비허용
--속성 2: Co12 문자형 길이 10 null값 허용 
--속성 3: Create_date 날짜타입 기본값 현재날짜 (SYSDATE)

CREATE TABLE ex02_10(
  Col1 VARCHAR2(10) NOT NULL,
  Col2 VARCHAR2(10) 
  Create_date DATE DEFAULT SYSDATE 
);

--컬럼명 변경 Col1->Col11
--alter table 테이블명 RENAME COLUMN 기존 컬럼명 TO 새로운 컬럼명 
ALTER TABLE ex02_10 RENAME COLUMN Col1 TO COL11;

--컬럼타입 변경
--alter table 테이블명 MODIFY 컬럼명 데이터타입;
ALTER TABLE ex02_10 MODIFY Col2 varchar2(30);

--컬럼삭제
--alter table 테이블명 drop column 컬럼명; 
ALTER TABLE ex02_10 DROP COLUMN Create_date;

--컬럼추가
--alter table 테이블명 add 컬럼명 컬럼타입;
ALTER TABLE ex02_10 ADD Col3 NUMBER;

--제약조건추가 
--테이블이 생성된 후 제약 조건을 추가 OR 삭제     
--alter table 테이블명 add constraint 제약조건명 제약조건종류(칼럼명);
ALTER TABLE ex02_10 ADD CONSTRAINT PK_EX02_10 PRIMARY KEY(COL11);

--제약조건 삭제
--alter table 테이블명 DROP CONSTRAINT 제약조건명;
ALTER TABLE EX02_10 DROP CONSTRAINT PK_EX02_10; 

--테이블생성
--테이블명 TBL_ANIMAL
--ID 숫자 기본키
--"TYPE" 문자형 길이 100
-- AGE 숫자형 길이 3
-- FEED 문자형 길이 100 

CREATE TABLE TBL_ANIMAL(
  ID NUMBER PRIMARY KEY,
  "TYPE" VARCHAR2(100),
  AGE NUMBER(3),
  FEED VARCHAR2(100)
);

ALTER TABLE TBL_ANIMAL DROP CONSTRAINT SYS_C007001;

--제약조건 추가하기
--ID 컬럼에 ANIMAL_PK라는 이름으로 기본키 설정하기 

ALTER TABLE TBL_ANIMAL ADD CONSTRAINT ANIMAL_PK PRIMARY KEY(ID);

--TBL_ANIMAL테이블 삭제하기 
DROP TABLE TBL_ANIMAL;

--DEFAULT 과 CHECK제약조건
CREATE TABLE TBL_STUDENT(
  ID NUMBER, --학번
  NAME VARCHAR2(100), --이름
  MAJOR VARCHAR2(100), --전공
  GENDER CHAR(1) DEFAULT 'W' NOT NULL CONSTRAINT BAN_CHAR CHECK(GENDER='M' OR GENDER='W'),
  BIRTH DATE CONSTRAINT BAN_DATE CHECK(BIRTH >=TO_DATE('1980-01-01','YYYY-MM-DD')),
  CONSTRAINT STD_PK PRIMARY KEY(ID)
);


SELECT EMPLOYEE_ID,FIRST_NAME,SALARY FROM EMPLOYEES
WHERE FIRST_NAME LIKE '______%'

























