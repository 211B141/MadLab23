class RHD extends Duck implements Flyable, Quackable
{
    public void fly()
    {
        System.out.println("RHD can Fly");
    }
    public void quack()
    {
        System.out.println("RHD can quack");
        super.swim();
    }
}