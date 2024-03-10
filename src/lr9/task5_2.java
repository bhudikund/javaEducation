package lr9;

public class task5_2 {
    class Node {
        public int value;
        public task5_1.Node next;
        Node(int value, task5_1.Node next){
            this.value = value;
            this.next = next;
        }
    }

   /* public void main(String[] args) {
        Node head = null;
        for (int i = 9; i >= 0; i--){
            head = new Node(i, head);
        }
        Node ref = head;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
*/
}
