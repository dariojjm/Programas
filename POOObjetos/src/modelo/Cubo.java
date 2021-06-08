package modelo;

public class Cubo extends Cuadrado {
	private float lado;

public Cubo(float lado) {
		super(lado);
		this.lado=lado;
	}
// se sobre escriben los metodos heredados 
@Override
public float calcularArea() {
	// TODO Auto-generated method stub
	return (lado*lado)*6;
}

@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return 12*lado;
	}

@Override
public void setLado(int lado) {
	this.lado=lado;
	super.setLado(lado);
}
public float calcularVolumen() {
	return lado*lado*lado ;
	
}
public float calcularAreaSuperficie() {
	// TODO Auto-generated method stub
	return (lado*lado)*6;
}
}
