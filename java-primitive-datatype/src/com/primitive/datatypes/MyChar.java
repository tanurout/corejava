package com.primitive.datatypes;

public class MyChar {
    private char ch;

    public MyChar(char c){
        this.ch = c;

    }

    public boolean isVowel() {
        if (
                ch == 'a'
                || ch == 'e'
                || ch == 'i'
                || ch == 'o'
                || ch == 'u')
            return true;
        return false;
    }
}
