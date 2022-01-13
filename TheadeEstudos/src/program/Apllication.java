package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Apllication {

	private static final ExecutorService pessoaParaExecutarAtividade = Executors.newFixedThreadPool(3);

	public static void main(String[] args) {

		Casa casa = new Casa(new Quarto());
		casa.obterAfazeresDecasa()
				//.forEach(atividade -> pessoaParaExecutarAtividade.execute(() -> atividade.realizar()));
				.forEach(atividade -> pessoaParaExecutarAtividade.submit(() -> atividade.realizar()));
		pessoaParaExecutarAtividade.shutdown();

	}
}

class Casa {
	private List<Comodo> comodos;

	Casa(Comodo... comodos) {
		this.comodos = Arrays.asList(comodos);
	}

	List<Atividade> obterAfazeresDecasa() {
		return this.comodos.stream().map(Comodo::obterAfazeresDoComodo).reduce(new ArrayList<Atividade>(),
				(pivo, atividades) -> {
					pivo.addAll(atividades);
					return pivo;
				});

	}

}

interface Atividade {
	void realizar();
}

abstract class Comodo {
	abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo {
	@Override
	List<Atividade> obterAfazeresDoComodo() {
		return Arrays.asList(this::getArruamarCama, this::varrerQuarto, this::arruamarGuardaRoupa);

	}

	private void arruamarGuardaRoupa() {
		System.out.println("Arrumar guarda roupas");
	}

	private void varrerQuarto() {
		System.out.println("Varrer o Quarto");
	}

	private void getArruamarCama() {
		System.out.println("Arrumar a cama");
	}
}
