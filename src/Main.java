import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String answer = "111";
		boolean flag = true;
		while (flag) {
			String temp = new String(answer);
			answer = generateAnswer(temp);
			guide();
			String input = sc.next();
			int[] ret = calculate(input, answer);
			flag = guide(ret);
			answer = initAnswer(flag, answer);
		}
		sc.close();
	}

	private static String initAnswer(boolean flag, String answer) {
		if (flag == false) {
			return "111";
		} else {
			return answer;
		}
	}

	private static boolean guide(int[] ret) {

		String line = "";
		if (ret[0] > 0) {
			line += ret[0] + " 스트라이크";
		}
		if (ret[1] > 0) {
			line += ret[1] + " 볼";
		}
		System.out.println(line);

		if (ret[0] == 3) {
			System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
			System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
			int flag = sc.nextInt();
			return playNext(flag);
		} else {
			return true;
		}

	}

	private static boolean playNext(int flag) {
		if(flag == 1) {
			return false;
		}else {
			return true;			
		}
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
			if (answer.length() == 3 && answer.charAt(0) != answer.charAt(1) && answer.charAt(1) != answer.charAt(2) && answer.charAt(0) != answer.charAt(2)) {
				break;
			}
		}
		return answer;
	}

}
