
package com.Practica01.service;

import com.Practica01.domain.estado;
import java.util.List;

public interface EstadoService {

    public List<estado> getEstados();

    public estado getEstado(estado estado);

    public void save(estado estado); // Para insertar o midificar(si viene el idestado o no)

    public void delete(estado estado);
}
