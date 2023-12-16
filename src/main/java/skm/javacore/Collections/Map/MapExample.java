package skm.javacore.Collections.Map;

import java.util.*;
import java.util.stream.Stream;

public class MapExample {


    public static void main(String[] args) {
        String sample= "This is an awesome occasion."
                +"This has never happened before.";

        HashMap<Character,Integer> mapOccurances=new HashMap<>();
        //1-Count ocurrances of a character the string
        List<Character> characterList=new ArrayList<>();
        for (int i=0;i<sample.length();i++) {
            characterList.add(sample.charAt(i));
        }

        for (Character character:characterList) {
            mapOccurances.put(character, Collections.frequency(characterList,character));
        }
        System.out.println(mapOccurances);

        //2-How many times words are present in a string
        String[] sampleArray=sample.split("\\s+");
        List<String> wordList=List.of(sampleArray);
        HashMap<String,Integer> mapWords=new HashMap<>();
        for (String word:wordList) {
            mapWords.put(word,Collections.frequency(wordList,word));
        }
        System.out.println(mapWords);




    }
}
