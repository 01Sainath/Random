import java.util.ArrayList;

public class Hashmapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mapp m1 = new Mapp();
		m1.add(1,1000);
		m1.add(2, 2000);
		m1.add(3, 3000);
		
		m1.displayMapp();
		
		m1.setValue(3, 3500);
		m1.displayMapp();
	}

}

class Mapp{
	ArrayList<ArrayList<Integer>> map = new ArrayList<>();
	int currIndex = 0;
	void add(int key, int value) {
		map.add(new ArrayList<Integer>());
		map.get(currIndex).add(key);
		map.get(currIndex).add(value);
		currIndex++;
	}
	
	int size() {
		return currIndex;
	}
	
	int getValue(int key) {
		
		for(int i=0; i<map.size(); i++) {
			if(map.get(i).get(0) == key) {
				return map.get(i).get(1);
			}
		}
		
		return -1;
	}
	
	void setValue(int key, int value) {
		for(int i=0; i<map.size(); i++) {
			if(map.get(i).get(0) == key) {
				map.get(i).set(1,value);
				return;
			}
		}
	}
	
	void displayMapp() {
		for(ArrayList<Integer> list: this.map) {
			System.out.print("[ ");
			for(int ele: list) {
				System.out.print(ele+" ");
			}
			System.out.println("]");
		}
	}
	
}



