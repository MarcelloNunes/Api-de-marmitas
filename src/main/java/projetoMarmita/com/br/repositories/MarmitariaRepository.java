package projetoMarmita.com.br.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projetoMarmita.com.br.entities.Marmita;

@Repository
public interface MarmitariaRepository extends JpaRepository<Marmita, Integer>{}
