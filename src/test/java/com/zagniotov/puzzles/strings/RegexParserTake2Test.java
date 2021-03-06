package com.zagniotov.puzzles.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegexParserTake2Test {

    @Test
    public void testIsMatch() throws Exception {
        final RegexParserTake2 regexParser = new RegexParserTake2();

        assertTrue(regexParser.isMatch("ac", "ab*c"));
        assertTrue(regexParser.isMatch("abcbcd", "a.*c.*d"));
        assertTrue(regexParser.isMatch("abbbc", "ab*c"));
        assertTrue(regexParser.isMatch("aab", "c*a*b"));
        assertTrue(regexParser.isMatch("aa", "aa"));
        assertTrue(regexParser.isMatch("aa", "a*"));
        assertTrue(regexParser.isMatch("aa", ".*"));
        assertTrue(regexParser.isMatch("ab", ".*"));
        assertTrue(regexParser.isMatch("aa", ".a"));
        assertTrue(regexParser.isMatch("abca", ".b*c*a"));
        assertTrue(regexParser.isMatch("aa", "a*a"));
        assertTrue(regexParser.isMatch("aaaab", "a*b"));
        assertTrue(regexParser.isMatch("abbc", "ab*bbc"));
        assertTrue(regexParser.isMatch("a", "ab*"));
        assertTrue(regexParser.isMatch("", "c*c*"));
        assertTrue(regexParser.isMatch("", ".*.*"));
        assertTrue(regexParser.isMatch("", "a*"));
        assertTrue(regexParser.isMatch("a", ".*.a*"));
        assertTrue(regexParser.isMatch("a", "b*a"));

        assertFalse(regexParser.isMatch("", "..a*"));
        assertFalse(regexParser.isMatch("", "*.a*"));
        assertFalse(regexParser.isMatch("", ".a*"));
        assertFalse(regexParser.isMatch("", ".*.a*"));
        assertFalse(regexParser.isMatch("", ".*.a*"));
        assertFalse(regexParser.isMatch("a", "a.*.a*"));
        assertFalse(regexParser.isMatch("a", ".*..a*"));
        assertFalse(regexParser.isMatch("a", ".a"));
        assertFalse(regexParser.isMatch("a", "ab*a"));
        assertFalse(regexParser.isMatch("a", "b"));
        assertFalse(regexParser.isMatch("aa", "a"));
        assertFalse(regexParser.isMatch("aaa", "aa"));
        assertFalse(regexParser.isMatch("abc", ".a*c"));
        assertFalse(regexParser.isMatch("aabcde", "c*a*b"));
        assertFalse(regexParser.isMatch("aaba", "ab*a*c*a"));
        assertFalse(regexParser.isMatch("aaa", "ab*a"));
        assertFalse(regexParser.isMatch("aaabbbabc", "*abc"));
        assertFalse(regexParser.isMatch("abc", "a.*b"));
        assertFalse(regexParser.isMatch("ab", ".*c"));

    }
}
