import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    int len = input.length()-1;
		int temp = solution(input,0,len);
		int ans = temp;
		for(int i = temp+1 ; i < input.length() ; i++ ){
		    if(input.charAt(i) == '0'){
		        ans = i;   
		    }
		}
		
		System.out.println("ans :" + ans);
	}
	
	public static int solution(String str, int left , int right){
	    //System.out.println(str+" "+left+ " "+right );
	    int mid = (left + right) / 2;
	    if(str.charAt(mid) == '1'){
	       return solution(str,left,mid);
	    }
	    if(str.charAt(mid) == '0'){
	        return mid;
	    }
	    return solution(str,mid,right);
	}
}
