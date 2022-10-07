
import java.util.*;

public class mtf<T>{
	// left of the list is top of the mtf
	private LinkedList<T> myData = new LinkedList<T>();
	// push removing previous occurrences of item
	// O(n) because remove(item) is O(n) and add() is O(1) in LL
	public void push(T item){
		myData.remove(item);
		myData.add(item);
	}
	// pop
	// O(1) because remove() is O(1) in LL
	public T pop(){return myData.remove();}
	// contains
	// O(n) because contains() is O(n) in LL
	public boolean contains(T item){return myData.contains(item);}
	// isEmpty
	// O(1) because isEmpty() is O(1) in LL
	public boolean isEmpty(){return myData.isEmpty();}
	// toString
	// O(n) because toString is O(n) in LL
	public String toString(){return myData.toString();}
	// test
	public static void main(String[] args){
		mtf<Integer> myMTF = new mtf<Integer>();
		for (int i=1; i<=10; i++){myMTF.push(i);}
		System.out.println(myMTF);
		// checking that repetitions are removed
		for (int i=1; i<=10; i++){myMTF.push(i);}
		System.out.println(myMTF);
		// checking both outcomes of boolean functions
		System.out.println("The structure contains 5: "+myMTF.contains(5));
		System.out.println("The structure is empty: "+myMTF.isEmpty());
		while(!myMTF.isEmpty()){myMTF.pop();}
		System.out.println("The structure contains 5: "+myMTF.contains(5));
		System.out.println("The structure is empty: "+myMTF.isEmpty());
	}
}
