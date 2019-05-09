
public class TesteSistema {

	public static void main(String[] args) {
		
		Autenticavel gerente = new Gerente();
		gerente.setSenha(2222);
		
		Autenticavel admistrador = new Admistrador();
		admistrador.setSenha(3333);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(gerente);
		si.autentica(admistrador);
		
	}
}
