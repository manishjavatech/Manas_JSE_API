package jdk8.stream.stream_operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Partitioning is a special case of grouping.
 * Grouping data is based on the keys returned from a function.
 * Partitioning only takes care of two groups based on a predicate. 
 * The value evaluated to true is one group, false is another group.
 * 
 * partitioningBy() method, which collects data in a Map
 * whose keys are always of the type Boolean.
 * @author Manas
 *
 */

public class K_StreamOperation_Partitioning {
	public static void main(String[] args) {
		Map<Boolean, List<Transaction>> collect = populateTransactions()
												.stream()
												.collect(Collectors.partitioningBy(Transaction::isGrocery));
		System.out.println(collect);
		
		Map<Boolean, String> collect2 = populateTransactions()
									   .stream()
									   .collect(Collectors.partitioningBy(Transaction::isGrocery,Collectors.mapping(Transaction::getType, Collectors.joining(", "))));
		System.out.println(collect2);
		
		Map<Boolean, List<String>> collect3 = populateTransactions()
											.stream()
											.collect(Collectors.partitioningBy(Transaction::isGrocery,Collectors.mapping(Transaction::getType, Collectors.toList())));
		System.out.println(collect3);
	}

	
	public static List<Transaction> populateTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();

		transactions.add(new Transaction(1,"NON-GROCERY",100D));
		transactions.add(new Transaction(1,"GROCERY",80D));
		transactions.add(new Transaction(7,"GROCERY",120D));
		transactions.add(new Transaction(7,"NON-GROCERY",40D));
		transactions.add(new Transaction(10,"GROCERY",50D));
			
		return transactions;
	}
}
