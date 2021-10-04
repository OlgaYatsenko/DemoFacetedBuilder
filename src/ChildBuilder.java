//faceted builder
class ChildBuilder{
    protected Child child=new Child();

    public ChildPersonalInfoBuilder setPersonalInfo(){
        return new ChildPersonalInfoBuilder(child);
    }

    public ChildHomeAdressBuilder lives(){
        return new ChildHomeAdressBuilder(child);
    }

    public Child build(){
        return child;
    }


}
