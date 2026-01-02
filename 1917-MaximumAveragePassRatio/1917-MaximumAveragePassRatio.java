// Last updated: 02/01/2026, 10:07:54
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        return ans(classes, extraStudents);
    }

    double ans(int[][] c,int e){
        PriorityQueue<double[]>p=new PriorityQueue<>((a,b)-> Double.compare(b[0],a[0]));//gain - pass - total
        for(int i[]:c) {
            double gain1=gain(i[0],i[1]) ;
            p.add(new double[]{gain1,i[0],i[1]});
        }
        while(e>0){
            double pq[]=p.poll();
            double pass=pq[1]+1;
            double total=pq[2]+1;
            double gain1=gain(pass,total);
            p.add(new double[]{gain1,pass,total});
            e--;
        }
        double sum=0;
        while(!p.isEmpty()){
            double pq[]=p.poll();
            sum+=pq[1]/(pq[2]*1.0);
        }
        return sum/(c.length*1.0);
    }

    double gain(double pass, double total) {
        return ((pass + 1) / ((total) + 1)) - (pass / (total));
    }
}