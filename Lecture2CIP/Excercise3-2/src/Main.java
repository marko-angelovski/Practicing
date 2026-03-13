//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String urlString = "https://uacs.edu.mk/";
    try {
        URL url = new URL(urlString);
        System.out.println(url.getAuthority());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getQuery());
        System.out.println(url.getFile());
        System.out.println(url.getPath());
        System.out.println(url.getProtocol());
        System.out.println(url);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        Path filePath = Paths.get("uacs.html");
        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("uacs.html"));
        String line;

        while ((line = bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();

        System.out.println("Content Downloaded");

    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
