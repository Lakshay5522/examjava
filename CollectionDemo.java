import java.util.*;
public class CollectionDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Frog");
        System.out.println("LinkedList: " + linkedList);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Red");
        System.out.println("HashSet: " + hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Monkey");
        treeSet.add("Ant");
        System.out.println("TreeSet (Sorted): " + treeSet);

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(2, "Updated Two");
        System.out.println("HashMap: " + hashMap);

        System.out.println("Iterating HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
