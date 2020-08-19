package com.hibicode.beerstore.model;

import java.math.BigDecimal;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EntityScan
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Beer {
	
	@Id
	@SequenceGenerator(name = "beer_seq", sequenceName = "beer_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "beer_seq")
	@EqualsAndHashCode.Include
	private Long id;
	
	private String name;
	private BeerType type;
	private BigDecimal volume;
	
}
