package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		
		//<엄청 빠르게 데이터 읽는 방법 - 주스트림(인풋,아웃풋)+배열사용>
		
		
		//스트림준비
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffimg.jpg");
		System.out.println("스트림준비완료");
		
		//1024모금을 담을 수 있는 케리어
		byte[] buff = new byte[1024];
		
		System.out.println("복사시작");
		
		while(true) {
			//int data = in.read();
			int data= in.read(buff); //1024만큼 모음
			System.out.println(data);
			
			
			if(data == -1) {
				System.out.println("(-1)복사끝");
				break;
			}
				
			out.write(buff); //케리어(배열)에 모은 걸 써~ 하고 내보내야함.	
				
		}
		
		
		//스트림종료
		out.close();
		in.close();

		System.out.println("프로그램 종료");
	}

}
