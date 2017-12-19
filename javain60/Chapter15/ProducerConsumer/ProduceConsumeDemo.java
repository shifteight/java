public class ProduceConsumeDemo
{
	public static void main(String [] args)
	{
		Buffet buffet = new Buffet();

		PizzaChef producer = new PizzaChef(buffet);
		LunchCrowd consumer = new LunchCrowd(buffet);

		producer.start();
		consumer.start();
	}
}