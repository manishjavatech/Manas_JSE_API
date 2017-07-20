package jdk8.stream.stream_operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The java.util package contains three classes to collect statistics:
 * 	DoubleSummaryStatistics
 * 	LongSummaryStatistics
 * 	IntSummaryStatistics
 * @author manas
 *
 */

public class G_StreamOperation_Statistics {
 public static void main(String[] args) {
	 IntSummaryStatistics numbersSummary =  Arrays.asList(1, 2, 3, 4, 5)
										   .stream()
										   .filter(n -> n % 2 == 0)
										   .map(n -> n * 2)
										   //.collect(IntSummaryStatistics::new, IntSummaryStatistics::accept, IntSummaryStatistics::combine);
										   .collect(Collectors.summarizingInt(n -> n));
	 System.out.println(numbersSummary);
	 
	 //System.err.println(numbersSummary.getCount());
	 //System.out.println(numbersSummary.getMax());
	 //System.out.println(numbersSummary.getMin());
	 //System.out.println(numbersSummary.getSum());
	 //System.out.println(numbersSummary.getAverage());
}
}
