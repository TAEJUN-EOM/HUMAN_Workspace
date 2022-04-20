package lab.workshop.lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public final static int LOTTO_NUM_CNT = 6;

	public int[] generateLottoNumbers() {
		 int[] lottoNumbers = new int[LOTTO_NUM_CNT];
		 for(int i=0;i<LOTTO_NUM_CNT;i++) {
			 lottoNumbers[i] = getRandomNumber();
			 for(int j=0;j<i;j++) {
				 if(lottoNumbers[j]==lottoNumbers[i]) {
					 --i;
				 }//if end
			 }//inner for end
		 }//outer for end
		return lottoNumbers;
	}

	public void displayLottoNumbers(int[] lottoNumbers) {
		sortLottoNumbers(lottoNumbers);
		System.out.println("\t<<Lotto>>\t");
		 for (int n : lottoNumbers) {
			   System.out.print(n+"  ");
		   }
	}

	public void sortLottoNumbers(int[] lottoNumbers) {
		Arrays.sort(lottoNumbers);	   
	}

	private static int getRandomNumber() {
		Random rand = new Random(); //(int)(Math.random(45)+1)
		int randomNumber = rand.nextInt(45) + 1;
		return randomNumber;
	}

}
