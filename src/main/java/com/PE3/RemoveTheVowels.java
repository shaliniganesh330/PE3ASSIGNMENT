package com.PE3;

public class RemoveTheVowels {
    public String removevowels(String[] names) {
        for (int i = 0; i < names.length; i++) {
            if(names.length!=0) {

                names[i] = names[i].replace("a", "")
                        .replace("e", "")
                        .replace("i", "")
                        .replace("o", "")
                        .replace("u", "");

//             System.out.println(names[i]);
                return names[i];
            }return null;
        }return null;
    }
}
//public static void main(String[] args)
//{
//    RemoveTheVowels vowels = new RemoveTheVowels() ;
//    String[] names ={" India","United States","Germany","Egypt","czechoslovakia"};
//    vowels.removevowels(names);
//}
