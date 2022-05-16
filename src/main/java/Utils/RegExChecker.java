package Utils;

import java.util.List;
import java.util.stream.Collectors;

public class RegExChecker {

    public List<String> check(String word, List<String> dictionary){
        String regex = "[^" + word.toLowerCase() + "]";
        return dictionary.stream()
                .filter(x-> !x.matches(".*" + regex + ".*"))
                .collect(Collectors.toList());
    }
}

