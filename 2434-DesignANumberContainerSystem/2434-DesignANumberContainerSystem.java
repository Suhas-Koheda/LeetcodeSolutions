// Last updated: 02/01/2026, 10:07:27
class NumberContainers {
        HashMap<Integer,TreeSet<Integer>> nti;
        HashMap<Integer,Integer> itn;
    public NumberContainers() {
        nti=new HashMap<>();
        itn=new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(itn.containsKey(index)){
            int prev=itn.get(index);
            nti.get(prev).remove(index);
            if(nti.get(prev).isEmpty()){
                nti.remove(prev);
            }
        }
        itn.put(index,number);
        if(!nti.containsKey(number)){
            nti.put(number,new TreeSet<>());
        }
        nti.get(number).add(index);
    }
    
    public int find(int number) {
        if(!nti.containsKey(number)){
            return -1;
        }
        return nti.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */