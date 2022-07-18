# Postman
```
스프링 로직의 결과를 웹이 아닌 postman으로 확인 할 수 있음
프론트 개발자를 초대해서 결과가 저장된 파일을 알려주고 코딩을 부탁함
```
```
구글에서 postman을 검색 후 다운로드
-> https://www.postman.com/ (사이트 주소)
MyWorkspace에서 new collection으로 폴더 만듦
collection 오른쪽 클릭 - add request
```

## Http 메소드별 실행 방법
```
GET : GET 선택하고 주소 넣고 Send

DELETE : DELETE 선택하고 주소 넣고 Send

POST : POST 선택하고 body - raw - JSON 선택
       아래 공간에 json 형태로 데이터를 넣고 Send

PATCH : PATCH 선택하고 body - raw - JSON 선택
       아래 공간에 json형태로 데이터를 넣고 Send

json형식 ex) {
            "ename" : "홍길동",
            "empno" : "1"
       }
```