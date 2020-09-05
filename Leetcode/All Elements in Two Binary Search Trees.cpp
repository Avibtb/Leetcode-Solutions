class Solution {
public:
  vector<int> getAllElements(TreeNode* root1, TreeNode* root2) {
    vector<int> v1, v2, ret;
    inorder(root1, v1);
    inorder(root2, v2);
    for (auto it1 = v1.begin(), it2 = v2.begin(); it1 != v1.end() || it2 != v2.end();)
      ret.push_back(it2 == v2.end() || (it1 != v1.end() && *it1 < *it2) ? *it1++ : *it2++);
    return ret;
  }
  
  void inorder(TreeNode* root, vector<int>& nums) {
    if (root == nullptr) return;
    inorder(root->left, nums);
    nums.push_back(root->val);
    inorder(root->right, nums);
  }
};