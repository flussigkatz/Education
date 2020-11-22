package Module8;

import java.net.URL;
class MyURL {
    public static void main(String args[]) throws Exception {
        URL hp = new URL("https://www.wikipedia.org/");
        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());
        System.out.println("Host: " + hp.getHost());
        System.out.println("File: " + hp.getFile());
        System.out.println("Ext: " + hp.toExternalForm());
    }
}