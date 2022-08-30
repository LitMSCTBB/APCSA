package climbingclub;

public class ClimbingClubRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbingClub hikerClub = new ClimbingClub();
		hikerClub.addClimb("Monadnock", 274);
		hikerClub.addClimb("Whiteface", 301);
		hikerClub.addClimb("Algonquin", 225);
		hikerClub.addClimb("Monadnock", 344);
		int numNames = hikerClub.distinctPeakNames();
		System.out.println(numNames);
	}
}
