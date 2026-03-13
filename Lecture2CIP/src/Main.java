//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter host address: ");
    String address = scanner.nextLine();
    try{
        InetAddress inetAddress = InetAddress.getByName(address);
        System.out.println("IP address: " + inetAddress.getHostAddress());
        System.out.println("Canonical host name: " + inetAddress.getCanonicalHostName());
        System.out.println("Is Reachable: " + inetAddress.isReachable(5000));
        }catch (Exception e){
        e.printStackTrace();

    }
}
