package than.projectboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import than.projectboard.domain.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
