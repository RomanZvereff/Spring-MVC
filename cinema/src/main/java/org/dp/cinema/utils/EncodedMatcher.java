package org.dp.cinema.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodedMatcher {

    public static boolean matches(String origin, String encoded) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(origin, encoded);
    }

}
