class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {

    public boolean hasCycle(ListNode head) {

        if ( head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;


        while( fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}

public class Main {

    // Creates a linked list from an array
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

    // Creates a cycle by connecting the last node
    // to the node at index 'pos'
    // pos = -1 means no cycle
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
        System.out.println("Test 1: " + sol.hasCycle(head1)); // Expected: true

        // Test Case 2
        ListNode head2 = createList(new int[] { 1, 2 });
        createCycle(head2, 0);
        System.out.println("Test 2: " + sol.hasCycle(head2)); // Expected: true

        // Test Case 3
        ListNode head3 = createList(new int[] { 1 });
        createCycle(head3, -1);
        System.out.println("Test 3: " + sol.hasCycle(head3)); // Expected: false

        // Test Case 4
        ListNode head4 = createList(new int[] {});
        System.out.println("Test 4: " + sol.hasCycle(head4)); // Expected: false

        // Test Case 5
        ListNode head5 = createList(new int[] { 1, 2, 3, 4, 5 });
        createCycle(head5, -1);
        System.out.println("Test 5: " + sol.hasCycle(head5)); // Expected: false
    }
}