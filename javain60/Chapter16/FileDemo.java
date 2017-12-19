import java.io.File;

public class FileDemo
{
	public static void main(String [] args)
	{
		File file = new File(args[0]);

		if(!file.exists())
		{
			System.out.println(args[0] + " does not exist.");
			return;
		}

		if(file.isFile() && file.canRead())
		{
			System.out.println(file.getName() + " can be read from.");
		}

		if(file.isDirectory())
		{
			System.out.println(file.getPath() + " is a directory containing...");
			String [] files = file.list();
			for(int i = 0; i < files.length; i++)
			{
				System.out.println(files[i]);
			}
		}
	}
}