import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    System.out.println(pigLatinSimple("mOck"));
    System.out.println(pigLatinSimple("pIe"));
    System.out.println(pigLatinSimple("daViD"));
    System.out.println(pigLatinSimple("AaRon"));
    System.out.println(pigLatinSimple("a"));
    System.out.println(pigLatinSimple("A"));
    System.out.println(pigLatinSimple("z"));
    System.out.println(pigLatinSimple("Z"));
    System.out.println(pigLatinSimple(""));
  }
  public static String pigLatinSimple(String s){
    if (s == ""){
      return "";
    }
    s = s.toLowerCase();
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
      return(s + "hay");
    }
    else{
      return(s.substring(1) + s.charAt(0) + "ay");
    }
  }
  public static String pigLatin(String s){
    return null;
  }
  public static String pigLatinBest(String s){
    return null;
  }
}
