package ObjectiveOriented;

import ObjectiveOriented.StaticClass;

public class StaticFinalProg {

    public static void main(String args[])
    {
        StaticClass staticClass1 = new StaticClass();
        System.out.println(staticClass1.getCounter());

        StaticClass staticClass2 = new StaticClass();
        System.out.println(staticClass2.getCounter());

        StaticClass staticClass3 = new StaticClass();
        System.out.println(staticClass3.getCounter());

        // If the counter is NO static, each single instance created has it own counter variable
        // and consequentially the three staticClass instances has the counter equals 1
        // Constructor of the staticClass is counter++

        // If the staticClass.counter variable is STATIC, all the instances point to the same variables
        // besides three staticClass instances will have the counter incremented. (from 1 to 3) The constructor is counter++

        // Static method should be called by class.method and not by instance.method. It is not a mistake but it makes more sense.
        System.out.println(StaticClass.getCounter());
    }
}
