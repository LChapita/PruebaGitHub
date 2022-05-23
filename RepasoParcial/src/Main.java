import java.util.*;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("martin", 123, Gene.hombre);
        Persona persona2 = new Persona("pablo", 456, Gene.hombre);
        Persona persona3 = new Persona("juan", 789, Gene.hombre);
        Persona persona4 = new Persona("Carlos", 135, Gene.hombre);
        //Persona persona5 = new Persona("martin", 124, Gene.hombre);
        //Persona persona6 = new Persona("martin", 123, Gene.hombre);
        Persona igual = new Persona("martin", 123, Gene.hombre);


        /*
        HashMap<Integer, Persona> listaHashMap = new HashMap<Integer, Persona>();
        listaHashMap.put(persona1.hashCode(), persona1);
        listaHashMap.put(persona2.hashCode(), persona2);
        listaHashMap.put(persona3.hashCode(), persona3);
        listaHashMap.put(persona4.hashCode(), persona4);
        listaHashMap.put(persona5.hashCode(), persona5);
        for (Map.Entry<Integer, Persona> personEntry : listaHashMap.entrySet()) {

                Persona persona = personEntry.getValue();
                System.out.println(persona.toString());
            }
        }
        */
        /*
        HashSet<Persona> personaHashSet=new HashSet<Persona>();
        personaHashSet.add(persona1);
        personaHashSet.add(persona2);
        personaHashSet.add(persona3);
        personaHashSet.add(persona4);
        personaHashSet.add(persona5);
        for (Persona person : personaHashSet) {
            if(person.equals(persona3)){
                System.out.println(person.toString());
            }
        }
        */
        /*
        List<Persona> personaList = new LinkedList<>();

        personaList.add(persona1);
        personaList.add(persona2);
        personaList.add(persona3);
        personaList.add(persona4);
        personaList.add(persona5);
        personaList.add(persona6);
        personaList.add(igual);

        if(persona1.hashCode()==igual.hashCode()){
            System.out.println("igual");
        }else {
            System.out.println("no es igual");
        }

        personaList.sort(Comparator.comparingInt(Persona::getDni));

        for (Persona person : personaList) {
            System.out.println(person.toString());
        }
    }
    */
        /*
        LinkedHashMap<Integer,Persona> personaLinkedHashMap= new LinkedHashMap<Integer,Persona>();
        personaLinkedHashMap.put(persona1.hashCode(),persona1);
        personaLinkedHashMap.put(persona2.hashCode(),persona2);
        personaLinkedHashMap.put(persona3.hashCode(),persona3);
        personaLinkedHashMap.put(persona4.hashCode(),persona4);
        personaLinkedHashMap.put(persona5.hashCode(),persona5);
        personaLinkedHashMap.put(persona6.hashCode(),persona6);
        Gene genero=new Gene();

        for (Map.Entry<Integer, Persona> personaMap: personaLinkedHashMap.entrySet() ) {
            Persona persona=personaMap.getValue();
            persona.saludar();
            persona.correr();
            System.out.println(persona.getNombre());
        }*/
        /*
        Stack<String> palabras = new Stack<>();

        // agrego elementos a la pila
        palabras.push("primer palabra");
        palabras.push("segunda palabra");
        palabras.push("tercer palabra");
        palabras.push("cuarta palabra");

        // quito el ultimo elemento ingresado
        palabras.pop();

        // mostrando palabras
        System.out.println(palabras);

        Iterator<String> iterator = palabras.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
        /*
        Map<Integer,Persona> personaMap=new HashMap<>();
        personaMap.put(persona1.getDni(),persona1);
        personaMap.put(persona2.getDni(),persona2);
        personaMap.put(persona3.getDni(),persona3);
        personaMap.put(persona4.getDni(),persona4);
        personaMap.put(igual.hashCode(),igual);

        personaMap.forEach((k,v)->{
            System.out.println("key: "+k);
            System.out.println("value: "+v);
        });
        */
        /*
        Map<Integer,Persona> map=new TreeMap<>();

        map.put(persona1.getDni(),persona1);
        map.put(persona2.getDni(),persona2);
        map.put(persona3.getDni(),persona3);
        map.put(persona4.getDni(),persona4);
        map.put(igual.getDni(),igual);

        map.forEach((k,v)->{
            System.out.println("key: "+k);
            System.out.println("value: "+v);
        });

        for (var persona:personaMap.entrySet()) {
            System.out.println(persona.toString());
        }*/
        /*
        Set<Persona> personaSet=new TreeSet<>();

        personaSet.add(persona1);
        personaSet.add(persona2);
        personaSet.add(persona3);
        personaSet.add(persona4);
        //personaSet.add(igual);

        /*
        personaSet.forEach((i)->{
            System.out.println("persona: "+i);
        });*/
        /*
        for (Persona per:personaSet){
            System.out.println(per.toString());
        }
        */

        /*Set<String> strings=new TreeSet<>();
        strings.add("z");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");

        for (String str:strings) {
            System.out.println(str);
        }*/
        /*
        List<String> palabras= new ArrayList<>();
        palabras.add("hola");
        palabras.add("mundo");
        palabras.add("a pedasos");
        palabras.add("macacos");

        Iterator<String> iterator= palabras.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        Map<Integer,Persona> personaMap=new TreeMap<>();
        personaMap.put(persona1.hashCode(),persona1);
        personaMap.put(persona2.hashCode(),persona2);
        personaMap.put(persona3.hashCode(),persona3);
        personaMap.put(persona4.hashCode(),persona4);

        for (Persona per:personaMap.values()) {
            System.out.println(per.hashCode());
        }

    }

}
