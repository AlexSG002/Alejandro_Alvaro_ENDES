package barcos;

import java.util.Arrays;
import java.util.Scanner;

public class Jugador {
	Scanner sc = new Scanner (System.in);

	private String Nombre;
	private int Edad;
	private String Nick;
	private Boleto Boleto;
	
	public Jugador() {
		this.Nombre="";
		this.Edad=0;
		this.Nick="";
		this.Boleto = new Boleto();
	}

	public Jugador(String nombre, int edad, String nick, Boleto boleto) {
		this.Nombre = nombre;
		this.Edad = edad;
		this.Nick = nick;
		this.Boleto = new Boleto();
	}
	
	public Jugador(String nombre, int edad, Boleto Boleto) {
		Scanner sc = new Scanner (System.in);
		this.Nombre =  sc.next();
		this.Edad = sc.nextInt();
		String Nom="";
		if(Nombre.length()>=3) {
			Nom=Nombre.substring(0, 2);
			this.Nick = "Jugador_"+Nom+Edad;
		}else
			this.Nick = "Jugador_"+Nombre+Edad;
		this.Boleto = new Boleto();
	}
	
	
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		nombre = sc.next();
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		edad = sc.nextInt();
	}

	public String getNick() {
		return Nick;
	}

	public void setNick(String nick) {
		String Nom="";
		if(Nombre.length()>=3) {
			Nom=Nombre.substring(0, 2);
			this.Nick = "Jugador_"+Nom+Edad;
		}else
			this.Nick = "Jugador_"+Nombre+Edad;
		this.Boleto = new Boleto();
	}


	public Boleto getBoleto() {
		return Boleto;
	}

	public void setBoleto(Boleto boleto) {
		Boleto = new Boleto();
	}

	@Override
	public String toString() {
		return "El jugador "+Nick+" tiene el boleto: "+this.Boleto;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boleto b1 = new Boleto();
		b1.rellenarBoleto();
		Boleto b2 = new Boleto();
		b2.rellenarBoleto();
		Jugador j = new Jugador("",0,b1);
		Jugador j2 = new Jugador("",0,b2);
		System.out.println(j);
		System.out.println(j2);
		
	}
}
