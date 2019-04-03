package com.seleni.Diary.presentation;

import com.seleni.Diary.logic.Entry;
import com.seleni.Diary.logic.EntryService;
import com.seleni.Diary.logic.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EntriesRestController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private EntryService entryService;

    @GetMapping("/entries")
    public List<Entry> getAllEntries() {
        /*  String token = jwtTokenProvider.resolveToken((HttpServletRequest) req);
        if (token != null && jwtTokenProvider.validateToken(token)) {
            Authentication auth = jwtTokenProvider.getAuthentication(token);
            SecurityContextHolder.getContext().setAuthentication(auth);
        }
        filterChain.doFilter(req, res);*/
       // tokenService.checkToken(token);

        return entryService.getAllEntries();

    }
}
