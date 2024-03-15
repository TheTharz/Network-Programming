package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) throws IOException {
		DatagramSocket client = new DatagramSocket();
		InetAddress ipAdress = InetAddress.getLocalHost();
		String str = "Hello world!";
		byte[] buf = str.getBytes();
		
		DatagramPacket pac = new DatagramPacket(buf,buf.length,ipAdress,4222);
		client.send(pac);
		client.close();
	}

}
