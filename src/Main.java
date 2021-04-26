import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	// flag 0 게임을 계속 해야 하는 상태
	// flag 1 게임을 끝냈지만 정답을 맞추었는데 1을 누른 상태
	// flag 2 게임을 끝냈지만 정답을 맞추었는데 2를 누른 상태
	public static void main(String[] args) throws Exception {
		String answer = "111";
		int flag = 0;
		gamePlay(answer, flag);
		sc.close();
	}

	/**
	 * 게임 플레이
	 * 
	 * @param answer
	 * @param flag
	 */
	private static void gamePlay(String answer, int flag) {
		while (flag != 2) {
			answer = generateAnswer(new String(answer));
			guide();
			String input = sc.next();
			int[] ret = calculate(input, answer);
			flag = guide(ret);
			answer = initAnswer(flag, answer);
		}
	}

	private static String initAnswer(int flag, String answer) {
		if (flag == 0) {
			return answer;
		}
		if (flag == 1) {
			return "111";
		}
		if (flag == 2) {
			return answer;
		}
		return answer;
	}

	private static int guide(int[] ret) {

		String line = "";
		if (ret[0] > 0) {
			line += ret[0] + " 스트라이크 ";
		}
		if (ret[1] > 0) {
			line += ret[1] + " 볼";
		}
		System.out.println(line);

		if (ret[0] == 3) {
			System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
			System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
			int flag = sc.nextInt();
			return flag;
		}
		// 쓰리 스트라이크가 아니면 게임을 계속 해야함
		return 0;

	}

	/**
	 * @param input
	 *            내가 입력한 숫자
	 * @param answer
	 *            정답
	 * @return 스트라이크, 볼 수
	 */
	private static int[] calculate(String input, String answer) {

		int[] ret = new int[2];
		if (input.charAt(0) == answer.charAt(0)) {
			ret[0]++;
		}
		if (input.charAt(0) == answer.charAt(1)) {
			ret[1]++;
		}
		if (input.charAt(0) == answer.charAt(2)) {
			ret[1]++;
		}
		if (input.charAt(1) == answer.charAt(0)) {
			ret[1]++;
		}
		if (input.charAt(1) == answer.charAt(1)) {
			ret[0]++;
		}
		if (input.charAt(1) == answer.charAt(2)) {
			ret[1]++;
		}
		if (input.charAt(2) == answer.charAt(0)) {
			ret[1]++;
		}
		if (input.charAt(2) == answer.charAt(1)) {
			ret[1]++;
		}
		if (input.charAt(2) == answer.charAt(2)) {
			ret[0]++;
		}
		return ret;
	}

	private static void guide() {
		System.out.print("숫자를 입력해주세요 : ");
	}

	/*
	 * 입력이 정상이면 정상을 그대로 리턴
	 * 입력이 정상이 아니어도 정상을 리턴
	 */
	private static String generateAnswer(String answer) {
		if (answer.length() == 3 && answer.charAt(0) != answer.charAt(1) && answer.charAt(1) != answer.charAt(2) && answer.charAt(0) != answer.charAt(2)) {
			return answer;
		}
		while (true) {
			int temp = (int) (Math.random() * 999 + 1);
			if (temp < 100 || temp >= 1000) {
				continue;
			}
			answer = temp + "";
			if (answer.charAt(0) == '0' || answer.charAt(1) == '1' || answer.charAt(2) == 2) {
				continue;
			}
			if (answer.length() == 3 && answer.charAt(0) != answer.charAt(1) && answer.charAt(1) != answer.charAt(2) && answer.charAt(0) != answer.charAt(2)) {
				break;
			}
		}
		return answer;
	}

}
