package codesquad_stringstat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class App {
	
	static final String inputSentence = "Do you know Doctor who?";
	
	
	
	
	public static void main (String args[]) {
		HashMap<String, Integer> alphabetCount = new HashMap();
		List<String> sortedCount = new ArrayList();
		
		String processedSentence = inputSentence.replaceAll("\\?", "");
		String countSentence = processedSentence.replaceAll(" ", "");
		String [] words = processedSentence.split(" ");
		String [] letters = countSentence.toLowerCase().split("");
		words[0] += "?";
		for (int i = 0; i < words.length; i++) {
			
			System.out.print(words[words.length - i - 1] + " ");
		}
		
		System.out.println("\n전체 수: " + countSentence.length());
		for (int i = 0; i < letters.length; i++) {
			if (alphabetCount.containsKey(letters[i]) == true) {
				int temp = Integer.parseInt(alphabetCount.get(letters[i]).toString()) + 1;
				alphabetCount.put(letters[i], temp);
			}
			
			else {
				alphabetCount.put(letters[i], 1);
			}
		}
		
		sortedCount = App.sortByValue(alphabetCount);
		for (int i = 0; i < sortedCount.size(); i++) {
			String key = sortedCount.get(i);
			System.out.println(key + " : " + alphabetCount.get(key));
			
		}
		/*Set<String> keyset = alphabetCount.keySet();
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()) {
			String key = (String)iter.next();
			System.out.println(key + ": " + alphabetCount.get(key));*/
}
	
	  public static List<String> sortByValue(final HashMap<String, Integer> map){
	        List<String> list = new ArrayList<String>();
	        list.addAll(map.keySet());
	        Collections.sort(list,new Comparator<Object>(){

				@SuppressWarnings("unchecked")

				public int compare(Object o1,Object o2){

	                Object v1 = map.get(o1);
	                Object v2 = map.get(o2);

	                return ((Comparable<Object>) v1).compareTo(v2);

	            }

	        });

	        Collections.reverse(list); 

	        return list;

	    }

}
