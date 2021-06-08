package modelo;

public class Cuadrado  {
	private float lado;
	public Cuadrado(float lado) {
		this.lado=lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public float calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}

}
