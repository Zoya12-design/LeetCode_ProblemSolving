class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Find length of list
        int length = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Step 2: Make list circular (last node points to head)
        temp.next = head;

        // Step 3: Find new tail (length - k % length - 1) steps ahead
        k = k % length;
        int stepsToNewTail = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 4: New head is next of newTail
        ListNode newHead = newTail.next;

        // Step 5: Break the circle
        newTail.next = null;

        return newHead;
    }
}
