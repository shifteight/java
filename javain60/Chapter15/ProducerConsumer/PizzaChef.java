public class PizzaChef extends Thread
{
	private Buffet buffet;

    public PizzaChef(Buffet b)
    {
 		buffet = b;
    }

    public void run()
   	{
  		int cookingTime = 0;
  	   	while(true)
       	{
			synchronized(buffet)
  		  	{
  		     	while(!buffet.isEmpty())
  				{
  			   		try
			   		{
	   					System.out.println("Chef is waiting...");
	  					buffet.wait();
   		   	   		}catch(InterruptedException e)
  			   		{}
  				}
       	  	}

	     	//bake some pizzas
	  		try
	  	   	{
				System.out.println("Chef is cooking...");
				cookingTime = (int) (Math.random()*3000);
				Thread.sleep(cookingTime);
	  		}catch(InterruptedException e)
	 		{}

			if(cookingTime < 1500)
			{
				buffet.setEmpty(true);
			}
			else
			{
				buffet.setEmpty(false);
		  		synchronized(buffet)
		  		{
					buffet.notify();
				}
			}
 		}
   	}
 }
