package Mohammed.Abrar.DataStructures;


public class LinkedList<T extends Comparable> {

    private Node<T> head;


    public LinkedList() {

        this.head = null;
    }

    public T getHead() {
        if (head == null) {
            return null;
        }

        return head.data;

    }

    public void add(T t) {


        head = new Node<T>(t, head);
    }

    public int size() {

        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }


    public T get(int reference) {
        try {
            if (head == null)
                return null;
            Node<T> tmp = head;
            for (int i = 1; i < reference && tmp != null; i++)
                tmp = tmp.next;


            return tmp.data;
        } catch (Exception e) {

            System.out.println("Can not get the item");
            return null;
        }

    }


    public int find(T data) {
        try {
            if (head == null)
                return -1;
            int index = 0;
            Node<T> tmp = head;
            for (index = 1; tmp.data == data && tmp != null; index++)
                tmp = tmp.next;


            return index;
        } catch (Exception e) {

            System.out.println("Can not get the item");
            return -1;
        }

    }

    public  void sort(LinkedList<T> list) {


        if (list.head == null)
            System.out.println("No items to be sorted");
        int index = 0;
        T tmp = list.head.data;

        for (index = 0; index < list.size(); index++) {

                 if(list.get(index).compareTo(list.get(index+1))>0)
                     tmp=list.get(index+1);




           }

        }






    public boolean isEmpty() {

        return head == null;
    }


    public boolean contains(T data) {

        T data1 = head.data;

        if (data1.equals(data))
            return true;
        while (head != null) {

            if (head.data.equals(data))


                return true;
            head = head.next;

        }

        return false;
    }


    public void remove(T data) {


        if (head.data.equals(data)) {

            head = head.next;

            return;
        }

        Node<T> previousPosition = head;

        Node<T> currentPostion = null;


        while (!previousPosition.data.equals(data)) {

            previousPosition = currentPostion;

            currentPostion = currentPostion.next;

        }


        previousPosition.next = currentPostion.next;

    }


    public LinkedList<T> copy(LinkedList<T> linkedList) {

        Node<T> tmp = head;

        while (tmp != null) {
            linkedList.addLast(tmp.data);

            tmp = tmp.next;

        }

        return linkedList;
    }

    public void addLast(T item) {

        if (head == null)

            add(item);

        else {

            Node<T> tmp = head;

            while (tmp.next != null)
                tmp = tmp.next;

            tmp.next = new Node<T>(item, null);
        }

    }


    public T getLast() {

        Node<T> tmp = head;

        while (tmp.next != null)
            tmp = tmp.next;


        return tmp.data;

    }


    private static class Node<T extends Comparable> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }



        public int compareTo(T o) {
           return next.compareTo(o);
        }


    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        // Mohammed.Abrar.DataStructures.LinkedList<String> linkedList2= new Mohammed.Abrar.DataStructures.LinkedList<>();
        // linkedList2 = linkedList.copy(linkedList);
        linkedList.add("Abrar");
        linkedList.add("Raul");
        linkedList.add("NoOne");
        linkedList.add("Mina");
        //System.out.println(linkedList.size());
        // linkedList.removeAll();
        // System.out.println(linkedList.isEmpty());
        // System.out.println(linkedList.get(2));
        linkedList.find("Abrar");
        // System.out.println(linkedList.contains("Raul"));
        System.out.println(linkedList.head.data);
    }
}