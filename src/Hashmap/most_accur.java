
// given an array find the most frequent element in it if there are multiple element that appear a max number of time print any oneof them;
package Hashmap;
import java.util.HashMap;

public class most_accur {
    public static void main(String[] args) {
        int[] arr= {5,4,6,2,5,7,3,5,8,7,0};
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int el: arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else {
                freq.put(el,freq.get(el)+1);
            }
        }

        System.out.println("freq Map");
        System.out.println(freq.entrySet());
    }
}
