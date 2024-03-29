package org.anyframe.cloud.auth.user.infrastructure.persistence;

import org.anyframe.cloud.auth.user.domain.RegisteredUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hahn on 2015-11-25.
 */
public interface UserRepository extends JpaRepository<RegisteredUser, String> {

    RegisteredUser findByUserIdAndPassword(String userId, String password);
}
