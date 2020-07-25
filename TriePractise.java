
public class TriePractise {
	public static void main(String[] args) {
		Trie trie=new Trie();
//		trie.insert("akhil");
//		trie.insert("akon");
//		trie.insert("akshay");
		String[] input= {"cat","bat","rat","catt","cattl"};
		for(String str: input){
            trie.insert(str);
        }
//		trie.traverse();
//		System.out.print(trie.autocomplete("aks"));
		System.out.println(trie.contains("cattle"));
//		char ch='a';
//		System.out.println(trie.longestWords());
	}
}
