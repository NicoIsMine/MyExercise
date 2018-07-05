package SchoolIdolProject.YinNaiMuBan;

public class MusicStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		μs us = new μs();
		Guo guo = new Guo();
		guo.adv();
		guo.dis();
		guo.hobby();
		guo.familyMember();
		String s = us.findMember(AllMember.HuinaiGuo);
		System.out.println(s);
		us.findMemberbynum();
		us.findNumByName();
	}

}
