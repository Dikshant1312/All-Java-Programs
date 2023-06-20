import java.util.*;  
public class Exp_7b {  
       public static void main(String args[]) {   
          Vector<String> vec = new Vector<String>();   
          vec.add("Apple");  
          vec.add("Mango");  
          vec.add("Pineapple");   
          System.out.println("Original Elements are: "+vec);
 System.out.println("Cloned vector: "+vec.clone());    
 System.out.println("The first fruit of the vector is = "+vec.firstElement());   
 System.out.println("The last fruit of the vector is = "+vec.lastElement());
 System.out.println("Size of Vector before clear() method: "+vec.size());   
 vec.clear();  
 System.out.println("Size of Vector after clear() method: "+vec.size());       
  }  
}  


