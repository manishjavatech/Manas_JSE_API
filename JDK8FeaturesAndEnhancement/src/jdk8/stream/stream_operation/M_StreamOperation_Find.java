package jdk8.stream.stream_operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class M_StreamOperation_Find {
	public static void main(String[] args) {
		Optional<Transaction> find = populateTransactions()
										.stream()
										//.parallelStream()
										.filter(Transaction::isGrocery)
										.findAny();
		System.out.println(find.get());
		
		find = populateTransactions()
				.stream()
				.filter(Transaction::isGrocery)
				.findFirst();
		System.out.println(find.get());
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
