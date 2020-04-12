package encapsulation;

public class Chair{

    private int size;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel( String model ) {
        this.model = model;
    }



    public void setSize(int size){  //we can write a code in the method

       if (size>0)  // you can put code in setter method

        this.size = size;
    }

     public int getSize(){  // getter method return size to you

        if (this.model.equals("ikea")){  // you can put code in getter method
        return size;
     }else{
            System.out.println("it not ikea model");
            return 0;
        }
    }

   public void info(){

       System.out.println("chair model is:" + model);
       System.out.println("chair size is :" + size);



   }
}
