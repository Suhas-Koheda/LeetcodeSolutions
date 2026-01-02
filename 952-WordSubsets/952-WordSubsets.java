// Last updated: 02/01/2026, 10:08:50
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        Map<String, Map<Character, Integer>> map1 = getFrequencyMap(words1);

        Map<Character, Integer> map2 = new HashMap<>();
        for (String word : words2) {
            Map<Character, Integer> tempMap = new HashMap<>();
            for (char c : word.toCharArray()) {
                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
                int val1 = entry.getValue();
                int val2 = map2.getOrDefault(entry.getKey(), 0);
                map2.put(entry.getKey(), Math.max(val1, val2));
            }
        }

        List<String> result = new ArrayList<>();
        for (String word : words1) {
            boolean isUniversal = true;
            Map<Character, Integer> charMap = map1.get(word);

            for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
                if (!charMap.containsKey(entry.getKey()) || charMap.get(entry.getKey()) < entry.getValue()) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                result.add(word);
            }
        }

        return result;
    }

    private Map<String, Map<Character, Integer>> getFrequencyMap(String[] words) {
        Map<String, Map<Character, Integer>> map = new HashMap<>();
        for (String word : words) {
            Map<Character, Integer> charMap = new HashMap<>();
            for (char c : word.toCharArray()) {
                charMap.put(c, charMap.getOrDefault(c, 0) + 1);
            }
            map.put(word, charMap);
        }
        return map;
    }
}
