package domain.interactor

import domain.model.Person
import domain.repository.Repository

/**
 * UseCases
 */

fun getPeople(repository: Repository): List<Person> = repository.getPeople()