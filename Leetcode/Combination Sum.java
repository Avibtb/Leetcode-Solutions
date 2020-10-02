class Solution {
     List<List<Integer>> ans = new ArrayList();
    void solve(int[] candidates,int target,int i,int n,List<Integer> list)
    {
        if(i>=n||target<0)
            return;
        if(target==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(candidates[i]);
        solve(candidates,target-candidates[i],i,n,list);
        list.remove(list.size()-1);
        solve(candidates,target,i+1,n,list);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates,target,0,candidates.length,new ArrayList<>());
        return ans;
        
    }
}