# DI 프레임워크 구현

---
## 학습 목표
- Spring 프렝미워크의 Bean 컨테이너 동작 원리를 이해한다.
- Spring 프렝미워크의 @Configuration 동작 방식과 필요성을 이해한다.

---
## 리뷰어 가이드
이번 미션의 핵심 목표는 Bean 컨테이너 구현을 통해 Spring 프레임워크의 Bean 컨테이너 동작 원리를 이해하는데 있다.
3, 4단계를 통해 @Configuration의 동작 원리를 이해하는 것도 중요하지만 1, 2단계의 Bean 컨테이너 구현만으로도 충분히 의미있다.

DI 프레임워크 구현에서 중점적으로 리뷰할 내용은 다음과 같다.

- 1, 3단계 구현에 대한 피드백은 객체지향 설계, 클린 코드 관점에서 부족한 부분을 집중적으로 피드백한다.
- 1단계를 통해 Bean 컨테이너를 구현했는가?
- 1, 2단계에서 구현한 Bean 컨테이너를 사용자 관리 서비스, 질문/답변 게시판에 적용했는가?
- 3단계를 통해 @Configuration을 활용해 설정이 가능하도록 구현했는가?
- 3, 4단계에서 구현한 부분을 바탕으로 DataSource를 설정하도록 적용했는가?

객체지향 설계, 클린 코드 관점에서 정말 심각하지 않다면 바로 merge 후 피드백한 내용 + 2, 4단계의 힌트를 참고해 리팩토링하도록 유도한다.
특히 프레임워크만 구현하고 적용하지 않는 수강생이 종종 있는데 2, 4단계 코드 리뷰할 때 적용 여부를 판단하고 피드백할 것을 추천한다.

객체지향 설계, 클린 코드 구현에 약간의 우선 순위를 두고 피드백하고, 일부 테스트 코드는 미리 제공하기 때문에 테스트 코드 구현에 대한 우선 순위는 조금 낮추어도 괜찮다.
