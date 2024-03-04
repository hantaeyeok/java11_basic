package sec5;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;			//List<String> => 
	protected Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
	
}
