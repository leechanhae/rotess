package pk14;

public interface Remote {

	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int vol);
}