package aplication;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Fernando", "Tania", "Elias", "Heloisa", "Davi"};
		
		
		/*fazer o for normalmente tem o mesmo efeito de 
		 * fazer um for aech veja ex; a baixo.
		 */
		
	
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("====================");
		for(String obj: vect) {
			System.out.println(obj);
		}
		
	}
}
