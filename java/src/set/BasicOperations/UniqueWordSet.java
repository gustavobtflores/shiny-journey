package set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordSet {
    Set<String> wordSet;

    public UniqueWordSet() {
        this.wordSet = new HashSet<>();
    }

    public static void main(String[] args) {
        UniqueWordSet uniqueWordSet = new UniqueWordSet();

        uniqueWordSet.addWord("Maçã");
        uniqueWordSet.addWord("Camiseta");
        uniqueWordSet.addWord("Novela");
        uniqueWordSet.addWord("Novela");
        uniqueWordSet.removeWord("Camiseta");

        uniqueWordSet.showUniqueWords();
    }

    public void addWord(String word) {
        wordSet.add(word);
    }

    public void removeWord(String word) {
        if (wordSet.isEmpty()) {
            System.out.println("Não é possível remover de uma lista vazia");
            return;
        }

        for (String currentWord : wordSet) {
            if (currentWord.equals(word)) {
                wordSet.remove(currentWord);
                break;
            }
        }

//        wordSet.removeIf(currentWord -> currentWord.equals(word));
    }

    public void findWord(String word) {
        for (String currentWord : wordSet) {
            if (currentWord.equals(word)) {
                System.out.println("A palavra " + word + " está presente no Set");
                return;
            }
        }

        System.out.println("A palavra " + word + " não está presente no Set");
    }

    public void showUniqueWords(){
        System.out.println(wordSet);
    }
}
