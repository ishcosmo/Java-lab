//5.Imagine you’re designing a restaurant management system where you have a base class called Chef with a method makeSpecialDish().
// This method simply prints a generic message indicating that the chef is making a special dish.
// Next, create three subclasses called ItalianChef, ChineseChef, and MexicanChef—each 
//overrides makeSpecialDish() with a distinct print statement, such as "Making pasta", "Making dumplings", or "Making tacos".
//In your main method, declare an array or list of Chef references, but assign each element to a different subclass (ItalianChef, ChineseChef, MexicanChef)
//. Use a loop to call the makeSpecialDish() method on each array element and observe how
// runtime polymorphism ensures that the correct subclass version of makeSpecialDish() is invoked.
class Chef{
    public void makeSpecialDish(){
        System.out.println("The chef is making a special dish");
    }
}
class ItalianChef extends Chef{
    @Override
    public void makeSpecialDish(){
        system.out.println("Making Pasta");
    }
}
class ChineseChef extends Chef{
    @Override
    public void makeSpecialDish(){
        system.out.println("Making Noodles");
    }
}
class MexicanChef extends Chef{
    @Override
    public void makeSpecialDish(){
        system.out.println("Making tacos");
    }
}
public class q5 {
    public static void main(String[] args) {
        Chef[] chefs = {new ItalianChef,new ChineseChef(),new MexicanChef()};
        for(int i=0 i<Chef.length,i++){
            i.makeSpecialDish();
        }
    }
}
