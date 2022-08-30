package phrase;

public class Phrase
{
	private String currentPhrase;
	
    public Phrase( String p )
    {
    	currentPhrase = p;
    }
    
    public int findNthOccurence( String str, int n )
    {
    	return 0;
    }	
    	
    public void replaceNthOccurence( String str, int n, String repl )
    {
    	int ind = findNthOccurence(str, n);
    	if (ind != -1) currentPhrase = currentPhrase.substring(0, ind)+repl+currentPhrase.substring(ind+str.length());
    }
    
    public int findLastOccurence( String str )
    {
    	int n = 1; int ind = findNthOccurence(str, 1); int prev = -2;
    	while(ind != -1) {
    		n++;
    		prev = ind; ind = findNthOccurence(str, n);
    	}
    	if (n==1) return -1;
    	return prev;
    }       	
    	
    public String toString()
    {
    	return "" + currentPhrase;
    }    
}