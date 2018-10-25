import java.util.Random;


public class GenerateOTP {

	public static char[] generateOtp(int length) {
		System.out.println("your OTP for this transaction is ");
		String numbers="0123456789";
		char[] otp = new char[length];
		Random r = new Random();
		for(int i=0;i<length;i++)
			otp[i]= numbers.charAt(r.nextInt(numbers.length()));
		return otp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] otp = generateOtp(4);
		System.out.println(otp);
	}

}
