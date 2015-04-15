package com.hackbulgaria.task3.wc;

public class WordCountResult {

    private int wordsCount;
    private int linesCount;
    private int charsCount;
    
    WordCountResult() {
        this(0, 0, 0);
    }
    
    WordCountResult(int wc, int lc, int cc) {
        wordsCount = wc;
        linesCount = lc;
        charsCount = cc;
    }
    
    public void setWordsCount(int wc) {
        wordsCount = wc;
    }
    
    public int getWordsCount() {
        return wordsCount;
    }
    
    public void setLinesCount(int lc) {
        linesCount = lc;
    }
    
    public int getLinesCount() {
        return linesCount;
    }
    
    public void setCharsCount(int cc) {
        charsCount = cc;
    }
    
    public int getCharsCount() {
        return charsCount;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        WordCountResult obj = null;
        if (o instanceof WordCountResult) {
            obj = (WordCountResult) o;
        }
        
        if ((this.wordsCount != obj.wordsCount) || (this.linesCount != obj.linesCount) || (this.charsCount != obj.charsCount) ) {
            return false;
        }
            
        return true;
    }
    @Override
    public String toString() {
        return "Words count: " + wordsCount + ", Lines count: " + linesCount + ", Chars count: " + charsCount;
    }
}
