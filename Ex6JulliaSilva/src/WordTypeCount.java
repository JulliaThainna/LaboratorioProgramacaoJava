// Fig. 16.17: WordTypeCount.java
// Program counts the number of occurrences of each word in a String.
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class WordTypeCount {
   public static void main(String[] args) {
      // create HashMap to store char keys and Integer values
      Map<Character, Integer> myMap = new HashMap<>();            

      createMap(myMap); // create map based on user input
      displayMap(myMap); // display map content
   } 

   // create map from user input
   private static void createMap(Map<Character, Integer> map) {
      Scanner scanner = new Scanner(System.in); // create scanner
      System.out.println("Enter a string:"); // prompt for user input
      String input = scanner.nextLine();

      // convert to lowercase and string to char array
      char[] tokens = input.toLowerCase().toCharArray();
               
      // processing input text 
      for (char token : tokens) {
         // if the map contains the word
    	 if ((int)token >= 65 && (int)token <= 123) { //Se o token for uma letra (tabela ASCII)
             if (map.containsKey(token)) { // is word in map?
                 int count = map.get(token); // get current count
                 map.put(token, count + 1); // increment count   
              } 
              else {
                 map.put(token, 1); // add new word with a count of 1 to map
              }  
    	 }
      } 
      scanner.close();
   } 
   
   // display map content
   private static void displayMap(Map<Character, Integer> map) {
      Set<Character> keys = map.keySet(); // get keys

      // sort keys
      TreeSet<Character> sortedKeys = new TreeSet<>(keys);

      System.out.printf("%nMap contains:%nKey\t\tValue%n");

      // generate output for each key in map
      for (char key : sortedKeys) {
         System.out.printf("%-10s%10s%n", key, map.get(key));
      }
      
      System.out.printf(
         "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
   } 
} 
