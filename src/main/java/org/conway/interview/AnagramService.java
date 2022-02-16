package org.conway.interview;

public class AnagramService {
    public boolean isAnagram(String string1, String string2) {
        for (char c:string1.toCharArray()) {
            if (string2.indexOf(c) == -1)
                return false;
        }
        return true;
    }
}
