class LD extends Duck implements Flyable, Quackable
{
    public void fly()
    {
        System.out.println("LD can Fly");
    }
    public void quack()
    {
        System.out.println("LD can quack");
        super.swim();
    }
}