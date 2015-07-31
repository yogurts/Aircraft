package com.Exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Ita
 * 
 * Exception分为两种
 * RuntimeException及其子类，可以不明确处理
 * 否则，称为受检的异常(checked Exception)
 * 受检的异常，要求明确进行语法处理 要么捕(catch) 要么抛(throws):在方法的签名后面用throws xxx来声明
 */
public class ExceptionTrowsToOther {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("========Before========");
			readFile();
			System.out.println("========After========");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void readFile()throws IOException {
		FileInputStream in = new FileInputStream("C:\\works\\Serendipity\\grace\\src\\com\\Exception\\myfile.txt");
		int b;
		b = in.read();
		while (b != -1) {
			System.out.println((char)b);
			b = in.read();
		}
		in.close();
	}

}
