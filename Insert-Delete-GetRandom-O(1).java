1import java.util.*;
2
3class RandomizedSet {
4    private ArrayList<Integer> list;
5    private HashMap<Integer, Integer> map; 
6    private Random rand;
7    public RandomizedSet() {
8        list = new ArrayList<>();
9        map = new HashMap<>();
10        rand = new Random();
11    }
12    public boolean insert(int val) {
13        if (map.containsKey(val)){
14            return false;
15        }
16        map.put(val, list.size());
17        list.add(val);
18        return true;
19    }
20    
21    public boolean remove(int val) {
22        if (!map.containsKey(val)){
23            return false;
24        }
25        int indexToRemove = map.get(val);
26        int lastElement = list.get(list.size() - 1);
27        list.set(indexToRemove, lastElement);
28        map.put(lastElement, indexToRemove);
29        list.remove(list.size() - 1);
30        map.remove(val);
31        return true;
32    }
33    public int getRandom() {
34        return list.get(rand.nextInt(list.size()));
35    }
36}