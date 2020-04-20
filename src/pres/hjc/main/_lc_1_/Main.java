package pres.hjc.main._lc_1_;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/20
 * @time 18:46
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,95,4,-3};
        int target = 92;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                System.out.println(map.get(target - nums[i]) + " " + i);
                //return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
    }
    public int[] a(){
        int[] nums = {3,2,4};
        int target = 6;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target){
                for (int i1 = 0; i1 < nums.length; i1++) {
                    if (nums[i1] < target && nums[i] + nums[i1] == target){

                        System.out.println(i+" "+i1);
                    }
                }
            }
        }
        return null;
    }
}
