# 방탈출 예약 관리

---

## 경험해야할 학습 목표

- 스프링부트 프레임워크를 사용해 웹 요청을 받고 응답하기
- 웹 애플리케이션에서 DB에 데이터를 저장하고 조회하기
- 스프링 빈의 의존성 주입이 무엇인지 알고, 코드에 적용
- 소프트웨어 개발에 일반적으로 적용되는 계층형 아키텍쳐(Layered Architecture)를 알고, 코드에 적용
- `학습 테스트`를 활용해 새로운 기능을 학습

---

## 리뷰 포인트
구현한 코드가 정말 심각한 수준이 아니라면 다음과 같이 진행할 것을 추천

- 1차 피드백을 남기면서 merge. 피드백을 다음 단계 진행할 때 반영하도록 가이드.
- 2차 리뷰 요청에 대해서는 리뷰어분들이 만족하는 수준까지 핑퐁을 주고 받은 후 merge

### 1단계

- 웹 요청/응답 처리 시 스프링이 제공하는 적절한 기능을 사용하는지 확인
- 데이터베이스 접근 시 스프링이 제공하는 적절한 기능을 사용하는지 확인
- 미리 계층을 나누어 구현 할 경우 왜 필요한지 물어봐서 맹목적으로 작성하는 패턴화된 코드에 대한 경각심을 주기
- 객체 관리를 위해 스프링이 제공하는 기능을 정확하게 사용하는가?
- 코드의 구조가 일관성을 가지고 있는가?

### 2단계

- 새로운 기능 추가로 인해 기존 기능이 영향을 받지는 않았는지를 고려했는지 확인
  - 테스트가 없었다면 이 부분을 강조해서 테스트의 필요성을 언급하기
- 계층의 역할을 이해하는지, 그 이해에 맞도록 구조를 설계했는지 확인
- Http 스펙(ex. Http Status Code)에 대해서 어색한 부분이 있는지? 있다면 어떤 기준으로 설계했는지 확인
- 요구사항에서 발생할 수 있는 예외에 대한 처리가 잘 되어있는가?
  - 부족하다면 놓친 부분에 대한 언급을, 과하다면 과한 이유에 대해 묻기
  - 예를 들어, 시간 관리에서 시간이 중복되는 경우에 대한 처리가 잘 되어있는가?
  - @ExceptionHandler 나 @ControllerAdvice를 사용하여 예외 처리를 하였는가?