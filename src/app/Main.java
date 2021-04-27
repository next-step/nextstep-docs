package app;

public class Main {

	// flag 0 게임을 계속 해야 하는 상태
	// flag 1 게임을 끝냈지만 정답을 맞추었는데 1을 누른 상태
	// flag 2 게임을 끝냈지만 정답을 맞추었는데 2를 누른 상태
	public static void main(String[] args) throws Exception {
		PlayStore store = new PlayStore();
		store.play();
	}

}
