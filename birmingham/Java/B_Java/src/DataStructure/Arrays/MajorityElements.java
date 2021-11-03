package DataStructure.Arrays;
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋
times. You may assume that the majority element always exists in
the array.
 */
public class MajorityElements {
    public int majorityElement(int[] nums) {
        int cnt = 0, major = 0;
        for(int num:nums){
            if(cnt == 0){
                major = num;
                cnt = 1;
            }
            else{
                if(major == num){
                    cnt += 1;
                }
                else{
                    cnt -= 1;
                }
            }
        }
        return major;
    }
}
