package com.szm.sys_zarz_mag.Magazyn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazynRepository extends JpaRepository<Magazyn, Integer> {
}
