package barcos;

import java.util.Scanner;

public class Juego {

	private Jugador J1;
	private Jugador J2;
	
	public Juego() {
		this.J1 =  new Jugador();
		this.J2 =  new Jugador();
	}

	public Juego(Jugador j1, Jugador j2) {
		
		this.J1 = new Jugador();
		this.J2 = new Jugador();
	}
	public static void main(String[] args) {
		Jugador m = new Jugador();
		Jugador i = new Jugador();
		Boleto b1 = new Boleto();
		Scanner sc = new Scanner (System.in);
		System.out.println("Indícame el Nombre del J1");
		m.setNombre(sc.next());
		System.out.println("Indícame la edad del J1");
		m.setEdad(sc.nextInt());
		System.out.println("Indícame el Nombre del J2");
		i.setNombre(sc.next());
		System.out.println("Indícame la edad del J2");
		i.setEdad(sc.nextInt());
		System.out.println("********************************************************");
		System.out.println("****************** COMIENZA EL JUEGO *******************");
		System.out.println("********************************************************");
		Juego j = new Juego(m,i);
		
		System.out.println(m);
		System.out.println(i);
		j.partida();
	}

	private void partida() {
		
		
	}
}
