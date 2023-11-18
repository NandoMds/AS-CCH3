package command;

import java.util.ArrayList;

public class Broker {
	
	private ArrayList<AcaoIF> listaAcoes = new ArrayList<AcaoIF>();
	
	public void adicionaAcao(AcaoIF acao) {
		listaAcoes.add(acao);
	}
	
	public void executaAcao() {
		for(AcaoIF acao : listaAcoes) {
			acao.executar();
		}
		
		listaAcoes.clear();
	}
}
