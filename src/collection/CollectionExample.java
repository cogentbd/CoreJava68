package collection;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
       /*
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4); 
        //System.out.println(l.get(0));
        for (Object o : l) {
            //System.out.println(o);
        }

        Set s = new HashSet();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        
        //System.out.println(s.iterator());
        
        Iterator ss = s.iterator(); // calll the iterator
        System.out.println(ss.next());
        System.out.println(ss.next());
        
        System.out.println(ss.hasNext());
        while(ss.hasNext()){
            System.out.println(ss.next());
        }
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            set.add(i);
        }
        Iterator iUnique = set.iterator();
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put((Integer) iUnique.next(), "A");
        map.put((Integer) iUnique.next(), "B");
        map.put((Integer) iUnique.next(), "C");
        map.put((Integer) iUnique.next(), "D");
        map.put((Integer) iUnique.next(), "D");

        for (Integer i : map.keySet()) {
            System.out.println("Key : " + i + " Value : " + map.get(i));
        }
        */
        
        List l1 = new LinkedList();
        Set s1 = new HashSet();
        //l1.add(s1);
        l1.add(0, "C");
        l1.add(1, "E");
        l1.add(2, "H");
        l1.add(3, "A");
        l1.add(4, "Z");

        System.out.println(l1);
        System.out.println(l1.indexOf("C"));
        l1.sort(Comparator.naturalOrder()); //sorting a list
        System.out.println(l1);
        System.out.println(l1.indexOf("C"));
        //System.out.println(s1.contains("C"));
        //System.out.println(l1.contains("B"));
        
        Map<Set<? extends List<Integer>>, ? extends Employee> map = new HashMap();
       
        

    }
}
