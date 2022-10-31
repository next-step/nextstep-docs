### 1단계
- `Stream` 이용시 불편한 부분 잘 유도
- Stream은 getter로 처리하도록 https://github.com/next-step/flutter-card-flip/pull/1#discussion_r962332628
- 데이터를 전달하기보다는 `State` 객체를 만들어서 전달하도록 유도. (추후에 bloc으로 교체할 때 더 자연스럽게 전환)

### 2단계
- Cubit과 Bloc의 개념 및 용도 차이 설명 https://github.com/next-step/flutter-card-flip/pull/2#pullrequestreview-1098398775
- 굳이 Bloc 사용으로 유도하지 않으셔도 됩니다.(3주차 3단계 과제)