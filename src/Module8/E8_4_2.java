package Module8;

import org.w3c.dom.ls.LSOutput;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class E8_4_2 {
    public static void main(String[] args) throws MalformedURLException, UnknownHostException {
        Scanner scanner = new Scanner(System.in);
        String typeUrl = scanner.nextLine();
        InetAddress ipadr = InetAddress.getByName(typeUrl);
        URL url = new URL("https://" + typeUrl);
        System.out.println(ipadr.getHostName());
    }
}
