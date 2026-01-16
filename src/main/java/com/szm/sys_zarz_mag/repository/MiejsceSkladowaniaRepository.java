package com.szm.sys_zarz_mag.repository;

import com.szm.sys_zarz_mag.model.MiejsceSkladowania;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiejsceSkladowaniaRepository extends JpaRepository<MiejsceSkladowania, Long> {


}
