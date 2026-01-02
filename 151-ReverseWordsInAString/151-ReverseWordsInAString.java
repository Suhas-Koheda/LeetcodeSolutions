// Last updated: 02/01/2026, 10:09:52
class Solution {
    public String reverseWords(String s) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        // for (int i = 0; i < arr.size(); i++) {
        //     arr.set(i, arr.get(i).trim());
        // }
        // System.out.println(arr);
        Collections.reverse(arr);
        return String.join(" ", arr);
    }
}