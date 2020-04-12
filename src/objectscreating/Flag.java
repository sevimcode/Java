package objectscreating;

public class Flag{

    String country;
    int size;
    String color;
    String material;    /// instance variables

    public void flap(){  //method does not return anything void

        System.out.println(" Flag is flapping");
    }

    public void info(){    // method prints every thing about the object

        System.out.println("Country :" +country);
        System.out.println("Size :" +size);
        System.out.println("Color :" +color);
        System.out.println("Material :" +material);

    }

      public void upgrade (int size, String material){  //upgrade method accept new values and change existing one

//       material = material ; // it does not make sense because java thinks all of them are local variables
//       material = material1;   we usually give same names of instance variables to nethods parameters
//       size = size1;

//        if you use upgrade (int size, String material)  you need to write "this.material=material;"

           this.size = size;
           this.material = material; //"this" means I am talking about the instance variable of material.

      }

}
