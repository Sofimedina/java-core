package skm.javacore.Generics;

public class GenericsExample {
    public static void main(String[] args) {
        MyCustomList<String> list=new MyCustomList<>();
        list.addElement("Sofi");
        list.addElement("Cane");
        System.out.println(list.get(1));
        MyCustomList<Integer> list2=new MyCustomList<>();
        list2.addElement(1);
        list2.addElement(2);
        System.out.println(list2.get(1));

    }
}
