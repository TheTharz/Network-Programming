package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try (DatagramSocket server = new DatagramSocket(4222)) {
            byte[] buf = new byte[256];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);

            System.out.println("Server is listening on port 4222...");

            server.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());

            System.out.println("Message is: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
