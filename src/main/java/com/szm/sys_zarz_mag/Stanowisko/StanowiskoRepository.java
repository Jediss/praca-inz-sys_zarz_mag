package com.szm.sys_zarz_mag.Stanowisko;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StanowiskoRepository extends JpaRepository<Stanowisko, Integer> {
}
