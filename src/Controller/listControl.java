package Controller;

import Model.ListToDo;
import Model.Person;
import View.listToWrite;

import java.util.List;

public class listControl {
    private ListToDo ltd;
    private Person person;

    private listToWrite ltw;

    public listControl(ListToDo ltd, Person person, listToWrite ltw) {
        this.ltd = ltd;
        this.person = person;
        this.ltw = ltw;
    }
}
