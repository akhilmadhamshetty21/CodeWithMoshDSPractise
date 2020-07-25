import java.util.ArrayList;
import java.util.HashMap;

public class Trie {
 public static class Node{
	 char value;
	 HashMap<Character,Node> childrens=new HashMap<>();
	 boolean isEndOfWord;
	 public Node(char value) {
		 this.value=value;
	 }
	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}
	public Node[] getChildren() {
		return childrens.values().toArray(new Node[0]);
	}
	 
 }
 Node root=new Node('\0');
 public void insert(String word) {
	 Node current=root;
	 for(char ch:word.toCharArray()) {
		 if(current.childrens.get(ch)==null)
			 current.childrens.put(ch,new Node(ch));
		 current=current.childrens.get(ch);
	 }
	 current.isEndOfWord=true;	 
 }
 public String contains(String word) {
//	 Node current=root;
//	 for(char ch:word.toCharArray()) {
//		 if(current.childrens.containsKey(ch))
//			 current=current.childrens.get(ch);
//	 }
//	 if(current.isEndOfWord)
//		 return true;
//	 return false;
	 String str="";
     ArrayList<String> similar=new ArrayList<>();
	 Node current=root;
	 for(char ch:word.toCharArray()) {
		 if(current.childrens.containsKey(ch)) {
			 current=current.childrens.get(ch);
			 str=str+""+ch;
			 if(current.isEndOfWord){
	             similar.add(str);
	         }
		 }
         
	 }
     System.out.println(similar);
	 return str;
 }
 public void traverse() {
	 traverse(root);
 }
 int count=0,acount=0;
private void traverse(Node root2) {
	// TODO Auto-generated method stub
	System.out.print(root2.value+"="+count+"\n");
	for(Node child:root2.getChildren()) {
		traverse(child);
		
	}
	
}
String result="";
public String longestWords(){
	String presult="";
    longestWords(root,presult);
    return result;
}
private void longestWords(Node root,String presult){
    if(root.isEndOfWord) {
    	count++;
    	presult=presult+""+root.value;
    }
    
    if(root.getChildren().length==0) {
    	if(count>acount) {
    		acount=count;
//    		System.out.println(count);
//    		System.out.println(acount);
    		count=0;
    		result=presult;
    		presult="";
    	}
    	else
    		count=0;
    }
    for(Node child:root.getChildren()) {
		longestWords(child,presult);
	}	
}

public ArrayList<String> autocomplete(String word){
	ArrayList<String> suggested=new ArrayList<String>();
	Node prefix=findLastNodeOf(word);
	autocomplete(prefix,word,suggested);
	return suggested;
}
private void autocomplete(Node root, String word, ArrayList<String> suggested) {
	// TODO Auto-generated method stub
	if(root.isEndOfWord==true)
		suggested.add(word);
	for(Node child:root.getChildren()) {
		
		autocomplete(child,word+child.value,suggested);
	}

}
private Node findLastNodeOf(String prefix) {
	Node current=root;
	for(char ch:prefix.toCharArray()) {
		Node child=current.childrens.get(ch);
		if(child==null)
			return null;
		current=child;
	}
	return current;
}
}
