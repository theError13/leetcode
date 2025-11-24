class Solution {
    public int singleNumber(int[] nums) {
        int len=0;
        Set<Integer> check = new LinkedHashSet<Integer>();
        for(int i=0;i<nums.length;i++){
len+=1;
check.add(nums[i]);
if(check.size()!=len){
check.remove(nums[i]);
len-=2;
}
        }
        Integer first = check.iterator().next();
        return first;
    }
}