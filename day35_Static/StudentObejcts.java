package day35_Static;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
/*Muhtar's comment
Student is class name, student1 is object Name.
only the statics can be called through class name
 */
public class StudentObejcts {

    public static void main(String[] args) {
        Student student1 = new Student();
            student1.name = "Muhtar";
        System.out.println(student1);

        Student student2 = new Student();
        System.out.println(student2);

        Student.printSchoolName();
    }


}
