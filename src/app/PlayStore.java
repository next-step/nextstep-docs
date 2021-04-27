package app;

import java.util.Scanner;

public class PlayStore {
	private Scanner sc;

	public PlayStore(Scanner sc) {
		super();
		this.sc = sc;
	}

	public PlayStore() {
		sc = new Scanner(System.in);
	}

	public void play() {
		String answer = "111";
		int flag = 0;
		gamePlay(answer, flag);
		sc.close();
	}

	public void gamePlay(String answer, int flag) {
		while (flag != 2) {
			answer = generateAnswer(new String(answer));
			guide();
			String input = sc.next();
			int[] ret = calculate(input, answer);
			flag = guide(ret);
			answer = initAnswer(flag, answer);
		}
	}

	public void guide() {
		System.out.print("숫자를 입력해주세요 : ");
	}

	public int guide(int[] input) {
		String line = mentMaking(input);
		System.out.println(line);
		if (input[0] == 3) {
			System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료 \n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
			int flag = sc.nextInt();
			return flag;
		}
		return 0;
	}

	public String mentMaking(int[] input) {
		String ret = "";
		ret = mentMakingStrike(input, ret);
		ret = mentMakingBall(input, ret);
		ret = mentMakingNothing(input, ret);
		return ret;
	}

	public String mentMakingStrike(int[] input, String ret) {
		if (input[0] > 0) {
			ret += input[0] + " 스트라이크 ";
		}
		return ret;
	}

	public String mentMakingBall(int[] input, String ret) {
		if (input[1] > 0) {
			ret += input[1] + " 볼";
		}
		return ret;
	}

	public String mentMakingNothing(int[] input, String ret) {
		if (input[0] == 0 && input[1] == 0) {
			ret += "낫싱";
		}
		return ret;
	}

	public int[] calculate(String input, String answer) {
		int[] ret = new int[2];
		ret[0] = calculateStrike(input, answer);
		ret[1] = calculateBall(input, answer);
		return ret;
	}

	public int calculateBall(String input, String answer) {
		int ret = 0;
		ret = calculateMatch(input.charAt(0), answer.charAt(1), ret);
		ret = calculateMatch(input.charAt(0), answer.charAt(2), ret);
		ret = calculateMatch(input.charAt(1), answer.charAt(0), ret);
		ret = calculateMatch(input.charAt(1), answer.charAt(2), ret);
		ret = calculateMatch(input.charAt(2), answer.charAt(0), ret);
		ret = calculateMatch(input.charAt(2), answer.charAt(1), ret);
		return ret;
	}

	public int calculateStrike(String input, String answer) {
		int ret = 0;
		ret = calculateMatch(input.charAt(0), answer.charAt(0), ret);
		ret = calculateMatch(input.charAt(1), answer.charAt(1), ret);
		ret = calculateMatch(input.charAt(2), answer.charAt(2), ret);
		return ret;
	}

	public int calculateMatch(char a, char b, int ret) {
		if (a == b) {
			return ret + 1;
		}
		return ret;
	}

	public String generateAnswer(String answer) {
		if (isSafe(answer)) {
			return answer;
		}
		return generateNewAnswer();
	}

	public boolean isSafe(String answer) {
		if (answer.charAt(0) == answer.charAt(1) || answer.charAt(1) == answer.charAt(2) || answer.charAt(0) == answer.charAt(2)) {
			return false;
		}
		if (answer.charAt(0) == '0' || answer.charAt(1) == '0' || answer.charAt(2) == '0') {
			return false;
		}
		return true;
	}

	public String generateNewAnswer() {
		String ret = "";
		int temp = (int) (Math.random() * 999 + 1);
		ret = temp + "";
		if (temp >= 100 && temp <= 999 && isSafe(ret)) {
			return ret;
		}
		return generateNewAnswer();
	}

	public String initAnswer(int flag, String answer) {
		if (flag == 0 || flag == 2) {
			return answer;
		}
		if (flag == 1) {
			return "111";
		}
		return answer;
	}
}
