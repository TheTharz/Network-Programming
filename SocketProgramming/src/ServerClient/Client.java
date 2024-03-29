package ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	static int port = 6600;//same port as the server
	static String input;
	public static void main(String[] args) throws IOException {
		
		System.out.println("\t\t\tSimple Client Side\n");
		System.out.println("\t\t\t===================\n\n");
		
		//because server and client are in the same computer we are using getlocalhost()
		InetAddress ipAddress = InetAddress.getLocalHost();
		
		Socket socket = new Socket(ipAddress ,port);
		
		System.out.println("Server is connected....\n\n");
		
		//reading the messsage send from the server
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		in.readLine();
		
		System.out.println("Server says:" + input);
		
		System.out.println("Closing connection...");
		
		socket.close();
		in.close();
		
//		System.exit(0);
		}

}
