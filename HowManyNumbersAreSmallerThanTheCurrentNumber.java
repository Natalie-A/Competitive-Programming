class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> frequency = new ArrayList();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }frequency.add(count);
            count = 0;
        }
        int[] array = frequency.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}