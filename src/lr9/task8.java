package lr9;

import java.util.LinkedList;

public class task8 {
    static class Node{
        int value;
        Node next;
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }


        static class Cycle {
            public Node head;


            public Node CreateHead() {
                head = null;
                for (int i = 0; i <= 9; i++) {
                    head = new Node(i, head);
                }
                return head;
            }


            public Node CreateTail() {
                Node head = null;
                for (int i = 9; i >= 0; i--) {
                    head = new Node(i, head);
                }
                return head;
            }

            public Node addFirst(int value) {
                head = new Node(value, head);
                return  head ;
            }

            public Node addLast(int value){
                Node newtail = new Node(value, null);
                Node ref = head;
                while (ref.next != null) {
                    ref = ref.next;
                }
                ref.next=newtail;
                return ref;
            }

            public Node inputAnyWhere(int value, int counter){
                Node newNode=new Node(44, null);
                Node ref = head;

                int k=1;
                while (ref.next!= null && (k<counter )) { ref = ref.next;
                    k++;
                }

                newNode.next=ref.next.next;
                ref.next=newNode;
                return ref;
            }

            public Node removeFirst(){
                Node ref = head;
                while (ref.next.next != null) {
                    ref = ref.next;
                }
                ref.next=null;
                return ref;
            }

            public Node removeLast(){
                Node ref = head;
                while (ref.next != null) {
                    ref = ref.next;
                }
                ref.next=null;
                return ref;
            }

            public Node removeAnyWhere(int counter){
                Node ref = head;
                int k = 1;

                while (ref.next != null && (k < counter)) {
                    ref = ref.next;
                    k++;
                }
                ref.next = ref.next.next;
                return ref;
            }

            public String getNode(){
                Node getNode = head;
                StringBuilder sb = new StringBuilder();
                while (getNode != null) {
                    sb.append(getNode.value).append(" ");
                    getNode = getNode.next;
                }
                return sb.toString();
            }

            public String toStringHead() {
                Node stringOut = CreateHead();
                StringBuilder sb = new StringBuilder();
                while (stringOut != null) {
                    sb.append(stringOut.value).append(" ");
                    stringOut = stringOut.next;
                }
                return sb.toString();
            }
            public String toStringTail() {
                Node stringOut = CreateTail();
                StringBuilder sb = new StringBuilder();
                while (stringOut != null) {
                    sb.append(stringOut.value).append(" ");
                    stringOut = stringOut.next;
                }
                return sb.toString();
            }

                 public static void main(String[] args) {

                    Cycle headList = new Cycle();
                    Cycle tailList = new Cycle();
                    Cycle test = new Cycle();

                    switch (1){
                        case 1:
                            headList.CreateHead();
                            test.getNode();
                            System.out.println(test.toString());
                            System.out.println(headList.toStringHead());
                            break;
                        case 2:
                            tailList.CreateTail();
                            System.out.println(tailList.toStringTail());
                            break;
                    }
                }
        }
    }
}
