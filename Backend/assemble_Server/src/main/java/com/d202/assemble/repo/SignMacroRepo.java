package com.d202.assemble.repo;

import com.d202.assemble.dto.SignMacro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SignMacroRepo extends JpaRepository<SignMacro, Long> {

    List<SignMacro> findBySeqAndCategorySeq(Long seq, Long categorySeq);
}
