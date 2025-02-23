package demo1;
import java.util.*;
public class ItemManager {

	public static void main(String[] args) {
		GenericItem g1 = new GenericItem();
		g1.setName("Generic");
		g1.setQuantity(456);
		ProduceItem p1 = new ProduceItem();
		p1.setName("Produce");
		p1.setQuantity(100);
		p1.setExpiration("Expired already!!!!");
		System.out.println(p1.getDescription());
		ArrayList<GenericItem> items=new ArrayList<GenericItem>();
		items.add(g1);
		items.add(p1);
		int i=0;
		for(i=0;i<items.size();++i)
		{
			System.out.println(items.get(i).getDescription());
		}
	}

}
