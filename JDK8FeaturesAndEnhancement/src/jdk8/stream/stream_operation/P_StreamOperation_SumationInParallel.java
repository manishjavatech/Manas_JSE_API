package jdk8.stream.stream_operation;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.LongStream;

public class P_StreamOperation_SumationInParallel {
	public static final Long LIMIT = 100_000_000L;
	public static void main(String[] args) {
		
		Long sum=0L;
		//long startTimeMillis = System.currentTimeMillis();
		for (int i = 0; i <= LIMIT; i++) {
			sum += i;
		}
		System.out.println("Sum in sequential By Accumulation: " + sum);
		/*long endTimeMillis = System.currentTimeMillis();
		Double turnAroundTime=(double) (endTimeMillis - startTimeMillis)/1000L;
		System.out.println(turnAroundTime);*/
		
		Long[] sum2= {0L};
		LongStream.rangeClosed(0,LIMIT)
				  .parallel()
				  .forEach(i -> sum2[0] += i);
		System.out.println("Sum in parallel By Accumulation: " + sum2[0]);
		
		AtomicLong atomicSum=new AtomicLong();
		LongStream.rangeClosed(0,LIMIT)
				  .parallel()
				  .forEach(n-> atomicSum.addAndGet(n));
		System.out.println("Sum in parallel By Accumulation with AtomicLong: " + atomicSum.get());
		
		long sum3 = LongStream.rangeClosed(0,LIMIT)
							  .parallel()
							  .reduce(0, (i, j)-> i + j);
		System.out.println("Sum in parallel By Reduction: " + sum3);
		
		long sum4 = LongStream.rangeClosed(0,LIMIT)
							  .parallel()
							  .sum();
		System.out.println("Sum in parallel By Reduction: " + sum4);
		
		
		
	}
}
