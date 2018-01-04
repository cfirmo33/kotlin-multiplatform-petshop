package data.mapper

import data.model.PersonDto
import domain.model.Person

/**
 * DtoMappers
 */
fun PersonDto.toModel(): Person = Person(name = name)