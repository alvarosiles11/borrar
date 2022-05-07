public class App {


    public static void ConfigureServices() {
        SharedKernel.Extensions.AddKernel();
        Infraestructure.Extensions.AddInfraestructure();
        WebApi.Extensions.AddControllers();
    }

    public static void main(String[] args) throws Exception {

        ConfigureServices();

        // IMediator.registerHandler(GetVueloByKeyHandler.class);
        // IMediator.registerHandler(CrearVueloHandler.class);
        // IMediator.registerHandler(GetTripulanteByKeyHandler.class);
        // IMediator.registerHandler(CrearTripulanteHandler.class);

        // IServiceCollection.AddSingleton(MemoryDatabase.class);

        // IServiceCollection.AddTransient(IVueloFactory.class, VueloFactory.class);
        // IServiceCollection.AddTransient(IVueloRepository.class, MemoryVueloRepository.class);
        // IServiceCollection.AddTransient(ITripulanteFactory.class, TripulanteFactory.class);
        // IServiceCollection.AddTransient(ITripulanteRepository.class, MemoryTripulanteRepository.class);

        // Rest.addController(VueloController.class);
        // Rest.addController(TripulanteController.class);
        // Rest.start();
        // Rest.start(82);

    }
}