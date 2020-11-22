package Module8;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class E8_4_2 {
    public static void main(String[] args) {
        // задание IP-адреса в виде массива
        byte[] ip = {127, 21, 43, 10};
        try {
            InetAddress addr = InetAddress.getByAddress("University", ip);
            System.out.println(addr.getHostName() +
                    "-> соединение:" + addr.isReachable(1000));
        } catch (UnknownHostException e) {
            System.err.println("адрес недоступен " + e);
        } catch (IOException e) {
            System.err.println("ошибка потока " + e);
        }
    }
    /*public static void main(String[] args) throws MalformedURLException, UnknownHostException {
        Scanner scanner = new Scanner(System.in);
        String typeUrl = scanner.nextLine();
        InetAddress ipadr = InetAddress.getByName(typeUrl);
        URL url = new URL("https://" + typeUrl);
        System.out.println(ipadr.getHostName());
    }*/
}
