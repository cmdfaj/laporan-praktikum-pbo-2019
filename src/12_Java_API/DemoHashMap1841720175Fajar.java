package percobaan;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class DemoHashMap1841720175Fajar {

    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        hMapItem.put("1", "Biskuit");
        hMapItem.put("2", "Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);

//        Collection mCollection = hMapItem.values();
//        Iterator mIterator = mCollection.iterator();
//        while (mIterator.hasNext()) {
//            System.out.println(mIterator.next());
//        }

        System.out.printf("HashMap Item Total: %d\n\n", hMapItem.size());

        Object mObject = hMapItem.remove("1");
        System.out.printf("%s remove from Hashmap\n", mObject);
        System.out.printf("HashMap item total: %d\n", hMapItem.size());
        System.out.println(hMapItem);

        hMapItem.clear();
        System.out.printf("HashMap Item Total: %d", hMapItem.size());
    }
}
