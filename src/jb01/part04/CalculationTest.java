package jb01.part04;

public class CalculationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		a = 0;
		int b = 1;
		int c = 2;
		
		//변수의 값을 출력
		System.out.println("a="+a+":b="+b+":c="+c);
		
		//숫자 + 연산자 사용(계산)
		int sum = a+b+c;
		System.out.println("sum = "+sum);
		System.out.println("a+b+c = "+(a+b+c)); //아래 실행문의 출력 결과와 비교
		System.out.println("a+b+c = "+a+b+c); //위의 실행문의 출력 결과와 비교
		
		c = c + 10;
		System.out.println("c=(c+10) : "+c);
		
		//연산후 대입연산자 (+=) 사용 ( c = c+10 동일한 의미)
		c += 10;
		System.out.println("c += 10 = "+c);
		
		//논리반전연산자
		boolean boo1 = true;
		boolean boo2 = !boo1;
		
		System.out.println("boo1 : "+boo1);
		System.out.println("boo2 : "+boo2);
	}

}
