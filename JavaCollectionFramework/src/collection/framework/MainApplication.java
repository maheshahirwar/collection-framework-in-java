package collection.framework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MainApplication {

	public static void main(String[] args) {
				
		List<Integer>list = new ArrayList<>();
		// add(Object o)
		list.add(2);
		list.add(1);
		list.add(34);
		list.add(65);
		System.out.println("add : "+list);
		List<Integer>list1 = new ArrayList<>();
		list1.add(78);
		list1.add(100);
		list1.add(234);
		// addAll()
		list1.addAll(list);
		System.out.println("add all : "+list1);
		
//		remove(Object o)
//		list1.remove(Integer.valueOf(1));
		System.out.println("remove(object) : "+list1);
		//remove(int index)
//		list1.remove(1);
		System.out.println("remove(index) : "+list1);
		
//		list1.removeAll(list);
		System.out.println("Remove All :: "+list1);
		
//		list1.removeIf(t -> t%2!=0);
		System.out.println("remove if : "+list1);
		
//		list1.retainAll(list);
		System.out.println("retain all : "+list1);
		
		System.out.println("list size : "+list1.size());
		
//		list1.clear();
		System.out.println("after clear : "+list1);
		
		System.out.println("list contains : "+list1.contains(65));
		
		System.out.println("list contains all : "+list1.containsAll(list));
		
		//Iterator
		Iterator<Integer>it = list1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		// toArray() Object[]
		Object[]arr = list1.toArray();
		System.out.println("toArray() : "+Arrays.toString(arr));
		// toArray(T[]) T[]
		Integer[]arr1 = list1.toArray(new Integer[] {});
		System.out.println("toArray(T[]) : "+Arrays.toString(arr1));
		
		System.out.println("list isEmpty() : "+list1.isEmpty());
//		
		// ArrayList
		System.out.println("==========ArrayList===============");
		ArrayList<String> arrayList=new ArrayList<String>();//Creating arraylist  
		arrayList.add("Ravi");//Adding object in arraylist  
		arrayList.add("Vijay");  
		arrayList.add("Ravi");  
		arrayList.add("Ajay");  
		System.out.println(arrayList); 
		 
		
		System.out.println();
		System.out.println("============LinkedList=================");
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		System.out.println(al);
//		
		System.out.println();
		System.out.println("============Vector=================");
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		System.out.println(v);
//		
		System.out.println();
		System.out.println("============Stack ( First-In-Last-Out )=================");
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop(); 
//		
		System.out.println(stack.peek());
//		
		System.out.println();
		System.out.println("============Queue using LinkedList ( First-In-First-Out )=================");
//		
		Queue<String>queue = new LinkedList<String>();
		queue.add("Ayush");
		queue.add("Garvit");
		queue.add("Amit");
		queue.add("Ashish");
		queue.add("Garima");
		queue.poll();
		System.out.println(queue);
		
		System.out.println();
		System.out.println("============PriorityQueue (Based on priority )=================");
//		
		PriorityQueue<String>pq = new PriorityQueue<String>(Collections.reverseOrder());
		pq.add("Ayush");
		pq.add("Garvit");
		pq.add("Amit");
		pq.add("Ashish");
		pq.add("Garima");
//		queue.poll();
		System.out.println(pq);
//		
		System.out.println();
		System.out.println("============Deque using ArrayDeque ( First-In-First-Out/First-In-Last-Out )=================");
//		
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay"); 
		deque.addFirst("Mahesh");
		deque.addLast("Ayush");
//		
		deque.removeLast();
		System.out.println(deque.pollLast());
//		
		System.out.println();
		System.out.println("============Set using HashSet =================");
		Set<String>set = new HashSet<String>();
		set.add("Ayush");
		set.add("Garvit");
		set.add("Amit");
		set.add("Ashish");
		set.add("Garima");
		set.add("Ayush");
		set.add("Amit");
		System.out.println(set);
		System.out.println();
		System.out.println("============Set using LinkedHashSet =================");
		LinkedHashSet<String> set1=new LinkedHashSet<String>();  
		set1.add("Ravi");  
		set1.add("Vijay");  
		set1.add("Ravi");  
		set1.add("Ajay");  
		System.out.println(set1);
		
		System.out.println();
		System.out.println("============Set using TreeSet =================");
		TreeSet<String> set2=new TreeSet<String>();  
		set2.add("Ravi");  
		set2.add("Vijay");  
		set2.add("Ravi");  
		set2.add("Ajay"); 
		System.out.println(set2);
		
		
//		Part : 2
		
		System.out.println();
		System.out.println("============Map using HashMap =================");
		Map<String, Integer> map = new HashMap<>();
		
		System.out.println("============put(key,value) =================");
        map.put("Alice", 10);  
        map.put("Bob", 20);  
        map.put("Charlie", 30); 
        System.out.println("map : "+map);
        
        System.out.println("============ get(key) =================");
        System.out.println("Value for 'Alice': " + map.get("Alice"));  
        System.out.println("============ getOrDefault(key,defaultValue) =================");
        System.out.println("Default Value for 'Mahesh': " + map.getOrDefault("Mahesh",100)); // 100 
        
        System.out.println("========== Iterate using entrySet() ===========");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {  
            String key = entry.getKey();  
            Integer value = entry.getValue(); 
            System.out.println(key + ": " + value);  
        } 
        
        System.out.println("========== Iterate using keySet() ===========");
        for (String key : map.keySet()) {  
            System.out.println(key + ": " + map.get(key));  
        }
        
        System.out.println("========== Iterating in map value using values() ===========");
        for(int value:map.values()) {
        	System.out.print(value+" ");
        }
        System.out.println();
        
        System.out.println("========== remove(key) ==========="); 
        map.remove("Charlie"); 
        System.out.println(" 'Charlie' key removed from map : "+map.get("Charlie"));
        
        System.out.println("========== containsKey(key) ==========="); 
        if (map.containsKey("Bob")) {  
            System.out.println("Map contains key 'Bob'.");  
        } 
        
        System.out.println("========== containsValue(value) ===========");
        if(map.containsValue(20)) {
        	System.out.println("Map contains value 20 ");
        }
        
        System.out.println("========== putIfAbsent(key,value) ===========");
        map.putIfAbsent("Alice", 40);
        System.out.println("put if absent : "+map.get("Alice"));
        
        System.out.println("========= putAll(Map<String,Integer>map) ============");
        Map<String,Integer>childMap = new HashMap<>();
        childMap.put("Abc", 100);
        childMap.put("Def", 200);
        childMap.put("Ghi", 300);
        childMap.put("Jkl", 400);
        map.putAll(childMap);
        System.out.println("put all : "+map);
        
        System.out.println("========== computeIfAbsent(key,Function<String, Integer>function) ===========");
        Function<String, Integer>myFunc = t-> 100;
        map.computeIfAbsent("Mahesh", myFunc);
        System.out.println("compute if absent : "+map.get("Mahesh"));
        
        System.out.println("========== computeIfPresent(key,BiFunction<String, Integer, Integer>biFunction) ===========");
        BiFunction<String, Integer, Integer>biFunction = (t, u) -> u*2;
        map.computeIfPresent("Mahesh", biFunction);
        System.out.println("compute if present : "+map.get("Mahesh"));
        
        System.out.println("========== compute(key,BiFunction<String, Integer, Integer>biFunction) ===========");
        BiFunction<String, Integer, Integer>bf = (t, u) -> 340;
        map.compute("Ahirwar", bf);
        System.out.println("compute : "+map.get("Ahirwar"));
        
        System.out.println("========== merge(key,newValue, BiFunction<Integer, Integer, Integer>biFunction) ===========");
        BiFunction<Integer, Integer, Integer>bi = (t, u) -> t+u;
        map.merge("Mahesh", 2, bi);
        System.out.println("merge : "+map.get("Mahesh"));
        
        System.out.println("=========== forEach() =============");
        map.forEach((t, u) -> System.out.println(t+" : "+u));
        
        System.out.println("================== size() ==================");
        System.out.println("size : "+map.size());
        
        
        System.out.println();
        System.out.println("================Map using LinkedHashMap : insertion order ================");
        Map<Integer,Integer>linkedHashMap = new LinkedHashMap<Integer, Integer>();
        linkedHashMap.put(50, 1);
        linkedHashMap.put(20, 2);
        linkedHashMap.put(30, 3);
        linkedHashMap.put(10, 4);
        linkedHashMap.put(40, 5);
        
        System.out.println("linkedHashMap: "+linkedHashMap);
        
        System.out.println();
        System.out.println("==============Map using TreeMap : sorted order ==================");
        Map<String,Integer>treeMap = new TreeMap<String, Integer>();
        treeMap.put("Mahesh", 10);
        treeMap.put("Charlie", 20);
        treeMap.put("Alice", 30);
        treeMap.put("Bob", 40);
        treeMap.put("Ahirwar", 50);
        
        System.out.println("treeMap : "+treeMap);
        
	}

}
