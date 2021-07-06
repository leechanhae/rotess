package pk18_1;

public class GenericPrinter<T extends Material> {

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
	
	public void print() { //메소드 안에 또다른 객체 메소드가 존재
		material.doPrinting();
	}
	
}
