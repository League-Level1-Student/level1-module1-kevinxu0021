
public class Chicken {
	 String canLayEggs;
	 String canEatIt;
	Chicken(String canLayEggs, String canEatIt) {
      	this.canLayEggs = canLayEggs;
      	this.canEatIt = canEatIt;
}
	public static void main(String[] args) {
		Chicken chicken = new Chicken("Chickens can lay eggs.","You can eat chickens.");
		System.out.println(chicken.canLayEggs);
		System.out.println(chicken.canEatIt);
		chicken.eat();
	}
	public void eat(){
		// TODO Auto-generated method stub
		System.out.println("eat");
	}
}
