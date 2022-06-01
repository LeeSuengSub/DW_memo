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

git branch main
(main으로 branch 변경)

```
