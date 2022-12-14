package org.sid.dao;


import org.sid.entites.contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContactRepository extends JpaRepository<contact,Long>{
@Query("select c from contact c where c.nom like :x")
public Page<contact> cherche (@Param("x") String mc,Pageable pageable);
 //   @Query(" select c.contact from contact e where e.Id = :Id")
    //    Page<contact> findAllById(String Id, Pageable pageRequest);
}
