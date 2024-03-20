package atividade;

public class Vetor<T> {

	private T[] vetorT;

	public Vetor(T[] vetorT) {
		this.vetorT = vetorT;
	}
	
	public T[] getVetorT() {
		return vetorT;
	}

	public void setVetorT(T[] vetorT) {
		this.vetorT = vetorT;
	}
	
}
