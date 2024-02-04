package com.example.myapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.example.myapp.Models.*;

@Repository
public interface CultureRepository extends JpaRepository<Culture, Integer> {
    Culture findById(int id_Culture);
}
