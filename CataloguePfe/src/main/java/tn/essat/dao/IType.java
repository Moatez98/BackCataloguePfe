package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.Type;

@Repository
public interface IType extends JpaRepository<Type, Integer>{

}
