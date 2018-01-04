package view.presenter

import domain.interactor.getPeople
import domain.model.Person
import domain.repository.Repository

/**
 * PeoplePresenter
 */
class PeoplePresenter<V : PeoplePresenter.View>(private val peopleRepository: Repository,
                                                private val view: V) {

    fun initialize() {
        val people = getPeople(repository = peopleRepository)
        view.showPeople(people)
    }

    interface View {
        fun showPeople(people: List<Person>)
    }
}