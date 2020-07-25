import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractise {
	public static void main(String[] args) {
		HashMapNonRepeated("ggreen apple");
		System.out.println(HashMapRepeated("rreen apple"));
		countPairsWithDiff(2, new int[] {1,7,5,9,2,12,3});
	}
	private static char HashMapRepeated(String str) {
		// TODO Auto-generated method stub
		Set<Character> hset=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			if(hset.add(str.charAt(i))==false)
				return str.charAt(i);
		}
		return Character.MAX_VALUE;
		
	}
	public static void HashMapNonRepeated(String str) {
		Map<Character,Integer> hmap=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(!hmap.containsKey(str.charAt(i)))
				hmap.put(str.charAt(i), 1);
			else
				hmap.put(str.charAt(i),hmap.get(str.charAt(i))+1);
		}
		System.out.println(hmap);
		for(int i=0;i<str.length();i++) {
			 if(hmap.get(str.charAt(i))==1) {
				 System.out.println(str.charAt(i));
				 break;
			 }
				 
		}
	}
	public static void countPairsWithDiff(int k,int[] arr) {
		int count=0;
		HashSet<Integer> hset=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hset.add(arr[i]);
		}
		for(int i=0;i<hset.size();i++) {
			if(hset.contains(i+k))
				count++;
		}
		System.out.print(count);
	}
}
