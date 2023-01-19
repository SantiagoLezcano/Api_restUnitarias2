package Api_restUnitarias2.Api_restUnitarias.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="producto")
public class Producto {

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
    private Tienda tienda;

    public Producto() {
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

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Producto(int codigo, String nombre, int cantidad, Tienda tienda) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tienda = tienda;
    }

    public Producto(int codigo, String nombre, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
}
