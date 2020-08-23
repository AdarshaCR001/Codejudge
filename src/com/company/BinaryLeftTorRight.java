package com.company;

import java.util.*;




class BinaryLeftToRight
{
    static Scanner s = new Scanner(System.in);

    public static void printTree(TreeNode root) {
        String output = "";
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();

            if (node == null||node.data==-1) {
                output += "null ";
                continue;
            }

            output += String.valueOf(node.data) + " ";
            if(node.left!=null | node.right!=null){
                nodeQueue.offer(node.left);
                nodeQueue.offer(node.right);
            }
        }
        System.out.print(output);
    }

    public static TreeNode takeLevelOrder(){
        Queue<TreeNode>  pendingNodes = new LinkedList<>();
        int rootData = s.nextInt();
        TreeNode root = new TreeNode(rootData);
        pendingNodes.offer(root);

        while(!pendingNodes.isEmpty()){
            TreeNode currentNode = pendingNodes.poll();

            int leftChildData;
            try {
                leftChildData= s.nextInt();
            }
            catch (Exception e)
            {
                leftChildData=-1;
            }
            if(leftChildData != -1){
                TreeNode leftChild = new TreeNode(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.offer(leftChild);
            }
            int rightChildData;
            try{
                rightChildData= s.nextInt();
            }
            catch (Exception e)
            {
                rightChildData= -1;
            }
            if(rightChildData != -1){
                TreeNode rightChild = new TreeNode(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.offer(rightChild);
            }
        }
        return root;
    }



    public static void main(String[] args){
        TreeNode root = takeLevelOrder();
        new Solution().straightenTheBinaryTree(root);
        printTree(root);
    }

}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}


class Solution {
    public void straightenTheBinaryTree(TreeNode root) {
        //Write your own code
        if(root.right!=null)
        {
            straightenTheBinaryTree(root.right);
        }
        if(root.left!=null)
        {
            straightenTheBinaryTree(root.left);
            TreeNode temp=root.left;
            while(temp.right!=null)
            {
                temp=temp.right;
            }
            temp.right=root.right;
            root.right=root.left;
            root.left=null;
        }
    }
}