# NEXTSTEP 코드 리뷰 문서

1. public static void main(String[] args);
	- 메인 메서드
2. private static void gamePlay(String answer, int flag);
  - play를 위한 메서드
3. private static void guide();
  - 간단한 가이드 메서드
4. private static int guide(int[] input);
  - 가이드이면서 앞으로 어떻게 해야 할지 알려주는 플래그가 있는 메서드
5. private static String mentMaking(int[] input)
  - 가이드를 만들어주는 메서드
	- 스트라이크, 볼, 포볼에 따라 분
6. private static String mentMakingStrike(int[] input, String ret)
  - 스트라이크 멘트를 만들어주는 메서드
7. private static String mentMakingBall(int[] input, String ret)
  - 볼 멘트를 만들어주는 메서드
8. private static String mentMakingNothing(int[] input, String ret)
  - 포볼 멘트를 만들어주는 메서드
9. private static int[] calculate(String input, String answer)
  - 점수 계산 메서드
	- 볼 계산, 스트라이크 계산에 따라 분기
10. private static int calculateBall(String input, String answer)
  - 볼 계산 메서드
11.	private static int calculateStrike(String input, String answer)
  - 스트라이크 계산 메서드
12. private static int calculateMatch(char a, char b, int ret)
  - 계산을 위한 매치 함수
13. private static String generateAnswer(String answer)
  - 정답 만들기 함수
	- 정답 판정에 따라 분기
14. private static boolean isSafe(String answer)
  - 정답 판정 함수
15. private static String generateNewAnswer()
  - 새로운 정답 만들기 함수
	- 정답 판정을 하지 않음
---
## [NEXTSTEP의 온라인 코드 리뷰 과정](./codereview/README.md)

---
## [NEXTSTEP의 프리코스 과제 제출 방법](./precourse/README.md)
