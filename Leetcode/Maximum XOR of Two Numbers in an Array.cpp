class Solution {
public:
    int findMaximumXOR(vector<int>& nums) {
        node* root = new node;
        for (auto num : nums) {
            insert(root, num);
        }
        int res = 0;
        for (auto num: nums) {
            res = max(res, compare(root, num));
        }        
        delete root;
        return res;
    }
private: 
    class node {
    public:
        node(): zero(nullptr), one(nullptr) {}
        ~node() { delete zero; delete one; }
        node* zero;
        node* one; 
    };
    void insert(node* root, int num) {
        node* p = root;
        for (int i = 31; i > 0; --i) {
            bool is_one = num & (1 << (i-1));
            if (is_one) {
                if (!p->one) {
                    p->one = new node;
                }
                p = p->one;                                    
            }
            else { 
                if (!p->zero) {
                    p->zero = new node;
                }
                p = p->zero;
            }            
        }
    }
    int compare(node* root, int num) {
        int res = 0;
        node* p = root; 
        for (int i = 31; i > 0; --i) {
            bool is_one = num & (1 << (i-1));
            if (is_one) {
                if (p->zero) {
                  res += (1 << (i-1));   
                  p = p->zero; 
                } else {
                    p = p->one;                    
                }                
            } else { 
                if (p->one) {
                    res += (1 << (i-1));
                    p = p->one;
                } else {
                    p = p->zero;
                }            
            }
            
        }
        return res;        
    }    
};