Can static method be overridden in Java, or can you override and overload static method in Java?
It is a common Java interview question, mostly asked to 2 years experienced Java programmers. Answer is, No, you can not override static method in Java, though you can declare method with same signature in sub class. It won't be overridden in exact sense, instead that is called method hiding. But at same time, you can overload static methods in Java, there is nothing wrong declaring static methods with same name, but different arguments. Some time interviewer also ask, Why you can not override static methods in Java? Answer of this question lies on time of resolution. As I said in difference between static and dynamic binding , static method are bonded during compile time using Type of reference variable, and not Object. If you have using IDE like Netbeans and Eclipse, and If you try to access static methods using an object, you will see warnings. As per Java coding convention, static methods should be accessed by class name rather than object. In short Static method can be overloaded, but can not be overridden in Java. If you declare,  another static method with same signature in derived class than static method of super class will be hidden, and any call to that static method in sub class will go to static method declared in that class itself. This is known as method hiding in Java.

Can Static Method be overridden in Java - See yourself
Can we overload and override static method in Java - WhyLet's see an example of trying to override a static method. In this Java Program, we have two classes Parent and Child, both have name() method which is static. Now, As per rules of method overriding, if a method is overridden than a call is resolved by type of object during runtime. Which means, in our test class StaticOverrideTest, p.name() in second example, should call Child class' name() method, because reference variable of type Parent is referring an object of Child, but instead it call name() method of Parent class itself. This happens, because static methods are resolved or bonded during compile time, and only information which is available, and used by compiler is type of reference variable. Since p was reference variable of Parent type, name() method from Parent class was called. Now, In order to prove that static method can be hidden, if we call Child.name() or c.name(), it will call name() method from Child class. This means static methods can not overridden in Java, they can only be hidden. This also answers, Why static method can not be overridden in Java, because they are resolved during compile time. By the way, this example doesn't show, whether you can overload static method or not, but you can. See this tutorial, for an example of overloading static method in Java. 

/**
 * Java Program to show that, you can not override static method in Java.
 * If you declare same method in subclass then, It's known as method hiding.
 *
 * @author Javin Paul
 */
public class StaticOverrideTest {
   
   
    public static void main(String args[]) {
       
        Parent p = new Parent();
        p.name();   // should call static method from super class (Parent)
                    // because type of reference variable
                    // p is Parent
       
        p = new Child();
        p.name();  // as per overriding rules this should call to child's static 
                   // overridden method. Since static method can not be overridden
                   // , it will call parent static method
                   // because Type of p is Parent.
       
        Child c = new Child();
        c.name();  // will call child static method because static method 
                   // get called by type of Class
       
    }
}

class Parent{
   
    /*
     * original static method in super class which will be hidden
     * in subclass.
     */
    public static void name(){
        System.out.println("static method from Parent");
    }
}

class Child extends Parent{
   
    /*
     * Static method with same signature as in super class,
     * Since static method can not be overridden, this is called
     * method hiding. Now, if you call Child.name(), this method
     * will be called, also any call to name() in this particular
     * class will go to this method, because super class method is hidden.
     */
    public static void name(){
        System.out.println("static method from Child");
    }
}

Output
static method from Parent
static method from Parent
static method from Child

That's all on this Java interview question guys. Remember, Static methods can not be overridden in Java, but they can be overloaded and hidden in Java. We have also touched based on What is method hiding in Java, and learned Why Static method can not be overridden in Java, since they are bonded during compile time by using type of Class, and not at runtime using Objects.


Read more: https://javarevisited.blogspot.com/2013/03/can-we-overload-and-override-static-method-java.html#ixzz6AQKIjUVq
