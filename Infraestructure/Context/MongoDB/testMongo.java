package Infraestructure.Context.MongoDB;

import java.util.List;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class testMongo {

    public static MongoClient mongo;
    // public static MongoDatabase db;

    public static String DB_NAME = "dmsnur_vuelo";
    public static String DB_USER = "root";
    public static String DB_PASS = "rootpassword";
    public static String DB_HOST = "servisofts.com";
    public static int DB_PORT = 27017;

    public static String DB_TABLA = "Vuelo";

    public static void main(String[] args) {
        MongoClientURI uri = new MongoClientURI(
                "mongodb://" + DB_USER + ":" + DB_PASS + "@" + DB_HOST + ":" + DB_PORT + "/?authSource=admin");
        mongo = new MongoClient(uri);
        verificarConeccion(mongo);
    }

    private static void verificarConeccion(MongoClient mongo) {
        if (mongo != null) {
            System.out.println("Conexión MongoDB exitosa");
            printDatabases(mongo);
            printTables(mongo);
            printTableData(mongo);
            System.out.println("Conexión MongoDB exitosa");

        } else {
            System.out.println("Error: Conexión no establecida");
        }
    }

    private static void printDatabases(MongoClient mongo) {
        List dbs = mongo.getDatabaseNames();
        System.out.println("");
        System.out.println("Base de datos");
        for (Object db : dbs) {
            System.out.println(" - " + db);
        }
        System.out.println("");
    }

    private static void printTables(MongoClient mongo) {
        DB db = mongo.getDB(DB_NAME);
        System.out.println("BD " + DB_NAME + " Tablas");
        Set tables = db.getCollectionNames();
        for (Object tableName : tables) {
            System.out.println(" - " + tableName);
        }
        System.out.println("");
    }

    private static void printTableData(MongoClient mongo) {
        DB db = mongo.getDB(DB_NAME);
        DBCollection tableas = db.getCollection(DB_TABLA);
        System.out.println("Tabla: " + DB_TABLA);
        DBCursor cur3 = tableas.find();

        for (DBObject obj : cur3) {
            System.out.println(" key: " + obj.get("key") +
                    "\n NroVuelo: " + obj.get("nroVuelo") +
                    "\n keyAeronave: " + obj.get("keyAeronave") +
                    "\n keyAeropuertoOrigen: " + obj.get("keyAeropuertoOrigen") +
                    "\n keyAeropuertoDestino: " + obj.get("keyAeropuertoDestino") +
                    "\n fecha salida: " + obj.get("fecha_salida") +
                    "\n fecha arribe: " + obj.get("fecha_arribe") +
                    "\n Tripulante: " + obj.get("listaTripulante"));
            System.out.println("");
        }
        System.out.println();
    }

}