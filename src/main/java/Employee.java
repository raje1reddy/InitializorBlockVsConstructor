
class Employee {

        {
                System.out.println("Employee: initializer1"); //initializer block
        }


        Employee(){ System.out.println("Employee: constructor");}

        {
                System.out.println("Employee: initializer2"); //initializer block
        }

}

