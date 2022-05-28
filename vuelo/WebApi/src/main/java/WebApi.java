
import fourteam.http.Rest;
import Controllers.VueloController;
import Controllers.TripulanteController;

public class WebApi {
    public static void AddControllers() {

        Rest.addController(VueloController.class);
        Rest.addController(TripulanteController.class);
        Rest.start(80);
    }
}
