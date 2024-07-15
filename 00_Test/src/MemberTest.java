import java.util.Scanner;

//회원 기본 클래스 (Member)
class Member {
	private String name;
	private String contact;
	private String address;
	private Grade grade; // 등급 정보를 저장할 Grade 객체 변수 추가

	public Member(String name, String contact, String address) {
		this.name = name;
		this.contact = contact;
		this.address = address;
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("연락처: " + contact);
		System.out.println("주소: " + address);
		System.out.println("등급: " + grade.getGradeName()); // 등급 이름 출력
		System.out.println("할인율: " + grade.getDiscountRate() * 100 + "%"); // 할인율 출력
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public double getDiscountPrice(double price) {
		return price - (price * grade.getDiscountRate()); // 할인 적용 가격 계산
	}
}

//등급 클래스 (Grade)
abstract class Grade {
	protected double discountRate; // 할인율

	public abstract String getGradeName(); // 등급 이름 반환

	public double getDiscountRate() {
		return discountRate;
	}

	public abstract double calculateDiscount(double price); // 할인 적용 가격 계산 (추상 메서드)
}

//Green 등급 클래스 (GreenGrade)
class GreenGrade extends Grade {
	public GreenGrade() {
		super(0.01); // Green 등급 할인율 1%
	}

	@Override
	public String getGradeName() {
		return "Green";
	}

	@Override
	public double calculateDiscount(double price) {
		return price * discountRate; // Green 등급 할인 계산 방식
	}
}

//Gold 등급 클래스 (GoldGrade)
class GoldGrade extends Grade {
	public GoldGrade() {
		super(0.03); // Gold 등급 할인율 3%
	}

	@Override
	public String getGradeName() {
		return "Gold";
	}

	@Override
	public double calculateDiscount(double price) {
		return price * discountRate; // Gold 등급 할인 계산 방식
	}
}

//VIP 등급 클래스 (VIPGrade)
class VIPGrade extends Grade {
	public VIPGrade() {
		super(0.07); // VIP 등급 할인율 7%
	}

	@Override
	public String getGradeName() {
		return "VIP";
	}

	@Override
	public double calculateDiscount(double price) {
		return price * discountRate; // VIP 등급 할인 계산 방식
	}
}

//사용 예시
public class MemberTest {
	public static void main(String[] args) {
		// Green 회원 생성
		Member greenMember = new Member("김철수", "010-1234-5678", "서울시 강남구");
		greenMember.setGrade(new GreenGrade());

		// Gold 회원 생성
		Member goldMember = new Member("이영희", "010-9876-5432", "경기도 용인시");
		goldMember.setGrade(new GoldGrade());

		// VIP 회원 생성
		Member vipMember = new Member("박지영", "010-8765-4321", "인천시 연수구");
		vipMember.setGrade(new VIPGrade());

		// 각 회원 정보 출력 및 할인 적용 가격 확인
		greenMember.showInfo();
		System.out.println("Green 할인 적용 가격: " + greenMember.getDiscountPrice(10000));

		goldMember.showInfo();
		System.out.println("Gold 할인 적용 가격: " + goldMember.getDiscountPrice(10000));

		vipMember.showInfo();
		System.out.println("VIP 할인 적용 가격: " + vipMember.getDiscountPrice(10000));
	}
}
