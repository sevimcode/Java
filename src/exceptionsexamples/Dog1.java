package exceptionsexamples;



public class Dog1 {
    int age;

    public void setAge(int age) throws DogInvalidAgeException{
        if (age<0 || age >35){
            throw new DogInvalidAgeException ();}
        this.age = age;
    }




    public void bark() {

        if (this.age > 20)
            throw new DogNotBarkableException ();

        System.out.println ("dog is barking");
    }



    }








