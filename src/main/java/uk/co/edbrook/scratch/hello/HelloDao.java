package uk.co.edbrook.scratch.hello;

import org.springframework.data.jpa.repository.JpaRepository;

interface HelloDao extends JpaRepository<HelloEntity, Long> {

}
