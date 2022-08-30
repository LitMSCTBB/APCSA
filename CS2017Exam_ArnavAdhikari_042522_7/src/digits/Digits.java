package digits;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Digits
{
   private ArrayList<Integer> digitList;
   
   //part A
   public Digits( int num )
   {
	  digitList = new ArrayList<>();
      int cp = num; while (cp > 0) {
    	  digitList.add(cp%10); cp/=10;
      }
      Collections.reverse(digitList);
   }
   
	//part B
	public boolean isStrictlyIncreasing()
	{
		for (int i=0; i<digitList.size()-1; i++) {
			if (digitList.get(i) >= digitList.get(i+1)) return false;
		}
		return true;
	}  
      
   public String toString()
   {
		return "" + digitList;
   }
}