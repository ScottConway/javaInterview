package org.conway.interview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramServiceTest
{
    private AnagramService service;

    @Before
    public void setUp() {
        service = new AnagramService();
    }

    @Test
    public void an_Anagram_is_Two_String_with_Same_Characters_but_Different_order() {
        assertTrue(service.isAnagram("mary", "army"));
        assertFalse(service.isAnagram("mary", "tree"));
    }

//    @Test
//    public void an_Anagram_Is_Case_Insensitive() {
//        assertTrue(service.isAnagram("Mary", "ArmY"));
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    @Test
//    public void a_Word_Cannot_Be_An_Anagram_Of_Itself() {
//        assertFalse(service.isAnagram("mary", "mary"));
//        assertFalse(service.isAnagram("mary", "MaRy"));
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    @Test
//    public void words_Have_To_Use_The_Same_Number_Of_The_Same_Characters() {
//        assertFalse(service.isAnagram("mary", "marry"));
//        assertFalse(service.isAnagram("axx", "xaa"));
//        assertFalse(service.isAnagram("axx", "aax"));
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    @Test
//    public void beginning_And_End_Spaces_Are_Not_Counted() {
//        assertTrue(service.isAnagram(" mary", "army    "));
//        assertFalse(service.isAnagram(" mary", "mary    "));
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    @Test
//    public void multiple_Words_Are_Allowed() {
//        assertTrue(service.isAnagram("Florence Nightingale", "Flit on cheering angel"));
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    @Test
//    public void punctuation_Is_Ignored() {
//        assertTrue(service.isAnagram("Florence Nightingale", "Flit on, cheering angel!"));
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    @Test
//    public void an_Anagram_Is_Transitive() {
//        assertTrue(service.isAnagram("mary", "army"));
//        assertTrue(service.isAnagram("army", "mary"));
//        assertFalse(service.isAnagram("mary", "tree"));
//        assertFalse(service.isAnagram("tree", "mary"));
//        assertFalse(service.isAnagram("ack", "acks"));
//        assertFalse(service.isAnagram("acks", "ack"));
//    }
//





































//    @Test
//    public void same_Letters_In_Same_Order_But_Different_Words_Does_An_Anagram_Make() {
//        assertTrue(service.isAnagram("I said ok.", "Is aid ok?"));
//    }
}
