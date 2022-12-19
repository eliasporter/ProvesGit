
public class ProvaGit {

	public static void main(String[] args) {
		System.out.println("Proves i mes proves");
		
		int n=0;
		for (int i = 0; i < 10; i++) {
			if (esParell(n)) {
				System.out.println(n);
			}
			n++;		
		}

	}
	
	public static void Saludar (int n) {
		System.out.println("Hola persona "+n+"!");
	}
	
	public static boolean esParell (int n) {
		return n%2==0;
	}

}
