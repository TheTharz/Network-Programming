package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        try (DatagramSocket client = new DatagramSocket()) {
            InetAddress ipAddress = InetAddress.getLocalHost();
            String str = "Hello world!";
            byte[] buf = str.getBytes();

            DatagramPacket packet = new DatagramPacket(buf, buf.length, ipAddress, 4222);
            client.send(packet);

            System.out.println("Message sent: " + str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
