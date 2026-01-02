// Last updated: 02/01/2026, 10:08:17
class ProductOfNumbers {

    ArrayList<Integer> arr;
    int currProd=1;
    public ProductOfNumbers() {
        arr=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0){
            arr=new ArrayList();
            currProd=1;
            return;
        }
        arr.add(currProd);
        currProd=currProd*num;
        return;
    }
    
    public int getProduct(int k) {
        int prod=1;
        if(k==arr.size()){
            return currProd;
        }
        if(arr.size()-k < 0){
            return 0;
        }
        prod=(currProd/arr.get(arr.size()-k));
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */