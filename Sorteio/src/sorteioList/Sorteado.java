package sorteioList;

public class Sorteado {
	
	public static void main(String[] args) {
		
	NumeroSorte numeroSorte = new NumeroSorte(20, 100);
	
	 int numeroSorteado = numeroSorte.sortear();
	
	System.out.println("O número sorteado foi o  " + numeroSorteado + " Parabéns");
	}

}
