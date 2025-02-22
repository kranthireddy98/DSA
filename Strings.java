public class Strings {

public static void main(String args[]){

    char[] ch = {'j','a','v','a','p','o','i','n','t'};
    String s = new String(ch);
    String k = "javapoint";
    System.out.println(s);

    System.out.println(System.identityHashCode(s));
    System.out.println(System.identityHashCode(k));
    //compare()
    //concat()
    //split()
    //length()
    //replace()
    //compareTo()
    //intern()
    //substring()

    //String implements (Serializable,Comparable,CharSequence)

    // Stored in String Pool
    

}
}
