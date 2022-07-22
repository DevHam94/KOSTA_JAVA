package kosta.video;

public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("1", "탑건", "톰크루즈");
		Video v2 = new Video("2", "경관의피", "조진웅");
		Video v3 = new Video("2", "쿵더펜더2", "지성민");
		
		GeneralMember m1 =
				new GeneralMember("aa", "홍길동", "가산동");
		
		//m1.setRentalVideo(v1);
		m1.rental(v1);
		m1.rental(v2);
		
		m1.show();
		
		/*
		Video v1 = new Video("1", "트랜스포머3", "서봉수");

		GeneralMember gm1 = new GeneralMember("aaa", "홍길동", "동탄");
		GeneralMember gm2 = new GeneralMember("bbb", "김철수", "서울");

		gm1.rentVideo(v1);
		gm1.printMember();
		gm2.printMember();
		*/
		
		SpecialMember s1 = new SpecialMember("bbb", "김철수", "서울", 10);
		
		s1.rental(v3);
		
		s1.show();
	}

}
