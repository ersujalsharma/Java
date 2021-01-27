class Cat{
	void speak() {
		System.out.println(" Meaon ! ");
	}
}
class PetCat extends Cat{
	void speak() {
		System.out.println(" Meow ! ");
	}
}
class MagicCat extends Cat {
	static boolean noOne;
	void speak() {
		if (noOne) {
			super.speak();
		} else {
			System.out.println("Hello World !");
		}
	}
}
class Demonstration_66{
	public static void main(String... a){
		PetCat c1 = new PetCat();
		MagicCat c2 = new MagicCat();
		c2.noOne = true;
		c2.speak();
		c1.speak();
		c2.noOne = false;
		c2.speak();
	}
}