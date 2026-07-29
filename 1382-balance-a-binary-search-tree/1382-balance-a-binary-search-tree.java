/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>al=new ArrayList<>();
        inorder(root,al);
        int n=al.size();
        return BST(al,0,n-1);
    }
    static TreeNode inorder(TreeNode root,ArrayList<Integer>al){
        if(root==null){
            return null;
        }
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al);
        
        return root;
        
    }
    static TreeNode BST( ArrayList<Integer>al, int s,int e){
        if(s>e){
            return null;
        }
        int mid=(s+e)/2;
        TreeNode root=new TreeNode(al.get(mid));
        root.left=BST(al,s,mid-1);
        root.right=BST(al,mid+1,e);
        
        return root;
    }

    }
