package com.zagniotov.puzzles.strings;

class AnagramTake2 {

    AnagramTake2() {

    }

    boolean isAnagram(final String first, final String second) {
        if (first.length() != second.length()) {
            return false;
        }

        int counter = 0;
        final int[] cached = new int[255]; // Extended ASCII set: 8-bit characters
        char[] firstChars = first.toLowerCase().toCharArray();
        char[] secondChars = second.toLowerCase().toCharArray();
        for (int idx = 0; idx < first.length(); idx++) {
            if (++cached[firstChars[idx]] == 1) {
                counter++;
            }

            if (--cached[secondChars[idx]] == 0) {
                counter--;
            }
        }

        return counter == 0;
    }
}
