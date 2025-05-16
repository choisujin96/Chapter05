package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex04_2 {

	public static void main(String[] args) throws IOException {
		//<정답공개>
		
		/*
		값 넣기 전 퍼슨에 있는 tostring이 잘 작동하는지 확인하기
		Person p = new Person("최수진","212","121");
		System.out.println(p.toString());
		*/		
		
		//리스트 만들기
		List<Person> pList = new ArrayList<Person>();
		
		//스트림준비
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//반복. 한 줄을 읽는다.
		while(true) {
			String str	= br.readLine();
			
			
			str.split(" ");
			
			
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
		
		/*
		 <문제>
		파일에서 한 줄(이효리)를 읽는다.
		이효리, 010-3838-2020, 02-393-2929
		읽은 줄에서 이름,hp,company로 분리한다.
		Person을 메모리에 올리고 이름,hp,company 를 초기화한다.
		리스트에 person 주소를 넣는다.
		
		(세번반복)
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
