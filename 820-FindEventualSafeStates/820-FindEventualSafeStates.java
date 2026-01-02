// Last updated: 02/01/2026, 10:09:00
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        int n=graph.length;
        List<Integer> list=new ArrayList();
        for(int i=0;i<n;i++){
            if(DFS(i,graph,map)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean DFS(int node,int[][]graph,HashMap<Integer,Boolean> map){
        if(map.containsKey(node))return map.get(node);
        map.put(node,false);
        for(int nei:graph[node]){
            if(!DFS(nei,graph,map)){
                return false;
            }
        }
        map.put(node,true);
        return true;
    }

}