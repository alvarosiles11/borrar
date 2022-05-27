package dmsnur.WebApi;

import dmsnur.SharedKernel.http.Rest;
import dmsnur.WebApi.Controllers.TripulanteController;
import dmsnur.WebApi.Controllers.VueloController;

public class Extensions {
    public static void AddControllers() {
        Rest.addController(VueloController.class);
        Rest.addController(TripulanteController.class);
        Rest.start(80);
    }
}
