package jdk8.stream.stream_operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * We can convert the result of the collector to a different type by using 
 * collectingAndThen(Collector<T,A,R> downstream, Function<R,RR>  finisher) method of the Collectors class.
 *     downstream is a collector that collects the data. 
 *     finisher which converts the result.
 * @author manas
 *
 */

public class L_StreamOperation_Converter {
	public static void main(String[] args) {
		List<String> collect = populateTransactions()
								.stream()
						        .map(Transaction::getType)
						        .collect(Collectors.collectingAndThen(Collectors.toList(),
						             result ->  Collections.unmodifiableList(result)));
		System.out.println(collect);
	}
	
	public static List<Transaction> populateTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();

		transactions.add(new Transaction(1,"NON-GROCERY",100D));
		transactions.add(new Transaction(3,"GROCERY",80D));
		transactions.add(new Transaction(6,"GROCERY",120D));
		transactions.add(new Transaction(7,"NON-GROCERY",40D));
		transactions.add(new Transaction(10,"GROCERY",50D));
			
		return transactions;
	}
}
