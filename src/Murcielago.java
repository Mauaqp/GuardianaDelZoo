
public class Murcielago extends Mamifero{
//	Tiene mas energ�a que su clase padre
	public Murcielago() {
		this.nivelEnergia = 300;
	}
	
	public void volar() {
		nivelEnergia -= 50;
		System.out.println("El murci�lago est� volando por todos lados");
		mostrarEnergia();
	}
	
	public void comerHumanos() {
		nivelEnergia += 25;
		System.out.println("El murci�lago se ha tragado a un peat�n!!");
		mostrarEnergia();
	}
	
	public void atacarCiudad() {
		nivelEnergia -= 100;
		System.out.println("El murci�lago est� atacando el pueblo");
		mostrarEnergia();
	}
	

}
