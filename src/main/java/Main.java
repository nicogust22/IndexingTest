import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java -jar test.jar file1.txt file2.html");
            return;
        }

        IIndexing[] rules = {new IndexingFiveCharsLong(), new IndexingUpperCase() };

        for (String arg : args) {
            File file = new File(arg);
            if (!file.exists() || !file.isFile()) {
                System.out.println("Invalid file: " + arg);
                continue;
            }
            System.out.println("Processing File: " + arg);
            for (IIndexing rule : rules) {
                rule.doMain(file);
            }
        }
    }
}
