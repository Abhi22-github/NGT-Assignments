package list;

public class reverse_sentence_24 {
	public static void main(String[] args) {
	    String sentence = "Reverse This";
	    String reversed = reverse(sentence);
	    System.out.println("The reversed sentence is: " + reversed);
	  }

	  public static String reverse(String sentence) {
	    if (sentence.isEmpty())
	      return sentence;

	    return reverse(sentence.substring(1)) + sentence.charAt(0);
	  }
}