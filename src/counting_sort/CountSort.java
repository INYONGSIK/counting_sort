package counting_sort;

import java.io.IOException;

public class CountSort {

	public static void main(String[] args) throws IOException {
		int[] rankOfScore = new int[101]; // 0~100점의 점수가 담긴 배열을 생성한다.
		int[] input = { 77, 79, 82, 100, 66, 77 };

		for (int i = 0; i < rankOfScore.length; i++) {
			int rank = 1;
			for (int j = 0; j < input.length; j++) {

				if (i > input[j]) {
					rank++;
				}
			}
			rankOfScore[i] = rank;
		}
		System.out.println(rankOfScore[66]);
	}

}
