## 안정적인 서비스 만들기

### 1. 화면 응답 개선하기


- 개선방안을 각각 적용하고 부하테스트를 통해 계측했는지

- Load Test, Stress Test 목적에 맞게 결과를 도출했는지
    - 개선 후 Load Test를 동일하게 진행했을 경우 latency가 어느정도 개선되었는지를 확인
        - http_req_duration max 값을 기준으로 개선여부를 판단합니다.
    - 개선 후 Stress Test를 진행했을 때 한계점이 증가되었음을 확인
        - 부하테스트 결과를 보고는 성능이 개선되었다고 이야기하고, 스트레스테스트 결과를 보고는 최대 허용 가능한 VUser 가 xx 로 증가했다고 이야기를 합니다.

- 웹 서버
    - 정적 파일 캐싱을 적용했는지
    - http2 적용했는지
    - gzip 적용했는지
    - worker connection 수치를 조정했는지
- was
    - 경로찾기에 대해 redis 설정을 적용했는지

### 2. 스케일 아웃

- HTTP 캐싱 적용 요구사항을 수행했는지

- 부하테스트를 통해 계측했는지 (cloudwatch 그래프도 포함하였는지)
- cpu 부하 실행에 따른 auto scaling 을 경험해보았는지
- auto scaling group 종료 정책을 구성했는지


### 3. 쿼리 최적화

- 인덱스를 추가하지 않고도 응답시간이 1s 내인지 (m1은 2s)
- 실행계획 확인시, 조인을 적절히 구성했는지
  - 드라이빙, 드리븐 테이블 구성이 적절한지 (record 테이블의 rows를 적게 탐색하기 위해 조인 선후관계가 적절한지) 
  - 드라이빙 테이블(인라인뷰)의 모수를 줄이려는 노력을 했는지 (filtered 참고)
- 질문이나 피드백하기 어려운 경우가 있다면, 이동규 에게 dm 주세요.


### 4. 인덱스 설계

- 학생 분들 답변대로 인덱스를 추가했을 때 응답시간이 100 ms인지 (m1은 200ms)
- 질문이나 피드백하기 어려운 경우가 있다면, 이동규 에게 dm 주세요.

 
 
 

