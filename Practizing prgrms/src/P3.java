public class P3 {
public static void main(String[] args) {
	int num=34;
	int out = 0;
	System.out.println("input num:" +num);
	while(num!=0) {
		int last=num%10;
		out=out*10+last;
		System.out.println("Extracted num:" +out);
		num=num/10;
	}
	System.out.println("reverse num:" +out);
	if(out==num) {
		System.out.println("It is palindrome");
	}else {
		System.out.println("It is not a palindrome");
	}
}
}
