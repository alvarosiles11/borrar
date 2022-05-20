package WebApi;

import SharedKernel.http.Rest;
import WebApi.Controllers.TripulanteController;
import WebApi.Controllers.VueloController;

public class Extensions {
    public static void AddControllers() {
        Rest.addController(VueloController.class);
        Rest.addController(TripulanteController.class);
        Rest.start(80);
    }
}
