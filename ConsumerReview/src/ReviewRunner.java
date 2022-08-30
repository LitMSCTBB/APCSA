
public class ReviewRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Review.totalSentiment("SimpleReview.txt")); 
	    //The above line prints -3.1700000000000004
	    
	    System.out.println(Review.starRating("SimpleReview.txt")); 
	    //The above line prints 0
	    
	    System.out.println(Review.totalSentiment("26WestReview.txt")); 
	    //The above line prints 29.909999999999993
	    
	    System.out.println(Review.starRating("26WestReview.txt")); 
	    //The above line prints 3
	
		

	}

}
