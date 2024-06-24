import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println("Removed ele: "+list.remove(1));
        System.out.println(list);
        System.out.println("Removed ele: "+list.remove(1));
        System.out.println(list);


        CustomGenericArrayList<String> list2 = new CustomGenericArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        System.out.println(list2);
        System.out.println("Removed ele: "+list2.remove(1));
        System.out.println(list2);
        System.out.println("Removed ele: "+list2.remove(1));
        System.out.println(list2);
    }
}