package demo1;

public class HomeDecision {

	public static void main(String[] args) {
		Apartment choiceA = new Apartment(1085.0, 1, 4.0);
		House choiceB = new House(1090, 1, 4.2, 300000);
		System.out.println(choiceA.score);
		System.out.println(choiceB.score);
	}

}
