package peaksoft.repository;

public interface CategoryRepository extends org.springframework.data.jpa.repository.JpaRepository<peaksoft.entity.Category, java.lang.Long> ,org.springframework.data.jpa.repository.JpaSpecificationExecutor<peaksoft.entity.Category> {
}