package biblioteca;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {
	
	static JTextField nome = new JTextField();
	static JTextField cpf = new JTextField();
	
	static Object[] opcoesIniciar = {"Cadastrar usuário","Emprestar livros","Cadastrar livros"};
	static Object[] camposUsuario = {"Nome",nome,"CPF",cpf};
	
	static ArrayList <Pessoa> pessoas = new ArrayList <>();
	static ArrayList <Livro> livros = new ArrayList <>();
	
	static Emprestimo emprestimo = new Emprestimo();

	public static void main (String[]args) {
		
		int op = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu iniciar", 1, 3, null, opcoesIniciar, null);
		switch (op) {
		case 0:
			cadastrarUsuario();
			break;
		case 1:
			cadastrarLivro();
			break;
		case 2:
			break;
		}
		
	}
	
	public static void cadastrarUsuario() {
		JOptionPane.showConfirmDialog(null, camposUsuario, "Dados", JOptionPane.INFORMATION_MESSAGE);
		Pessoa p = new Pessoa(nome.getText(), cpf.getText());
		pessoas.add(p);
	}
	
	public static void cadastrarLivro() {
		String nomeLivro = JOptionPane.showInputDialog(null, "Informe o nome do livro", "Dados", JOptionPane.INFORMATION_MESSAGE);
		Livro l = new Livro(nomeLivro);
	}
	
	
}
