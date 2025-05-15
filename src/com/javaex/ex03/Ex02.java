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

public class Ex02 {

	public static void main(String[] args) throws IOException {

		
		//***메모파일이 UTF-8로 입력되지 않아(MS949형식으로 되어있음) 한글이 깨짐(읽지 못함 그래서 다르게 처리해야함)***
		//주스트림+보조스트림+보조스트림 조합으로 할 예정.
		//InputStream + InputStreamRedader + BufferedReader
		
		//읽기스트림준비(주+보조)
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt"); //주스트림-->2진수로 읽어온다.
		InputStreamReader isr = new InputStreamReader(in, "MS949");       //보조스트림(섞어쓰기 노노) --> MS949형식을 해석한다.
		BufferedReader br = new BufferedReader(isr);	//서로서로 연결	  //보조스트림(섞어쓰기 노노) --> MS949형식으로 해석된 글자를 버퍼에 담아서 처리한다.
		
		
		
		
		//쓰기스트림준비(주+보조)
		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");  //주스트림
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");             //보조스트림 번역할 형식도 같이 써줌.
		BufferedWriter bw = new BufferedWriter(osw);                               //보조스트림
		
		
		
		
		
		System.out.println("-----------------------스트림준비완료");
		
		
		while(true) {
			
			String str = br.readLine();

			if(str == null) {
				System.out.println("-----------------------읽기 끝");
				break;
			
			}
			
			//System.out.println(str);
			bw.write(str);
			bw.newLine();
			
		}
			
			//스트림 종료
			bw.close();
			br.close();
			System.out.println("-----------------------스트림준비완료");

	}

}
