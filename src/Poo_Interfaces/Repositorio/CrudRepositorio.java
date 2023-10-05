package Poo_Interfaces.Repositorio;
import Poo_Interfaces.Modelo.Cliente;
import java.util.List;

public interface CrudRepositorio {
    List<Cliente>listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
