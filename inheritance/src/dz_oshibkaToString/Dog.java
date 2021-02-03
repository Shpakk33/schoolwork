package dz_oshibkaToString;

public class Dog {
        String name;
        String breed;
        int age;
        Dog (String breed, String name, int age){
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        public boolean equals(dz_oshibkaToString.Dog dog){
            return this.name.equals(dog.name) &&
                    this.breed.equals(dog.breed) &&
                    this.age==dog.age;
        }
        public boolean equals(Object o){
        boolean result = this.age ==((Dog)o).age &&
            this.breed.equals(((Dog)o).breed) &&
                this.name.equals(((Dog)o).name);

        return result;
        }
        public String toString(){
            return "Dog " + name + " age " + age;
        }


    }


