package kosta.video;

public class Video {
	//강사님 코드 
	private String sno;
	private String title;
	private String actor;
	
	public Video() {}

	public Video(String sno, String title, String actor) {
		super();
		this.sno = sno;
		this.title = title;
		this.actor = actor;
	}
	
	public void show() {
		System.out.println("회원이 대여한 비디오 번호: " + sno);
		System.out.println("회원이 대여한 비디오 제목: " + title);
		System.out.println("회원이 대여한 비디오 주인공: " + actor);
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
	/*
	private String no;
	private String title;
	private String actor;
	
	public Video() {}

	public Video(String no, String title, String actor) {
		super();
		this.no = no;
		this.title = title;
		this.actor = actor;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	*/
}
