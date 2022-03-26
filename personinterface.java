interface Persioninterface{
    public abstract String name;

    public abstract String set_name(name){
        this.name=name;
        return this.name;
    }

    public abstract String get_name(){
        return this.name;
    }
}