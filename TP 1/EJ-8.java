public class Mueble{
  float peso;
  float costo;
  float precio;
  String madera;
  String color;
  int stock;

  public Mueble(float peso, float costo, float precio, float beneficio, String madera, String color, int stock){
    this.peso = peso;
    this.costo = costo;
    this.precio = costo + beneficio; // beneficio = 35% para los productos iniciales
    this.madera = madera;
    this.color = color;
    this.stock = stock;
  }

  public void compra(){
    stock--;
  }
  
}

public class Muebleria{
  private Mueble sillas = new Mueble(...); // cambian variables dependiendo el producto
  private Mueble mesas  = new Mueble(...);
  private Mueble bancos = new Mueble(...);
  private caja;
  
  public void compra(String mueble, canti){
    if (mueble == "sillas")
  }
}
