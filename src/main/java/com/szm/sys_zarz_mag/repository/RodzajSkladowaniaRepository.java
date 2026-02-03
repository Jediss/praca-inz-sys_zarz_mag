package com.szm.sys_zarz_mag.repository;

import com.szm.sys_zarz_mag.model.RodzajSkladowania;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RodzajSkladowaniaRepository extends JpaRepository<RodzajSkladowania, Long> {

}