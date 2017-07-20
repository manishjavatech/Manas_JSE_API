package jdk8.stream.stream_operation;

import java.util.ArrayList;
import java.util.List;

public class N_StreamOperation_Match {
	public static void main(String[] args) {
		boolean allMatch = populateTransactions()
							.stream()
							.allMatch(Transaction::isGrocery);
		System.out.println(allMatch);
		
		boolean anyMatch = populateTransactions()
							.stream()
							.anyMatch(Transaction::isGrocery);
		System.out.println(anyMatch);
		
		 boolean noneMatch = populateTransactions()
				 			  .stream()
				 			  .noneMatch(Transaction::isGrocery);
		 System.out.println(noneMatch);
	}
	
	public static List<Transaction> populateTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(1,"NON-GROCERY",100D));
		transactions.add(new Transaction(11,"GROCERY",80D));
		transactions.add(new Transaction(6,"GROCERY",120D));
		transactions.add(new Transaction(7,"NON-GROCERY",40D));
		transactions.add(new Transaction(10,"GROCERY",50D));
		return transactions;
	}
}
