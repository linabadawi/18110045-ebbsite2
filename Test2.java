

	
	import java.util.Scanner;
	public class Test2 {

	    public static void main(String arg[]){
	        Scanner sc=new Scanner(System.in);
	        System.out.println("pyramid");
	        int n=sc.nextInt();
	        String numSp="                                                                             ";
	        String spaceAdd=numSp.substring(0,n-1);
	        StringBuilder space=new StringBuilder(spaceAdd);
	        StringBuilder star=new StringBuilder("* ");

	        for(int i=1;i<=n*2-1;i++){
	            if(i<n){
	                System.out.print(space);
	                space.delete(0,1);
	                System.out.println(star);
	                star.append("* ");
	            }
	            if(i==n){
	                System.out.println(star);
	            }
	             }
	        }
	    }

