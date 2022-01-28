package balaji.AssistedPractice;
	import java.util.*;
	public class Usesofcollections6 {
		public static void main(String[] args) {
			//creating array list
			System.out.println("ArrayList");
			ArrayList<String> city=new ArrayList<String>();   
		      city.add("Chennai");//
		      city.add("Bangalore");    	   
		      System.out.println(city);  
			
			//creating a Vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(20); 
		      vec.addElement(40); 
		      System.out.println(vec);
			
			//creating linked list
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("Ravindra");  
		      names.add("Hardhik");  	      
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       //creating hash set
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(117);  
		       set.add(118);  
		       set.add(119);
		       set.add(120);
		       System.out.println(set);
		       
		       //creating linked hash set
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(17);  
		       set2.add(18);  
		       set2.add(19);
		       set2.add(20);	       
		       System.out.println(set2);
		      	} 
		      }  
		}


