interface DeclareStuff{
    public static final int EASY = 3;
    void doStuff(int t);
}
 
class TestDeclare implements DeclareStuff{
    public static void main(String[] args) {
        int x = 5;
        new TestDeclare().doStuff(++x);
    }
 
    public void doStuff(int s) {
        s+=EASY+ ++s;
        System.out.println("s: "+s);
    }
}
