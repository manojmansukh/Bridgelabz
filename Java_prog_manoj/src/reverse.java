public class reverse
{
   public void reverseWordInMyString(String str)
   {
	/* The split() method of String class splits
	 * a string in several strings based on the
	 * delimiter passed as an argument to it
	 */
	String[] words = str.split(" ");
	System.out.println(words[1]);
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
          // System.out.println(word);
            String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		/* The charAt() function returns the character
		 * at the given position in a string
		 */
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
	System.out.println(str);
	System.out.println(reversedString);
   }
   public static void main(String[] args) 
   {
	reverse obj = new reverse();
	obj.reverseWordInMyString("Welcome to BeginnersBook");
	//obj.reverseWordInMyString("This is an easy Java Program");
   }
}