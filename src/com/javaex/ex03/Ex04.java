package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) throws IOException{

		//반복
		//===>리스트에 정리
		//[0x111][0x444][0x555]
		//[0x111] name = 이효리 [0x444] hp=010-5555-5555 [0x555]company=031-687-8798
		//for문으로 출력
		//문제에 있는 형식으로 출력한다.
		
		//읽기스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//출력스트림
		OutputStream out = new FileOutputStream("C:\\javaStudy\\PhoneDB_cccopyyy.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		ArrayList<Person> pList = new ArrayList<Person>();
		
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				//System.out.println("읽기끝");
				break;
			}
			
			bw.write(str);
			bw.newLine();

			//System.out.println(str);
			
			 String[] sArray = str.split(",");

			    if (sArray.length == 3) {
			        String name = sArray[0];
			        String hp = sArray[1];
			        String company = sArray[2];

			        Person p = new Person(name, hp, company);
			        pList.add(p);
			    }
			}

			// 스트림 닫기
			br.close();
			bw.close();

			// 출력 확인
			/*
			for (Person p : pList) {
			    System.out.println(p);
			}
			*/
			
			pList.add("최수진" , "010-0124-7777", "031-777-1245");
			
			for (Person p : pList) {
			    System.out.println("이름: " + p.getName());  
			    System.out.println("핸드폰: " + p.getHp());
			    System.out.println("회사: " + p.getCompany());
			    System.out.println("--------------------------------");
			}
		}

			

}
