## 0단계: 문서화 테스트 작성

- RestAssured를 활용한 문서 테스트 작성 연습
- 기존 인수 테스트 스텝 메서드를 문서 테스트에서도 재사용 가능하게 리팩터링 가이드
- Request Parameters나 Request and Response Fields를 활용하여 풍성한 문서 만들기 가이드(선택)

---

## 1단계: 경로 조회 타입 추가

- 기존 기능을 잘 유지하면서 리팩터링을 하였는가?
  - 기존 기능과 중복되는 로직이나 구조를 얼마나 잘 추상화 하였는가?
- 인수 조건과 인수 테스트를 잘 작성하였는가?
- 커밋 로그를 통해 TDD를 진행하였는지 파악할 수 있는가?

---

## 2단계: 요금 조회 기능

- 인수 테스트 -> 문서화 -> 기능 구현 싸이클 연습하는 단계
- 기존 기능을 유지한 채로 신규 기능 구현하는 연습(목표는 3주차와 비슷)

---

## 3단계: 요금 정책 추가

- 경로 조회 시 로그인 사용자의 나이를 알기 위해서는 경로 조회 컨트롤러 메서드에 @AuthenticationPrincipal를 이용해 LoginMember 객체를 받아야 함
- 하지만 비로그인 사용자도 사용할 수 있게 해야함
- @AuthenticationPrincipal 설정값으로 `boolean required`을 두어 required값이 false일 때 로그인 객체가 없다면 빈 값이 응답될 수 있게 가이드 하기
- 요금별 정책 로직에 대해 집중적으로 코드 리뷰하면 좋을 듯