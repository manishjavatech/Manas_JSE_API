package jdk8.stream.stream_operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The groupingBy() method from the Collectors class returns a collector that groups the data
 * before collecting them in a Map. It is similar to a "group by" clause in SQL.
 * @author Manas
 *
 */

public class J_StreamOperation_Grouping {
	public static void main(String[] args) {
		Map<Integer, List<Transaction>> transactionMapGroupByID = populateTransactions()
				   .stream()
				   .collect(Collectors.groupingBy(Transaction::getId));
		System.out.println(transactionMapGroupByID);
		
		Map<Integer, String> transactionTypeMapGroupByID = populateTransactions()
				   .stream()
				   .collect(Collectors.groupingBy(Transaction::getId,
						   						  Collectors.mapping(Transaction::getType,
						   								  			 Collectors.joining(", "))));
		System.out.println(transactionTypeMapGroupByID);
		
		Map<Integer, List<String>> transactionTypeMapGroupByID1 = populateTransactions()
				   .stream()
				   .collect(Collectors.groupingBy(Transaction::getId,
						   						  Collectors.mapping(Transaction::getType,
						   								  			 Collectors.toList())));
		System.out.println(transactionTypeMapGroupByID1);
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
