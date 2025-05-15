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

public class Ex03 {

	public static void main(String[] args) throws IOException{
		
		
		//폰디비첵스트 파일을 하ㄴ줄씩 읽는다.
		//","로 구문한다 --> 배열
		//문제에 있는 형식으로 출력
		
		//읽기스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader (in, "UTF-8");
		BufferedReader br = new BufferedReader (isr);
		
		//출력스트림
		OutputStream out= new FileOutputStream("C:\\javaStudy\\PhoneDB_copy.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		while(true) {
			
			String str = br.readLine();
			
			if(str == null) {
				//System.out.println("---------읽기 완료");
				break;
			}
			bw.write(str);
			bw.newLine();
			
			//System.out.println(str);
			
			String[] sArray = str.split(","); // ","를 기준(기준은 내가 정할 수 있음)으로 나눠서 배열(주소)에 담아달라.
			for(int i=0; i<sArray.length; i++) {  // 그리고 배열의 주소를 리턴한다.
				System.out.println(sArray[i]);
				
			}

		}
		
		bw.close();
		br.close();		
		
	
	}

	

	
}
