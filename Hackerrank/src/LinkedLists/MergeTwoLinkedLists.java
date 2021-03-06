package LinkedLists;

public class MergeTwoLinkedLists {
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode ptr = new ListNode(0);
        ListNode head = ptr;

        if (head1 == null){
            return head2;
        }
        if (head2 == null){
            return head1;
        }

        while(head1 != null && head2 != null){
            if (head1.data <= head2.data){
                ptr.next = head1;
                head1 = head1.next;
            }else{
                ptr.next = head2;
                head2 = head2.next;
            }
            // store val in head
            ptr = ptr.next;
        }

        if(head1 != null){
            ptr.next = head1;
        }

        if (head2 != null){
            ptr.next = head2;
        }
        return head.next;
    }
}

  class ListNode {
      int data;
      ListNode next;
    ListNode(int data) { data = data; }
  }
