


    abstract class Assign{
        // declaring abstract class without method
    }
    abstract class Assignment{   //  abstract class can not be private
        public void show() {
            System.out.println("Hello");
        }
        public abstract void method();
// If any class has any of its method abstract then you must declare entire class abstract.
    }

    class AbstractClass extends Assignment{
        // extend abstract class, so we must need to do override
        @Override
        public void method() {
        }

    }
    class Assignment4{
        public static void main(String[] args) {
            //showing error, Abstract class cannot be instantiated.
            //assignment a = new assignment();
          //  a.show();
        }
    }
