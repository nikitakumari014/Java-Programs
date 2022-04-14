public class strings {
    public static void main(String[]args)
    {
      String s1,s2;
      s1 = "Hello there!";
      s2 = "Java Programming";
      System.out.println(s1.indexOf("o"));
      System.out.println(s2.indexOf("r")); // index of a variable.
      System.out.println(s1.charAt(7));
      System.out.println(s2.charAt(6)); //character at any index
      System.out.println(s1.toUpperCase());
      System.out.println(s2.toUpperCase());  // lower to upper case
      System.out.println(s1.toLowerCase());
      System.out.println(s2.toLowerCase());  //upper to lower case
      if(s1 == s2)
      System.out.println("Equal");
      else 
      System.out.println("Unequal"); // comparing both strings 
      System.out.println(s1.substring(2,7)); //substring of s1.


    }
}
