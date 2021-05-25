## 확장하는 인프라 만들기

### 1. 쿠버네티스로 구성하기
- 쿠버네티스 구성요소 (Pod, Service, Ingress 등을 활용하여) 애플리케이션을 서비스하고 있는지

- 쿠버네티스 클러스터에 대해 스트레스 테스트를 진행하였는지

- 쿠버네티스 클러스터 구성이 합리적인지

### 2. 클러스터 운영하기

- 모니터링 시스템 알림 설정 기준이 합리적인지

- hpa, auto scaling 설정이 합리적인지
    - 설정 후 Stress Test를 진행해보았는지

- ResourceQuota, PodDisruptionBudget, Affinity 설정이 합리적인지

- 부하 테스트, Stress 테스트 결과를 제대로 이해하고 있는지
