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
    System.out.println(pigLatin("tHe"));
    System.out.println(pigLatin("CheCk"));
    System.out.println(pigLatin("skeE"));
    System.out.println(pigLatin("eMU"));
    System.out.println(pigLatin("gRade"));
    System.out.println(pigLatin("tH"));
    System.out.println(pigLatin("mOck"));
    System.out.println(pigLatin("pIe"));
    System.out.println(pigLatin("daViD"));
    System.out.println(pigLatin("AaRon"));
    System.out.println(pigLatin("a"));
    System.out.println(pigLatin("A"));
    System.out.println(pigLatin("z"));
    System.out.println(pigLatin("Z"));
    System.out.println(pigLatin(""));
  }
  public static String pigLatinSimple(String s){
    if (s == ""){
      return "";
    }
    s = s.toLowerCase();
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
      return(s + "hay");
    }
    else if (s.length() > 1){
      return(s.substring(1) + s.charAt(0) + "ay");
    }
    else{
      return(s.charAt(0) + "ay");
    }
  }
  public static String pigLatin(String s){
    ArrayList<String> digraphs = new ArrayList<String>(Arrays.asList("bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"));
    s = s.toLowerCase();
    if (s.length() > 1 && digraphs.contains(s.substring(0,2))){
      if(s.length() == 2){
        return(s + "ay");
      }
      else{
        return(s.substring(2) + s.substring(0, 2) + "ay");
      }
    }
    else{
      return(pigLatinSimple(s));
    }
  }
  public static String pigLatinBest(String s){
    return null;
  }
}
