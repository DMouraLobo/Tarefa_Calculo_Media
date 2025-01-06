package calculos;
/**
 * @author Diego Moura Lobo
 */
public class App {

	public static void main(String[] args) {
		
		//Instanciamento da classe CalcularMedia
		CalcularMedia media = new CalcularMedia();
		
		//Atribuição de valores aos atributos do objeto
		media.setNota1(6);
		media.setNota2(10);
		media.setNota3(4);
		media.setNota4(2);
		
		//Impressão de resultado no console
		System.out.println(media.operacoesMedia());
	}

}
