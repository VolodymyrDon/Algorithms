package arrays;

public class HanoiTowers {
	final static String srcLable = "src";
	final static String tempLable = "temp";
	final static String destLable = "dest";

	private static String move(int n, String src, String dest, String temp) {
		// condition from recursion
		// n - 1 move from src to temp
		// log movement of nth element from src to dest
		// move n - 1 from temp to dest

		if (n == 0) {
			return null;
		}
		move(n - 1, src, temp, dest);
		System.out.println("Move disk " + n + " from tower " + src + " to tower " + dest);
		return move(n - 1, temp, dest, src);
	}

	public static void main(String[] args) {
		int n = 4;
		move(n, srcLable, destLable, tempLable);
	}
}
