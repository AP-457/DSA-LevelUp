import java.util.*;
public class SubArrayWithSumZero {
    int maxLength(int arr[]) {
        // code here
        int ans= 0;
        int sum= 0;

        HashMap<Integer, Integer> freq= new HashMap<>();

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==0){
                ans= Math.max(ans, i+1);
            }else if(freq.containsKey(sum)){
                ans= Math.max(ans, i-freq.get(sum));
            }else{
                freq.put(sum, i);
            }
        }

        return ans;
    }
}
