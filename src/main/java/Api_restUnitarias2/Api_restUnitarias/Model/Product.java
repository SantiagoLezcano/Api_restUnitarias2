package Api_restUnitarias2.Api_restUnitarias.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="producto")//DTO
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column
    private String nombre;

    @Column
    private int cantidad;

    @ManyToOne(fetch =FetchType.LAZY,optional = false)//Lazy solo trae cuando le indiquemos; Igger es lo contrario
    @JoinColumn(name="tienda_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)//
    private Store store;

    public Product() {
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Store getTienda() {
        return store;
    }

    public void setTienda(Store store) {
        this.store = store;
    }

    public Product(int codigo, String nombre, int cantidad, Store store) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.store = store;
    }

    public Product(int codigo, String nombre, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
}
