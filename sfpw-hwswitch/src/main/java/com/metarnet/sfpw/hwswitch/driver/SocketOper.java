package com.metarnet.sfpw.hwswitch.driver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.metarnet.sfpw.hwswitch.util.HwConfig;

public class SocketOper {

	private Socket socket;
	
	private InputStream input;
	
	private byte[] buffer = new byte[1024];
	
	private OutputStream output;
	
	private HwConfig config;
	
	public void setConfig(HwConfig config) {
		this.config = config;
	}

	public void init() throws UnknownHostException, IOException{
		
		socket = new Socket(config.getWsServer(),Integer.parseInt(config.getWsPort()));
		socket.close();
		
	}
	
	public synchronized String request(String requestStr) throws IOException{
		
		socket = new Socket(config.getWsServer(),Integer.parseInt(config.getWsPort()));
		
		StringBuffer result = new StringBuffer();
		
		int inputlength = 0;
		
		output = socket.getOutputStream();
		
		output.write(requestStr.getBytes());
		
		input = socket.getInputStream();
		
		while((inputlength = input.read(buffer)) != -1){
			result.append(new String(buffer,0,inputlength));
		}
		
		close();
		
		return result.toString();
		
	}
	
	public void close() throws IOException{
		
		if(input != null){
			input.close();
		}
		
		if(output != null){
			output.close();
		}
	
		if(socket != null && !socket.isClosed()){
			socket.close();
		}
	}
	
}
