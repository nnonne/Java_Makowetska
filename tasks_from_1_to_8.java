package cw_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class tasks_from_1_to_8 {
	public static void main(){
        String s1;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s1 = s1.replaceAll("^ +| +$|( )+", "$1");

        //1
        String[] words = s1.split(" ");
        System.out.println("Words count: " + words.length);

        //2
        for(int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
        System.out.println();

        //3
        for(int i = 0; i < words.length; i++){
            if(words[i].equals("small"))
                words[i] = "very large";
            System.out.print(words[i] + " ");
        }
        System.out.println();

        //4
        List<String> words2 = new ArrayList<>();
        for (String word: words
             ) {
            if(word.equals("a") || word.equals("an"))
                continue;
            else
                words2.add(word);
            System.out.print(word + " ");
        }
	    
	    s1 = sc.nextLine();
	    s1 = s1.replaceAll("^ +| +$|( )+", "$1");
	
	    //5
	    String[] arr = s1.split(" ");
	    for (String word: arr
	         ) {
	        if(word.equals("small") || word.equals("large"))
	            words.add("very");
	        words.add(word);
	    }
	    for (String word: words
	         ) {
	        System.out.print(word + " ");
	    }
	    System.out.println();
	
	    //6
	    StringBuffer sb = new StringBuffer(s1);
	    sb.append(", that we use to ilustrate the methods of class StringBuffer");
	    System.out.println(sb.toString());
	
	    //7
	    int cnt_words = arr.length, cnt_symbols = s1.length();
	    int cnt_znaks = 0, cnt_sentence = 0;
	    for(int i = 0; i < s1.length(); i++)
	    {
	        if(s1.charAt(i) == ','
	                || s1.charAt(i) == ':'
	                || s1.charAt(i) == ';')
	        {
	            cnt_znaks++;
	        }
	        if (s1.charAt(i) == '.'
	        || s1.charAt(i) == '!'
	        || s1.charAt(i) == '?')
	        {
	            cnt_znaks++;
	            cnt_sentence++;
	        }
	    }
	    System.out.println("Symbols: " + cnt_symbols);
	    System.out.println("Words: " + cnt_words);
	    System.out.println("Znaks: " + cnt_znaks);
	    System.out.println("Sentences: " + cnt_sentence);
	
	    //8
	    String enter_word = sc.nextLine();
	    for (String word: arr
	         ) {
	        if(enter_word.toLowerCase(Locale.ROOT).equals(word.toLowerCase(Locale.ROOT)))
	        {
	            System.out.println("Yes");
	            return;
	        }
	    }
	    System.out.println("No");
	}	
}
