package com.szm.sys_zarz_mag.Repository;

import com.szm.sys_zarz_mag.Entity.MiejsceSkladowania;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiejsceSkladowaniaRepository extends JpaRepository<MiejsceSkladowania, Long> {

}
