import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CapitalizeString {

    public static  void  main(String[] args){

        List<String> ls = new ArrayList<>();
        ls.add("apple");
        ls.add("apple");
        ls.add("apple");
        ls.add("apple");

        List<String> res =  ls.stream().map(l -> l.substring(0,1).toUpperCase() +l.substring(1)).collect(Collectors.toList());
        System.out.println(res);
    }
}
