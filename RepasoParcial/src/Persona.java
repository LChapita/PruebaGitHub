import java.util.Comparator;
import java.util.Objects;

public class Persona implements Acciones {
    private String nombre;
    private int dni;
    private String genero;

    public Persona() {
    }

    public Persona(String nombre, int dni, String genero) {
        this.nombre = nombre;
        this.dni = dni;
        this.genero = genero;
    }

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", genero='" + genero + '\'' +
                '}';
    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
*/

    /*
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Persona persona = (Persona) o;
            return nombre.equals(persona.nombre);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nombre);
        }
        */
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni && nombre.equals(persona.nombre) && genero.equals(persona.genero);
    }
    *//*
    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, genero);
    }*/
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni && nombre.equals(persona.nombre) && genero.equals(persona.genero);
    }*//*
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        boolean respuesta = this.dni == persona.dni && this.genero == persona.genero && this.nombre == persona.nombre;
        return respuesta;

    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, genero);
    }*/

    /*
    @Override
    public int hashCode() {
        int resultado = this.nombre.hashCode();
        resultado += 31 * this.genero.hashCode();
        resultado += 31 * Integer.hashCode(this.dni);
        return resultado;
    }*/
    /*
    @Override
    public int compareTo(Object o) {
        Persona persona=(Persona) o;
        int resultado=this.nombre.compareTo(persona.nombre);
        if(resultado==0){
            resultado=this.genero.compareTo(persona.genero);
            if (resultado==0){
                resultado=Integer.compare(this.dni,persona.dni);
            }
        }
        return resultado;
    }*/

    @Override
    public void saludar() {
        System.out.println("Hola buen dia");
    }

    @Override
    public void correr() {
        System.out.println("no te corro ni media cuadra");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
