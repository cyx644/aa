package com.etc.a1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		//新建端口
		ServerSocket ss=new ServerSocket(8888);
		//接收客户端
		Socket socket=ss.accept();
		//得到socket的读写
		socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();
		
		
	}

}
