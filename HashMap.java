
import java.util.*;
class Mapex {
    public static void main(String[] args) {
        HashMap < Integer,String>map = new HashMap<Integer,String>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Custard apple");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        
        System.out.println("After inserting a new Val using putIfAbsent Method");
        map.putIfAbsent(4,"Date");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.put(5, "Emu");
        map.putAll(map);
        System.out.println("after inserting all :");
        for(Map.Entry m:map.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
          
          map.remove(4);
          System.out.println("after removing:"+map);
          map.replaceAll((k,v)->"Z");
          System.out.println("replacing All:"+map);
          map.replace(1,"Z","B");
          System.out.println("B"+map);
        
    }
}
