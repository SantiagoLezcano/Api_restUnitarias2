package Api_restUnitarias2.Api_restUnitarias.Model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="tienda")
public class Tienda {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Nit;

    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private int contacto;

    @OneToMany(mappedBy = "tienda",cascade = CascadeType.ALL)
    private Set<Producto> productos=new HashSet<>();

    public Tienda() {
    }


    public int getNit() {
        return Nit;
    }

    public void setNit(int nit) {
        Nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
        for(Producto producto: productos){
            producto.setTienda(this);//en el objeto actual que estamos
        }
    }

    public Tienda(int nit, String nombre, String direccion, int contacto) {
        Nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    public Tienda(int nit, String nombre, String direccion, int contacto, Set<Producto> productos) {
        Nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.productos = productos;
    }
}
