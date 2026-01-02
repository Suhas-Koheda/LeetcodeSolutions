// Last updated: 02/01/2026, 10:08:14
class Solution {
    public boolean canConstruct(String str, int k) {
        if(str.length()<=0 || str.length()<k){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : str.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int odd=0;
        for(char i: map.keySet()){
            if(map.get(i)%2!=0){
                odd++;
            }
        }
        return (odd<=k ? true: false);
    }
}
