package ipaddress;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String ip = input.nextLine();
        SplitIPAddress splitter = new SplitIPAddress(ip);
        splitter.SplitAndPrint();

    }
}
