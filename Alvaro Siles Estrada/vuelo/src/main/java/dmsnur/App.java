package dmsnur;

public class App {

    public static void ConfigureServices() {
        dmsnur.SharedKernel.Extensions.AddKernel();
        dmsnur.Infraestructure.Extensions.AddInfraestructure();
        dmsnur.WebApi.Extensions.AddControllers();
    }

    public static void main(String[] args) throws Exception {
        ConfigureServices();
    }
}