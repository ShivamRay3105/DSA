class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                slow = head;
                while (slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }
}

public class Main {

    // Create linked list
    static ListNode createList(int[] arr) {
        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return head;
    }

    // Create cycle at index 'pos'
    // pos = -1 => no cycle
    static void createCycle(ListNode head, int pos) {
        if (head == null || pos == -1)
            return;

        ListNode cycleNode = null;
        ListNode curr = head;
        int index = 0;

        while (curr.next != null) {
            if (index == pos)
                cycleNode = curr;
            curr = curr.next;
            index++;
        }

        if (index == pos)
            cycleNode = curr;

        curr.next = cycleNode;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        // Test Case 1
        ListNode head1 = createList(new int[] { 3, 2, 0, -4 });
        createCycle(head1, 1);
        ListNode ans1 = sol.detectCycle(head1);
        System.out.println("Test 1: " + (ans1 == null ? "null" : ans1.val)); // Expected: 2

        // Test Case 2
        ListNode head2 = createList(new int[] { 1, 2 });
        createCycle(head2, 0);
        ListNode ans2 = sol.detectCycle(head2);
        System.out.println("Test 2: " + (ans2 == null ? "null" : ans2.val)); // Expected: 1

        // Test Case 3
        ListNode head3 = createList(new int[] { 1 });
        createCycle(head3, -1);
        ListNode ans3 = sol.detectCycle(head3);
        System.out.println("Test 3: " + (ans3 == null ? "null" : ans3.val)); // Expected: null

        // Test Case 4
        ListNode head4 = createList(new int[] {});
        ListNode ans4 = sol.detectCycle(head4);
        System.out.println("Test 4: " + (ans4 == null ? "null" : ans4.val)); // Expected: null

        // Test Case 5
        ListNode head5 = createList(new int[] { 1 });
        createCycle(head5, 0);
        ListNode ans5 = sol.detectCycle(head5);
        System.out.println("Test 5: " + (ans5 == null ? "null" : ans5.val)); // Expected: 1

        // Test Case 6
        ListNode head6 = createList(new int[] { 1, 2, 3, 4, 5 });
        createCycle(head6, 2);
        ListNode ans6 = sol.detectCycle(head6);
        System.out.println("Test 6: " + (ans6 == null ? "null" : ans6.val)); // Expected: 3

        // Test Case 7
        ListNode head7 = createList(new int[] { 1, 2, 3, 4, 5 });
        createCycle(head7, -1);
        ListNode ans7 = sol.detectCycle(head7);
        System.out.println("Test 7: " + (ans7 == null ? "null" : ans7.val)); // Expected: null
    }
}