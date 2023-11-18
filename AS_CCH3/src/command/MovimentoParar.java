package command;

public class MovimentoParar implements AcaoIF{
	private Deslocamento deslocar;
	
	public MovimentoParar(Deslocamento deslocar) {
		this.deslocar = deslocar;
	}

	@Override
	public void executar() {
		
		this.deslocar.parar();
		
	}
}