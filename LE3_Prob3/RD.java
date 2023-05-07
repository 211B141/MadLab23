class RD extends Duck implements Quackable
{
    public void quack()
    {
        System.out.println("RD can squeak");
        super.swim();
    }
}