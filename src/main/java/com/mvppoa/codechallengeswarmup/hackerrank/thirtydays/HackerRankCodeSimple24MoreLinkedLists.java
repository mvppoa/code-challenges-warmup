package com.mvppoa.codechallengeswarmup.hackerrank.thirtydays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Objective
 * Check out the Tutorial tab for learning materials and an instructional video!
 * <p>
 * Task
 * A NodeList class is provided for you in the editor. A NodeList object has an integer data field, , and a NodeList instance pointer, , pointing to another NodeList (i.e.: the next NodeList in a list).
 * <p>
 * A removeDuplicates function is declared in your editor, which takes a pointer to the  NodeList of a linked list as a parameter. Complete removeDuplicates so that it deletes any duplicate NodeLists from the list and returns the head of the updated list.
 * <p>
 * Note: The  pointer may be null, indicating that the list is empty. Be sure to reset your  pointer when performing deletions to avoid breaking the list.
 * <p>
 * Input Format
 * <p>
 * You do not need to read any input from stdin. The following input is handled by the locked stub code and passed to the removeDuplicates function:
 * The first line contains an integer, , the number of NodeLists to be inserted.
 * The  subsequent lines each contain an integer describing the  value of a NodeList being inserted at the list's tail.
 * <p>
 * Constraints
 * <p>
 * The data elements of the linked list argument will always be in non-decreasing order.
 * Output Format
 * <p>
 * Your removeDuplicates function should return the head of the updated linked list. The locked stub code in your editor will print the returned list to stdout.
 * <p>
 * Sample Input
 * <p>
 * 6
 * 1
 * 2
 * 2
 * 3
 * 3
 * 4
 * Sample Output
 * <p>
 * 1 2 3 4
 * Explanation
 * <p>
 * , and our non-decreasing list is . The values  and  both occur twice in the list, so we remove the two duplicate NodeLists. We then return our updated (ascending) list, which is .
 */



public class HackerRankCodeSimple24MoreLinkedLists {

    static class NodeList {
        int data;
        NodeList next;

        NodeList(int d) {
            data = d;
            next = null;
        }

    }

    /**
     * Recursive solution - not fully working for non decreasing order
     *
     *
     *     if (head == null || head.next == null){
     *         return head;
     *     }
     *     if (head.data == head.next.data){
     *         head.next = head.next.next;
     *         removeDuplicates(head);
     *     }else{
     *         removeDuplicates(head.next);
     *     }
     *     return head;
     *
     * @param head
     * @return
     */

    public static NodeList removeDuplicates(NodeList head) {

        List<Integer> referenceData = new ArrayList<>();

        NodeList previousVal = null;
        NodeList currentVal = head;

        while (currentVal != null) {
            if (referenceData.contains(currentVal.data)) {
                previousVal.next = currentVal.next;
            } else {
                referenceData.add(currentVal.data);
                previousVal = currentVal;
            }
            currentVal = currentVal.next;
        }

        return head;
    }


    public static NodeList insert(NodeList head, int data) {
        NodeList p = new NodeList(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            NodeList start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(NodeList head) {
        NodeList start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        NodeList head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}


