package Context.MongoDB;

import org.junit.Test;
import org.mockito.Mockito;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class WriteDbContextTest {

    @Test
    public void CheckConstructor() {

        MongoClient client = Mockito.mock(MongoClient.class);
        MongoDatabase db = Mockito.mock(MongoDatabase.class);

        String DB_NAME = "dmsnur_vuelo";
        String DB_USER = "root";
        String DB_PASS = "rootpassword";
        String DB_HOST = "servisofts.com";
        int DB_PORT = 27017;

        WriteDbContext context0 = Mockito.mock(WriteDbContext.class);
        // WriteDbContext context2 = new WriteDbContext();

    }

    // private MongoClient client;
    // private MongoDatabase db;

    // private final String DB_NAME = "dmsnur_vuelo";
    // private final String DB_USER = "root";
    // private final String DB_PASS = "rootpassword";
    // private final String DB_HOST = "servisofts.com";
    // private final int DB_PORT = 27017;

    // public WriteDbContext() {
    // super(WriteDbContext.class);
    // }

    // @Override
    // public void onModelCreating(List<DbSet> sets) {
    // Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
    // mongoLogger.setLevel(Level.SEVERE);
    // MongoClientURI uri = new MongoClientURI(
    // "mongodb://" + DB_USER + ":" + DB_PASS + "@" + DB_HOST + ":" + DB_PORT +
    // "/?authSource=admin");
    // this.client = new MongoClient(uri);
    // this.db = client.getDatabase(DB_NAME);
    // sets.iterator().forEachRemaining(obj -> {
    // this.db.getCollection(obj.getName());

    // });
    // }

    // @Override
    // public boolean isConnected() {
    // return this.db != null;
    // }

    // @Override
    // public void Commit() {
    // System.out.println("WriteDbContext::Commit Not implemented");
    // }

    // @Override
    // public void Transaction() {
    // System.out.println("WriteDbContext::Transaction Not implemented");
    // }

    // @Override
    // public void Rollback() {
    // System.out.println("WriteDbContext::Rollback Not implemented");
    // }

    // @Override
    // public void Add(Object obj, DbSet dbSet) {
    // this.db.getCollection(dbSet.getName())
    // .insertOne(Document.parse(JSON.getInstance().toJson(obj, obj.getClass())));
    // }

    // @Override
    // public void Update(Object obj_to_edit, BooleanFunction fun, DbSet dbSet) {
    // this.db.getCollection(dbSet.getName()).find().iterator().forEachRemaining(action
    // -> {
    // Object obj = parseObject(dbSet, (Document) action);
    // if (fun.run(obj)) {
    // Document doc = Document.parse(JSON.getInstance().toJson(obj_to_edit,
    // obj_to_edit.getClass()));
    // doc.entrySet().iterator().forEachRemaining(k -> {
    // if (!k.getKey().equals("_id")) {
    // action.replace(k.getKey(), doc.get(k.getKey()));
    // }
    // });
    // this.db.getCollection(dbSet.getName()).replaceOne(Filters.eq("_id",
    // action.get("_id")), action);
    // }
    // });
    // }

    // @Override
    // public void Delete(BooleanFunction fun, DbSet dbSet) {
    // this.db.getCollection(dbSet.getName()).find().iterator().forEachRemaining(action
    // -> {
    // Object obj = parseObject(dbSet, (Document) action);
    // if (fun.run(obj)) {
    // this.db.getCollection(dbSet.getName()).deleteOne(action);
    // }
    // });
    // }

    // @Override
    // public Object Single(BooleanFunction fun, DbSet dbSet) {
    // ArrayList<Object> list = new ArrayList<>();
    // this.db.getCollection(dbSet.getName()).find().iterator().forEachRemaining(action
    // -> {
    // Object obj = parseObject(dbSet, (Document) action);
    // if (fun.run(obj)) {
    // list.add(obj);
    // }
    // });
    // if (list.size() > 0) {
    // return list.get(0);
    // }
    // return null;
    // }

    // @Override
    // public List All(DbSet dbSet) {
    // ArrayList<Object> list = new ArrayList<>();
    // this.db.getCollection(dbSet.getName()).find().iterator().forEachRemaining(action
    // -> {
    // list.add(parseObject(dbSet, (Document) action));
    // });
    // return list;
    // }

    // @Override
    // public List Filter(BooleanFunction fun, DbSet dbSet) {
    // ArrayList<Object> list = new ArrayList<>();
    // this.db.getCollection(dbSet.getName()).find().iterator().forEachRemaining(action
    // -> {
    // Object obj = parseObject(dbSet, (Document) action);
    // if (fun.run(obj)) {
    // list.add(obj);
    // }
    // });
    // return list;
    // }

    // public Object parseObject(DbSet dbSet, Document doc) {
    // return JSON.getInstance().fromJson(doc.toJson(), dbSet.get_type());
    // }

}
