package peaksoft.ozonproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.ozonproject.model.YandexProducts;

@Repository
public interface YandexRepository extends JpaRepository<YandexProducts, Long> {

}
