import javax.swing.JOptionPane;

public class TVView {

	private static Integer menu = null;

	public static void mostrarmenu() {
		TV televisao = new TV();

		menu = Integer.parseInt(JOptionPane
				.showInputDialog("Selecionar um valor no menu:"
						+ "\n 1) Cadastrar" + "\n 2) Listar" + "\n 3) Deletar"
						+ "\n 4) Consultar" + "\n 5) Alterar" + "\n 6) Sair"));

		if (menu == 1) {
			televisao.cadastrar();
		} else if (menu == 2) {
			televisao.listar();
		} else if (menu == 3) {
			televisao.deletar();
		} else if (menu == 4) {
			televisao.consultar();
		} else if (menu == 5) {
			televisao.alterar();
		} else if (menu == 6) {
			System.exit(0);
		}else {
			JOptionPane.showMessageDialog(null,
					TVMessage.MESSAGEM_ERRO_MENU);
		}

	}

	public static void main(String[] args) {

	}

}
