class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> freq = new HashMap<>();

      for (String word: strs){
        char[] ch = word.toCharArray();
        Arrays.sort(ch);
        String sortedWord = new String(ch);

        if(!freq.containsKey(sortedWord)){
            freq.put(sortedWord,new ArrayList<>());
        }

        freq.get(sortedWord).add(word);
      }

      return new ArrayList<>(freq.values());  
    }
}
