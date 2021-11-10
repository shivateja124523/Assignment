1)program on HashSet

package generics;

import java.util.HashSet;

class Employee_gen {
      int id,salary;
      String emp_name,department;
	public Employee_gen(int id, int salary, String emp_name, String department) {
		super();
		this.id = id;
		this.salary = salary;
		this.emp_name = emp_name;
		this.department = department;
	}
      public void display_details()
      {
    	  System.out.println(id);
    	  System.out.println(salary);
    	  System.out.println(emp_name);
    	  System.out.println(department);
      }    
}
public class HashSet2
{
	public static void main(String[] args) 
	{
		HashSet<Employee_gen> set = new HashSet<>();
		Employee_gen e1 = new Employee_gen(123,20000,"bhav","development");
		set.add(e1);
		for(Employee_gen e:set){  
		    e.display_details();
		    }  
	}
}


2)program on exchange

package generics;

public class Exchange1<T> {
      private T[] arr;

	public Exchange1(T[] arr) {
		super();
		this.arr = arr;
	}

	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}
      
	public <E> void printElements(E[] arr)
	{
		for(E e : arr)
		{
			System.out.println(e);
		}
	}
	 public static <T> void swap(T[] array, int i, int j)
	 {
		 
       	T temp = array[i];
         array[i] = array[j];
         array[j] = temp;
         
	 }
}


3)program on HashMap


package generics;
import java.util.HashMap;
import java.util.Random;
public class Hashmap1 {
	    public static void main(String[] args)
	    {
	        HashMap<Integer,Double> store=new HashMap<Integer,Double>();
	        Random r=new Random();
	        int max=45;
	        double range=8.76;
	        double min=7;
	        for (int i = 0; i < 10; i++)
	        {
	            int x=(int)(r.nextInt(max));
	            double y=range+r.nextDouble()-min;
	            store.put(x,y);
	            System.out.println(x+" "+y);
	        }
	        System.out.println(" ");
	        System.out.println(store);
	    }
	
}


4) program on pair


a)

package generics;
public class MainClass1 {

	public static void main(String[] args) {
		Integer[] arr = {10,20,50,60};
		int p=2;
		int q=3;
		
		Exchange1<Integer> x = new Exchange1<>(arr);
		Integer[] arr2 = x.getArr();
		System.out.println("Swapping at index "+p+ " and "+q);
		System.out.println("--------------before swap-----------");
		x.printElements(arr);
		x.swap(arr,p,q);
		System.out.println("--------------after swap-----------");
		x.printElements(arr);
		

		
	}
}






b)

package generics;
import java.util.*;
public class MainClass4 {
      public static void main(String[] args) {
		
    	  
    	  pair<String, String> myobj=new pair<String, String>("1","Hello");
          System.out.println(" { "+myobj.getKey()+" = "+myobj.getValue()+" } ");
          
          Date objc=new Date();
          pair<String, java.util.Date> object=new pair<String,java.util.Date> ("1",objc);
          System.out.println(" { "+object.getKey()+" = "+object.getValue()+" } ");
	}
}


class pair<K,V>
{
	private K key;
	private V value;
	public pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}







