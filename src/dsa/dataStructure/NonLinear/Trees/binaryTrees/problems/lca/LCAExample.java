package dsa.dataStructure.NonLinear.Trees.binaryTrees.problems.lca;

public class LCAExample {
    static class NODE{
        int data;
        NODE left,right;
        NODE(int data){
            this.data=data;
        }
    }
    static NODE findLCA(NODE root,int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;
        }
        NODE left=findLCA(root.left,n1,n2);
        NODE right=findLCA(root.right,n1,n2);
        if(left!=null && right!=null){
            return root;
        }
        return (left!=null?left:right);
    }

    public static void main(String[] args) {
        NODE root=new NODE(1);
        root.left=new NODE(2);
        root.right=new NODE(3);
        root.left.left=new NODE(4);
        root.left.right=new NODE(5);
        NODE lca=findLCA(root,4,5);
        System.out.println("LCA: "+lca.data);
    }
}
