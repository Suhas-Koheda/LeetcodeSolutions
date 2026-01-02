// Last updated: 02/01/2026, 10:07:21
import java.util.HashMap;

class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> tree = new HashMap<>();
        for (int i : nums) {
            int x = findSum(i);
            ArrayList<Integer> list = tree.getOrDefault(x, new ArrayList<>());
            list.add(i);
            tree.put(x, list);
        }
        Iterator<Integer> i = tree.keySet().iterator();
        while (i.hasNext()) {
            Integer key = i.next(); 
            if (tree.get(key).size() == 1) {
                i.remove();
            }
        }
        if(tree.keySet().size()==0){
            return -1;
        }
        int maxx=0;
        for(int k:tree.keySet()){
        ArrayList<Integer>list=tree.get(k);
        Collections.sort(list);
        int j=list.size()-1;
        maxx=(maxx>(list.get(j)+list.get(j-1))?maxx:list.get(j)+list.get(j-1));
        }
        System.out.println(tree);
        return maxx;
    }

    int findSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum = sum + (x % 10);
            x = x / 10;
        }
        return sum;
    }
}