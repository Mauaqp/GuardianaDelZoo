
public class Murcielago extends Mamifero{
//	Tiene mas energía que su clase padre
	public Murcielago() {
		this.nivelEnergia = 300;
	}
	
	public void volar() {
		nivelEnergia -= 50;
		System.out.println("El murciélago está volando por todos lados");
		mostrarEnergia();
	}
	
	public void comerHumanos() {
		nivelEnergia += 25;
		System.out.println("El murciélago se ha tragado a un peatón!!");
		mostrarEnergia();
	}
	
	public void atacarCiudad() {
		nivelEnergia -= 100;
		System.out.println("El murciélago está atacando el pueblo");
		mostrarEnergia();
	}
	

}
