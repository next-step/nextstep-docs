## 리뷰 철학
- 정답을 찾는 리뷰가 아니라 **의사결정을 검증하는 리뷰**입니다.
- “왜 그렇게 선택했는가?”에 집중합니다.
- 자동화 자체보다 **사고 과정과 전략**을 봅니다.

## 학습 목표
1. Gherkin 시나리오 설계 및 협업 가능한 테스트 작성
2. Production Parity 원칙 이해 및 적용
3. Spring Profiles로 환경 분리 전략 수립
4. Docker Compose로 PostgreSQL 격리 실행
5. Multi-stage Build로 애플리케이션 컨테이너화
6. Gradle로 전체 워크플로우 자동화

## 리뷰 포인트

### 1. Cucumber BDD 적용 (요구사항 1)
- “Java 인수 테스트를 Gherkin으로 변환했을 때, 가독성이 실제로 개선되었나요?”
- “Given/When/Then이 '행위/관찰 결과' 중심인가요, '구현' 중심인가요?”
- “Then에서 상태코드 대신 비즈니스 결과를 표현하고 있나요?”
- “Step Definitions가 재사용 가능하게 작성되었나요?”
- “시나리오 간 데이터 격리가 보장되나요?”
- “Step이 너무 많은 일을 하지 않나요?” (하나의 Step이 여러 검증을 숨기지 않는지)
- “@CucumberContextConfiguration과 @ActiveProfiles가 올바르게 설정되었나요?”

### 2. Production Parity (요구사항 2 - 개념)
- “왜 H2 대신 PostgreSQL을 사용했나요?”
- “로컬에서만 통과하는 테스트의 위험성을 이해하고 있나요?”
- “개발/테스트/프로덕션 환경을 동일하게 유지하는 것의 장점을 설명할 수 있나요?”
- “SQL 방언 차이, 트랜잭션 격리 수준 차이를 경험했나요?”

### 3. Spring Profiles (요구사항 2 - 설정)
- “application.properties와 application-cucumber.properties가 명확히 분리되어 있나요?”
- “@ActiveProfiles('cucumber')를 사용하는 이유를 설명할 수 있나요?”
- “환경변수가 properties 파일보다 우선하는 이유를 이해하고 있나요?”
- “H2는 단위 테스트에서만 사용하고 있나요?”

### 4. Docker Compose (요구사항 2 - 실행)
- “docker-compose.yml이 명확하게 작성되어 있나요?”
- “healthcheck를 설정한 이유를 설명할 수 있나요?”
- “volume을 사용하는 이유를 설명할 수 있나요?”
- “포트 매핑 '5432:5432'의 의미를 이해하고 있나요?”
- “시나리오별 DB cleanup 전략(TRUNCATE)이 구현되어 있나요?”
- “왜 Volume 삭제가 아닌 TRUNCATE를 사용했나요?”

### 5. Application Containerization (요구사항 3 - Docker)
- “Dockerfile이 Multi-stage Build로 작성되어 있나요?”
- “Build Stage와 Runtime Stage의 역할을 설명할 수 있나요?”
- “이미지 크기가 얼마나 줄어들었나요? (효과를 측정했나요?)”
- “docker-compose.yml에 app 서비스가 올바르게 추가되었나요?”
- “depends_on: condition: service_healthy의 의미를 이해하고 있나요?”
- “.dockerignore가 작성되어 있나요? 어떤 파일들을 제외했나요?”

### 6. Docker Network 이해 (요구사항 3 - 네트워크)
- “컨테이너 내부에서 postgres:5432로 접근하는 이유를 설명할 수 있나요?”
- “Service Name이 hostname이 되는 Docker DNS를 이해하고 있나요?”
- “호스트에서는 localhost:5432, 컨테이너에서는 postgres:5432인 이유를 설명할 수 있나요?”
- “애플리케이션의 포트를 8080이 아닌 다른 포트를 지정해주었나요?”
- “webEnvironment = NONE을 사용하는 이유를 설명할 수 있나요?”
- “테스트는 어디서 실행되고, 애플리케이션은 어디서 실행되나요?”

### 7. Gradle Automation (요구사항 3 - 자동화)
- “dockerBuild, dockerUp, dockerDown task가 구현되어 있나요?”
- “cucumberTest task가 올바르게 분리되어 있나요?”
- “doFirst로 사전 조건(Docker 컨테이너 실행 상태)을 체크하고 있나요?”
- “단위 테스트(test)와 Cucumber 테스트(cucumberTest)가 명확히 분리되어 있나요?”
- “./gradlew cucumberTest 한 줄로 전체 테스트를 실행할 수 있나요?”
- “실패 시 명확한 에러 메시지를 보여주나요?”

### 8. 환경 재현성 (전체)
- “다른 개발자가 ./gradlew cucumberTest 한 줄로 테스트를 실행할 수 있나요?”
- “로컬과 CI가 정말 동일하게 실행되나요?”
- “수동 단계가 숨어있지 않나요? (DB 수동 설치, 환경변수 수동 설정 등)”
- “README.md에 실행 방법이 명확하게 문서화되어 있나요?”
- “CI에서 실패할 가능성은 없나요?” (포트 충돌, readiness, 환경변수 누락)

### 9. AI 활용
- “AI가 제안한 전략을 그대로 사용했나요?”
- “AI의 제안을 어떻게 검증했나요?”
- “AI가 틀린 부분은 무엇이었나요?”
- “개념을 물어보는 것과 코드를 작성해달라고 하는 것의 차이를 이해하고 있나요?”
