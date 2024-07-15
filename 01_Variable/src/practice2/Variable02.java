package practice2;

public class Variable02 {
	
	public static void main(String[] args)
	{
		
		// 1. 대소문자가 구분된다.
		int num = 10;
		int nuM = 20;
		
		System.out.println(num);
		System.out.println(nuM);
		
		//2. 예약어를 사용하면 안 된다.
		//int class;
		
		//3. 숫자로 시작하면 안 된다.
		//int 1age;
		int age1;
		
		//4.특수문자는 언더바와 달러만 가능
		//String sh@rp;
		String $harp;
		
		//5. 카멜케이스 : 소문자로 시작하여 다음단어의 첫글자가 대문자로 작성
		//회원이름
		String userName;
		String username;   //문법상 오류는 어나너, 추후 어떤 환경에서는 오류가 발생할수도 있다
		//제품(product)의 번호(id) =>정수형
		
		int productId;
		String bookTitle;
		
		
	    
	}

}
