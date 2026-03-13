//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    try{
        InetAddress[] inetAddresses = InetAddress.getAllByName("ww.google.com");
        System.out.println("Ip Addresses for google.com ");
        for (InetAddress address : inetAddresses) {
            System.out.println(address.getHostAddress());
        }
    } catch (UnknownHostException e) {
        throw new RuntimeException(e);
    }
}
