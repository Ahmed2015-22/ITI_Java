package ipaddress;

public class SplitIPAddress {
    private String ip;

    public SplitIPAddress(String ip) {
        this.ip = ip;
    }

    public void SplitAndPrint() {

        String[] parts = ip.split("\\.");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}
