package com.szm.sys_zarz_mag.RefreshToken;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szm.sys_zarz_mag.repository.PracownikRepository;
import com.szm.sys_zarz_mag.model.Pracownik;

@Service
public class RefreshTokenService {

    @Value("${syszarz.app.jwtRefreshExpirationMs}")
    private Long refreshTokenDurationMs;

    @Autowired
    private RefreshTokenRepository refreshTokenRepository;

    @Autowired
    private PracownikRepository pracownikRepository;


    public Optional<RefreshToken> findByToken(String token) {
        return refreshTokenRepository.findByToken(token);
    }

    public RefreshToken createRefreshToken(Long pracownikId) {
        RefreshToken refreshToken = new RefreshToken();

        refreshToken.setPracownik(pracownikRepository.findById(pracownikId).get());
        refreshToken.setExpiryDate(Instant.now().plusMillis(refreshTokenDurationMs));
        refreshToken.setToken(UUID.randomUUID().toString());

        refreshToken = refreshTokenRepository.save(refreshToken);
        return refreshToken;
    }

    public RefreshToken verifyExpiration(RefreshToken token) {
        if (token.getExpiryDate().compareTo(Instant.now()) < 0) {
            refreshTokenRepository.delete(token);
            throw new RefreshTokenException(token.getToken(), "Token expired. Please make a new signin request");
        }
        return token;
    }

    @Transactional
    public int deleteByPracownik(Pracownik pracownik) {
        return refreshTokenRepository.deleteByPracownik(pracownik);
    }
}
