package com.root_raiser.root.Repository;

import com.root_raiser.root.model.Farmer;
import com.root_raiser.root.model.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepsitory extends JpaRepository<Farmer, Integer> {
}
