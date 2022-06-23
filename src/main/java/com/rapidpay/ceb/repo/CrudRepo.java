package com.rapidpay.ceb.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CrudRepo<T, ID> extends JpaRepository<T, ID>, SuperRepo {

}
