public class Buffet
{
    boolean empty;

    public synchronized boolean isEmpty()
    {
       return empty;
    }

    public synchronized void setEmpty(boolean b)
    {
       empty = b;
    }
}

