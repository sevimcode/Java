package enums;

public class DBUtility{

    Connection connection;   // this is connection object if you test database you need to connect to database

                            // we create one method it will connect you when you need it you don't need to write again


    public void openConnection (DataBase db){

        switch (db){

            case USERS:
                // connection = connect;
                //code to connect to use user  database

            case SALES:
                // connection = connect;
                //code to connect to use sales database

            case MEDIA:
                //connection = connect;
                //code to connect to use media database
        }



    }



}
