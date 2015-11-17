package televisao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TvRepositorio {

	private List<TV> repositorio;

	public TvRepositorio() {
		repositorio = new ArrayList<TV>();
	}

	public void cadastrar(TV televisao) {
		repositorio.add(televisao);
	}

	public String listar() {
		String valoresConcatenadosLista = "Codigo      Marca      modelo \n";
		for (TV linha : repositorio) {
			valoresConcatenadosLista = valoresConcatenadosLista + "      "
					+ linha.getId() + "             " + linha.getMarca()
					+ "            " + linha.getModelo() + "\n";
		}
		return valoresConcatenadosLista;
	}

	public void deletar(int televisaoParaDeletar) {

		TV tvParaExcluir = new TV();

		for (TV linha : repositorio) {
			if (linha.getId() == televisaoParaDeletar) {
				tvParaExcluir = linha;
			}
		}
		if (tvParaExcluir.getId() != 0) {
			repositorio.remove(tvParaExcluir);

			JOptionPane.showMessageDialog(null, "Tv deletada com Sucesso");

		}

	}

	public String consultar(int televisaoParaAchar) {

		TV tvParaAchar = new TV();

		for (TV linha : repositorio) {
			if (linha.getId() == televisaoParaAchar) {
				tvParaAchar = linha;
			}
		}
		String televisaoConsulta ="   "+tvParaAchar.getId()+"  "+
				tvParaAchar.getMarca()+"  "+
				tvParaAchar.getModelo()+"  "+
				tvParaAchar.getNumeroSerie()+"  "+
				tvParaAchar.getTamanho()+"  "+
				tvParaAchar.getVoltagem();	
		
		return televisaoConsulta;
	}

	public void alterar() {
		TV tvParaExcluir = new TV();
		TV novaTv = new TV();

		int codigoParaAlterar = Integer
				.parseInt(JOptionPane
						.showInputDialog("Qual o codigo da Televisão que você deseja alterar? "));
		for (TV linha : repositorio) {
			if (linha.getId() == codigoParaAlterar) {
				tvParaExcluir = linha;
			}
		}
		if (tvParaExcluir.getId() != 0) {
			repositorio.remove(tvParaExcluir);

			novaTv.setId(Integer.parseInt(JOptionPane
					.showInputDialog("Qual o codigo da Televisão ? ")));
			novaTv.setMarca(JOptionPane
					.showInputDialog("Qual a marca da Televisão ? "));
			novaTv.setModelo(JOptionPane
					.showInputDialog("Qual o modelo da Televisão ? "));
			novaTv.setVoltagem(JOptionPane
					.showInputDialog("Qual a voltagem da Televisão ? "));
			repositorio.add(novaTv);

			JOptionPane.showMessageDialog(null, "Alterado com Sucesso");

		} else {
			System.err.println("Esse cara não existe na lista");
		}
	}

}
