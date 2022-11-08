import java.util.Locale;
import java.util.Scanner;
  public class StringLoops {
      // default constructor; no instance variables
      public StringLoops() {
      }
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
      public String reverseString(String origString) {
          String x = "";
          for (int i = origString.length(); x.length() < origString.length(); i--) {
              String f = origString.substring(i - 1, i);
              x = x + f;
          }
          return x;
      }
      public String reverseString2(String origString) {
          String x = "";
          for (int i = 0;x.length()<origString.length();i++){
              String f = origString.substring(i,i+1);
              x = f+x;
          }
        return x;
      }
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
          int q = 0;
          int f = 0;
          int i =searchString.length();
          origString=origString.toLowerCase();
          searchString=searchString.toLowerCase();
          String x = "";
          while(i<=origString.length()){

              x = origString.substring(f,f+searchString.length());
              if (x.equals(searchString)){
                  q=q+1;
              }
              f=f+1;
              i=i+1;
          }
          return q;
      }
      public String removeString(String searchString, String origString)
      {
          String d="";
          String e="";

          int f = 0;
          int i =searchString.length();
          String x = "";
          while(i<=origString.length()){

              x = origString.substring(f,f+searchString.length());
              if (x.equals(searchString)){
                  d=origString.substring(0,f);
                  e=origString.substring(f+searchString.length());
                  origString=d+e;
                  f=0;
                  i=searchString.length();
              }
              if(!x.equals(searchString)) {
                  f = f + 1;
                  i = i + 1;
              }
          }
          return origString;
      }
      public String replaceCharacter(String searchChar, String origStr, String replaceChar)
      {
          String d="";
          String e="";
          String x = "";
          int f=0;
          int i= searchChar.length();
          while(i<=origStr.length()) {
              x = origStr.substring(f,f+searchChar.length());
              if (x.equals(searchChar)){
                  d=origStr.substring(0,f);
                  e=origStr.substring(f+searchChar.length());
                  origStr=d+replaceChar+e;
                  f=0;
                  i=searchChar.length();
              }
              if(!x.equals(searchChar)) {
                  f = f + 1;
                  i = i + 1;
              }
          }
          return origStr;
      }

  }