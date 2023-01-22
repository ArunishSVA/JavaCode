package oth.dfb;

public class NestedForLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.println("J Value="+j);
			}
			System.out.println("I value="+i);
		}
	}

}
