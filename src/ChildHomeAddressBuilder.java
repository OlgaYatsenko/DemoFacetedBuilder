class ChildHomeAdressBuilder extends ChildBuilder {

    public ChildHomeAdressBuilder(Child child) {
        this.child = child;
    }


    public ChildHomeAdressBuilder at(String streetName) {
        child.street = streetName;
        return this;
    }

    public ChildHomeAdressBuilder in(String country) {
        child.country = country;
        return this;
    }

}