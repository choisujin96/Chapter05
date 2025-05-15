package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
									   //에러를 밖으로 내던지다. (공부떄매 하는 거임 약간의 무책임한 방법)							
	public static void main(String[] args) throws IOException {
	
		// I/O 스트림 준비물: 빨대꽂기
		//부모  //지정한 변수    //본체
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteimg.jpg");
		
		System.out.println("스트림준비완료");
		
		//반복
		while(true) {
			//읽기
			int data = in.read();             //1.한모금 읽고
			System.out.println(data);
			
			if(data == -1) { // 데이터 값이 -1이 될때까지 정보를 읽기 때문에 -1임
				System.out.println("읽기끝(-1)"); //3. -1이 되면 다 읽은 것. 빨대 끓는 소리(비유임) 나면서 종료.
				break;
			}
			
			//쓰기
			out.write(data);				//2.한모금 먹은 거 뱉고 를 반복
			
			
			
		} 

		
		System.out.println("프로그램 종료");
		
		//I/O 스트림 종료 : 빨대회수
		in.close();
		out.close(); //닫아야 에너지(?)가 많이 발생되지 않음
	}
}
