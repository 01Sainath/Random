import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		Map m1[] = new Map[n];
		for(int i=0; i<n; i++) {
			System.out.print("Key:");
			int key = input.nextInt();
			System.out.print("Value:");
			String value = input.next();
			
			m1[i] = new Map(key,value);
		}
		
		System.out.println("Before sort");
		for(int i=0; i<n; i++) {
			System.out.println("Key:"+m1[i].key+", Value:"+m1[i].value);
		}
		Map.sort(m1);
		System.out.println("After sort");
		for(int i=0; i<n; i++) {
			System.out.println("Key:"+m1[i].key+", Value:"+m1[i].value);
		}
	}

}

class Map{
	int key;
	String value;
	public Map(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	static void sort(Map[] m1) {
		
		int n = m1.length;
		Map temp;
		for(int i=0; i<n; i++) {
			for(int j=1; j<n; j++){
				if(m1[j-1].key > m1[j].key) {
					temp = new Map(m1[j-1].key,m1[j-1].value);
					m1[j-1].key = m1[j].key;
					m1[j-1].value = m1[j].value;
					m1[j].key = temp.key;
					m1[j].value = temp.value;
				}
			}
		}
	}
}
