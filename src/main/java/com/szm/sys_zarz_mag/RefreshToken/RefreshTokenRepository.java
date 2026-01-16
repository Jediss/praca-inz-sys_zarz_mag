package com.szm.sys_zarz_mag.RefreshToken;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.szm.sys_zarz_mag.model.Pracownik;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long>{
    Optional<RefreshToken> findByToken(String token);

    @Modifying
    int deleteByPracownik(Pracownik pracownik);

    RefreshToken save(RefreshToken refreshToken);

    void delete(RefreshToken token);
}
