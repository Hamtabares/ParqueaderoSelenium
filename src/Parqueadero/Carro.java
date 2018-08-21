package Parqueadero;
import java.util.Scanner;

public class Carro {

	private String strPlaca;
	private String strMarca;
	private String strModelo;
	private String strColor;
	
	public  void carro(String strPlaca, String strMarca, String strModelo, String strColor) {
		
		this.strPlaca=strPlaca;
		this.strMarca=strMarca;
		this.strModelo=strModelo;
		this.strColor=strColor;			
				
			
		//solicitar placa e imprimir
		System.out.println("Ingresar la Placa del Carro ");
		Scanner entrada = new Scanner(System.in);
		strPlaca = entrada.nextLine();
		
		//solicitar Marca e imprimir
		System.out.println("Ingresar Marca del Carro  ");
		Scanner entrada2 = new Scanner(System.in);
		strPlaca = entrada2.nextLine();
		
		//solicitar Modelo e imprimir
		System.out.println("Ingresar Modelo del Carro  ");
		Scanner entrada3 = new Scanner(System.in);
		strPlaca = entrada3.nextLine();
		
		//Ver el color e imprimir
		System.out.println("Ingresar Color del Carro  ");
		Scanner entrada4 = new Scanner(System.in);
		strPlaca = entrada4.nextLine();
	}
	
	public String getstrPlaca() {
		return this.strPlaca;
	}
}
	
