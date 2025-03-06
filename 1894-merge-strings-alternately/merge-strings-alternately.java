class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        // Using stringbuilder as it is immutable, if we use String = "", it will create a new String every time!

        StringBuilder result = new StringBuilder();

        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                result.append(word1.charAt(i)); // Efficient, modifies the same object
            }
            if(i<word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}