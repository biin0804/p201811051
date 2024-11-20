package p201811051;

public class Main {
	public static void main(String[] args) {
		// 자신의 학번과 이름을 출력하라
		System.out.println("201811051 김정훈");
		System.out.println(Hello.sum(10));
		System.out.println(Hello.sum(100));
		System.out.println(Sansu.max(new int[] {8, 5, 6, 9, 4, 1, 7, 10, 3, 2, 8}));
		System.out.println(Sansu.max(new int[] {-2, 5, 6, 9,-6, 1, 7, 2, 8, 10}));
	}
}
