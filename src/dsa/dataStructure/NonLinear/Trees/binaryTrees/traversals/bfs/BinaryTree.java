package dsa.dataStructure.NonLinear.Trees.binaryTrees.traversals.bfs;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class BinaryTree {
    public static void levelOrderTraversalOrBFS(TreeNode root){
        //Base case//Corner Case//Edge Case
        if(root==null){
            return;
        }
        //You are pushing nodes into the queue,not integers
        Queue<TreeNode> queue=new LinkedList<>();
        //Add the root node into the queue & then travers left & right
        queue.add(root);
        //Print all nodes level by level till the queue is empty
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();//This removes and stores the front node of the queue
            System.out.print(temp.data+" ");
            //Left subtree
            if(temp.left!=null){
                queue.add(temp.left);
            }
            //Right subtree
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Level 0
        TreeNode root=new TreeNode(1);
        //L1
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        //L2
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        System.out.println("BFS or Level Order Traversal: ");
        levelOrderTraversalOrBFS(root);
    }
}
