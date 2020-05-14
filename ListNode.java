import java.util.LinkedList;
import java.util.*;

public class ListNode {

    public static void main(String[] args) {

        LinkedList<String> myLinks = new LinkedList<String>();

        // 1. isEmpty

        System.out.println(isLinkEmpty(myLinks));

        // 2. Add

        addNode(myLinks, "Testing my data");
        addNode(myLinks, "Another test of the method");
        System.out.println(myLinks);

        // 3. makeEmpty

        makeItEmpty(myLinks);

        myLinks.add("Lebron");
        myLinks.add("Jack");
        myLinks.add("Jordan");
        myLinks.add("Jordan");
        myLinks.add("Jordan");
        myLinks.add("Jordan");
        myLinks.add("Magic");
        myLinks.add("Bird");
        myLinks.add("Kareem");
        myLinks.add("Spike");

        // 4. Create a new method that prints each node in a given LinkedList on its own
        // line.

        printMyItems(myLinks);

        // 5. Create a new method with a list and an index as its arguements, use
        // remove() to delete a node at that specific index

        removeMe(myLinks, 1);
        printMyItems(myLinks);

        // 6. Create a method that searches a list for the given data value and remove
        // each
        // occurance of it.

        removeOcurrance(myLinks, "Jordan");
        printMyItems(myLinks);

        // 7. Create a new method that adds a new node to the beginning (head) of a
        // given LinkedList.

        addFirstNode(myLinks, "Horry");
        printMyItems(myLinks);

        // 8. Create a new method that adds a new node after a given index in a given
        // list.

        insert(myLinks, "Fox", 4);
        printMyItems(myLinks);
        // 9. Create a new method that appends the contents of one given list to the end
        // of another given list. (List2 = List2 + List1)
        LinkedList<String> items = new LinkedList<String>();
        items.add("jacket");
        items.add("shoes");
        items.add("glasses");
        addListItems(myLinks, items);
        printMyItems(myLinks);

        // 10. Create a new method that prints the contents of a given list in reverse
        // order.

        PrintInReverse(myLinks);
        Collections.reverse(myLinks);

    }

    // #1
    public static boolean isLinkEmpty(LinkedList<String> list) {
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    // #2

    public static void addNode(LinkedList<String> myLinks, String nodeData) {
        myLinks.add(nodeData);
    }

    // #3
    public static void makeItEmpty(LinkedList<String> list) {
        if (list.size() == 0) {
            System.out.println("List was already empty");
        } else {
            list.clear();
            System.out.println("List is now empty");
        }
    }

    // #4
    public static void printMyItems(LinkedList<String> list) {
        for (String items : list) {
            System.out.println(items);
        }

    }

    // #5
    public static void removeMe(LinkedList<String> list, int index) {
        list.remove(index);

    }

    // #6
    public static void removeOcurrance(LinkedList<String> list, String items) {

        for (int i = 0; i < list.size(); i++) {
            list.remove(items);
        }
    }

    // 7
    public static void addFirstNode(LinkedList<String> list, String items) {
        list.addFirst(items);

    }

    // #8
    public static void insert(LinkedList<String> list, String items, int index) {
        list.add(index + 1, items);
    }

    // #9
    public static void addListItems(LinkedList<String> list, LinkedList<String> y) {
        list.addAll(y);

    }

    // #10
    public static void PrintInReverse(LinkedList<String> is) {

        Collections.reverse(is);
        for (String values : is) {
            System.out.println(values.toString());
        }

    }
}