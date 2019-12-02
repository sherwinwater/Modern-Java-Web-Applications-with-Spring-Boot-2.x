package org.packt.springboot22.vid05.repository;

import org.packt.springboot22.vid05.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LocationRepository extends CrudRepository<Location, Long>, PagingAndSortingRepository<Location, Long>{

}
