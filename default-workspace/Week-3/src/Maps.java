import java.awt.Menu;
import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		Map<String, Double> menuItems = new HashMap<String, Double>();
		

	      menuItems.put("Spaghetti", 8.97);
	      menuItems.put("Lasagana", 10.98);
	      menuItems.put("Pizza", 15.50);
	      menuItems.put("Ceasar salad", 7.00);
	      menuItems.put("Kale salad", 7.00);
	      
	      System.out.println("The price of Spaghetti" + menuItems.get("Spaghetti"));
	      System.out.println("The price of Lasagna" + menuItems.get("Lasagna"));
	      System.out.println("The price of Pizza" + menuItems.get("Pizza"));
	      System.out.println("The price of Ceasar Salad" + menuItems.get("Ceasar Salad"));
	      System.out.println("The price of Kale salad" + menuItems.get("Kale Salad"));
	}
} 
	