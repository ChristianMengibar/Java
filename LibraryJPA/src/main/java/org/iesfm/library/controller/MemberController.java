package org.iesfm.library.controller;

import org.iesfm.library.Member;
import org.iesfm.library.repository.MemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;

@RestController
public class MemberController {

    private MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "members")
    public Iterable<Member> list(@RequestParam(value = "name") String name) {
        if (memberRepository.existsByName(name)) {
            return memberRepository.findByName(name);
        } else if (name == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El campo de nombre está vacío.");
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró ningún miembro con ese nombre.");
        }
    }

    @Transactional
    @RequestMapping(method = RequestMethod.DELETE, path = "/members")
    public void deleteMember(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname){
        memberRepository.deleteByNameAndSurname(name,surname);
    }
}