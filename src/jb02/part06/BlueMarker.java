package jb02.part06;

/*
 	FileName : 청색보드마카.java
 	:	현실세계(Real world)의 물리적 사물(객체)을 "속성, 기능"을 Java의 class로 표현
 	:	Bean / POJO (Plain Old Java Object) 
 */

public class BlueMarker {

		
		///상태/속성 정보 ==> Field
		String 이름 = "청색 보드마카";
		String 칼라 = "청색";
		int 잉크량 = 100;
		
		///행위 ==> method
		public void 사용하다(){
			잉크량--;
		}
		
		public  boolean 사용가능유무() {
			if(잉크량 == 0) {
				return false;
			}else {
				return true;
			}
		}

}
