package DataStructure.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){
                cnt++;
            }
            else{
                nums[i-cnt] = nums[i];
            }
        }
        return n-cnt;
    }
}
