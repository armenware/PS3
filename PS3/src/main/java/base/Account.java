package base;
import java.util.Date;

import java.io.*;
public class Account {
	/*
	 *  data fields 
	 */
		private int id = 0;
		private double balance = 0;
		private double annualInterestRate = 0;
		private Date dateCreated;
		private double monthlyInterestRate;

		public Account() {
		}

		public Account(int id, double balance) {
			this.id = id;
			this.balance = balance;
		}

		/*
		 *  accessors
		 */
		public int getID() {
			return this.id;
		}

		public double getBalance() {
			return this.balance;
		}

		public double getAnnualInterstRate() {
			return annualInterestRate;
		}

		/*
		 *  mutators
		 */
		public void setID(int id) {
			this.id = id;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public void setAnnualInterstRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}

		/*
		 *  accessor for dateCreated
		 */
		public Date getDateCreated() {
			return dateCreated;
		}
/*
 * accessor for monthly interest rate 
 */
		public double getMonthlyInterestRate() {
			monthlyInterestRate = annualInterestRate / 12;
			return monthlyInterestRate;
		}
/*
 * withdraw method with if to test InsufficientFundsException
 */
		public void withdraw(double withdraw_amount)throws InsufficientFundsException {
			if (withdraw_amount <= balance) {
				balance = balance - withdraw_amount;
			} else {
				double needs = withdraw_amount - balance;
				throw new InsufficientFundsException(needs);
			}
		}
/*
 * deposit method
 */
		public double deposit(double deposit_amount) {
			return balance = balance + deposit_amount;
		}
	}


