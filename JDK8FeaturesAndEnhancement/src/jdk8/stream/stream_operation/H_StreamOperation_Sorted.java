package jdk8.stream.stream_operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class H_StreamOperation_Sorted {
	public static void main(String[] args) {
		// In Java SE 7
		List<Transaction> transactions = populateTransactions();
		List<Transaction> groceryTransactions = getGroceryTransactions(transactions);
		Collections.sort(groceryTransactions, getTransactionComparator());
		List<Integer> transactionIDList = getGroceryTransactionsIDList(groceryTransactions);
		System.out.println(transactionIDList);

		//  In Java SE 8
		transactionIDList = 
			    transactions.stream()
			                .filter(t -> "GROCERY".equals(t.getType()))
			                .sorted(comparing(Transaction::getValue).reversed())
			                .map(Transaction::getId)
			                .collect(toList());
		System.out.println(transactionIDList);
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

	public static List<Integer> getGroceryTransactionsIDList(List<Transaction> groceryTransactions) {
		List<Integer> transactionIds = new ArrayList<>();
		for (Transaction t : groceryTransactions) {
			transactionIds.add(t.getId());
		}
		return transactionIds;
	}

	public static Comparator<Transaction> getTransactionComparator() {
		return new Comparator<Transaction>() {
			public int compare(Transaction t1, Transaction t2) {
				return t2.getValue().compareTo(t1.getValue());
			}
		};
	}

	public static List<Transaction> getGroceryTransactions(List<Transaction> transactions) {
		List<Transaction> groceryTransactions = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if ("GROCERY".equals(transaction.getType())) {
				groceryTransactions.add(transaction);
			}
		}
		return groceryTransactions;
	}

}
