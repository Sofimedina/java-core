package skm.javacore.Generics;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T> {

    private ArrayList<T> list=new ArrayList<>();
    public void addElement(T element){
        list.add(element);
    };

    public void removeElement(T element){
        list.add(element);
    };

    public T  get(int index){
        return list.get(index);
    };

}
