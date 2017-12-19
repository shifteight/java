public class SimpleObject
{
	private String name;

	public SimpleObject(String n)
	{
		System.out.println("Instantiating " + n);
		name = n;
	}

	public void finalize()
	{
		System.out.println("*** " + name + " is getting garbage collected ***");
	}
}