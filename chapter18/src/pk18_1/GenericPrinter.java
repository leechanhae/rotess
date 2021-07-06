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
	
	public void print() { //�޼ҵ� �ȿ� �Ǵٸ� ��ü �޼ҵ尡 ����
		material.doPrinting();
	}
	
}
