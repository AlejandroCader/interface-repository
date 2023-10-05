package Poo_Interfaces.Repositorio;
import Poo_Interfaces.Modelo.Cliente;
import java.util.List;
public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
