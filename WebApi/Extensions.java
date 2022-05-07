package WebApi;

import SharedKernel.http.Rest;
import WebApi.Controllers.VueloController;

public class Extensions {
    public static void AddControllers() {
        Rest.addController(VueloController.class);
        Rest.start(80);
    }
}
