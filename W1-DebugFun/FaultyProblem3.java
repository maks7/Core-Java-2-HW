package com.hackbulgaria.corejava;

public class FaultyProblem3 {
    
    public String reverseEveryWordInString(String sentence){
        String[] words = sentence.split(" ");
        
        StringBuilder strBuild = new StringBuilder();
        
     //   for (String word: words){
        for (int i = 0; i < words.length; i++) {
            strBuild = strBuild.append(reverse(words[i]));
            if (i != (words.length - 1))  
                strBuild.append(" ");
        }    
            //sentence = sentence.replace(word, reverse(word));
     //   }
        return strBuild.toString();
    }

    private CharSequence reverse(String word) {
        return Utils.reverseMe(word);
    }
}
