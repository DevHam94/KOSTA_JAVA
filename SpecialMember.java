package kosta.video;

public class SpecialMember extends GeneralMember {
	private int bonusPoint;
	
	public SpecialMember() {}

	public SpecialMember(String id, String name, String address, int bonusPoint) { //부모에게 전달을 하기위해 만든 생성자 
		super(id, name, address);
		this.bonusPoint = bonusPoint;
	}

	public void bonusPrint() {
		System.out.println("보너스 포인트 : " + bonusPoint);
	}

	@Override
	public void show() {
		super.show();
		System.out.println("회원의 보너스 포인터 적립: " + bonusPoint);
	}
	
	
	
}
