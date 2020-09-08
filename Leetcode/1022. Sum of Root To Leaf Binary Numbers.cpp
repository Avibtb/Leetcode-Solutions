class Solution {
private:
    
    void addToVec(TreeNode* root, int sum, int& totalSum) {
        if (!root) {
			return;
		} else if (root && root->left == nullptr && root->right == nullptr) {
            sum = (sum * 2) + root->val;
            totalSum += sum;
            return;
        }
        sum = (sum * 2) + root->val;
        addToVec(root->left, sum, totalSum);
        addToVec(root->right, sum, totalSum);
        return;
    }
      
public:
    int sumRootToLeaf(TreeNode* root) {
        int finalSum{};
        addToVec(root, 0, finalSum);
        return finalSum;
    }
};