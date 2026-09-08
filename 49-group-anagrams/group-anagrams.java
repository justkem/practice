class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> track = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            track.putIfAbsent(sortedStr, new ArrayList<>());
            track.get(sortedStr).add(str);
        }

        return new ArrayList<>(track.values());
    }
}