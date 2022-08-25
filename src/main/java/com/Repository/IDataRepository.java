package com.Repository;

import com.model.IData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDataRepository extends JpaRepository<IData, Integer> {

    List<IData> findByAsignado(Integer asignado);

}
