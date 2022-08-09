package com.practice2.run;

import com.practice2.model.dto.GalaxyNote9;
import com.practice2.model.dto.SmartPhone;
import com.practice2.model.dto.V40;

public class Run {

	public static void main(String[] args) {
		
		SmartPhone[] phone = new SmartPhone[2];
		
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		
		// for문을 이용하여  phone 객체배열에 모든 인덱스를 참조
		
		for (int i = 0; i < phone.length;i++) {
			phone[i].printMaker();
			phone[i].makeacall();
			phone[i].takeaCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
			
			System.out.println();
		}

	}

}
