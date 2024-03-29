# 지하철

## 리뷰어 가이드
이번 주차의 주요 목표는 웹 애플리케이션을 개발하는 과정에서 복잡한 도메인인 지하철 정보를 다루는 경험을 하는 것이다. 
객체지향적인 설계를 통해 복잡한 도메인 규칙을 잘 구현했는지, 그리고 이 과정에서 필요한 테스트를 충분히 작성했는지에 초점을 맞춰서 피드백한다.

## 경험해야할 학습 목표
- 웹 애플리케이션에서 복잡한 도메인을 설계하고 구현하는 경험
- 다양한 종류의 테스트를 작성하는 경험 (예: 단위 테스트, 통합 테스트)
- Java Configuration을 통해 스프링 메타데이터를 설정하는 방법을 경험 
- 추가되는 요구사항을 구현하면서 변경에 유연한 설계에 대해 다시 고민해보는 경험

## 리뷰 포인트

구현한 코드가 정말 심각한 수준이 아니라면 다음과 같이 진행할 것을 추천한다.
* 1차 피드백을 남기면서 merge. 피드백을 다음 단계 진행할 때 반영하도록 가이드.
* 2차 리뷰 요청에 대해서는 리뷰어분들이 만족하는 수준까지 핑퐁을 주고 받은 후 merge

### 1단계
- 지하철 역과 노선 객체 사이의 관계가 잘 표현되었는지 피드백
- 노선에 포함된 지하철 역과 역 사이의 관계인 구간 객체를 잘 도출했는지 확인
- API레벨의 통합 테스트를 필요한 기능별로 구현했는지 확인
- 비즈니스 로직이 단위 테스트로 잘 검증이 되는지 확인 (가능하면 커밋 기록을 참고해서 TDD 사이클을 잘 경험했는지도 확인하면 좋음)

### 2단계
- 외부 라이브러리를 Java Configuration 사용해 Bean으로 설정했는지 확인. 만약 다른 방식으로 사용했다면 왜 그렇게 했는지 설명을 요청
- profile을 이용하여 환경별 데이터베이스 경로 설정이 되었는지 확인(prod: local path, test: in-memory)
- 새로운 정책 추가로 인해 변경이 많았는지 확인. 그리고 그 이유에 대해 생각을 공유하도록 코멘트
