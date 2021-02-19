package moduledao.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommonRepository<T> extends JpaRepository<T, Long> {
    @Override
    Optional<T> findById(Long aLong);
}
