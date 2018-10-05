## 온라인 코드리뷰 3단계
코드리뷰 3단계는 리뷰 요청을 보낸 후 pull request가 next-step으로 merge가 된 이후의 과정을 다룬다.

---
1. 리뷰어는 피드백을 마무리하고 next-step 저장소로 merge한다.

![codereview 8](codereview_8.png)

----
9. merge를 완료했다는 통보를 받으면 브랜치 변경 및 작업 브랜치 삭제(option)한다.
```
git checkout 본인_아이디
git branch -D 삭제할_브랜치이름
ex) git checkout javajigi
ex) git branch -D step1
```

![codereview 9](codereview_9.png)

----
10. merge한 next-step 저장소와 동기화하기 위해 next-step 저장소 추가(최초 한번만)

```
git remote add {저장소_별칭} base_저장소_url
ex) git remote add upstream https://github.com/next-step/java-racingcar.git
// 위와 같이 next-step 저장소를 추가한 후 전체 remote 저장소 목록을 본다.
git remote -v
```

----
11. next-step 저장소에서 자기 브랜치 가져오기(또는 갱신하기)

```
git fetch upstream {본인_아이디}
ex) git fetch upstream javajigi
```

![codereview 10_11](codereview_10_11.png)

----
12. next-step 저장소 브랜치와 동기화하기
```
git rebase upstream/본인_아이디
ex) git rebase upstream/javajigi
```

![codereview 12](codereview_12.png)

----
13. 코드리뷰 1단계의 4에서 다시 시작

![codereview 13](codereview_13.png)