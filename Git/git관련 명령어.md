```
master => main으로 수정및 삭제하기

$ git checkout master
$ git branch -m master main
$ git fetch
$ git branch --unset-upstream
$ git branch -u origin/main
$ git symbolic-ref refs/remotes/origin/HEAD refs/remotes/origin/main
```

```
branch 삭제
git branch -d <branchname>

branch 확인
git branch

branch 변경
git switch main
(main으로 branch 변경)
```

## 이클립스 폴더를 처음 연결한 방법
```

1. 내 깃허브 들어가서 레파지토리 생성

2. 연결할 폴더에서 bash 열고 코드 입력
    git init
    git config --global core.autocrlf true
        (OS별 CRLF 차이로 인한 문제를 막기 위해 사용함
        Windows에서는 CRLF를 사용하므로 저장소에서 가져올 때 LF를 CRLF로 변경하고 저장소로 보낼 때는 CRLF를 LF로 변경하도록 true로 설정)
    git add .
    git branch -M main
        (브랜치를 mater에서 main으로 변경)
    git remote add origin 저장소주소
    git push -u origin main
        (저장소에 푸쉬)
```

## SSH 설정
```
ssh키 생성

-> ssh-keygen -t rsa -C"이메일 주소 입력"
-> 엔터-> 비밀번호 설정-> 비밀번호 재입력
```