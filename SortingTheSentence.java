class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        
        for (String word : words) {
            if (word.length() > 0) {
                int num = (word.charAt(word.length() - 1) - '0') - 1;
                result[num] = word.substring(0, word.length() - 1);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (String w : result) {
             sb.append(w).append(" ");
        }
        
        return sb.toString().trim();
    }
}