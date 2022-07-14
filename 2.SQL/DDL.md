# DDL
---

## DDL(Data Definition Language) 데이터 정의 언어
---
```
테이블을 관리하는 명령어

```

## 종류
---
```
CREATE TABLE <table_name> : table 생성
DROP TABLE <table_name> : table 삭제
ALTER TABLE <table_name> : table 수정

Alter -> 테이블 이름을 변경할때 주로 씀
```

## 스키마
---
```
CREATE TABLE student(
    id(컬럼이름) INT(11)(데이터 타입) NOT NULL(조건),
    name VARCHAR (20) NOT NULL,
    height INT(5),
    age INT(5) DEFAULT 0,
    : age에 데이터를 넣지 않아도 디폴트가 0 이기 때문에 0으로 출력됨.
    create_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    constraint student_id_pk primary key(id)
);
```