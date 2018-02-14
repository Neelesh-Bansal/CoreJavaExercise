import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class test1 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("2");

        Collection set = new HashSet();
        set.add("1");
        set.add("2");
        set.add("2");

        Iterator listIt = set.iterator();
        while(listIt.hasNext()){
            System.out.println(listIt.next());

        }

        Iterator listIterator = list.iterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
