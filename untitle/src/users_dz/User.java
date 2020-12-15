package users_dz;

public class User {
    User User1 = new User(2003);
    int birthYear;
    User(int a){
        birthYear = a;
    }
    int getAge(){
        return 2020 - birthYear;
    }

}
