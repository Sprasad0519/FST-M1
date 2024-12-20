package helloo;


class CustomerException extends Exception
	{
		private String message = null;
		
		public CustomerException(String  message) {
			this.message= message;
		}
		@Override
		public String getMessage()
		{
			return message;
		}
	}

public class Activity8
{
	public static void main(String args[])
	{
		try
		
		{
			Activity8.exceptionTest("Will print to console");
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("Won't execute");
		}catch(CustomerException mae)
		{
			System.out.println("Inside catch block : " +mae.getMessage());
		}
	}
	static void exceptionTest(String str)throws CustomerException
	{
		if(str==null)
		{
			throw new CustomerException("String Value is null");
		}
		else
		{
			System.out.println(str);
		}
	}
	
	
}


		
		
		 
	

	
