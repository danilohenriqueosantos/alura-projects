
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Admistrador admistrador = new Admistrador();
		admistrador.setSenha(3333);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(admistrador);
		
	}
}
