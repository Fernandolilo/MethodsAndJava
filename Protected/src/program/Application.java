package program;

public class Application {

	public static void main(String[] args) {
	
		final var superUsuario = new SuperUsuario("root", "1234");
		
		superUsuario.getLogin();
		superUsuario.getSenha();
		String root = superUsuario.nome;
		
		System.out.println(root);
		
		System.out.println(superUsuario.getLogin());
		System.out.println(superUsuario.getSenha());
	}

}
