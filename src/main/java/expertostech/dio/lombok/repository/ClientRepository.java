package expertostech.dio.lombok.repository;

import expertostech.dio.lombok.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
}
