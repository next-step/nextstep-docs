import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String answer = "111";
		boolean flag = true;
		while (flag) {
			String temp = new String(answer);
			answer = generate(temp);
			guide();
			String input = sc.next();
			int[] ret = calculate(input, answer);
			flag = guide(ret);
			guide(flag);
		}

		A: while (true) {
			String answer = "111";

			

			System.out.println("숫자를 입력해주세요 : ");
			String line = sc.next();

			B: while (answer.equals(line)) {
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
				System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
				String command = sc.next();
				if ("1".equals(command)) {
					break B;
				} else if ("2".equals(command)) {
					break A;
				} else {
					System.out.println("다시 입력해주세요.");
				}
			}

		}

		sc.close();

	}

	private static String generate(String answer) {
		if (answer.length() == 3 && answer.charAt(0) != answer.charAt(1) && answer.charAt(1) != answer.charAt(2) && answer.charAt(0) != answer.charAt(2)) {
			return answer;
		}
		while (true) {
			int temp = (int) (Math.random() * 999 + 1);
			if (temp < 100 || temp >= 1000) {
				continue;
			}
			answer = temp + "";
			if (answer.length() == 3 && answer.charAt(0) != answer.charAt(1) && answer.charAt(1) != answer.charAt(2) && answer.charAt(0) != answer.charAt(2)) {
				break;
			}
		}		
		return answer;
	}

}
