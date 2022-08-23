package com.Repository;

import com.model.CausalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface CausalesRepository extends JpaRepository<CausalesEntity, CriteriaBuilder.In> {
}
