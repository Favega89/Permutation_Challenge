package Main;

import java.util.List;
import Utils.Dictionary;
import Utils.RegExChecker;


public class Main {

    public static void main(String[] args){
        String word = "Robot";
        Dictionary dictionary = new Dictionary();
        RegExChecker regExChecker = new RegExChecker();
        List <String> results = regExChecker.check(word,dictionary.getWords());
        for(String found : results){
            if(dictionary.isEnglishWord(found)) {
                System.out.println(found.toLowerCase());
            }
        }
    }
}