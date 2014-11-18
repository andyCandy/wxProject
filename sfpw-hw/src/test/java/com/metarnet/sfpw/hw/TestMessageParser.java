package com.metarnet.sfpw.hw;

import java.io.FileInputStream;
import java.io.IOException;

import com.metarnet.sfpw.hw.util.MessageParser;

public class TestMessageParser {

	public static void main(String[] args) throws IOException {
		byte[] bs = new byte[1024*10];
		FileInputStream fin = new FileInputStream("F:log.txt");
		int count = fin.read(bs);
		String message = new String(bs,0,count,"gbk");
		fin.close();
		System.out.println(MessageParser.parseOltPort(message));
	}
	
}
