package Api_restUnitarias2.Api_restUnitarias.Model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tienda")
public class Store {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Nit;

    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private int contacto;

    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL)
    private Set<Product> products =new HashSet<>();

    public Store() {
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

    public Set<Product> getProductos() {
        return products;
    }

    public void setProductos(Set<Product> products) {
        this.products = products;
        for(Product product : products){
            product.setTienda(this);//en el objeto actual que estamos
        }
    }

    public Store(int nit, String nombre, String direccion, int contacto) {
        Nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    public Store(int nit, String nombre, String direccion, int contacto, Set<Product> products) {
        Nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.products = products;
    }
}
