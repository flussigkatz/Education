package Module8;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class E8_4_1 {
    public static void main(String[] args) {
        InetAddress currentIP = null;
        InetAddress bsuIP = null;
        try {
            currentIP = InetAddress.getLocalHost();
            // вывод IP-адреса локального компьютера
            System.out.println("Мой IP -> " + currentIP.getHostAddress());
            bsuIP = InetAddress.getByName("www.ya.ru");
            // вывод IP-адреса БГУ www.bsu.by
            System.out.println("Обращаемся к -> " + bsuIP.getHostAddress());
        } catch (UnknownHostException e) {
            // если не удается найти IP
            System.err.println("адрес недоступен " + e);
        }
    }
    /*public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("localhost");
        System.out.println(address);
        address = InetAddress.getByName("www.yandex.ru");
        System.out.println(address);
        InetAddress[] sw = InetAddress.getAllByName("www.yandex.ru");
        System.out.println(Arrays.toString(sw));
    }*/
}
