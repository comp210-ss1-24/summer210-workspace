package ex05;

public class Runner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeAtIndex(0);
        System.out.println(list.toString());
    }
}
