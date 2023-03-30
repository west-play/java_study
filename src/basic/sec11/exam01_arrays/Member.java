package basic.sec11.exam01_arrays;

public class Member implements Comparable<Member> {
	String name;
	Member(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);		//정렬을 만드는 기준을 세워주는 코드
	}
}
