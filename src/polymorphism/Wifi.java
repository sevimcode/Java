package polymorphism;

public interface Wifi{

    public abstract void searchWifi();   //public abstract method in interface


    public static void m(){    // static method in interface

        System.out.println("static method");
    }

     public default void d(){  //regular method in interface -


    }


}
