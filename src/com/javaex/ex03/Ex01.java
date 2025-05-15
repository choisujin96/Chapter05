package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		//***메모파일이 UTF-8로 입력되지 않아(MS949형식으로 되어있음) 한글이 깨짐(읽지 못함 그래서 다르게 처리해야함)***
		
		//주스트림준비
		Reader fr = new FileReader("C:\\javaStudy\\MS949.txt");
		
		//보조 스트림 준비 (얘는 섞어쓰기 안함.)
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("----------------------스트링 준비 완료");
		
		
		while(true) {
			
			String str = br.readLine(); //한 줄씩 읽는다.
			
			if(str == null) {
				System.out.println("----------------------파일 읽기 끝");
				break;
			}
			
			System.out.println(str);
			
		}
		//스트림 닫기
		br.close();
		System.out.println("----------------------프로그램 종료");
		
		
		
	}

}
