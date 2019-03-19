package com.mvppoa.codechallengeswarmup.hackerrank.thirtydays;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Link https://www.hackerrank.com/challenges/30-binary-trees/problem
 * Objective
 * Today,we're going further with Binary Search Trees. Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * A level-order traversal,also known as a breadth-first search,visits each level of a tree's nodes from left to right,top to bottom. You are given a pointer,,pointing to the root of a binary search tree. Complete the levelOrder function provided in your editor so that it prints the level-order traversal of the binary search tree.
 *
 * Hint: You'll find a queue helpful in completing this challenge.
 *
 * Input Format
 *
 * The locked stub code in your editor reads the following inputs and assembles them into a BST:
 * The first line contains an integer, (the number of test cases).
 * The  subsequent lines each contain an integer,,denoting the value of an element that must be added to the BST.
 *
 * Output Format
 *
 * Print the  value of each node in the tree's level-order traversal as a single line of  space-separated integers.
 *
 * Sample Input
 *
 * 6
 * 3
 * 5
 * 4
 * 7
 * 2
 * 1
 * Sample Output
 *
 * 3 2 5 1 4 7
 * Explanation
 *
 * The input forms the following binary search tree:
 * BST.png
 *
 * We traverse each level of the tree from the root downward,and we process the nodes at each level from left to right. The resulting level-order traversal is ,and we print these data values as a single line of space-separated integers.
 */

public class HackerRankCodeSimple23BinarySearchTreeLevelOrderTraversal {

    static void levelOrder(Node root){

        //It will show in the order in level - Remember to mix in collections with the desired behaviors
        /**
         * 6
         * 3
         * 5
         * 4
         * 7
         * 2
         * 1
         */

        Queue<Node> dataQueue = new LinkedBlockingQueue<>();
        if(root != null) {
            dataQueue.add(root);
            while (!dataQueue.isEmpty()){

                Node currentLeaf = dataQueue.remove();

                System.out.println(currentLeaf.data);

                if(currentLeaf.left != null){
                    dataQueue.add(currentLeaf.left);
                }
                if(currentLeaf.right != null){
                    dataQueue.add(currentLeaf.right);
                }

            }
        }

    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }



/**
 Tree Traversal
 A traversal of some binary tree,,is an algorithm that iterates through each node in  exactly  time.

 InOrder Traversal
 An inorder traversal of tree  is a recursive algorithm that follows the left subtree; once there are no more left subtrees to process,we process the right subtree. The elements are processed in left-root-right order. The basic algorithm is as follows:

 inOrder(t) {
 if(t is not empty) {
 inOrder( left subtree of t )
 process t's root element
 inOrder( right subtree of t )
 }
 }
 An inorder traversal of a binary search tree will process the tree's elements in ascending order.

 PostOrder Traversal
 A postorder traversal of tree  is a recursive algorithm that follows the left and right subtrees before processing the root element. The elements are processed in left-right-root order. The basic algorithm is as follows:

 postOrder(t) {
 if(t is not empty) {
 postOrder( left subtree of t )
 postOrder( right subtree of t )
 process t's root element
 }
 }
 PreOrder Traversal (DFS)
 A preorder traversal of tree  is a recursive algorithm that processes the root and then performs preorder traversals of the left and right subtrees. The elements are processed root-left-right order. The basic algorithm is as follows:

 preOrder(t) {
 if(t is not empty) {
 process t's root element
 preOrder( left subtree of t )
 preOrder( right subtree of t )
 }
 }
 Because a preorder traversal goes as deeply to the left as possible,it's also known as a depth-first-search or DFS.

 Level-Order Traversal (BFS)
 A level-order traversal of tree  is a recursive algorithm that processes the root,followed by the children of the root (from left to right),followed by the grandchildren of the root (from left to right),etc. The basic algorithm shown below uses a queue of references to binary trees to keep track of the subtrees at each level:

 levelOrder(BinaryTree t) {
 if(t is not empty) {
 // enqueue current root
 queue.enqueue(t)

 // while there are nodes to process
 while( queue is not empty ) {
 // dequeue next node
 BinaryTree tree = queue.dequeue();

 process tree's root;

 // enqueue child elements from next level in order
 if( tree has non-empty left subtree ) {
 queue.enqueue( left subtree of t )
 }
 if( tree has non-empty right subtree ) {
 queue.enqueue( right subtree of t )
 }
 }
 }
 }
 **/

}
