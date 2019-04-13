
public class TestaClasse {

	public static void main(String[] args) {
		
		ClasseBase classeBase = new ClasseBase("teste", "teste@teste.com.br");
		System.out.println(classeBase.getNome());
		System.out.println(classeBase.getEmail());
		
	}
}
