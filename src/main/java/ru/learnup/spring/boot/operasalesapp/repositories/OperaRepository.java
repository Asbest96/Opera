package ru.learnup.spring.boot.operasalesapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.learnup.spring.boot.operasalesapp.entity.Opera;

public interface OperaRepository extends JpaRepository <Opera, Long> {
}
