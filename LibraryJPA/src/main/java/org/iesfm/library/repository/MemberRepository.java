package org.iesfm.library.repository;

import org.iesfm.library.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    boolean existsByName(String name);

    List<Member> findByName(String name);

    void deleteByNameAndSurname(String name, String surname);
}