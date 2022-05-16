package Utils;

import java.util.List;
import static Utils.Reader.readTxtFile;

public class Dictionary {

    private final String ENGLISH_WORDS_FILE_PATH = "src/main/resources/Words.txt";
    private List<String> words;

    public Dictionary() {
        this.words = readTxtFile(ENGLISH_WORDS_FILE_PATH);
    }

    public Boolean isEnglishWord(String word) {
        return words.stream().anyMatch(word::equalsIgnoreCase);
    }

    public List<String> getWords() {
        return words;
    }
}
