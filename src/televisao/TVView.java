package televisao;

import javax.swing.JOptionPane;

public class TVView {

	private static Integer menu;

	public static void mostrarMenu() {
		TvRepositorio repositorio = new TvRepositorio();

		do {
			menu = Integer.parseInt(JOptionPane
					.showInputDialog("Selecionar um valor no menu:"
							+ "\n 1)Cadastrar " + "\n 2)Listar "
							+ "\n 3)Deletar " + "\n 4)Consultar "
							+ "\n 5)Alterar " + "\n 6)Sair"));

			if (menu == 1) {
				TV tv = new TV();
				tv.setId(Integer.parseInt(JOptionPane
						.showInputDialog("Digite o Id da Televisão: ")));
				tv.setMarca(JOptionPane
						.showInputDialog("Digite a Marca da Televisão: "));
				tv.setModelo(JOptionPane
						.showInputDialog("Digite o Modelo da Televisão: "));
				tv.setTamanho(Integer.parseInt(JOptionPane
						.showInputDialog("Digite o tamanho da Televisão: ")));
				tv.setVoltagem(JOptionPane
						.showInputDialog("Digite a voltagem da Televisão: "));
				tv.setNumeroSerie(Integer.parseInt(JOptionPane
						.showInputDialog("Digite o numero de série da Televisão: ")));
				repositorio.cadastrar(tv);
				JOptionPane.showMessageDialog(null,
						"TelevisÃ£o cadastrada com Sucesso!");
			} else if (menu == 2) {
				JOptionPane.showMessageDialog(null, repositorio.listar());

			} else if (menu == 3) {
				int televisaoParaDeletar = Integer
						.parseInt(JOptionPane
								.showInputDialog(" Qual o ID da Televisão a ser deletada ?"));
				repositorio.deletar(televisaoParaDeletar);
			} else if (menu == 4) {
				int televisaoParaAchar = Integer
						.parseInt(JOptionPane
								.showInputDialog(" Qual o ID da Televisão Procurada ?"));
				
				JOptionPane.showMessageDialog(null, repositorio.consultar(televisaoParaAchar));
			} else if (menu == 5) {
				repositorio.alterar();
			}
		} while (menu != 6);
	}

	public static void main(String[] args) {
		mostrarMenu();
	}

}
