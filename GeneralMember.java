package kosta.video;

import java.util.ArrayList;
import java.util.List;

public class GeneralMember {
	//강사님 코드
	private String id;
	private String name;
	private String address;
	//private Video rentalVideo; //회원가입할때 비디오빌리진않는다. 위 세가지만 초기화가 되야한다. 
	//회원이 빌린 비디오
	private List<Video> rentalVideo;
	
	public GeneralMember(){}

	public void rental(Video video) {
		rentalVideo.add(video);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Video> getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(List<Video> rentalVideo) {
		this.rentalVideo = rentalVideo;
	}
	
	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		rentalVideo = new ArrayList<Video>();
	}

	public void show() {
		System.out.println("회원 아이디 : " + id);
		System.out.println("회원 이름 : " + name);
		System.out.println("회원 주소 : " + address);
		//rentalVideo.show();
		for(Video v : rentalVideo) {
			v.show();
		}
	}
	
	/*
	private String id; // 아이디
	private String name; // 이름
	private String address; // 주소
	private List<Video> videos; // 빌린비디오들
	
	// 기본생성자
	public GeneralMember() {
	}

	// 멤버등록 생성자
	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		videos = new ArrayList<Video>();
	}
	
	// 일반회원내역 출력
	public void printMember() {

		System.out.println("회원의 아이디 : " + id);
		System.out.println("회원의 이름 : " + name);
		System.out.println("회원의 주소 : " + address);
		for (Video video : videos) {
			if (video != null) {
				System.out.println("회원이 대여한 비디오 번호 : " + video.getNo());
				System.out.println("회원이 대여한 비디오 제목 : " + video.getTitle());
				System.out.println("회원이 대여한 비디오 주인공 : " + video.getActor());
			}
		}
		System.out.println();
	}

	

	// 비디오빌리기
	public void rentVideo(Video video) {
		videos.add(video);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	*/
}
