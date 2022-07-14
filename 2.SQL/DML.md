# DML
---

## DML(Data Manipulation Language) 데이터 조작 언어
---
```
table 안에 있는 데이터를 관리하는 명렬어
```

## 종류
---
```
SELECT : 데이터 조회
DELETE : 데이터 삭제
UPDATE : 데이터 수정
INSERT : 데이터 생성
```

## 문법
---
```
select

<컬럼이름>,
<컬럼이름>,
...n

from
<테이블 이름>

where <---필터링 기능

<조건>
group by <---그룹핑(묶는 기능)

having <---where에서는 함수를 적지 못하기에 여기에 적는다.

order by <--- 오름차순이나 내림차순으로 정렬할때 사용한다.
```

## 설명
---

## INSERT
---
### 문법
```
insert into emp
(empno,ename,job,mgr,hiredate,sal,comm,deptno)
values
(8000,'이승섭','SALESMAN',7900,'2022-01-06',5000,1000,30)
```
### 주의점
```
INSERT와 VALUE의 순서를 맞취져야 한다.
데이터를 넣고 싶지 않으면 INSERT부분에서 해당 테이블을 제외하고 적는다.
```

## UPDATE
---
### 문법
```
UPDATE emp
set job = 'MANAGER',
sal = 8000
where empno = 8003;
```
### 주의점
```
WHER 절이 필수!!!
말만 업데이트일뿐, 실제로는 해당문을 지우고 다시 작성하는 것이다.
다중 수정시에는 ,(콤마)를 활용한다.
```

### 관계 연산자
```
WHERE 절에서 사용

>(초과), =>(이상), <(미만), <=(이하), =(같다), !=(다르다)
```

### 논리 연산자
```
WHERE 절에서 사용

and(두개가 참일 때), OR(두개중에 하나만 맞아도 괜찮은 경우)
```

### NULL
```
WHERE 절에서 사용.
데이터를 넣지 않은 것을 의미.

is null : 데이터가 null인 것.
is not null : 데이터가 null이 아닌 것.
```

### LIKE
```
WHERE 절에서 사용
이름을 검색할때는 관계연산자를 안쓰고 'LIKE'를 사용한다.

문법
where ename like 'a%'
(이름이 A로 시작하는 사람을 조회)

WHERE ename like '%l%l%'
(이름에 L이 두번 들어간 사람을 조회)
```

### 정렬
```
위치는 WHERE절 뒤에 온다

ORDER BY (컬럼) DESC,ASC

DESC : 내림차순
ASC : 오름차순(디폴트값으로 설정됨)
```

### 통계
```
COUNT(컬럼이름) : 갯수
SUM(*) : 총합
AVG(*) : 평균
MAX(*) : 최댓값
MIN(*) : 최솟값
```

### AND,OR
```
WHERE 절에서 사용.

문법
select
ename,
sal
from emp
where 
(deptno = 10
 or
 deptno = 30)
 and
 sal > 1500
```

### 별명
```
컬럼 뒤에 as를 붙이면 별명으로 설정되어 결과창이 나옴.

문법
SELECT
ename as '이름',
sal as '급여'
from emp
```

### ifnull
```
임의로 데이터를 넣을때는 MySQL에서는 ifnull을 사용한다.
*오라클이나 mariaDB에서는 다른 명령어를 사용.

데이터가 null인 행에 임의 데이터를 넣는것.
데이터를 update하는게 아님.

문법
select
ifnull(comm,100) <-- ,(콤마) 왼쪽은 넣을 부분, 오른쪽을 넣을 값. *Fake!
from emp
```

### DATE_FORMAT
```
날짜별 데이터를 파악할수 있다.
년도, 월, 날짜로 그룹을 지울수 있다.

문법
select 
date_format(hiredate,'%y'),
count(*)
from emp
group by date_format(hiredate,'%y')
```

### 그룹핑
```
여러가지 목록을 그룹화 하는것.
where 뒤에 오며 group by를 적는다.

공통점이 있어야 묶을 수 있다.
'~별'이라는 말이 나오면 group by해야 하는구나 하고 생각하면 됨.

Having

group by한 애들을 필터링하는 콛,
group by 뒤에 쓴다.
```
### LIMIT
```
출력되는 결과의 행의 수를 제한한다.
order by 뒤에 온다.

문법
select  
* <-- 전체 데이터를 호출  
from emp  
limit
```

## 순서
---
```
입력순서
SELECT -> 찾는 것 -> FROM -> WHERE -> GROUP BY -> HAVING -> ORDER BY

검색순서(해석 순서)
FROM -> WHERE -> GROUP BY -> HAVING -> SELECT -> ORDER BY

*ORDER BY는 항상 맨마지막에 위치한다.
```

## JOIN
---
```
JOIN을 알기전에 Foreign key를 알아야 한다.
관계형 데이터베이스에서 사용.

두개 이상의 테이블을 조회할때 사용.
단, 조회하고자 하는 테이블들이 관계가 있어야 함.
```

### JOIN 종류
---
```
셀프조인 : inner join
아우터 조인 : left join, right join, outer join, full outer join

inner join : 두 테이블을 조회할때, 두테이블에 모두 지정한 데이터 조회
outer join : 두 테이블을 조회할때, 1개의 테이블에만 데이터가 있어도 조회

left join : JOIN을 기준으로 왼쪽 테이블의 모든 값이 출력되는 조인
right join : JOIN을 기준으로 오른쪽 테이블의 모든 값이 출력되는 조인
full outer join : 왼쪽 또는 오른쪽 테이블의 모든 값이 출력
```

### JOIN 방법
---
```
조인하는 방법 1

select 
	ename
from emp e, dept d
where e.deptno = d.deptno

- 권장하지 읺음. 기능이 다른 것들은 같이 있으면 안됨.
```
```
조인하는 방법 2.

select 
ename
from emp e 
join dept d 
on e.DEPTNO = d.DEPTNO

- 권장하는 방법.
```
```
조인하는 방법 3.

select 
ename
from emp e 
inner join dept d <--inner는 디폴트 값이어서 안써도 된다.
on e.DEPTNO = d.DEPTNO

- 권장하지 않음
```
```
OUTER 조인하는 방법

select
*
from <첫번째 테이블 이름>  
<left or right> outer(써도 되고 안써도 된다.)join <두번째 테이블 이름>  
on <조인 조건>  
where  

```

### JOIN 설명
---
```
교집합인 데이터를 가져온다.
join을 하고 on을 써야한다.
여러개의 테이블을 조회할때는 이름앞에 테이블이름을 적어야한다.
여러개의 테이블을 조회를 할때는 join 뒤에 ,(콤마) 사용이 가능하다.
```

## 서브쿼리
---

```
하나의 쿼리 문장내에 포함된 또 하나의 쿼리
```

### 서브쿼리 규칙
---
```
반드시 ()괄호로 묶음.
서브쿼리가 먼저 실행디ㅗㄴ 후 외부쿼리와 비교/연산
```

### 서브쿼리 위치
```
SELECT문 : 스칼라 서브쿼리
FROM문 : 인라이 뷰(많이 사용)
WHERE절 : 중첩 서브쿼리
HAVING
ORDER BY
INSERT VALUES
UPDATE SET : MySQL에서 실행 안됨
```