import java.time.LocalDate;

class ChildPersonalInfoBuilder extends ChildBuilder{


    public ChildPersonalInfoBuilder(Child child) {
        this.child=child;
    }

    public ChildPersonalInfoBuilder withName(String name){
        child.name=name;
        return this;
    }

    public ChildPersonalInfoBuilder withDateOfBirth(LocalDate date){
        child.dateOfBirth=date;
        return this;
    }
}
