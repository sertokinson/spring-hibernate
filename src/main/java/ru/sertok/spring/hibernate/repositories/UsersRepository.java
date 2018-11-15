package ru.sertok.spring.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sertok.spring.hibernate.models.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User,Long> {
   List<User> findAllById(Long id);
}
