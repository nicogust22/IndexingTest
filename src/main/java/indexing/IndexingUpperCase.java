import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IndexingUpperCase implements IIndexing {
    @Override
    public void doMain(File file) {
        int uppercaseWordsCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
                        uppercaseWordsCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("["+file.getName()+"]"+"Number of words starting with an uppercase letter:");
    }
}
