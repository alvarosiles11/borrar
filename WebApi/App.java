package WebApi;
import kernel.http.Rest;

public class App {
    public static void main(String[] args) throws Exception {

        Rest.addController(VueloApi.class);
        Rest.start();

    }
}
