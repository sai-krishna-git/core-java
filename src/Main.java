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


        CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        print(list3);

        //print(list2)  - will not work

        print2(list2);
        print2(list3);



        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arr.add(i+1);
        }
        System.out.println(arr);
        System.out.println("--------");
        arr.forEach((item) -> item *=2);


    }
    //Java Wildacards
    //will not work for type string .Only works for type Number and its subclasses
    public static void print(CustomGenericArrayList<? extends Number> list){
        int length = list.getSize();
        for (int i = 0; i < length; i++) {
            System.out.print(list.get(i)+", ");
        }
        System.out.println();
    }

    //this method will work for any datatype but you cannot use the same name as above
    //even if you change the type it will not consider as overloading.
    public static void print2(CustomGenericArrayList<?> list){
        int length = list.getSize();
        for (int i = 0; i < length; i++) {
            System.out.print(list.get(i)+", ");
        }
        System.out.println();


    }

}