
public class CastingForFun {
	public static void main(String[] args) {
		char c = 65535;
		int i = (int) c;
		
		int i2 = 2147483647;
		long l = (long) i;
		
		long l2 = 9223372036854775807L;
		short s = (short) l2;
		
		int i3 = 2147483647;
		float f = (float) i3;
		
		long l3 = 4L;
		double d = (double) 4L;
		
		double d2 = 1.7976931348623157E308D;
		long l4 = (long) d2;
		
		float f2 = 3.4028235E38F;
		double d3 = (double) f2;
		
		//boolean b1 = true;
		//int i4 = (int) b1;
		
		int mowwmoww = 2147483647;
		mowwmoww++;
		System.out.println(mowwmoww);
		
		
		
	}

}
