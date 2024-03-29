package ServerClient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	static int port = 6600;

	public static void main(String[] args) throws IOException {
		
		System.out.println("\t\t\t Simple Socket Server\n");
		System.out.println("\t\t\t=======================\n\n");
		
		//creating the server socket
		ServerSocket serversocket = new ServerSocket(port);
		
		try {
		//until a client is connected this will listen
		while(true) {
		//now socket will open and until a client is connected server will hold this socket
		Socket socket = serversocket.accept();
		System.out.println("Client is connected");
		
		try {
			//sending a message to client when client is connected
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			out.println("Welcome to Socket Programming");
		}finally {
			socket.close();
		}}
		}finally {
			serversocket.close();
			
		}
		
		
	}

}
