class Bonus
{
    int bonus = 10000;
}

class Programmer extends Bonus
{
    int basicsal = 50000;
    int totsal;
    void salary()
    {
        totsal = basicsal + bonus;
        System.out.println(totsal);
    }
}

class InheritBonus
{
    public static void main(String[] args)
    {
        Programmer p = new Programmer();
        p.salary();
    }
}