package principal;

import command.Broker;
import command.Deslocamento;
import command.MovimentoAndar;
import command.MovimentoCorrer;
import command.MovimentoParar;

public class DemoCommand {
	
	public static void main(String[] args) {
		Deslocamento deslocar = new Deslocamento();
		
		MovimentoAndar movAndar = new MovimentoAndar(deslocar);
		MovimentoCorrer movCorrer = new MovimentoCorrer(deslocar);
		MovimentoParar movParar = new MovimentoParar(deslocar);
		
		Broker br = new Broker();
		br.adicionaAcao(movAndar);
		br.adicionaAcao(movAndar);
		br.adicionaAcao(movCorrer);
		br.adicionaAcao(movCorrer);
		br.adicionaAcao(movAndar);
		br.adicionaAcao(movParar);
		br.executaAcao();
	}
}
