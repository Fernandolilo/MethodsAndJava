package program;


public class Apllication {

	public static void main(String[] args) {
		/*
		 * BarraDeCarregamento2 barra = new BarraDeCarregamento2(); BarraDeCarregamento3
		 * barra1 = new BarraDeCarregamento3(); barra.start(); barra1.start();
		 */

		/*
		 * Thread thread = new Thread(new BarraDeCarregamento2()); Thread thread1 = new
		 * Thread(new BarraDeCarregamento3());
		 * 
		 * thread.start(); thread1.start();
		 * 
		 * System.out.println("Nome da Thread: "+ thread.getName());
		 * System.out.println("Nome da Thread: "+ thread1.getName());
		 */

		GerararPDF pdf = new GerararPDF();
		BarraDeCarregamento carregamento = new BarraDeCarregamento(pdf);

		pdf.start();
		carregamento.start();

	}

}

class GerararPDF extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Iniciar");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("PDF gerado");
	}
}

class BarraDeCarregamento extends Thread {

	private Thread pdf;

	public BarraDeCarregamento(Thread pdf) {
		this.pdf = pdf;
	}

	@Override
	public void run() {

		while (true) {

			try {
				Thread.sleep(500);
				if (!pdf.isAlive()) {
					break;
				}
				System.out.println("Loading...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}

class BarraDeCarregamento2 implements Runnable {

	public void run() {

		try {
			Thread.sleep(5000);
			System.out.println("Rodei barra de carregamento 2 : ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class BarraDeCarregamento3 implements Runnable {

	public void run() {

		try {
			Thread.sleep(1000);
			System.out.println("Rodei barra de carregamento 3 : ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
