package balaji.AssistedPractice;
	 import java.util.*;
	 public class UsingtheMap7a {

	 	public static void main(String[] args) {
	 		// map
	 			
	 		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	 	      hm.put(1,"Ram");    
	 	      hm.put(2,"Rishi");    
	 	      hm.put(3,"Kavin");   
	 	       
	 	      System.out.println("\nThe elements of Hashmap are ");  
	 	      for(Map.Entry m:hm.entrySet()){    
	 	       System.out.println(m.getKey()+" "+m.getValue());    
	 	      }
	 	     System.out.println(" ------------------------------------------------------------------- ");
	 	     //HashTable
	 	       
	 	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	 	      
	 	      ht.put(4,"Shiv");  
	 	      ht.put(5,"Rithu");  
	 	      ht.put(6,"Kaali");  
	 	      ht.put(7,"Jithin");  

	 	      System.out.println("\nThe elements of HashTable are ");  
	 	      for(Map.Entry n:ht.entrySet()){    
	 	       System.out.println(n.getKey()+" "+n.getValue());    
	 	      }
	 	      
	 	     System.out.println(" ------------------------------------------------------------------- ");
	 	      //TreeMap
	 	      
	 	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	 	      map.put(8,"Anitha");    
	 	      map.put(9,"Cynthia");    
	 	      map.put(10,"Zara");       
	 	      
	 	      System.out.println("\nThe elements of TreeMap are ");  
	 	      for(Map.Entry l:map.entrySet()){    
	 	       System.out.println(l.getKey()+" "+l.getValue());    
	 	      }    
	 	     System.out.println(" ------------------------------------------------------------------- ");
	 	   }  
	 }


