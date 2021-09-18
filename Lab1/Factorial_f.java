package mirea.Lab1;

public class Factorial_f {
    private int f;
    public int getNumber(int f)
    {
        return f;
    }
    public void setNumber(int f)
    {
        this.f=f;
    }
    public int getFactorial()
    {
        int Factorial =1;
        for (int i =1; i<=this.f;i++)
        {
            Factorial = Factorial* i;
        }
        return Factorial;

    }
}
