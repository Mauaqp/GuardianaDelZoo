
public class Gorila extends Mamifero{
	public void lanzarCosas() {
		nivelEnergia -= 5;
		System.out.println("El gorila ha lanzado algo a la gente!!!");
	}
	public void comerBananas() {
		nivelEnergia += 10;
		System.out.println("El gorila ha comido una merienda y recuper� energia");
		mostrarEnergia();
	}
	public void trepar() {
		nivelEnergia -=10;
		System.out.println("El gorila est� trepando por todo lado");
		mostrarEnergia();
	}
	
}
