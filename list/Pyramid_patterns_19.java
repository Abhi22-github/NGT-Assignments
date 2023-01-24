package list;

public class Pyramid_patterns_19 {
	  public static void main(String[] args) {
		    int rows = 5, k = 1;

		    for (int i = 1; i <= rows; ++i, k += 2) {
		      for (int space = 1; space <= rows - i; ++space) {
		        System.out.print("   ");
		      }

		      for(int j=1;j<=k;j++) {
		    	  System.out.print("*  ");
		      }

		      System.out.println();
		    }
		  }
}
