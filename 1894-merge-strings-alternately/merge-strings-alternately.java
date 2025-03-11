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

    //Using Streams
    // public String mergeAlternately(String word1, String word2) {
    //     int maxLength=Math.max(word1.length(),word2.length());

    //     return IntStream.range(0,maxLength)
    //     .mapToObj(i->(i<word1.length()?String.valueOf(word1.charAt(i)):"")
    //     +(i<word2.length()?String.valueOf(word2.charAt(i)):"")).collect(Collectors.joining());
    // }
}