package pattern.problems;

public class ThreeDiffSymbolPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19;
		for (int i=1; i<=n; i++) {
			if(i%3==1) {
				System.out.print("* ");
			}
			
			else if(i%3==2) {
				System.out.print("# ");
			}
			
			else {
				System.out.print("@ ");
			}
		}
	}

}
