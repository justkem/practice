class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> output = new ArrayList<>();

        HashMap<String, List<String>> track = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);

            String word = String.valueOf(c);

            if (!track.containsKey(word)) {
                track.put(word, new ArrayList<String>());
            }  
            track.get(word).add(s);  
        }

        for (String key : track.keySet()) {
            output.add(track.get(key));
        }

        return output;
        
    }
}