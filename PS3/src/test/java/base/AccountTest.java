package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	public static Account testing;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InsufficientFundsException {
		testing = new Account(1122, 20000);
		testing.setAnnualInterstRate(4.5);
		testing.withdraw(2500.00);
		testing.deposit(3000.00);
		System.out.println("Balance: " + testing.getBalance());
		System.out.println("Monthly Interest: " + testing.getMonthlyInterestRate() + "%");
		System.out.println("Account date: " + testing.getDateCreated());
		assertEquals(1122, testing.getID());
		assertEquals(20500.00, testing.getBalance(), .2);
		assertEquals(4.5, testing.getAnnualInterstRate(), .3);
	}

	@Test
	public final void testWithdraw() throws InsufficientFundsException {
		testing = new Account(1122, 20000);
		testing.deposit(3000.00);
		testing.withdraw(4000.00);
	}

}
