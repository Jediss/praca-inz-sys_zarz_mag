package com.szm.sys_zarz_mag.Towar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TowarRepository extends JpaRepository<Towar, Long> {
}
