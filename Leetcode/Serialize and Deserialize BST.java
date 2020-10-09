/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return makeString(root, new StringBuffer()).toString();
    }
    
    public StringBuffer makeString(TreeNode root, StringBuffer sb) {
        if(root == null) return new StringBuffer(" ");
        if(root != null) {
            sb.append(root.val);
            sb.append(" ");
            makeString(root.left, sb);
            makeString(root.right, sb);
        }
        return sb;
    }
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(" ")) return null;
        String[] str = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
        for(int i=1; i<str.length; i++) {
            TreeNode curr = root;
            int val = Integer.parseInt(str[i]);
            while(true) {
                if(curr.val > val) {
                    if(curr.left != null) {
                        curr = curr.left;
                    } else {
                        curr.left = new TreeNode(val);
                        break;
                    }
                } else { 
                    if(curr.right != null) {
                        curr = curr.right;
                    } else {
                        curr.right = new TreeNode(val);
                        break;
                    }
                }
            }
        }
        return root;
    }
}