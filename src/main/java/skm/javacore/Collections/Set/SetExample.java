package skm.javacore.Collections.Set;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        List<Character> characters=List.of('A','Z','A','B','Z','F');
        System.out.println(characters);
        Set<Character> charactersUniqueOrder=new TreeSet<>(characters);
        Set<Character> charactersUniqueOrderIns=new LinkedHashSet<>(characters);
        System.out.println(charactersUniqueOrder);
        System.out.println(charactersUniqueOrderIns);


    }

}
