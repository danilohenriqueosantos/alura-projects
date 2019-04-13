public class CriaConta {

    public static void main(String[] args) {
        Conta contaDoDanilo = new Conta();
        contaDoDanilo.deposita(200);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(300);
        if (contaDaMarcela.transfere(100, contaDoDanilo)) {
        	System.out.println("Valor transferido com sucesso");
        	System.out.println("Saldo em conta: " + contaDaMarcela.getSaldo());
        }

        System.out.println(contaDoDanilo.getSaldo());
    }

}