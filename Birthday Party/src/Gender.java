
public enum Gender {
    Male,
    Female;

    public String setPrefix() {
        if (this.name().equals("Male"))
            return "Mr ";
        return "Ms ";
    }
}


