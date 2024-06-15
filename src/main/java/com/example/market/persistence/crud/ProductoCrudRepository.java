package com.example.market.persistence.crud;

import com.example.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto>findByIdCategoria(int idCategoria);

    Optional<List<Producto>>findByCantidadStock(int cantidadStock, boolean estado);
}
