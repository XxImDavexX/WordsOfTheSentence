package test;

import java.util.Scanner;

public class WordsOfTheSentence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String sentence;
        String words[];
        System.out.println("Insert the sentence: ");
        sentence = keyboard.nextLine();
        words = sentence.split(" ");
        for(int i = 0; i < words.length ; i++){
            System.out.println(words[i]);
        }
    }
}
