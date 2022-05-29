package myntraapp.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myntraapp.bean.Customer;

@Repository
public interface MyLocalRepository extends JpaRepository<Customer, Long> {

}
