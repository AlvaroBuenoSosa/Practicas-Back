package com.tiendazapatos.abs;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ZapatosRepository extends JpaRepository<Zapatos, Integer>{

}
