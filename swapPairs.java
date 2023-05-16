public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode curr = temp;

        while(curr.next != null && curr.next.next != null){
            ListNode first = curr.next;
            ListNode sec = curr.next.next;
            curr.next = sec;
            first.next = sec.next;
            sec.next = first;
            curr = curr.next.next;
        }
        return temp.next;
    }
