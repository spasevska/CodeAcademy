package dayTwo.daySix;

import java.util.HashMap;
import java.util.Map;

public class Fibonachy {
	
	static Map<Long, Long> memory = new HashMap<>();
	static {
		memory.put(0L, 0L);
		memory.put(1L, 1L);	
	}

	public static void main(String[] args) {
		
		
		
		long start = System.currentTimeMillis();
//		System.out.println(fibonachy(-2));
//		System.out.println(fibonachy(0));
//		System.out.println(fibonachy(1));
//		System.out.println(fibonachy(6));
		System.out.println(Long.MIN_VALUE);
		System.out.println(fibonachy(5000));
		System.out.println(Long.MAX_VALUE);
		long end = System.currentTimeMillis();
		System.out.println("elapsed time: " + (end - start));
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Byte.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);
//		byte b = Byte.MAX_VALUE;
//		System.out.println(b);
//		b++;
//		System.out.println(b);
//		b--;
//		System.out.println(b);
//		System.out.println();
		System.out.println(Integer.toBinaryString(6));
		
	}
	
	
//	public static int fibonachy(int index) {
//		if (index < 0) {
//			return -1;
//		} else if (index == 0) {
//			return 0;
//		} else if (index == 1) {
//			return 1;
//		} else {
//			return fibonachy(index - 1) + fibonachy(index - 2);
//		}
//	}
	
	public static long fibonachy(long index) {
		if (index < 0) {
			return -1;
		} else {
			if (memory.get(index) != null) {
				return memory.get(index);
			}
			long result = fibonachy(index - 1) + fibonachy(index - 2);
			memory.put(index, result);
			return result;
		}
	}

}
