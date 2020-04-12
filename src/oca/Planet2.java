package oca;

public class Planet2{

    public String name;
    public int moons;

    public Planet2(String name, int moons){
        this.name = name;
        this.moons = moons;

    }

    public static void main( String[] args ) {
        Planet2 [] planets = { new Planet2 ( "mercury", 0 ),new Planet2 ( "venus", 0 ),new Planet2 ( "earth", 1 ),new Planet2 ( "mars", 2 )};
        System.out.println (planets);
        System.out.println (planets[2]);
        System.out.println (planets[2].moons);
    }
//    [Loca.Planet2;@3764951d
//    oca.Planet2@4b1210ee
//     1


}
