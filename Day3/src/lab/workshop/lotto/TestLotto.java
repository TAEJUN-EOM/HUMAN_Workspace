package lab.workshop.lotto;

public class TestLotto {

	public static void main(String[] args) {
		Lotto ex = new Lotto();
		int[] lottoNumbers = ex.generateLottoNumbers();
		ex.displayLottoNumbers(lottoNumbers);

	}

}
