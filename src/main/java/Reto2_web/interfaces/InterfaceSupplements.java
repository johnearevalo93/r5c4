
package Reto2_web.interfaces;

import Reto2_web.modelo.Supplements;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Fabio Ortiz
 */
public interface InterfaceSupplements extends MongoRepository<Supplements, String>{
    public List<Supplements> findByPrice(double price);
    public List<Supplements> findByDescriptionContainingIgnoreCase(String description);
}
