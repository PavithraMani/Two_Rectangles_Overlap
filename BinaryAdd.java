import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinaryAdd {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] a=line.split(" ");
		//int number1 = Integer.parseInt(a[0]);
		//int number2 = Integer.parseInt(a[1]);
		//System.out.println(number1);
		int la = a[0].length();
		int lb = a[1].length();

		int max = Math.max(la, lb);

		StringBuilder sum = new StringBuilder("");
		int carry = 0;

		for(int i = 0; i < max; i++){
			int m = getBit(a[0], la - i - 1);
			int n = getBit(a[1], lb - i - 1);
			int add = m + n + carry;
			sum.append(add % 2);
			carry = add / 2;
		}
		if(carry == 1)
			sum.append("1");
		System.out.println(sum.reverse().toString());
		br.close();
	}

	public static int getBit(String s, int index){
		if(index < 0 || index >= s.length())
			return 0;

		if(s.charAt(index) == '0')
			return 0;
		else
			return 1;

	}
}