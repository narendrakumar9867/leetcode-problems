class Solution {
    public char findTheDifference(String s, String t) {
        
        long sum1 = 0;
        long sum2 = 0;

        for(char c: t.toCharArray()) {
            sum1 += c - 'a';
        }

        for(char c: s.toCharArray()) {
            sum2 += c - 'a';
        }

        return (char) (sum1 - sum2 + 'a');

    }
}