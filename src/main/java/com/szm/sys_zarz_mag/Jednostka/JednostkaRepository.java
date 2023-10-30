package com.szm.sys_zarz_mag.Jednostka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JednostkaRepository extends JpaRepository<Jednostka, Integer> {
}
