import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int t=in.nextInt();
//		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt();
			long[] a = new long[n];
			for(int i=0; i<n; ++i)
				a[i]=in.nextLong();
			long ans=Long.MAX_VALUE;
			for(int i=0; i<n; ++i)
				for(int j=i+1; j<n; ++j)
					ans=Math.min(ans, lcm(a[i], a[j]));
			out.println(ans);
		}
		long gcd(long a, long b) {
			if(b==0)
				return a;
			return gcd(b, a%b);
		}
		long lcm(long a, long b) {
			return (a*b)/gcd(a, b);
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
