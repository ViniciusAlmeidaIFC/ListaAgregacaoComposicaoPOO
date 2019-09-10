package aula04.composicao3;

public class MainConta {

	public static void main(String[] args) {
		ContaSimples simples = new ContaSimples();
		
		simples.setSaldoPoupanca(123);
		simples.setAgencia(12345);
		simples.setNumeroDaConta(99999);
		simples.setSaldo(100000);
		
		System.out.println(simples.depositoPoupanca(500));
		System.out.println(simples.saquePoupanca(100));
		System.out.println(simples.deposito(400));
		System.out.println(simples.saque(150));
		
		simples.banco.setCodigo(111);
		simples.banco.setNome("BB");
		simples.banco.setNumeroAgencias(5);
		simples.correntista.setNome("Vinicius");
		simples.correntista.setEndereco("Sebastião Tomaz de Souza");
		System.out.println(simples.toString());
		
		
		ContaEspecial especial = new ContaEspecial();
		
		especial.setDiasSemJuros(10);
		especial.setLimite(500);
		especial.setAgencia(1);
		especial.setNumeroDaConta(123213);
		especial.setSaldo(20000);
		
		System.out.println(especial.deposito(5000));
		System.out.println(especial.saque(700));
		
		especial.banco.setCodigo(2);
		especial.banco.setNome("NuBank");
		especial.banco.setNumeroAgencias(2);
		especial.correntista.setNome("Vinicius");
		especial.correntista.setEndereco("Sebastião Tomaz de Souza");
		especial.cartao.setLimite(1000);
		especial.cartao.setNumero(123567894);
		especial.cartao.setOperadora("MasterCard");
		especial.cartao.setTipoDeCartao("Débito");
		System.out.println(especial.toString());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
