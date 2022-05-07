
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.Document;

import com.google.gson.Gson;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class testMongo {

    public static MongoClient mongo;
    public static MongoDatabase db;

    public static String DB_NAME = "dmsnur_vueloAlvaro";
    public static String DB_USER = "root";
    public static String DB_PASS = "rootpassword";
    public static String DB_HOST = "servisofts.com";
    public static int DB_PORT = 27017;

    public static void main(String[] args) {

        MongoClientURI uri = new MongoClientURI(
                "mongodb://" + DB_USER + ":" + DB_PASS + "@" + DB_HOST + ":" + DB_PORT + "/?authSource=admin");
        mongo = new MongoClient(uri);
        // db = mongo.getDatabase("dmsnur_vueloAlvaro");

        List dbs = mongo.getDatabaseNames();
        for (Object db : dbs) {
            System.out.println(" - " + db);
        }

        System.out.println("Prueba conexión MongoDB");
        // MongoClient mongo = crearConexion();

        if (mongo != null) {
            System.out.println("Lista de bases de datos: ");
            printDatabases(mongo);

            System.out.println("Lista de tablas de la base de datos: ");
            DB db = mongo.getDB("dmsnur_vueloAlvaro");

            Set tables = db.getCollectionNames();
            for (Object tableName : tables) {
                System.out.println(" - " + tableName);
            }

            DBCollection tableas = db.getCollection("Vuelo");

            System.out.println("Listar los registros de la tabla: ");
            DBCursor cur3 = tableas.find();

            while (cur3.hasNext()) {
                System.out.print("\t" + cur3.next().toString());
            }
            System.out.println();

          

        } else {
            System.out.println("Error: Conexión no establecida");
        }
    }

   

    private static void printDatabases(MongoClient mongo) {
        List dbs = mongo.getDatabaseNames();
        for (Object db : dbs) {
            System.out.println(" - " + db);
        }

    }
}