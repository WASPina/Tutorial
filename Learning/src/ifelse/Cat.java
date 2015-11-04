package ifelse;

public class Cat
{
    public String name;
    public int age;
   
    public boolean fight(Cat anotherCat)
{   if (this.age>=anotherCat.age){
        System.out.println(this.name);
        return true;
    }
    else
    {
        System.out.println(anotherCat.name + " ww");
        return false;
    }
}
public static void main(String[] args)
{
    Cat cat1 = new Cat();
    cat1.name = "vasya";
    cat1.age = 2;
   
    Cat cat2 = new Cat();
    cat2.name = "murik";
    cat2.age = 5;
   
    cat1.fight(cat2);
}
}