package com.homebroker.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository <Developer, Long> {
}
