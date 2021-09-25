package task02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Accout_Test
{
	
	@task02.before
	@Test
	
	public void Deposit_1() 
	{
		create_account obj = new create_account();
		obj.deposite(123, 1000);
		assertEquals(1000, obj.get_balance());
	}
	
	@Test
	
	public void Deposit_2()
	{
		create_account obj = new create_account();
		obj.deposite(123, 1000);
		assertEquals(1000, obj.get_balance());
	}
	
	@Test
	
	public void Withdraw_3()
	{
		create_account obj = new create_account();
		obj.deposite(123, 3000);
		obj.withdraw(2000);
		assertEquals(1000, obj.get_balance());
	}
	
	@Test
	
	public void Withdraw_4()
	{
		create_account obj = new create_account();
		obj.deposite(123, 3000);
		obj.withdraw(2000);
		assertNotEquals(1500, obj.get_balance());
	}

}