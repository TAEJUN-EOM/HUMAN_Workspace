/*
올해 중학생 키 입력값으로부터 유효범위를 체크해서 130~180를 벗어나면 OutOfRangeValueException 예외를 발생시킵니다.
예외 발생시킬때 메시지는 "유효범위보다 낮습니다." , "유효범위보다 높습니다." 를 설정합니다
예외가 발생되면 OutOfRangeValueException예외클래스에 저장된 작년도 키값으로 보정합니다.
올해의 중학생 평균 키를 출력합니다.
 */
public class ExceptionEx3 {
	public void checkTall(double tall) throws OutOfRangeValueException{
		//유효범위를 체크해서 130~180를 벗어나면 예외 RangeBoundsException 발생시킵니다.
		//예외 발생시킬때 메시지는 "유효범위보다 낮습니다." , "유효범위보다 높습니다." 를 설정
		 if (tall>180 ) 
			 throw new OutOfRangeValueException("유효범위보다 높습니다.");
		 if (tall<130)
			 throw new OutOfRangeValueException("유효범위보다 낮습니다.");
		}

	public double averageTall(double[] talls){
		 //올해의 중학생 평균 키를 계산해서 리턴
		double total = 0;
		 for (double t : talls) {
			 total += t;
		 }
		 return total/talls.length;
		}
		
	public static void main(String[] args){
		double[]  middle_talls = new double[] { 
				152,155.5,148.5,192,160,162,165,168,115,159,157,170,171
				};
		//배열에 저장된 키값의  유효범위를 체크해서 예외가 발생되면 예외처리
		//올해의 중학생 평균 키 출력
		ExceptionEx3 ex = new ExceptionEx3();
		for (int i=0;i<middle_talls.length;i++) {
			try {
			ex.checkTall(middle_talls[i]);
			}catch(OutOfRangeValueException e) {
				System.err.println(e.getMessage());
				middle_talls[i] = e.getMiddleAvgTall();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//for end
		System.out.printf("올해의 중학생 평균 키 : %1$.2f" , ex.averageTall(middle_talls));
		}
 
}
