package kr.or.bit;

public class apt {
	public String aptname;
	//int door; //default
	private int window; // private
	private int bathroom;
	//�����Ҵ�
	//�����Ҵ��� ���� �����Ҵ��� ���� ������ ��ȣ
	public void write_window(int w) { //ĸ��ȭ�� �ڿ��� ���ؼ� ������
		if(w==0) {
			window = 100;
		} else {
			window = w;	
		}
	}
	public int read_window() { //ĸ��ȭ�� �ڿ��� ���ؼ� �б� ���
		return window;
	}
	
}
