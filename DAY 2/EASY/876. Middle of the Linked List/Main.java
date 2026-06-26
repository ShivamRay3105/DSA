// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

// class Solution {

//     public ListNode middleNode(ListNode head) {

//         if (head == null || head.next == null) {
//             return head;
//         }

//         ListNode slow = head;
//         ListNode fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (fast == null || fast.next == null) {
//                 return slow;
//             }
//         }

//         return null;
//     }
// }

// public class Main {

//     // Create linked list from array
//     static ListNode createList(int[] arr) {
//         if (arr.length == 0)
//             return null;

//         ListNode head = new ListNode(arr[0]);
//         ListNode curr = head;

//         for (int i = 1; i < arr.length; i++) {
//             curr.next = new ListNode(arr[i]);
//             curr = curr.next;
//         }

//         return head;
//     }

//     // Print list from a given node
//     static void printList(ListNode head) {
//         while (head != null) {
//             System.out.print(head.val);
//             if (head.next != null)
//                 System.out.print(" -> ");
//             head = head.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         Solution sol = new Solution();

//         // Test Case 1
//         ListNode head1 = createList(new int[] { 1, 2, 3, 4, 5 });
//         System.out.print("Test 1: ");
//         printList(sol.middleNode(head1)); // Expected: 3 -> 4 -> 5

//         // Test Case 2
//         ListNode head2 = createList(new int[] { 1, 2, 3, 4, 5, 6 });
//         System.out.print("Test 2: ");
//         printList(sol.middleNode(head2)); // Expected: 4 -> 5 -> 6

//         // Test Case 3
//         ListNode head3 = createList(new int[] { 1 });
//         System.out.print("Test 3: ");
//         printList(sol.middleNode(head3)); // Expected: 1

//         // Test Case 4
//         ListNode head4 = createList(new int[] { 1, 2 });
//         System.out.print("Test 4: ");
//         printList(sol.middleNode(head4)); // Expected: 2

//         // Test Case 5
//         ListNode head5 = createList(new int[] { 1, 2, 3, 4 });
//         System.out.print("Test 5: ");
//         printList(sol.middleNode(head5)); // Expected: 3 -> 4

//         // Test Case 6
//         ListNode head6 = createList(new int[] {});
//         System.out.print("Test 6: ");
//         printList(sol.middleNode(head6)); // Expected: (empty)
//     }
// }