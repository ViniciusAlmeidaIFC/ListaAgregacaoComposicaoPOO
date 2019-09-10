package aula04.composicao2;

public class MainCarro {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setModelo("Saveiro");
		carro.setFabricante("VW");
		carro.setAno(2018);
		carro.setCor("Branco");
		
		carro.dono.setEndereco("Rua Sebatião Tomaz de Souza");
		carro.dono.setNome("Vinicius");
		carro.motor.setMarca("VW");
		carro.motor.setCilindros(98);
		carro.motor.setCombustivel("Gasolina");
		carro.motor.setPotencia(200);
		
		System.out.println(carro.toString());
	}
}
