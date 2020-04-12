package exceptionsexamples;

public class CityTestforDriver{

    public static void main( String[] args )  {
        Driver driver = new Driver ();

            try {
                driver.setName ("jamesbond" );
            } catch (Exception e) {
                e.printStackTrace ();
            }

        System.out.println (driver.getName ());

        try {
            driver.setLocation ( "bfhfhb" );
        } catch (InvalidLocationException e) {
            e.printStackTrace ();
        }finally{
            System.out.println (driver.getName ());
            System.out.println (driver.getLocation ());

        }


    }




}
