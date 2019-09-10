package aula04.composicao4;

public class MainComputador {

	public static void main(String[] args) {

		Computador computador = new Computador();
		computador.setMarca("Gigabyte");
		computador.setModelo("Gamer");
		computador.setTensao(220);
		computador.setConsumo(60);
		computador.mouse.setMarca("Fortrek");
		computador.mouse.setTipo("Gamer");
		computador.teclado.setMarca("hardline");
		computador.teclado.setTipo("Teclado Semi-Mecânico ");
		computador.monitor.setMarca("Duex");
		computador.monitor.setTipo("VGA");
		computador.monitor.setResolucao("1366 X 768");
		computador.gabinete.setModelo("Positivo");
		computador.gabinete.setTipo("Gamer");
		computador.gabinete.setBaias(2);
		computador.gabinete.placamae.setMarca("MSI");
		computador.gabinete.placamae.setModelo("MS - 7529");
		computador.gabinete.placamae.hd.setCapacidade(1000);
		computador.gabinete.placamae.hd.setMarca("WD");
		computador.gabinete.placamae.hd.setModelo("WD1000");
		computador.gabinete.placamae.hd.setRpm(7200);
		computador.gabinete.placamae.memoria.setCapacidade(8);
		computador.gabinete.placamae.memoria.setMarca("SG");
		computador.gabinete.placamae.memoria.setModelo("sg-88");
		computador.gabinete.placamae.memoria.setVelocidade(1333);
		computador.gabinete.placamae.processador.setMarca("Intel");
		computador.gabinete.placamae.processador.setModelo("i3");
		computador.gabinete.placamae.processador.setCache(12);
		computador.gabinete.placamae.processador.setClock(3);
		
		System.out.println(computador.toString());
		
		
	}

}
