import Utils.Dictionary;
import org.junit.Assert;
import org.junit.Test;

public class DictionaryTest {
    private Dictionary dictionary;

    @Test
    public void isEnglishWordTrue() {
        this.dictionary = new Dictionary();
        Assert.assertTrue(dictionary.isEnglishWord("main"));
    }

    @Test
    public void isEnglishWordFalse() {
        this.dictionary = new Dictionary();
        Assert.assertFalse(dictionary.isEnglishWord("perro"));
    }
}
