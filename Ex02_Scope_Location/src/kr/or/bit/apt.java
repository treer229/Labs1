package kr.or.bit;

public class apt {
	public String aptname;
	//int door; //default
	private int window; // private
	private int bathroom;
	//간접할당
	//직접할당을 막고 간접할당을 통한 데이터 보호
	public void write_window(int w) { //캡슐화된 자원에 대해서 쓰기기능
		if(w==0) {
			window = 100;
		} else {
			window = w;	
		}
	}
	public int read_window() { //캡슐화된 자원에 대해서 읽기 기능
		return window;
	}
	
}
