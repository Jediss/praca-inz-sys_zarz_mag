package com.szm.sys_zarz_mag.Security.services;

import com.szm.sys_zarz_mag.Pracownik.PracownikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szm.sys_zarz_mag.Pracownik.Pracownik;
import com.szm.sys_zarz_mag.Pracownik.PracownikRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    PracownikRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Pracownik user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return UserDetailsImpl.build(user);
    }

}
