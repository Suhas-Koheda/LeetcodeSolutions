// Last updated: 02/01/2026, 10:08:12
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[j].contains(words[i]) && !arr.contains(words[i])){
                    arr.add(words[i]);
                }
            }
        }
        return arr;
    }
}