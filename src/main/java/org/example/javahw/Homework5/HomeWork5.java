package org.example.javahw.Homework5;

public class HomeWork5 {
    public static void main(String[] args) {

        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee("Brandon Cody Evans","Network Administrator", "test@test", "578292-004", 300, 49);
        employeesArr[1] = new Employee("Anna Lily Jones", "Architect", "test@mail.ru", "89278547209", 6000, 30);
        employeesArr[2] = new Employee("Jenna Grace Hill", "Tester", "mail@gmail.com", "892785782", 5999, 43);
        employeesArr[3] = new Employee("Logan Ethan Nelson", "doctor", "test@hotmail.com", "923852--05", 38900, 32);
        employeesArr[4] = new Employee("Sylvanas Windrunner", "Banshee Queen", "test@gmail.com", "2087512522", 91254, 41);

        checkAge(employeesArr);
    }

    public static void checkAge(Employee[] employeesArr){
        for (int i = 0; i < employeesArr.length; i++){
            if (employeesArr[i].getAge() > 40) {
                System.out.println(employeesArr[i]);
            }
        }
    }
}
