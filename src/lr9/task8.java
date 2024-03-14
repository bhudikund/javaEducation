package lr9;

import java.util.LinkedList;
import java.util.Scanner;

public class task8 {
    static class Node{
        int value;
        Node next;
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    static class Rec{
            int value;
            Rec next;
            Rec(int value){
                this.value= value;
                this.next= null;
            }


        static class Cycle {
            public Node head;
            public Rec headR;


            public Node CreateHead() {
                head = null;
                for (int i = 0; i <= 9; i++) {
                    head = new Node(i, head);
                }
                return head;
            }


            public Node CreateTail() {
                head = null;
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
                Node newTail = new Node(value, null);
                Node ref = head;
                while (ref.next != null) {
                    ref = ref.next;
                }
                ref.next=newTail;
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

            public Node getNode(){
                return head;
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
            public static String toStringTest(Node test) {
                Node stringOut = test;
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
                /*
                public void CreateHeadR(int counter){
                 head = CreateHeadRec(counter,head);
                }
                public Node CreateHeadRec(int counter, Node newNode){
                    if (newNode == null){
                        return new Node(counter, head);
                    }
                        Node newNod = new Node(counter,head);
                        newNod.next = newNode;
                        return newNod;

                }

                public void CreateTailR(int counter){
                    head = CreateTailRec(counter,head);
                }

                public Node CreateTailRec(int counter, Node newNode){
                    if (newNode == null){
                        return new Node(counter, head);
                    }
                    else {
                        newNode.next = CreateTailRec(counter, newNode.next);
                        return newNode;
                    }
                }

                public String toStringRec() {
                    return toStringRecHelper(head);
                }

                private String toStringRecHelper(Node newNode) {
                    if (newNode == null) {
                        return "";
                    }
                    return newNode.value + " " + toStringRecHelper(newNode.next);
                }*/



            public void createHeadRec(int value) {
                headR = createHeadRecHelper(headR, value);
            }

            private Rec createHeadRecHelper(Rec curRec, int value) {
                if (curRec == null) {
                    return new Rec(value);
                }
                Rec newNode = new Rec(value);
                newNode.next = curRec;
                return newNode;
            }

            public void createTailRec(int value) {
                headR = createTailRecHelper(headR, value);
            }

            private Rec createTailRecHelper(Rec curRec, int value) {
                if (curRec == null) {
                    return new Rec(value);
                }
                curRec.next = createTailRecHelper(curRec.next, value);
                return curRec;
            }

            public String toStringRec() {
                return toStringRecHelper(headR);
            }

            private String toStringRecHelper(Rec curRec) {
                if (curRec == null) {
                    return "";
                }
                return curRec.value + " " + toStringRecHelper(curRec.next);
            }


                 public static void main(String[] args) {

                    Cycle headList = new Cycle();
                    Cycle tailList = new Cycle();
                    Cycle RecList = new Cycle();
                    Node test1;
                    Node test2;
                    Scanner in = new Scanner(System.in);
                     System.out.println("Цикл - 1; Рекурсия - 2");
                     int n = in.nextInt();
                    switch (n){
                        case 1:
                            headList.CreateHead();
                            System.out.println("С головы до изменений: " +headList.toStringHead());
                            headList.addFirst(1);
                            headList.removeFirst();
                            headList.addLast(15);
                            headList.removeLast();
                            headList.inputAnyWhere(44,2);
                            headList.removeAnyWhere(2);
                            test1= headList.getNode();
                            System.out.println("С головы после изменений: " + toStringTest(test1));
                            tailList.CreateTail();
                            System.out.println("С хвоста до изменений: " +tailList.toStringTail());
                            tailList.addFirst(1);
                            tailList.removeFirst();
                            tailList.addLast(15);
                            tailList.removeLast();
                            tailList.inputAnyWhere(44,2);
                            tailList.removeAnyWhere(2);
                            test2= tailList.getNode();
                            System.out.println("С хвоста после изменений: " +toStringTest(test2));
                            break;
                        case 2:
                            RecList.createHeadRec(5);
                            RecList.createTailRec(2);
                            System.out.println(RecList.toStringRec());
                            break;
                    }
                }
        }
    }
    }
}
