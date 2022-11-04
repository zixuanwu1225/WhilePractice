import java.util.Scanner;
  public class StringLoops {
      // default constructor; no instance variables
      public StringLoops() {
      }

      /* Returns the number of times "character" appears in "searchString"

         This should be case sensitive!

         Examples:
         - if character = "a" and searchString = "Apples and bananas",
           this method returns 4 (it finds BOTH "A" and "a")
         - if character = "A" and searchString = "Apples and bananas",
           this method returns 1 (it finds BOTH "A" and "a")
         - if character = "!" and searchString = "Hello! Nice day!",
           this method returns 2
        */
      public int countCharacters(String character, String searchString) {
          int x = 0;
          for (int i = 0; i < searchString.length(); i++) {
              String f = searchString.substring(i, i + 1);
              if (f.equals(character)) {
                  x = x + 1;
              }
          }
          return x;
      }

      /* Returns the original string reversed

       Examples:
       - if origString = "hello!" this method returns "!olleh"
       - if origString = "Apples and bananas" this method returns "sananab dna selppA"
      */
      public String reverseString(String origString) {
          String x = "";
          for (int i = origString.length(); x.length() < origString.length(); i--) {
              String f = origString.substring(i - 1, i);
              x = x + f;
          }
          return x;
      }

// --- FIVE NEW METHODS TO ADD & IMPLEMENT ARE BELOW ---

      /* Returns the original string reversed -- SECOND IMPLEMENTATION

       Examples:
       - if origString = "hello!" this method returns "!olleh"
       - if origString = "Apples and bananas" this method returns "sananab dna selppA"
      */
      public String reverseString2(String origString) {
          String x = "";
          for (int i = 0;x.length()<origString.length();i++){
              String f = origString.substring(i,i+1);
              x = f+x;
          }
        return x;
      }
      /* Returns the number of vowels ("a", "e", "i", "o", "u") that appear in "origString";
    matches should NOT be case sensitive.

    (Note: you could do this by simply calling your countCharacters method 5 times in a
    row, one for each vowel, but that would lead to traversing the entire origString 5
    times -- it’s more efficient to only traverse the string once, so don’t use your
    countCharacters method for this!)

     Examples:
     - if origString = "Apples and bananas", this method returns 6: Apples and bananas
     - if origString = "Hello Joe", this method returns 4: Hello Joe
     - if origString = "Hmm.. pssh!", this method returns 0
     - if origString = "I", this method returns 1
     - if origString = "Supercalifragilisticexpialidocious", this method returns 16
    */
      public int countVowels(String origString)
      {
          String x = "";
          int count = 0;
          for (int i = 0;i<origString.length();i++){
                  x=""+origString.charAt(i);
                  if (x.equals("a")||x.equals("e")||x.equals("i")||x.equals("o")||x.equals("u")||x.equals("A")||x.equals("E")||x.equals("I")||x.equals("O")||x.equals("U")) {
                      count++;
                  }
              }
          return count;
          }
      public int countString(String searchString, String origString)
      {
          int i =0;
          while()

          }
      }
  }