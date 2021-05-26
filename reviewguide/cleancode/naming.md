## 의미 있는 이름

### 클래스, 메서드, 변수명에 의도를 알기 어려운 이름을 붙였다
- 클린코드 p32
    > 클래스 이름
      클래스 이름과 객체 이름은 명사나 명사구가 적합하다. Customer, WikiPage, Account, AddressParser 등이 좋은 예다. Manager, Processor, Data, Info 등과 같은 단어는 피하고, 동사는 사용하지 않는다.
- 클린코드 p49
    > 서술적인 이름을 사용하라!
      코드를 읽으면서 짐작했던 기능을 각 루틴이 그대로 수행한다면 깨끗한 코드라 불러도 되겠다.

### get, set을를 잘못 사용하는 케이스
- 클린코드 p32
    > 메서드 이름
    접근자(Accessor), 변경자(Mutator), 조건자(Predicate)는 javabean 표준에 따라 값 앞에 get, set, is를 붙인다.
