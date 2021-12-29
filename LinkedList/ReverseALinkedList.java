public class ReverseALinkedList{
  class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
  }
  Node reverseList(Node head){
    if(head==null || head.next == null) return head;
    Node prev = null;
    Node curr = head;
    Node next = head.next;
    while(next!=null){
      curr.next = prev;
      prev = curr;
      curr = next;
      next = next.next;
    }
    curr.next = prev;
    return curr;
  }
}