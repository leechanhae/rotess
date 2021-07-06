package pk16;

public class InStack {

	private int max; // ���� �뷮
	private int ptr; // ���� ������
	private int[] stx; // ���� ��ü

	// ���� �� ���� : ������ ��� ����
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// ���� �� ���� : ������ ���� ��
	public class OverflowStackException extends RuntimeException {
		public OverflowStackException() {
		}
	}

	// ������
	public InStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stx = new int[max]; // ���� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // �����Ҽ� ���� �����߻�
			max = 0; // ó����
		}

	}

	// ���ÿ� x�� Ǫ��
	public int push(int x) throws OverflowStackException {
		if (ptr >= max)
			throw new OverflowStackException();
		return stx[ptr++] = x;
	}

	// ���ÿ��� �����͸� ��(���� �ִ� �����͸� ����)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stx[--ptr];
	}

	// ���ÿ��� �����͸� ��ũ(���� �ִ� �����͸� �鿩�ٺ� == ����͸�)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stx[ptr - 1];
	}

	// ���ÿ��� x�� ã�� ���ؽ�(������ -1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) // ���� �ʿ��� �����˻�
			if (stx[i] == x)
				return i; // �˻� ����
		return -1; // �˻� ����
	}

	// ������ ���
	public void clear() {
		ptr = 0;
	}

	// ������ �뷮 Ȯ��
	public int capacity() {
		return max;
	}
	
	//���ÿ� �׿� �ִ� ������ ��
	public int size() {
		return ptr;
	}
	
	//������ ��� �ִ°�?
	public boolean isEmpty() {
		return ptr<=0; //if(ptr<=0)
	}
	
	//������ ���� á�°�?
	public boolean isFull() {
		return ptr>=max;
	}
}
