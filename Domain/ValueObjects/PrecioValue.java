package Domain.ValueObjects;

 
public record PrecioValue(double precio) {
    public static double Precio;

    public PrecioValue {
        if (precio < 0) {
            System.out.println("Price value cannot be negative");
            // throw new IllegalArgumentException("Price value cannot be negative");
        }
        Precio = precio;
    }
}
