class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int size = nums.length;
        List<Integer> targets = new ArrayList();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            if(nums[i]==target){
                targets.add(i);
            }
        }
        return targets;
    }
}