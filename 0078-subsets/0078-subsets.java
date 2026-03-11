class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        generate(nums,nums.length,ans,l,0);
        return ans;
    }
    static void generate(int[] a,int n,List<List<Integer>> ans,List<Integer> l,int idx){
        ans.add(new ArrayList<>(l));
        for(int i=idx;i<n;i++){
            l.add(a[i]);
            generate(a,n,ans,l,i+1);
            l.remove(l.size()-1);
        }
    }
}