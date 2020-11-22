package Module8;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SmallServerSocket {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8090);
             PrintStream ps = new PrintStream(server.accept().getOutputStream())) {
            ps.println("привет!");
            ps.flush();
        } catch (IOException e) {
            System.err.println("Ошибка соединения потока: " + e);
        }
    }
}
