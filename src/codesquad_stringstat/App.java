package codesquad_stringstat;
import java.util.HashMap;
public class App {
	
	static final String inputSentence = "Do you know Doctor who?";
	
	public static void main (String args[]) {
		HashMap alphabetCount = new HashMap();
		
		String processedSentence = inputSentence.replaceAll("\\?", "");
		String countSentence = processedSentence.replaceAll(" ", "");
		String [] words = processedSentence.split(" ");
		words[0] += "?";
		for (int i = 0; i < words.length; i++) {
			
			System.out.print(words[words.length - i - 1] + " ");
		}
		
		System.out.println("\n전체 수: " + countSentence.length());
	}

}
