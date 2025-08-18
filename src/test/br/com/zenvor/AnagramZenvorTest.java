
package br.com.zenvor;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AnagramZenvorTest {

    @Test
    void generatesAllAnagramsForThreeDistinctLetters() {
        List<String> result = AnagramZenvor.generateAnagrams("abc");
        assertEquals(6, result.size());
        assertTrue(result.containsAll(
                Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")
        ));
    }

    @Test
    void generatesSingleAnagramForSingleCharacter() {
        List<String> result = AnagramZenvor.generateAnagrams("a");
        assertEquals(1, result.size());
        assertTrue(result.contains("a"));
    }

    @Test
    void returnsUniquePermutationsForInputWithRepeatedLetters() {
        List<String> result = AnagramZenvor.generateAnagrams("aab");
        Set<String> unique = new HashSet<>(result);
        assertEquals(3, unique.size());
        assertTrue(unique.containsAll(Arrays.asList("aab", "aba", "baa")));
    }

    @Test
    void returnsEmptyListForNullInput() {
        List<String> result = AnagramZenvor.generateAnagrams(null);
        assertTrue(result.isEmpty());
    }

    @Test
    void returnsEmptyListForEmptyInput() {
        List<String> result = AnagramZenvor.generateAnagrams("");
        assertTrue(result.isEmpty());
    }

    @Test
    void returnsEmptyListForNonAlphabeticCharacters() {
        List<String> result = AnagramZenvor.generateAnagrams("abc123");
        assertTrue(result.isEmpty());
    }
}