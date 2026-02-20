package multipleInheritence;

public class Cub implements Lion, Lioness{
	void play() {
		System.out.println("Cub is playing");
	}

	@Override
	public void hunt() {
		System.out.println("She is hunting");
		
	}

	@Override
	public void roar() {
		System.out.println("He is roaring");
		
	}
 
}
