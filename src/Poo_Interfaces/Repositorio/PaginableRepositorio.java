package Poo_Interfaces.Repositorio;
import Poo_Interfaces.Modelo.Cliente;

import java.util.List;
public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
