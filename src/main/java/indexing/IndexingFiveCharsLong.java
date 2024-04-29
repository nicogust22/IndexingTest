import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IndexingFiveCharsLong implements IIndexing {
    @Override
    public void doMain(File file) {
        //Logic to filter
        System.out.println("["+file.getName()+"]"+"List of words that longer than 5 Characters:" );
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > 5) {
                        System.out.println(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
