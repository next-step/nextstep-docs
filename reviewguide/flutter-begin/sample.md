### 1단계
- 1주차는 Dart 언어에 익숙해지는 시기로 생각합니다. 따라서 [https://dart.dev/guides/language/effective-dart](https://dart.dev/guides/language/effective-dart) 를 참고해주시면 좋을 것 같습니다.
- buildMethod -> Class로 변경하면서 named paramter 부분 설명이 있으면 좋겠습니다.
  https://dart.dev/guides/language/language-tour#parameters
- private 필드 생성자로 초기화하기

```dart
SampleClass({required Int data})
       : _data = data;
```

### 2단계
- 위젯을 적절한 위치에서 잘 위치하고 있는지, `context` 역할
- https://github.com/next-step/flutter-cart-sample/pull/2

### 3단계
- `dispose` 사용 하도록
- `Provider`, `Provider.value` 동작 차이