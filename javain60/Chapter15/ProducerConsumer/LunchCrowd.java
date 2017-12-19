public class LunchCrowd extends Thread
{
	private Buffet buffet;

    public LunchCrowd(Buffet b)
    {
 		buffet = b;
    }

    public void run()
   	{
  		int eatingTime = 0;
  	   	while(true)
       	{
			synchronized(buffet)
  		  	{
  		     	while(buffet.isEmpty())
  				{
  			   		try
			   		{
	   					System.out.println("Lunch crowd is waiting...");
	  					buffet.wait();
   		   	   		}catch(InterruptedException e)
  			   		{}
  				}
       	  	}

	     	//eat some pizzas
	  		try
	  	   	{
				System.out.println("Lunch crowd is eating...");
				eatingTime = (int) (Math.random()*3000);
				Thread.sleep(eatingTime);
	  		}catch(InterruptedException e)
	 		{}

			if(eatingTime < 1500)
			{
				buffet.setEmpty(false);
			}
			else
			{
				buffet.setEmpty(true);
		  		synchronized(buffet)
		  		{
					buffet.notify();
				}
			}
 		}
   	}
 }
