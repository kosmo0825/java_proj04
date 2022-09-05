package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		//에스프레소, 카페라떼, 아포카토 주문할 경우 가격이 3,500원
		//아메리카노 를 주문할 경우 : 2,500원 
		//그외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴 입니다. 
		
		//출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다. 
		//      우리 매장에 없는 메뉴 입니다.
	    // << 완료 시간 : 17: 50분 >>
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문할 메뉴를 입력하세요. >> ");
		System.out.println("===============================");
		System.out.println("에스프레소 카페라떼 아포카도 아메리카노");
		System.out.println("===============================");
		
		String order = sc.next(); 
		int prise = 0; 
		
		if ( order.equals("에스프레소")||order.equals("카페라떼")||order.equals("아포카도")){
			prise = 3500; 
		
		}else if (order.equals("아메리카노")) {
			prise = 2500;
		}
		else {
			System.out.println("우리 매장에 없는 메뉴입니다. ");
		}
		System.out.printf("주문하신 %s는 가격이 %d원 입니다.", order, prise);
		
	}

}