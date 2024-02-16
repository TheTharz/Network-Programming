package ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {

	
		
		static int port = 7777;

		public static void main(String[] args) throws IOException {
			
			System.out.println("\t\t\t Simple Socket Server Chat\n");
			System.out.println("\t\t\t=======================\n\n");
			
			//creating the server socket
			ServerSocket serversocket = new ServerSocket(port);
			Scanner ScannerInput = new Scanner(System.in);
			
			String input,output;
			
			try {
			//until a client is connected this will listen
			while(true) {
			//now socket will open and until a client is connected server will hold this socket
			Socket socket = serversocket.accept();
			System.out.println("Client is connected");
			//sending a message to client when client is connected
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			try {
				
				out.println("Welcome to Chat Application");
				
				while(true) {
					input = in.readLine();
					System.out.println("Client says : " + input);
					System.out.println("Server : ");
					output = ScannerInput.nextLine();
					
					out.println(output);
				}
				
			}finally {
				socket.close();
				out.close();
				in.close();
			}
			}
			}finally {
				serversocket.close();
				
			}
			
			
		}
	
}
