package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
        for (int i = 0; i < word.length(); i++) {
    		if (word.substring(i,i+1).equals("a")||word.substring(i,i+1).equals("e")||word.substring(i,i+1).equals("i")||word.substring(i,i+1).equals("o")||word.substring(i,i+1).equals("u")){
      			return i;
    		}
  		}
 		return -1;
    }

    public String pigLatin(String sWord) {
		if (findFirstVowel(sWord) == -1) {
			return sWord + "ay";
		}
		else if (findFirstVowel(sWord) == 0) {
			return sWord + "way";
		}
		else if (sWord.substring(0,2).equals("qu")) {
			return sWord.substring(2,sWord.length()) + "quay";
		}
		else {
			return sWord.substring(findFirstVowel(sWord), sWord.length()) + sWord.substring(0, findFirstVowel(sWord));
		}
        return null;
    }
}
