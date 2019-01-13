/*Write a program to set up an array of places, Loop round and remove the vowels.
Display the new words in console*/
package com.stackroute.PE3;

public class RemoveTheVowels {
    public String removeVowels(String[] names) {
        for (int i = 0; i < names.length; i++) {
            if(names.length!=0) {
                //replacing the elements
                names[i] = names[i].replace("a", "")
                        .replace("e", "")
                        .replace("i", "")
                        .replace("o", "")
                        .replace("u", "");
                return names[i];
            }return "";
        }return "";
    }
}


