# Dbeaver
```
구글에 Dbeaver 검색 후 다운로드

설치 진행하고 실행했을 때 예시 만들겠냐고 물어보면 '아니오' 클릭
디비버 실행해서 mysql 선택 - MySQL 설치할 때 입력했던 비밀번호 입력
좌측 상단 localhost:3306 있는 곳 바로 옆에 화살표를 클릭
디비버 화면 좌측 상단 localhost 왼쪽에 화살표를 클릭해서 드라이버 다운로드 받으면 데이터베이스 생성 완료

databases - skila - tables - actor 더블클릭, properties 옆에 데이터가 있는지 확인
```

## 실행
```
Ctrl + 엔터 : 명령어 실행
Alt + X : 여러개의 INSERT문을 한꺼번에 실행
```

## 계정 생성 & 권한 부여
```
ROOT : 프로그래밍 최고 권한

-- root 계정이 계정을 생성함
-- '%' : 모든 IP 허용(모든 IP에서 사용 가능하게 만듦)
    create user test@'%' identified by '123';

    grant select,insert,update on dw.* to test@'%';
-- dw의 모든 테이블에 대하여 delete를 제외한 기능에 대한 권한 부여

-- edit connection으로 새 Username과 password 입력해서 로그인 한 뒤 부여된 권한을 다음처럼 확인함

    select * from board
-- 데이터 조회 가능

    ALTER table board add column x integer(4) default 0;
    delete from board 
-- 위 alter와 delete는 권한이 없어서 사용 불가
```

## auto commit 해제
```
디비버는 auto commit이 디폴트이기에 설정에서 꺼줘야 한다.

window - preference - connections - connection type에서 auto commit by default 체크 해제하고 재시작
=> auto commit을 해제하면 웹으로 입력받은 데이터를 commit을 하기 전에 DB에서 반영되지 않는다.
```

## 에러
```
Connection refused: connect

cmd에서 netstat -a로 주소 3306이 있는지 확인
윈도우 찾기 검색창에 "서비스"를 검색하면 설정 창이 나오는데 거기에 "MySQL80" 시작시킨다.
디비버에서 재연결했더니 Pulic Key retrieval is not allowed라는 에러 발생
Edit Connection - Connection settings - Driver properties - allowPulicKeyRetrieval을 true로 변경하면 해결 완료
```