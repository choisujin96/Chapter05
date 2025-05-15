package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args)throws IOException  {

		//***메모파일이 UTF-8로 입력되어 한글이 깨지지 않음***
		//얘는 UTF-8만 번역할 수 있음.
		
		//외부에서 문자 데이터를 읽어오는 인풋역할. (예: 파일, 네트워크 등)
		//주스트림준비
		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		
		//보조스트림 준비
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("스트림 준비 완료");
		
		
		while(true) {
			
		//문자열에 담기	    //한 줄씩 읽는 것
			String str = br.readLine();
		
			//주소를 비교하기 때문에 == 이걸 사용.
			if(str == null) {
				System.out.println("파일읽기 끝");
				break;
				
			}
			
			System.out.println(str);
		
		}
		
		//스트림종료
		br.close();
		System.out.println("프로그램종료");
	
	}
	
	
}
