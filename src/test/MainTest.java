package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import app.PlayStore;

class MainTest {

	private static PlayStore store;
	
	@BeforeAll
	static void storeMaking() {
		store = new PlayStore();		
	}
	
	@Test
	void testGuideInt() {
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j <= 3 ; j++) {
				assertEquals(0, store.guide(new int[] {i, j}));
			}
		}
	}

	@Test
	void testMentMaking() {
		
		assertEquals("낫싱", store.mentMaking(new int[] {0, 0}));
		assertEquals("1 볼", store.mentMaking(new int[] {0, 1}));
		assertEquals("2 볼", store.mentMaking(new int[] {0, 2}));
		assertEquals("3 볼", store.mentMaking(new int[] {0, 3}));
		assertEquals("1 스트라이크 ", store.mentMaking(new int[] {1, 0}));
		assertEquals("2 스트라이크 ", store.mentMaking(new int[] {2, 0}));
		assertEquals("3 스트라이크 ", store.mentMaking(new int[] {3, 0}));
		for(int i = 1 ; i <= 3; i++) {
			for(int j = 1 ; j<= 3; j++) {
				assertEquals(i + " 스트라이크 " + j + " 볼", store.mentMaking(new int[] {i, j}));
			}
		}
				
	}

	@Test
	void testMentMakingStrike() {
		assertEquals("3 스트라이크 ", store.mentMakingStrike(new int[] {3, 0}, ""));
		assertEquals("2 스트라이크 ", store.mentMakingStrike(new int[] {2, 0}, ""));
		assertEquals("1 스트라이크 ", store.mentMakingStrike(new int[] {1, 0}, ""));
	}

	@Test
	void testMentMakingBall() {
		assertEquals("1 볼", store.mentMakingBall(new int[] {0, 1}, ""));
		assertEquals("2 볼", store.mentMakingBall(new int[] {0, 2}, ""));
		assertEquals("3 볼", store.mentMakingBall(new int[] {0, 3}, ""));
	}

	@Test
	void testMentMakingNothing() {
		assertEquals("낫싱", store.mentMakingNothing(new int[] {0, 0}, ""));
	}

	@Test
	void testCalculate() {
		for(int a = 1 ; a <= 9 ; a++) {
			for(int b = 1; b <= 9 ; b++) {
				if(a == b) {
					continue;
				}
				for(int c = 1; c <= 9 ; c++) {
					if(a == b || a == c || b == c) {
						continue;
					}
					for(int d = 1 ; d <= 9; d++) {
						for(int e = 1 ; e <= 9 ; e++) {
							if(d == e) {
								continue;
							}
							for(int f = 1 ; f <= 9 ; f++) {
								if(d == e || d == f || e == f) {
									continue;
								}
								String input = "" + a + b + c;
								String answer = "" + d + e + f;
								int [] ret = new int[2];
								for(int i = 0 ; i < 3 ; i++) {
									for(int j = 0 ; j < 3 ; j++) {
										if(input.charAt(i) == answer.charAt(j) && i == j) {
											ret[0]++;
										}
										if(input.charAt(i) == answer.charAt(j) && i != j) {
											ret[1]++;
										}
									}
								}
								assertEquals(ret[0], store.calculate(input, answer)[0]);
								assertEquals(ret[1], store.calculate(input, answer)[1]);
							}
						}
					}
				}
			}
		}
		
	}

	@Test
	void testCalculateBall() {
		for(int a = 1 ; a <= 9 ; a++) {
			for(int b = 1; b <= 9 ; b++) {
				if(a == b) {
					continue;
				}
				for(int c = 1; c <= 9 ; c++) {
					if(a == b || a == c || b == c) {
						continue;
					}
					for(int d = 1 ; d <= 9; d++) {
						for(int e = 1 ; e <= 9 ; e++) {
							if(d == e) {
								continue;
							}
							for(int f = 1 ; f <= 9 ; f++) {
								if(d == e || d == f || e == f) {
									continue;
								}
								String input = "" + a + b + c;
								String answer = "" + d + e + f;
								int [] ret = new int[2];
								for(int i = 0 ; i < 3 ; i++) {
									for(int j = 0 ; j < 3 ; j++) {
										if(input.charAt(i) == answer.charAt(j) && i != j) {
											ret[1]++;
										}
									}
								}
								assertEquals(ret[1], store.calculateBall(input, answer));
							}
						}
					}
				}
			}
		}
	}

	@Test
	void testCalculateStrike() {
		for(int a = 1 ; a <= 9 ; a++) {
			for(int b = 1; b <= 9 ; b++) {
				if(a == b) {
					continue;
				}
				for(int c = 1; c <= 9 ; c++) {
					if(a == b || a == c || b == c) {
						continue;
					}
					for(int d = 1 ; d <= 9; d++) {
						for(int e = 1 ; e <= 9 ; e++) {
							if(d == e) {
								continue;
							}
							for(int f = 1 ; f <= 9 ; f++) {
								if(d == e || d == f || e == f) {
									continue;
								}
								String input = "" + a + b + c;
								String answer = "" + d + e + f;
								int [] ret = new int[2];
								for(int i = 0 ; i < 3 ; i++) {
									for(int j = 0 ; j < 3 ; j++) {
										if(input.charAt(i) == answer.charAt(j) && i == j) {
											ret[0]++;
										}
									}
								}
								assertEquals(ret[0], store.calculate(input, answer)[0]);
							}
						}
					}
				}
			}
		}
	}

	@Test
	void testCalculateMatch() {
		for(char i = '1' ; i <= '9' ; i++) {
			for(char j = '1'; j <= '9' ; j++) {
				if(i == j) {
					assertEquals(1, store.calculateMatch(i, j, 0));					
				}else {
					assertEquals(0, store.calculateMatch(i, j, 0));
				}
			}
		}
	}

	@Test
	void testGenerateAnswer() {
		for(char a = '1' ; a <= '9'; a++) {
			for(char b = '1' ; b <= '9'; b++) {
				for(char c = '1'; c <= '9'; c++) {
					if(a == b || b == c || a == c) {
						assertNotEquals("" + a + b + c, store.generateAnswer("" + a + b + c));
					}else {
						assertEquals("" + a + b + c, store.generateAnswer("" + a + b + c));
					}
				}
			}
			
		}
	}

	@Test
	void testIsSafe() {
		for(char a = '1' ; a <= '9'; a++) {
			for(char b = '1' ; b <= '9'; b++) {
				for(char c = '1'; c <= '9'; c++) {
					if(a == b || b == c || a == c) {
						assertEquals(false, store.isSafe("" + a + b + c));
					}else {
						assertEquals(true, store.isSafe("" + a + b + c));
					}
				}
			}
		}
	}

	@Test
	void testGenerateNewAnswer() {
		for(int i = 0 ; i <= 10000000 ; i++) {
			String candi = store.generateNewAnswer();
			assertEquals(true, store.isSafe(candi));
		}
	}

	@Test
	void testInitAnswer() {
		assertEquals("123", store.initAnswer(0, "123"));
		assertEquals("111", store.initAnswer(1, "123"));
		assertEquals("123", store.initAnswer(2, "123"));
	}

}
