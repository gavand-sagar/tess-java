import java.util.HashSet;
import  java.util.Set;

public class WordsCollection {
    private  Set<String> dictionary;

    public WordsCollection() {
        this.dictionary = new HashSet<String>();
        dictionary.add("apple");
        dictionary.add("is");
        dictionary.add("my");
        dictionary.add("favourite");
        dictionary.add("I");
        dictionary.add("likes");
        dictionary.add("am");
        dictionary.add("he");
        dictionary.add("there");
        dictionary.add("nice");
        dictionary.add("a");
        dictionary.add("good");
        dictionary.add("so");
        dictionary.add("programmer");
    }

    public Set<String> getWords(){
        return dictionary;
    }

    public boolean isValid(String word){
        return dictionary.contains(word);
    }

}
