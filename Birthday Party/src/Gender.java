
enum Gender {
    Male,
    Female;

    String setPrefix() {
        if (this.name().equals("Male"))
            return "Mr ";
        return "Ms ";
    }
}


