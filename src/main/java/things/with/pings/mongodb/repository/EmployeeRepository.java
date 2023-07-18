package things.with.pings.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import things.with.pings.mongodb.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Long> {
}
