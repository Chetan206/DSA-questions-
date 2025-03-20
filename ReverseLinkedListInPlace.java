import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedListInPlace {

    public static void reverseLinkedList(LinkedList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        LinkedList<Integer> reversedList = new LinkedList<>();

        while (iterator.hasNext()) {
            reversedList.addFirst(iterator.next());
        }

        list.clear();
        list.addAll(reversedList);
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original LinkedList: " + list);

        reverseLinkedList(list);

        System.out.println("Reversed LinkedList: " + list);
    }
}
