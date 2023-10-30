package com.szm.sys_zarz_mag.Stawka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StawkaRepository extends JpaRepository<Stawka, Integer> {
}
