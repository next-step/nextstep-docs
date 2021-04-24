import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String answer = "";
		answer += (int) (Math.random() * 9 + 1);
		answer += (int) (Math.random() * 9 + 1);
		answer += (int) (Math.random() * 9 + 1);

		while (true) {
			System.out.println("숫자를 입력해주세요 : ");
			String line = sc.next();

			if (answer.equals(line)) {
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
				System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
				break;
			}

		}

		sc.close();

	}

}
