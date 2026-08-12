// Last updated: 8/12/2026, 7:11:32 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        
14        ListNode dummy = new ListNode(0);
15        ListNode current = dummy;
16
17        while (list1 != null && list2 != null) {
18
19            if (list1.val <= list2.val) {
20                current.next = list1;
21                list1 = list1.next;
22            } else {
23                current.next = list2;
24                list2 = list2.next;
25            }
26
27            current = current.next;
28        }
29
30        if (list1 != null) {
31            current.next = list1;
32        } else {
33            current.next = list2;
34        }
35
36        return dummy.next;
37    }
38}