package aula04.composicao;

public class Main {

	public static void main(String[] args) {

		HomeTheater h = new HomeTheater();
		
		h.som.setConsumo(20);
		h.som.setMarca("JBL");
		h.som.setModelo("Charge 4");
		h.som.setPotencia("144W");
		h.som.setTensao(220);
		
		h.video.setConsumo(100);
		h.video.setMarca("Duex");
		h.video.setModelo("DX166SD");
		h.video.setTensao(220);
		h.video.setResolução("1366 X 768");
		h.video.setTipo("Monitor");
		
		System.out.println(h.toString());
		System.out.println(h.video);
		System.out.println(h.som);
		
	}

}
