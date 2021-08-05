package twreflectives;

import java.lang.reflect.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TWReflectives {

    public static void main(String[] args) {

        System.out.println("Problem 1");
        Person pers = new Person();

        System.out.println("Person class: " + pers.getClass() + "\n"
                + "Person name: " + pers.getUniqueData());

        System.out.println("");
        System.out.println("Problem 2");

//        List<Class> listOfClasses = new ArrayList<>();
//        listOfClasses.add(Integer);
//        listOfClasses.add();
//        listOfClasses.add();
//        listOfClasses.add();
//        listOfClasses.add();
//        listOfClasses.add();
        Class c = LinkedList.class;
        Class[] interfaces = c.getInterfaces();

        System.out.println(interfaces);

        for (Class cls : interfaces) {
            System.out.println(cls.getName());
        }

        System.out.println("");
        System.out.println("Problem 3");

        System.out.println("Class: " + pers.getClass());
        Class clP = pers.getClass();
        Field[] fieldsForPers1 = clP.getFields();

        int i = 1;
        System.out.println("Fields:");
        for (Field f : fieldsForPers1) {
            System.out.println("     " + i + ". Name: " + f.getName() + " ; Type: " + f.getType().getName());
            i++;
        }

        System.out.println("");
        System.out.println("Problem 4");

        Method[] methodsForP = clP.getMethods();

        System.out.println("Class: " + pers.getClass());
        System.out.println("Methods:");
        i = 1;
        for (Method method : methodsForP) {
            System.out.println(" " + i + ". " + method);
            i++;
        }

        System.out.println("");
        System.out.println("Problem 5");

//        Class[] paramTypes = new Class[]{String.class, int.class};
//        Method method = c.getMethod("getCalculateRating", paramTypes);
//        Object[] args = new Object[]{new String("First Calculate"), new Integer(10)};
//        Double d = (Double) method.invoke(pers, args);
        try {
            Class cls = pers.getClass();
            Field field = cls.getField("name");

            String nameValue = (String) field.get(pers);

            System.out.println(": " + nameValue);
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(TWReflectives.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(TWReflectives.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}
