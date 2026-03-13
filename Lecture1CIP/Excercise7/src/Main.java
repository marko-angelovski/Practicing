//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Path startPath = Paths.get("Lecture1CIP/src/");
    int days = 7;

    try{
        Files.walkFileTree(startPath,
                new SimpleFileVisitor<>() {
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                        LocalDate lastModifiedTime = attrs.lastModifiedTime()
                                .toInstant()
                                .atZone(ZoneId.systemDefault())
                                .toLocalDate();
                        LocalDate now = LocalDate.now();
                        if (lastModifiedTime.isAfter(now.minusDays(days))) {
                            System.out.println(file);
                        }
                        return FileVisitResult.CONTINUE;
                    }

                });
    }catch (IOException e){
        System.out.println("Error occurred");
    }
}
