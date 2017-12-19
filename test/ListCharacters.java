class ListCharacters
{
	
	public static void main(String[] args) 
	{
		for(int i = 0; i < 128; i++)
		{
			if(Character.isLowerCase((char)i))
				System.out.println("value: " + i +
					" character: " + (char)i);
		}
	}
}
