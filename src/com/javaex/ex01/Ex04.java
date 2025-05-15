package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {

	public static void main(String[] args) throws IOException {

		
		//<주스트림+buffedstream 사용>
		
		
		//주 스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\bufferedimg.jpg"); 
		
		
		//보조 스트림              //(데이터를 임시보관해준다)
		BufferedInputStream bin= new BufferedInputStream(in); //인풋 주소를 먹인다.
		BufferedOutputStream bout= new BufferedOutputStream(out);
		
		System.out.println("스트림 준비 완료");
		
		System.out.println("복사시작");
		while(true) {
			
			int data= bin.read();
			
			if(data == -1) {
				System.out.println("복사끝");
				break;
		
			}bout.write(data);
				
		}
	
		//스트림정리 
		bout.close();  //주스트림도 close해준다.
		bin.close();
		
		
		System.out.println("프로그램종료");
	}

}
