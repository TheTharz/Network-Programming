package ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat {

	static int port = 7777;//same port as the server
	public static void main(String[] args) throws IOException {
		
		System.out.println("\t\t\tSimple Client Side\n");
		System.out.println("\t\t\t===================\n\n");
		
		Scanner ScannerInput = new Scanner(System.in);
		
		String input,output;
		
		//because server and client are in the same computer we are using getlocalhost()
		InetAddress ipAddress = InetAddress.getLocalHost();
		
		Socket socket = new Socket(ipAddress ,port);
		
		System.out.println("Server is connected....\n\n");
		
		//reading the messsage send from the server
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		try {
			
			out.println("Welcome to Chat Application");
			
			while(true) {
				input = in.readLine();
				System.out.println("Server says : " + input);
				System.out.println("Client : ");
				output = ScannerInput.nextLine();
				
				out.println(output);
			}
			
		}finally {
			socket.close();
			out.close();
			in.close();
		}
		}


}
