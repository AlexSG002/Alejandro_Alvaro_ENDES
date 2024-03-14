package barcos;

import java.util.Arrays;

public class Boleto {
private char[] b = {};
private int longitud;

public Boleto() {
	this.longitud=6;
	this.b = new char[longitud];
}

public char[] getB() {
	return b;
}

public void setB(char[] b) {
	this.b = b;
}

public int getLongitud() {
	return longitud;
}

public void setLongitud(int longitud) {
	this.longitud = longitud;
}

@Override
public String toString() {
	return "Boleto:" + Arrays.toString(b);
}
public void rellenarBoleto() {
	int CantidadBs=2;
	for(int i=0; i<longitud; i++) {
		this.b[i]='A';
	}
	for(int i=1; i<=CantidadBs; i++) {
		this.b[(int)(Math.random()*6)]='B';
	}
	
}
public static void main(String[] args) {
	Boleto b = new Boleto();
	b.rellenarBoleto();
	System.out.println(b);
}
}
