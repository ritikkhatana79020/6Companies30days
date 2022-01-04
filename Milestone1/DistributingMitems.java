package Milestone1;

public class DistributingMitems {
    public static void main(String[] args) {
       System.out.println(lastPosition(5,8,2));
    }

    static int lastPosition(int n, int m, int k){
        
        int ans = (n+k-1)%m;

        if(ans==0){
            return m;
        }

        return ans;
    }
}
