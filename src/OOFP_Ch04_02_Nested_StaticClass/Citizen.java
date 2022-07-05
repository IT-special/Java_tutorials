package OOFP_Ch04_02_Nested_StaticClass;

public class Citizen {

    private String tckn;
    private String firstName;
    private String lastName;
    private Nationality nationality;

    public Citizen(String tckn, String firstName, String lastName, Nationality nationality) {
        this.tckn = tckn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    public String getTckn() {
        return tckn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Nationality getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "tckn='" + tckn + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality=" + nationality +
                '}';
    }









    /* Static Class */
    static class Nationality {
        private String country;
        private String abbreviation;

        public Nationality(String country, String abbreviation) {
            this.country = country;
            this.abbreviation = abbreviation;
        }

        public String getCountry() {
            return country;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        @Override
        public String toString() {
            return "Nationality [country=" + country + ", abbreviation= " + abbreviation + "]";
        }
    }
}
