package com.szm.sys_zarz_mag.Repository;

import com.szm.sys_zarz_mag.Entity.Towar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TowarRepository extends JpaRepository<Towar, Long> {

}
