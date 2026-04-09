package dsa.dataStructure.NonLinear.Trees.binarySearchTrees;
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int value){
        data=value;
        left=right=null;
    }
}
public class BinarySearchTree {
    public static void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    static TreeNode insert(TreeNode root,int key){
        //case1 -> Empty Tree -> The new node becomes the root
        if(root==null){
            return new TreeNode(key);
        }if(key<root.data){
            root.left=insert(root.left,key);
        }else if(key>root.data){
            root.right=insert(root.right,key);
        }return root;
    }
    static TreeNode search(TreeNode root,int key){
        //1 Empty tree -> returns null
        //2 The root node data matches the key -> returns root
        if(root==null || root.data==key){
            return  root;
        }
        if(root.data<key){
            return search(root.right,key);
        }
        return search(root.left,key);
    }
    static  TreeNode findMin(TreeNode root){
     TreeNode cur=root;
     while(cur!=null && cur.left!=null){
         cur=cur.left;
     }return cur;
    }
    public static TreeNode deleteNode(TreeNode root,int key){
        if(root==null){
            return root;
        }
        if(key<root.data){
            root.left=deleteNode(root.left,key);
        }else if(key>root.data){
            root.right=deleteNode(root.right,key);
        }else{
            //Node has only one child -> return the non-null child
            if(root.left==null){
                TreeNode temp=root.right;
                root=null;
                return temp;
            }else if(root.right==null){
                TreeNode temp=root.left;
                root=null;
                return temp;
            }
            //Node has both the children
            //Find the inorder successor
            //It is the least value in the right subtree
            TreeNode temp=findMin(root.right);
            //Replace the root data with the inorder successor
            root.data=temp.data;
            //While doing this we will end up with a duplicate
            //Delete the duplicate that exists in the right subtree
            root.right=deleteNode(root.right,temp.data);
        }return root;
    }
    public static void main(String[] args) {
        TreeNode root=null;
        root=insert(root,50);
        inOrder(root);
        System.out.println();
        int[] arr={60,20,30,10,58,100};
        for (int j : arr) {
            root = insert(root, j);
        }
        inOrder(root);
        System.out.println();
        TreeNode result=search(root,100);
        if(result==null){
            System.out.println("Not found");
        }else{
            System.out.println("Key found");
        }
        root=deleteNode(root,50);
        inOrder(root);
        System.out.println();
        System.out.println(root.data);
    }
}