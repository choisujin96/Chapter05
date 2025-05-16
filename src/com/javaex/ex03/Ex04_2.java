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
			
				
				if(str == null) {
					break;
				}
				//읽은 줄에서 이름,hp,company로 분리한다.
				//이효리, 010-3838-2020, 02-393-2929 --> [이효리] [010-3838-2020] [02-393-2929]
				String[] sArray = str.split(",");
			
				System.out.println(sArray[0]);
				System.out.println(sArray[1]);
				System.out.println(sArray[2]);
				System.out.println("********************");
				
				String name = sArray[0];
				String hp = sArray[1];
				String company = sArray[2];
				
				
				Person p = new Person(name,hp,company);
				
				//Person (주소)를 List에 추가한다.
				 pList.add(p);
				
			
			}
			
			/*
			//테스트전체값 출력
			System.out.println("---테스트전체값 출력-------------");
			System.out.println(pList.toString());
			
			
			//출력
			System.out.println("---출력----------------");
			for(int i=0; i<pList.size(); i++) {
				System.out.println(pList.get(i).toString());
			}
		
			
			//이름만 출력
			System.out.println("---이름만 출력--------------------");
			for(int i=0; i<pList.size(); i++) {
				System.out.println(pList.get(i).getName());
			}
			
			
			//첫번째 사람의 이름, 핸드폰
			System.out.println("---첫번째 사람의 이름, 핸드폰--------------------");
			/*
			System.out.println(pList.get(0).getName());
			System.out.println(pList.get(0).getHp());
			*/
			Person p00= pList.get(0);
			System.out.println(p00.getName());
			System.out.println(p00.getHp());
			System.out.println("********************");
			Person p01 = pList.get(1);
			Person p02 = pList.get(2);
			Person p03 = pList.get(1);
			
			Person p04 = new Person("최수진", "010-6666-9645", "031-2932-2323");
			pList.add(p04);
		
			Person p05 = new Person("신재평", "010-6666-4444", "02-3333-2323");
			pList.add(p05);
			
			//(하나씩꺼냄 : 전체에서)
			for (Person p : pList) {
				System.out.println("이름: " + p.getName());
				System.out.println("핸드폰: " + p.getHp());
				System.out.println("회사: " + p.getCompany());
				System.out.println("--------------------------------");
			}
		
		
		
	}

}
